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
public class Variable extends Simbolo {

    
    String valor;
    boolean inicializada;
    
    public Variable(){
        super();
        valor = "";
        inicializada = false;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isInicializada() {
        return inicializada;
    }

    public void setInicializada(boolean inicializada) {
        this.inicializada = inicializada;
    }

    @Override
    public String toString() {
        
        String variable = "Variable";
        variable +=  "\tTipo: ";
        variable +=  this.tipo;
        variable +=  "\tNombre: ";
        variable +=  this.nombre;
        variable +=  "\tUsada: ";
        variable +=  this.usada;
        variable +=  "\tValor: ";
        variable +=  this.valor;
        variable +=  "\tScope: ";
        variable +=  this.scope;
        variable +=  "\tInicializada: ";
        variable +=  this.inicializada;
        
        return variable;
    }
    
}
