/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author Gabriel
 */

import LogicaNegocio.Top5;
import LogicaNegocio.Cancion;
import java.util.List;

public class TopControlador {
    private final Top5 top5;

    public TopControlador(Top5 top5) {
        this.top5 = top5;
    }

    public List<Cancion> getTopMejorCalificadas() {
        return top5.getTopsMejorCalificadas();
    }

    public List<Cancion> getTopMasCompradas() {
        return top5.getTopsMasCompradas();
    }

    public List<Cancion> getTopMasIncluidas() {
        return top5.getTopsMasIncluidas();
    }

    public void actualizarTop5() {
        top5.actualizarTop5(); // Suponiendo que más adelante implementes esta lógica
    }
}
