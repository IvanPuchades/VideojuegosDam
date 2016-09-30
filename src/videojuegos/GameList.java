/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class GameList {
    
    private ArrayList<Game> lista;

    public GameList() {
        lista = new ArrayList<>();
    }
    

    public ArrayList<Game> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Game> lista) {
        this.lista = lista;
    }

    
}
