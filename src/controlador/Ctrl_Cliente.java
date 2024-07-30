package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;

public class Ctrl_Cliente {
    
    public boolean existeCliente (String dniCliente){
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT dni FROM tb_cliente WHERE dni = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dniCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
              // existe el cliente
                result= true; 
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error al corroborar si existe el cliente con un dni dado. Error "+e); 
        }
        return result;
    }
    
    public Cliente retornarCliente (String dni)
    {
        Cliente clienteBuscado = null;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT nombre,apellido,telefono FROM tb_cliente WHERE dni =?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                clienteBuscado = new Cliente();
                clienteBuscado.setNombre(rs.getString("nombre"));
                clienteBuscado.setApellido(rs.getString("apellido"));
                clienteBuscado.setTelefono(rs.getString("telefono"));
                
            }
        } catch (SQLException e) {
                System.out.println("Error al encontrar cliente con un dni. Erorr "+e);
        }
        return clienteBuscado; 
    }
    
    public boolean registrarCliente (Cliente modelo){
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql ="INSERT INTO tb_cliente (dni,nombre,apellido,telefono) VALUES (?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, modelo.getDni());
            ps.setString(2, modelo.getNombre());
            ps.setString(3, modelo.getApellido());
            ps.setString(4, modelo.getTelefono());
            if (ps.executeUpdate() > 0){
                result=true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente. Error "+e);
        }
        return result;
    }
    
    public boolean eliminarCliente (String dniCliente){
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "DELETE FROM tb_cliente WHERE dni = ?"; 
            PreparedStatement ps = cn.prepareStatement(sql); 
            ps.setString(1, dniCliente);
            if (ps.executeUpdate() > 0){
                result = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente. Error "+e);
        }
        return result; 
    }
    
    public boolean actualizarCliente (Cliente modeloCliente){
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql ="UPDATE tb_cliente SET nombre = ?,apellido = ? ,telefono = ? WHERE dni = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, modeloCliente.getNombre());
            ps.setString(2, modeloCliente.getApellido());
            ps.setString(3, modeloCliente.getTelefono());
            ps.setString(4, modeloCliente.getDni());
            if (ps.executeUpdate() >0){
                result = true;
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente. Error "+e);
        }
        return result;
    }
    
    /*
    public Cliente retornarNombreCompleto (String dni){
        Cliente clienteBuscado = null;
        String nombre ="";
        String apellido ="";
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT nombre,apellido FROM tb_cliente WHERE dni =?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                nombre = rs.getString("nombre");
                apellido = rs.getString("apellido");
                clienteBuscado = new Cliente(nombre,apellido);
            }
        } catch (SQLException e) {
                System.out.println("Error al encontrar cliente con un dni. Erorr "+e);
        }
        return clienteBuscado; 
    }
*/ 
}
