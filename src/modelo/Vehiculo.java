package modelo;
public class Vehiculo {
    
    private String dniDueno;
    private String patente;
    private String tipoVehiculo;
    private String ubicacion;

    public Vehiculo(String dniDueno, String patente, String tipoVehiculo, String ubicacion) {
        this.dniDueno = dniDueno;
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.ubicacion = ubicacion;
    }

    public String getDniDueno() {
        return dniDueno;
    }

    public void setDniDueno(String dniDueno) {
        this.dniDueno = dniDueno;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
