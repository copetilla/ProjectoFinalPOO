/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Usuario {

    // Atributos
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String identificacion;
    private String avatar;
    private String correo;
    private String nombreUsuario;
    private String contrasena;

    // Constructor
    public Usuario(String nombreCompleto, LocalDate fechaNacimiento, String nacionalidad,
            String identificacion, String avatar, String correo,
            String nombreUsuario, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.avatar = avatar;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    // Métodos
    public boolean validarContrasena() {
        return true;
    }

    public boolean cambiarContrasena() {
        
        return true;
    }

    public boolean autenticar() {
        return true;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

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

    // toString
    @Override
    public String toString() {
        return "Usuario: " + nombreCompleto + "\n"
                + "Usuario: " + nombreUsuario + "\n"
                + "Correo: " + correo + "\n"
                + "Fecha de nacimiento: " + fechaNacimiento + "\n"
                + "Nacionalidad: " + nacionalidad;
    }

}
