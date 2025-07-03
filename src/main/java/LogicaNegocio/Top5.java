package LogicaNegocio;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Top5 {

    // Atributos
    private List<Cancion> topMejorCalificadas;
    private List<Cancion> topMasCompradas;
    private List<Cancion> topMasIncluidas;

    // Constructor
    public Top5() {
        this.topMejorCalificadas = new ArrayList<>();
        this.topMasCompradas = new ArrayList<>();
        this.topMasIncluidas = new ArrayList<>();
    }

    // Métodos
    
    public void actualizarTop5(){

    }

    public void mostrarTopsMejorCalificadas() {
       
    }

    public void mostrarTopsMasCompradas() {
        
    }

    public void mostrarTopsMasIncluidas() {
        
    }

    // Getters y Setters
    public List<Cancion> getTopsMejorCalificadas() {
        return topMejorCalificadas;
    }

    public void setTopsMejorCalificadas(List<Cancion> topsMejorCalificadas) {
        this.topMejorCalificadas = topsMejorCalificadas;
    }

    public List<Cancion> getTopsMasCompradas() {
        return topMasCompradas;
    }

    public void setTopsMasCompradas(List<Cancion> topsMasCompradas) {
        this.topMasCompradas = topsMasCompradas;
    }

    public List<Cancion> getTopsMasIncluidas() {
        return topMasIncluidas;
    }

    public void setTopsMasIncluidas(List<Cancion> topsMasIncluidas) {
        this.topMasIncluidas = topsMasIncluidas;
    }
    
    // toString()

    @Override
    public String toString() {
        return "Tops [Mejor calificadas: " + (topMejorCalificadas != null ? topMejorCalificadas.size() : 0) +
               ", Más compradas: " + (topMasCompradas != null ? topMasCompradas.size() : 0) +
               ", Más en listas: " + (topMasIncluidas != null ? topMasIncluidas.size() : 0) + "]";
    }
}
