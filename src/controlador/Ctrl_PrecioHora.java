package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ctrl_PrecioHora {
    
    public Double devolverPrecio (String tipoVehiculo){
        Connection cn = Conexion.conectar();
        Double precioHora = 0.0;
        try {
            String sql = "SELECT precioHora FROM tb_preciohora WHERE tipoVehiculo = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, tipoVehiculo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                precioHora=rs.getDouble("precioHora");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el precio de la hora. Error "+e);
        }
        
        return precioHora;
    }

    public boolean actualizarPrecio (String tipoVehiculo, Double precio){
        Connection cn = Conexion.conectar();
        boolean result = false;
        try {
            String sql = "UPDATE tb_precioHora SET precioHora = ? WHERE tipoVehiculo = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setDouble(1, precio);
            ps.setString(2, tipoVehiculo);
            if (ps.executeUpdate() > 0){
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el precio. Error "+e);
        }
        return result;
    }
}
