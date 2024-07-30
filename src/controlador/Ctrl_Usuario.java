package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Ctrl_Usuario {

    
    public boolean ExistenUsuarios() {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT 1 FROM tb_usuario LIMIT 1";  // Consulta optimizada
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        result = true;
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar usuarios.");
            System.out.println("Error al consultar usuarios, Error: " + e);
        }
        return result;
    }
    
    public boolean usuarioDisponible(String nombreUsuario) {
        boolean result = true;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT id FROM tb_usuario WHERE nombreUsuario = ?";
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, nombreUsuario);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        result = false;
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar si existe nombre de usuario.");
            System.out.println("Error al consultar nombre de usuario, Error: " + e);
        }
        return result;
    }

    public boolean registrarUsuario(Usuario modelo) {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "INSERT INTO tb_usuario (nombreUsuario, nombre, apellido, dni, tipoUsuario, telefono, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, modelo.getNombreUsuario());
                ps.setString(2, modelo.getNombre());
                ps.setString(3, modelo.getApellido());
                ps.setString(4, modelo.getDni());
                ps.setString(5, modelo.getTipoUsuario());
                ps.setString(6, modelo.getTelefono());
                ps.setString(7, modelo.getContrasena());
                if (ps.executeUpdate() > 0) {
                    result = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error al registrar el usuario.");
        }
        return result;
    }

    public boolean iniciarSesion(String nombreUsuario, String password) {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT nombreUsuario,contrasena FROM tb_usuario WHERE nombreUsuario = ? and contrasena = ? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion. Por favor intente denuevo");
            System.out.println("Error al iniciar sesion. Error " + e);
        }
        return result;
    }

    public String retornarTipoUsuario(String nombreUsuario) {
        String tipoUsuario = "";
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT tipoUsuario FROM tb_usuario WHERE nombreUsuario = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoUsuario = rs.getString("tipoUsuario");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el tipo del usuario. Error " + e);
        }
        return tipoUsuario;
    }

    public void actualizarUltimoInicio(String nombreUsuario) {
        Timestamp timestampActual = obtenerFechaActual();
        Connection cn = Conexion.conectar();
        try {
            String sql = "UPDATE tb_usuario SET ultimoInicio = ? WHERE nombreUsuario = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setTimestamp(1, timestampActual);
            ps.setString(2, nombreUsuario);
            int rs = ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el ultimo inicio de sesion.");
            System.out.println("Error al actualizar el ultimo inicio de sesion. Error " + e);
        }
    }

    public boolean existeUsuario(String nombreUsuario) {
        boolean existe = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT id FROM tb_usuario WHERE nombreUsuario = ? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al corroborar si existe el usuario.");
            System.out.println("Error al corroborar si existe el usuario. Error " + e);
        }
        return existe;
    }

    public boolean borrarUsuario(String nombreUsuario) {
        int resultado = 0;
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM tb_usuario WHERE nombreUsuario = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            resultado = ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario.");
            System.out.println("Error al eliminar el usaurio. Error " + e);
        }
        return resultado > 0;
    }

    private int retornarID(String nombreUsuario) {
        int id = 0;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT id FROM tb_usuario WHERE nombreUsuario = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el id del usuario.");
            System.out.println("Error al obtener el id del usuario. Error " + e);
        }
        return id;
    }

    
    /*
    podria hacerse solo con el nombre de usuario sin necesidad de buscar el id. Pero queria probar cambiando el nombre de usuario tambien
    Lo voy a dejar como mejora para mas adelante.
    */
    public boolean actualizarUsuario(Usuario user) {
        boolean result = false;

        int resultado = 0;
        Connection cn = Conexion.conectar();
        try {
            int idUsuario = retornarID(user.getNombreUsuario());
            String sql = "UPDATE tb_usuario SET nombre = ? ,apellido = ?,dni = ? ,tipoUsuario = ? ,telefono = ? WHERE id = ? ";
            PreparedStatement ps = cn.prepareStatement(sql);
            //ps.setString(1, user.getNombreUsuario());
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getDni());
            ps.setString(4, user.getTipoUsuario());
            ps.setString(5, user.getTelefono());
            ps.setInt(6, idUsuario);
            resultado = ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar elusuario.");
            System.out.println("Error al actualizar el usuario. Error" + e);
        }
        return resultado > 0;
    }
    
    private Timestamp obtenerFechaActual() {
        Date fechaActual = new Date();
        return new Timestamp(fechaActual.getTime());
    }
}
