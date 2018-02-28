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
public class Tac {
    
    LinkedList<Instruccion> instrucciones;
    int cantInstrucciones;
    String finalCode;
    
    
    public Tac() {
        instrucciones = new LinkedList<>();
        cantInstrucciones = 0;
        finalCode = "";
    }
    
    public LinkedList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(LinkedList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    public void setCantInstrucciones(int cantInstrucciones) {
        this.cantInstrucciones = cantInstrucciones;
    }
    
    public Instruccion getInstruccion(String nombre) {
        for(Instruccion ins : instrucciones) {
            if(ins.getNombre().equals(nombre)){
                return ins;
            }
        }
        
        return null;
    }


    public void addVariable(Variable var){
        
        String code = "";
        Instruccion ins;
       
        ins = getInstruccion(var.getNombre());
        if(ins != null){
            code += ins.getId3ac() + " := " + (((var.getValor() == "") ? "0": var.getValor()) + "\t//" + var.getNombre());
        }
        else{
            ins = new Instruccion();
            code += "t" + cantInstrucciones + " := " + (((var.getValor() == "") ? "0": var.getValor()) + "\t//" + var.getNombre());
        }
        ins.setId3ac("t" + cantInstrucciones);
        ins.setNombre(var.getNombre());
        instrucciones.add(ins);
        cantInstrucciones++;
        finalCode += code + "\n";
    }

    @Override
    public String toString(){
        return finalCode;
    }
    
}
