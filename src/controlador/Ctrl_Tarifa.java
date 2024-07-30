package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import modelo.Tarifa;
import modelo.Vehiculo;

public class Ctrl_Tarifa {

    public boolean generarTarifaIngreso(Vehiculo modelo) {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "INSERT INTO tb_tarifa (idTarifa,dniDueno,patenteVehiculo,horaIngreso) VALUES (?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, 0); // auto increment
            ps.setString(2, modelo.getDniDueno());
            ps.setString(3, modelo.getPatente());
            Timestamp fechaActual = new Timestamp(System.currentTimeMillis());
            ps.setTimestamp(4, fechaActual);
            if (ps.executeUpdate() > 0) {
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al generar la tarifa de ingreso. Error " + e);
        }
        return result;
    }

    public int devolverIdTarifa(String patente) {
        int idReturn = -1;
        Connection cn = Conexion.conectar();
        try {
            // Utiliza un alias para la columna de la función MAX
            String sql = "SELECT MAX(idTarifa) AS maxIdTarifa FROM tb_tarifa WHERE patenteVehiculo = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, patente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Obtén el valor usando el alias
                idReturn = rs.getInt("maxIdTarifa");
            }
        } catch (SQLException e) {
            System.out.println("Error al devolver el id de tarifa. Error " + e);
        }
        return idReturn;
    }

    public Timestamp devolverFechaIngreso(String patente) {
        Timestamp fechaIngreso = null;
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = Conexion.conectar();
            if (cn == null) {
                System.out.println("Database connection failed.");
                return null;
            }

            String sql = "SELECT horaIngreso FROM tb_tarifa WHERE patenteVehiculo = ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, patente);
            rs = ps.executeQuery();

            if (rs.next()) {
                fechaIngreso = rs.getTimestamp("horaIngreso");
                // System.out.println("Fecha ingreso encontrada: " + fechaIngreso);
            } else {
                System.out.println("No se encontró la fecha de ingreso para la patente: " + patente);
            }
        } catch (SQLException e) {
            System.out.println("Error al encontrar la fecha de ingreso del vehiculo con patente " + patente + ". Error: " + e.getMessage());
        } finally {
            // Cerrar ResultSet, PreparedStatement y Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }

        return fechaIngreso;
    }

    public boolean actualizarTarifa(Tarifa tarifa) {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "UPDATE tb_tarifa AS t "
                    + "INNER JOIN tb_vehiculo AS v ON t.patenteVehiculo = v.patente "
                    + "SET t.horaSalida = ?, "
                    + "    t.tiempoTranscurrido = ?, "
                    + "    t.totalPagar = ? "
                    + "WHERE v.patente = ? "
                    + "AND v.ubicacion = 'Dentro del Establecimiento'";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setTimestamp(1, tarifa.getSalida());
            ps.setInt(2, tarifa.getTiempoTranscurrido());
            ps.setDouble(3, tarifa.getTotalPagar());
            ps.setString(4, tarifa.getPatenteVehiculo());

            if (ps.executeUpdate() > 0) {
                result = true;
            }
            ps.close();
            cn.close();
        } catch (SQLException e) {
            // Manejar excepción
            e.printStackTrace();
            System.out.println("Error al actualizar la tarifa. Error " + e);
        }
        return result;
    }

}
