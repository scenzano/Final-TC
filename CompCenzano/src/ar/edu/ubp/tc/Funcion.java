/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.ubp.tc;

import java.util.LinkedList;

/**
 *
 * @author sebastian
 */
public class Funcion extends Simbolo {
    
    LinkedList <Variable> argumentos;
    
    public Funcion(){
        super();
        argumentos = new LinkedList <>();
    }
    
    public LinkedList<Variable> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(LinkedList<Variable> argumentos) {
        this.argumentos = argumentos;
    }
    
    public boolean existeArgumento(Variable var){
        for(Variable arg : argumentos){
            if(arg.getNombre().equals(var.getNombre())){
                return true;
            }
        }
        return false;
    }
    
    public boolean agregarArgumento(Variable var) {
        if(existeArgumento(var)) {
            return false;
        }
        this.argumentos.add(var);
        return true;
    }
    
    @Override
    public String toString() {
        String funcion = "Funcion ";
        
        funcion += "\tTipo: ";
        funcion += tipo;
        funcion += "\tNombre: ";
        funcion += nombre;
        funcion += "\tUsada: ";
        funcion += usada;
        funcion += "\tArgumentos: ";
        for( int i = 0; i < argumentos.size(); i++ ) {
            funcion += " [";
            funcion += argumentos.get( i ).getTipo();
            funcion += ",";
            funcion += argumentos.get( i ).getNombre();
            funcion += "]";
        }
        funcion += "\tScope: ";
        
        switch(scope)
        {
            case 0:
                funcion += "Global";
                break;
            
            default:
                funcion += "Local nivel " + scope;
                break;
        }
        
        return funcion;
    }
    
}
