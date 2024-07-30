package modelo;
public class Usuario {

    private int id;
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private String dni;
    private String tipoUsuario;
    private String telefono;
    private String contrasena;
    //private Timestamp ultimoInicio;

    public Usuario(int id, String nombreUsuario, String nombre, String apellido, String dni, String tipoUsuario, String telefono, String contrasena) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
        this.contrasena = contrasena;
        //this.ultimoInicio = ultimoInicio;
    }

    public Usuario(String nombreUsuario, String nombre, String apellido, String dni, String tipoUsuario, String telefono) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoUsuario = tipoUsuario;
        this.telefono = telefono;
    }


    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
