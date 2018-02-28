/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.ubp.tc;

import ar.edu.ubp.tc.embellecedor.Embellecedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

/**
 *
 * @author sebastian
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException{
        try{
            
            Embellecedor.getInstance().init("..\\TextoOutput.txt");
            //levantamos el archivo a procesar
            String archivo = "..\\TextoInput.txt";
            FileInputStream stream = new FileInputStream(archivo);
            
            //creamos un ANTLRInputStream pasándole el stream del archivo
            ANTLRInputStream antlrStream = new ANTLRInputStream(stream);
            
            //Creamos un lexer
            CGrammarLexer lexer = new CGrammarLexer(antlrStream);
            
            //levantamos los tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            //Creamos el parser
            CGrammarParser parser = new CGrammarParser(tokens);
            
            
            //Aramamos un árbol iniciando el proceso. para esto el generador 
            //de código crea un método dentro del parser con el nombre del símbolo 
            //inicial. Debemos invocar ese método.
            ParseTree tree = parser.programa();
            
            CGrammarBaseVisitor visitor = new CGrammarBaseVisitor();
            tree.accept(visitor);
            
            

            if(visitor.compilacionExitosa)
            {
                System.out.println("Compilacion exitosa!");

            }
            else
            {
                System.out.println("La compilacion ha fallado!");
                System.exit(-1);
            }
            
            Embellecedor.getInstance().persistirArchivo();
            
            File salida = new File("..\\Tabla3ac.txt");
            try (FileWriter escribir = new FileWriter(salida,false)) {
                escribir.write(visitor.outTabla);
            }


            //Podríamos imprimir el árbol por consola.
            System.out.println("arbol:"+tree.toStringTree(parser));
            //voy a imprimir arbol con gui
            TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewr.open();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}
