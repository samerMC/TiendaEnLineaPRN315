
package modelos;

public class Usuario {
    // Atributos del usuario que son los mismos que se encuentran en la estructura de la base de datos "usuarios"
    private int id;
    private String nombre, correo, contrasena, rol, estado;

    // Constructor vacío
    public Usuario() {
    }

    // Constuctor con todos los elementos
    public Usuario(int id, String nombre, String correo, String estado, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.estado = estado;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    // Metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String password) {
        this.contrasena = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
