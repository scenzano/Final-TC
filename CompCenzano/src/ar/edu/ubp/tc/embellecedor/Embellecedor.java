/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.ubp.tc.embellecedor;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author sebastian
 */
public class Embellecedor {
    
    private StringBuffer out;
    private Integer tabCounter=0;
    
    private String fileOut;
    private static Embellecedor ins;
    
    public static Embellecedor getInstance(){
        if (ins==null)ins = new Embellecedor();
        return ins;
    }

    private Embellecedor() {        
        this.out= new StringBuffer();
    }
    
    public void init(String fileOut){
        this.fileOut = fileOut;
    }
    

    public void incrementarTabs(){
        this.tabCounter++;
    }
    public void decrementarTabs(){
        this.tabCounter--;
    }

    public StringBuffer getOut() {
        return out;
    }
    
    public void append(String line, boolean indentar, int newLine){
        
        if(newLine != 0){
            for(Integer i=0;i<newLine;i++){
                out.append(System.getProperty("line.separator"));
                if(line.startsWith(" ") || line.startsWith(System.getProperty("line.separator"))){
                    line = line.substring(1);
                }
            }
        }
        if(indentar){
            for(Integer i=0;i<tabCounter;i++){
                out.append("\t");
            }
        }
        out.append(line);    
    }
    
    
    public void persistirArchivo() throws FileNotFoundException{
        try (PrintWriter archivo = new PrintWriter(fileOut)) {
            archivo.print(this.out.toString());
            archivo.close();
        }
        
    }
    
    
}
