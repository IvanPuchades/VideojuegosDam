/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

import java.io.Serializable;

/**
 *
 * @author dam
 */
public class Game implements Serializable {
    
    private String nombre;
    private String genero;
    private int puntos;
    private double precio;
    private boolean enPropiedad;
    
    //Constructor sin parametros
    public Game() {
        
    }

    public boolean isEnPropiedad() {
        return enPropiedad;
    }

    public void setEnPropiedad(boolean enPropiedad) {
        this.enPropiedad = enPropiedad;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
