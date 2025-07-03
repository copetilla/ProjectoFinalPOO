package LogicaNegocio;

public class Administrador {

    // Atributos
    private String correo;
    private String nombreUsuario;
    private String contrasena;

    // Constructor
    public Administrador(String correo, String nombreUsuario, String contrasena) {
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Métodos
    public void subirCancion() {
    }
    public void eliminarCancion() {
    }
    public void editarCancion() {
    }
    public void reproducirLista() {
    }
    public void buscarCancion() {
    }
    public void buscarLista() {
    }

    // Getters y Setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Administrador: " + nombreUsuario + " | Correo: " + correo;
    }
}
