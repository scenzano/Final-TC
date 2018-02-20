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
public abstract class Simbolo {
    
    protected String tipo;
    protected String nombre;
    protected boolean usada;
    protected int scope;
    
    public Simbolo(){
        
        this.tipo = "";
        this.nombre = "";
        this.usada = false;
        this.scope = 0;
    }
    
    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }
    
    @Override
    abstract public String toString();

}
