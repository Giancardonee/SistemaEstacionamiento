package modelo;
public class PrecioHora {
    private String tipoVehiculo;
    private Double precio; 

    public PrecioHora(String tipoVehiculo, Double precio) {
        this.tipoVehiculo = tipoVehiculo;
        this.precio = precio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
 
 
}
