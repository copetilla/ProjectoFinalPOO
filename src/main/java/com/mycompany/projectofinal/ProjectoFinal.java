/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectofinal;

import LogicaNegocio.Administrador;
import LogicaNegocio.Cancion;
import LogicaNegocio.ListaReproduccion;
import LogicaNegocio.Usuario;
import LogicaNegocio.UsuarioFinal;

import Controladores.CancionControlador;
import Controladores.ListaReproduccionControlador;

import Vistas.CancionVista;
import Vistas.ListaReproduccionVista;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class ProjectoFinal {

    public static void main(String[] args) {
       
       /*  
        Cancion c1 = new Cancion("Blinding Lights", "Synthpop", "The Weeknd", "Abel Tesfaye", LocalDate.of(2019, 11, 29), "After Hours", 1000);

        Cancion c2 = new Cancion("Rolling in the Deep", "Soul", "Adele", "Adele Adkins", LocalDate.of(2010, 11, 29), "21", 1000);
        
        Cancion c3 = new Cancion("Uptown Funk", "Funk", "Mark Ronson ft. Bruno Mars", "Mark Ronson", LocalDate.of(2014, 11, 10), "Uptown Special", 1000);
        
        Cancion c4 = new Cancion("Bad Guy", "Pop", "Billie Eilish", "Billie Eilish", LocalDate.of(2019, 3, 29), "When We All Fall Asleep", 1000);
        
        Cancion c5 = new Cancion("Someone You Loved", "Ballad", "Lewis Capaldi", "Lewis Capaldi", LocalDate.of(2018, 11, 8), "Divinely Uninspired", 1000);
        
        Cancion c6 = new Cancion("Old Town Road", "Country Trap", "Lil Nas X", "Montero Hill", LocalDate.of(2019, 12, 3), "7 EP", 1000);
        
        Cancion c7 = new Cancion("Don't Start Now", "Disco Pop", "Dua Lipa", "Dua Lipa", LocalDate.of(2019, 10, 31), "Future Nostalgia", 1000);
        
        Cancion c8 = new Cancion("Shallow", "Soundtrack", "Lady Gaga & Bradley Cooper", "Lady Gaga", LocalDate.of(2018, 9, 27), "A Star Is Born", 1000);
        
        Cancion c9 = new Cancion("Perfect", "Pop", "Ed Sheeran", "Ed Sheeran", LocalDate.of(2017, 3, 3), "Divide", 1.09);
        
        Cancion c10 = new Cancion("Sunflower", "Hip-Hop", "Post Malone & Swae Lee", "Post Malone", LocalDate.of(2018, 10, 19), "Spider-Man: Into the Spider-Verse", 1000);
        
        Cancion c11 = new Cancion("Dance Monkey", "Alternative", "Tones and I", "Toni Watson", LocalDate.of(2019, 5, 10), "The Kids Are Coming", 1000);
        
        Cancion c12 = new Cancion("Rockstar", "Rap", "DaBaby ft. Roddy Ricch", "DaBaby", LocalDate.of(2020, 4, 17), "Blame It on Baby", 1000);
        
        Cancion c13 = new Cancion("Senorita", "Latin Pop", "Shawn Mendes & Camila Cabello", "Andrew Watt", LocalDate.of(2019, 6, 21), "Romance", 1000);
        
        Cancion c14 = new Cancion("Happier", "EDM", "Marshmello ft. Bastille", "Marshmello", LocalDate.of(2018, 8, 17), "Joytime II", 1000);
        
        Cancion c15 = new Cancion("Believer", "Alternative Rock", "Imagine Dragons", "Dan Reynolds", LocalDate.of(2017, 2, 1), "Evolve", 1000);
        
        Cancion c16 = new Cancion("Lucid Dreams", "Emo Rap", "Juice WRLD", "Jarad Higgins", LocalDate.of(2018, 5, 4), "Goodbye & Good Riddance", 1000);
        
        Cancion c17 = new Cancion("Levitating", "Disco Pop", "Dua Lipa", "Dua Lipa", LocalDate.of(2020, 3, 27), "Future Nostalgia", 1000);
        
        Cancion c18 = new Cancion("Watermelon Sugar", "Pop Rock", "Harry Styles", "Harry Styles", LocalDate.of(2019, 11, 16), "Fine Line", 1000);
        
        Cancion c19 = new Cancion("Circles", "Pop Rock", "Post Malone", "Austin Post", LocalDate.of(2019, 8, 30), "Hollywood's Bleeding", 1000);
        
        Cancion c20 = new Cancion("Good 4 U", "Pop Punk", "Olivia Rodrigo", "Olivia Rodrigo", LocalDate.of(2021, 5, 14), "SOUR", 1000);
        
        Usuario u1 = new Usuario("Alonso Calderon", LocalDate.of(1998, 4, 10), "Costa Rica",
                         "115640332", "", "aloCal@gmail.com", "AloCal", "MiClave#123");
        UsuarioFinal uf = new UsuarioFinal(u1);
        
        ListaReproduccion lista1 = new ListaReproduccion("Mis favoritas");
        lista1.agregarCancion(c1);
        lista1.agregarCancion(c2);
        
        uf.getListasReproduccion().add(lista1);
        
        Administrador admin = new Administrador("admin@app.com", "superAdmin", "ClaveSegura#789");
        
        // Mostrar usuario final
        System.out.println("Usuario Final:");
        System.out.println(uf);
        
        // Mostrar listas de reproducción
        System.out.println("\n Listas de reproducción:");
        for (ListaReproduccion l : uf.getListasReproduccion()) {
            System.out.println("- Lista de reproduccion: " + l.getNombre() + " | Canciones: " + l.getCanciones().size());

            for (Cancion c : l.getCanciones()) {
                System.out.println("- " + c.getNombre() + " | " + c.getArtista());
            }

        }
        
        
        // Mostrar administrador
        System.out.println("\n Administrador:");
        System.out.println(admin);*/
       
       CancionControlador cancionCtrl = new CancionControlador();
        ListaReproduccionControlador listaCtrl = new ListaReproduccionControlador();

        CancionVista cancionVista = new CancionVista();
        ListaReproduccionVista listaVista = new ListaReproduccionVista();

        Cancion nuevaCancion = cancionVista.pedirDatosCancion();
        cancionCtrl.agregarCancion(nuevaCancion);

        ListaReproduccion nuevaLista = listaVista.pedirDatosLista();
        listaCtrl.agregarLista(nuevaLista);

        listaCtrl.agregarCancionALista(nuevaLista, nuevaCancion);

        listaVista.mostrarCancionesEnLista(nuevaLista);

        
        
        
    }
}
