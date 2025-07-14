/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author Gabriel
 */

import LogicaNegocio.Administrador;

public class AdministradorControlador {
    private final Administrador admin;

    public AdministradorControlador(Administrador admin) {
        this.admin = admin;
    }

    public String getCorreo() {
        return admin.getCorreo();
    }

    public String getNombreUsuario() {
        return admin.getNombreUsuario();
    }

    public void setCorreo(String correo) {
        admin.setCorreo(correo);
    }

    public void setNombreUsuario(String nombreUsuario) {
        admin.setNombreUsuario(nombreUsuario);
    }

    public void subirCancion() {
        // Lógica simulada
        System.out.println("Canción subida por el administrador.");
    }

    public void eliminarCancion() {
        System.out.println("Canción eliminada por el administrador.");
    }

    public void editarCancion() {
        System.out.println("Canción editada por el administrador.");
    }

    public void reproducirLista() {
        System.out.println("Reproduciendo lista de canciones.");
    }

    public void buscarCancion() {
        System.out.println("Buscando canción.");
    }

    public void buscarLista() {
        System.out.println("Buscando lista de reproducción.");
    }

    public Administrador getAdministrador() {
        return admin;
    }
}
