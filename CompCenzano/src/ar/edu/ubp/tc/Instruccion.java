/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.ubp.tc;

/**
 *
 * @author sebastian
 */
public class Instruccion {
    
    String nombre;
    boolean usada;
    String id3ac;
    
    public Instruccion() {
        this.nombre = "";
        this.usada = false;
        this.id3ac = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }
    
    public String getId3ac() {
        return id3ac;
    }

    public void setId3ac(String id3ac) {
        this.id3ac = id3ac;
    }
    
    
}
