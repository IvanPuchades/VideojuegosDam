/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

import utilidades.EntradaDatos;
import utilidades.Fichero;

/**
 *
 * @author dam
 */
public class Videojuegos {
     
    //Variable que contiene nuestra lista de juegos
    private static GameList misJuegos;
    private static Fichero miFichero;
    
    //introduzco un comentario
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Inicializamos nuestro fichero
        miFichero = new Fichero("juegos.xml");
        // Para inicializar la lista de misJuegos leemos de disco
        misJuegos = (GameList) miFichero.leer();
        //comprobamos si habia ficheros(o datos en el mismo)
        if (misJuegos == null) {
            //inicializamos la lista como una lista vacía
            misJuegos = new GameList();
        }
    }
    
}
