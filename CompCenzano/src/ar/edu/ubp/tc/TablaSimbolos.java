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
public class TablaSimbolos {
    
    LinkedList<Simbolo> simbolos;
    
    public TablaSimbolos() {
        simbolos = new LinkedList<>();
    }

    public LinkedList<Simbolo> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(LinkedList<Simbolo> simbolos) {
        this.simbolos = simbolos;
    }
    
    public boolean existeSimboloEnScope( Simbolo s ){
        String nombre = s.getNombre();
        int scope = s.getScope();
        boolean ret = false;
        for( Simbolo i : simbolos ) {
            if( i.getNombre().equals(nombre) && s.getScope() == i.getScope()) {
                ret = true;
            }
        }
        return ret;
    }

    public boolean existeSimbolo(Simbolo s) {

        for( Simbolo i : simbolos ) {            
            if( i.getNombre().equals( s.getNombre()) ) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarSimbolo( Simbolo s ) {
        if( existeSimboloEnScope( s )) {
            return false;
        }
        simbolos.add( s );
        return true;
    }    
    
    public int getScopeSimbolo( Simbolo s ) {        
        for( Simbolo i : simbolos ) {
            if( i.getNombre().equals( s.getNombre() ) ) {
                return i.getScope();
            }
        }
        return -1;
    }
    
    public Simbolo getSimbolo(String nombre, int scope) {
        for( Simbolo s : simbolos ) {
            if( s.getNombre().equals(nombre) && s.getScope() == scope) {
                return s;
            }
        }
        return null;
    }

    public void removerSimbolo(int scope) {

        int i = 0;
        
        while( i < simbolos.size()) {
            if(simbolos.get( i ).getScope()>=scope) {
                simbolos.remove(i);
            }
            else
            {
                i++;
            }
        }
    }

    public void removerSimbolos(int nivel) {
        int i = 0;
        
        while( i < simbolos.size()) {
            if(simbolos.get( i ).getScope()>=nivel) {
                simbolos.remove(i);
            }
            else
            {
                i++;
            }
        }
    }

    public boolean setUsadoSimbolo(String nombre, boolean usada) {
        for( Simbolo s : simbolos ) {
            /*
            if (s.getClass().getName().equals("ar.edu.ubp.tc.Funcion")){
                Funcion f = ((Funcion)s);
                for(int i = 0; i < f.getParametros().size(); i++ ) {
                    if( nombre.equals( f.getParametros().get(i).getNombre() ) ) {
                        s.setUsada(usado);
                        f.getParametros().get(i).setInicializada("Si");
                        return true;
                    }
                }
            }
            */
            
            if( s.getNombre().equals( nombre ) ) {
                s.setUsada(usada);
                return true;
            }
        }
        return false;
    }

    public String toStringScope(int scope) {
        String tablaSimbolosString = "";
        
        for(Simbolo s : simbolos) {
            if( s.getScope() <= scope ) {
            tablaSimbolosString += s.toString();
            tablaSimbolosString += "\n";
            }
            
        }
        
        return tablaSimbolosString;
    }

    @Override
    public String toString() {
        String tablaSimbolosString = "";
        
        for(Simbolo s : simbolos) {
            tablaSimbolosString += s.toString();
            tablaSimbolosString += "\n";
        }
        
        return tablaSimbolosString;
    }

}
