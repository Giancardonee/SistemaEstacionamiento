/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Vehiculo;

/**
 *
 * @author Usuario
 */
public class Ctrl_Vehiculo {

    public boolean vehiculoEnEstablecimiento(String patente) {
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT ubicacion FROM tb_vehiculo WHERE patente = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, patente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getString("ubicacion").equals("Dentro del establecimiento");
            }
            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al evaluar si se encuentra el vehiculo en el establecimiento. Error " + e);
        }
        return result;
    }
    
    
    // tengo que chequear si: 
    // si esta registrado el vehiculo: actualizar la ubicacion
    // si el vehiculo no esta registrado lo ingresamos. 
public boolean ingresarVehiculo(Vehiculo modelo) {
    boolean result = false;
    Connection cn = Conexion.conectar();
    try {
        // Verificar si el vehículo ya está registrado
        String sql = "SELECT COUNT(*) FROM tb_vehiculo WHERE patente = ?";
        PreparedStatement checkPs = cn.prepareStatement(sql);
        checkPs.setString(1, modelo.getPatente());
        ResultSet rs = checkPs.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        
        if (count > 0) {
            // El vehículo ya está registrado, se realiza un UPDATE
            String updateSql = "UPDATE tb_vehiculo SET ubicacion = ? WHERE patente = ?";
            PreparedStatement updatePs = cn.prepareStatement(updateSql);
            updatePs.setString(1, modelo.getUbicacion());
            updatePs.setString(2, modelo.getPatente());
            if (updatePs.executeUpdate() > 0) {
                result = true;
            }
            updatePs.close();
        } else {
            // El vehículo no está registrado, se realiza un INSERT
            String insertSql = "INSERT INTO tb_vehiculo (dniDueno, patente, tipoVehiculo, ubicacion) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(insertSql);
            ps.setString(1, modelo.getDniDueno());
            ps.setString(2, modelo.getPatente());
            ps.setString(3, modelo.getTipoVehiculo());
            ps.setString(4, modelo.getUbicacion());
            if (ps.executeUpdate() > 0) {
                result = true;
            }
            ps.close();
        }

        rs.close();
        checkPs.close();
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al ingresar o actualizar un vehículo. Error " + e);
    }
    return result;
}
    
    public String devolverTipoVehiculo (String patente){
        String tipoVehiculo = "";
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT tipoVehiculo FROM tb_vehiculo WHERE patente = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, patente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tipoVehiculo = rs.getString("tipoVehiculo");
            }
        } catch (SQLException e) {
            System.out.println("Error al devolver el tipo de vehiculo. Error "+e);
        }
        return tipoVehiculo;
    }
    
    public boolean retirarVehiculo (String patente){
        boolean result = false;
        Connection cn = Conexion.conectar();
        try {
            String sql ="UPDATE tb_vehiculo SET ubicacion = ? WHERE patente = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, "Fuera del establecimiento.");
            ps.setString(2, patente);
            if (ps.executeUpdate() >0){
                result = true;
            }
            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al retirar vehiculo.");
        }
     return result;   
    }
    
    public String devolverDniDueño(String patente)
    {
        String result = "";
        Connection cn = Conexion.conectar();
        try {
            String sql ="SELECT dniDueno FROM tb_vehiculo WHERE patente = ?" ;
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, patente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                result = rs.getString("dniDueno");
            }
            cn.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error al encontrar el dni del dueño del vehiculo.");
        }
     return result;   
    }
}
