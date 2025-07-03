/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import LogicaNegocio.Cancion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class CancionControlador {
    private final List<Cancion> canciones = new ArrayList<>();

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }
    
}
