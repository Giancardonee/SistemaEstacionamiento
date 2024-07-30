package modelo;

import java.sql.Timestamp;

public class Tarifa {
    private int idTarifa; // auto_increment
    private String dniDueno;
    private String patenteVehiculo;
    private Timestamp ingreso;
    private Timestamp salida;
    private Integer tiempoTranscurrido;
    private Double totalPagar;

    public Tarifa() {
    }

    public Tarifa(int idTarifa, String dniDueno, String patenteVehiculo, Timestamp ingreso, Timestamp salida, Integer tiempoTranscurrido, Double totalPagar) {
        this.idTarifa = idTarifa;
        this.dniDueno = dniDueno;
        this.patenteVehiculo = patenteVehiculo;
        this.ingreso = ingreso;
        this.salida = salida;
        this.tiempoTranscurrido = tiempoTranscurrido;
        this.totalPagar = totalPagar;
    }

    public Tarifa(int idTarifa, String dniDueno, String patenteVehiculo, Timestamp ingreso) {
        this.idTarifa = idTarifa;
        this.dniDueno = dniDueno;
        this.patenteVehiculo = patenteVehiculo;
        this.ingreso = ingreso;
    }

    public Tarifa(String patenteVehiculo, Timestamp ingreso, Timestamp salida, Integer tiempoTranscurrido, Double totalPagar) {
        this.patenteVehiculo = patenteVehiculo;
        this.ingreso = ingreso;
        this.salida = salida;
        this.tiempoTranscurrido = tiempoTranscurrido;
        this.totalPagar = totalPagar;
    }

        public Tarifa(String patenteVehiculo, Timestamp ingreso, Timestamp salida, Integer tiempoTranscurrido, Double totalPagar,String dni,int idTarifa) {
        this.patenteVehiculo = patenteVehiculo;
        this.ingreso = ingreso;
        this.salida = salida;
        this.tiempoTranscurrido = tiempoTranscurrido;
        this.totalPagar = totalPagar;
        this.dniDueno = dni;
        this.idTarifa = idTarifa;
    }
    
    public int getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    public String getDniDueno() {
        return dniDueno;
    }

    public void setDniDueno(String dniDueno) {
        this.dniDueno = dniDueno;
    }

    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    public void setPatenteVehiculo(String patenteVehiculo) {
        this.patenteVehiculo = patenteVehiculo;
    }

    public Timestamp getIngreso() {
        return ingreso;
    }

    public void setIngreso(Timestamp ingreso) {
        this.ingreso = ingreso;
    }

    public Timestamp getSalida() {
        return salida;
    }

    public void setSalida(Timestamp salida) {
        this.salida = salida;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Integer getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    public void setTiempoTranscurrido(Integer tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
    }
    
    
    
}
