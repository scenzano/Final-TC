// Generated from C:\Users\sebastian\Desktop\FINAL-TC\FinalCenzano\Final-TC\CompCenzano\src\ar\edu\u005Cubp\tc\CGrammar.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc;
import ar.edu.ubp.tc.embellecedor.Embellecedor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This class provides an empty implementation of {@link CGrammarVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CGrammarBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CGrammarVisitor<T> {

	Embellecedor embellecedor = Embellecedor.getInstance();
	TablaSimbolos tabla = new TablaSimbolos();
	int scope = 0;
	boolean compilacionExitosa = true;


	/************************************************************************
	
	ctx: should be the context of wich you want print the tokens and visit other ParseTrees
	firstIndent: to Change the identation of the first print.
	lineBreaks: the amount of line breaks before start printing.

	User defined function.
	IMPORTANT: This function visits all the childs of a context, so all your other
	visits calls should be erased.

	************************************************************************/
	private void PrintAndVisit(ParserRuleContext ctx, boolean firstIndent, int lineBreaks){

		ParseTree child;

        if(ctx.getChildCount() != 0){
        	child = ctx.getChild(0);
        	if(child.getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")){
            	embellecedor.append(child.getText(), firstIndent, lineBreaks);
	        }
	        else{
	            visit(child);
	        }

	        for(int i = 1; i < ctx.getChildCount(); ++i){
	            child = ctx.getChild(i);
	            if(child.getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")){
	                embellecedor.append(child.getText(), false, 0);
	            }
	            else{
	                visit(child);
	            }
        	}	
        }

	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInstrucciones(@NotNull CGrammarParser.InstruccionesContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAsignacion(@NotNull CGrammarParser.AsignacionContext ctx) {
        
        Variable var = new Variable();

        PrintAndVisit(ctx, true, 1);

        var.setNombre(ctx.getChild(0).getText());
        var.setScope(scope);
        
        if(tabla.existeSimbolo(var)){
            tabla.setUsadoSimbolo(var.getNombre(), true);
        }
        else{
            System.out.println("La variable " + var.getNombre() + " no fue declarada o esta siendo usada fuera de su scope.\n");
            compilacionExitosa = false;   
        }
        
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTipo_dato(@NotNull CGrammarParser.Tipo_datoContext ctx) {

		String parentName = ctx.getParent().getClass().getName();

        if(parentName == "ar.edu.ubp.tc.CGrammarParser$Declaracion_variableContext" 
        	|| parentName == "ar.edu.ubp.tc.CGrammarParser$Declaracion_funcionContext" ){
        	PrintAndVisit(ctx, true, 1);
        }
        else{
        	PrintAndVisit(ctx, false, 0);
        }
		
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrograma(@NotNull CGrammarParser.ProgramaContext ctx) {
        
        visitChildren(ctx);
    
        if(compilacionExitosa){
            System.out.println("Tabla de simbolos final\n\n" + tabla.toString());
        }
            
        //resultado_Parser += ("\nTabla de simbolos final\n\n" + tablaSimbolos.toString());
        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFor_asignacion(@NotNull CGrammarParser.For_asignacionContext ctx) {

        PrintAndVisit(ctx, false, 0);

        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaraciones_asignacion(@NotNull CGrammarParser.Declaraciones_asignacionContext ctx) {

        PrintAndVisit(ctx, false, 0);
            
        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTermino_matematico(@NotNull CGrammarParser.Termino_matematicoContext ctx) {

	    PrintAndVisit(ctx, false, 0);

        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpresion_logica(@NotNull CGrammarParser.Expresion_logicaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_while(@NotNull CGrammarParser.Estructura_control_whileContext ctx) {

	    PrintAndVisit(ctx, true, 2);
           
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametros_en_declaracion(@NotNull CGrammarParser.Parametros_en_declaracionContext ctx) {


		PrintAndVisit(ctx, false, 0);

        Variable var = new Variable();

        if (ctx.getChildCount() != 0 && ctx.getChildCount() < 4){
                
            var.setTipo(ctx.getChild(0).getText());
            var.setNombre(ctx.getChild(1).getText());
            var.setScope(scope);
            Simbolo ultimoSimbolo = tabla.getSimbolos().getLast();

            if (ultimoSimbolo.getClass().getName().equals("ar.edu.ubp.tc.Funcion")){

                if( !((Funcion)ultimoSimbolo).agregarArgumento(var) ) {
                   	System.out.println( "Error: El argumento " + ctx.getChild(1).getText() + " ya ha sido declarado." );
                  	compilacionExitosa = false;
                }
            }
        }

        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_parametros_en_llamada(@NotNull CGrammarParser.Lista_parametros_en_llamadaContext ctx) {

		PrintAndVisit(ctx, false, 0);

		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_for(@NotNull CGrammarParser.Estructura_control_forContext ctx) {

		PrintAndVisit(ctx, true, 2);
            
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_else(@NotNull CGrammarParser.Estructura_control_elseContext ctx) {

		PrintAndVisit(ctx, true, 1);
            
        return null;   
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_parametros_en_declaracion(@NotNull CGrammarParser.Lista_parametros_en_declaracionContext ctx) {
            
        Variable var = new Variable();

        PrintAndVisit(ctx, false, 0);
     
        if (ctx.getChildCount() != 0 && ctx.getChildCount() < 5){
                
            var.setTipo(ctx.getChild(1).getText());
            var.setNombre(ctx.getChild(2).getText());
            var.setScope(scope);

            Simbolo ultimoSimbolo = tabla.getSimbolos().getLast();

            if (ultimoSimbolo.getClass().getName().equals("ar.edu.ubp.tc.Funcion")){

                if( !((Funcion)ultimoSimbolo).agregarArgumento(var) ) {
                  	System.out.println( "Error: El argumento " + ctx.getChild(2) + " ya ha sido declarado." );
                  	compilacionExitosa = false;
                }
            }
        }
            
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_expresiones_matematicas(@NotNull CGrammarParser.Lista_expresiones_matematicasContext ctx) {
	       
	    PrintAndVisit(ctx, false, 0);
            
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion_variable(@NotNull CGrammarParser.Declaracion_variableContext ctx) {
        
        Variable var = new Variable();

        PrintAndVisit(ctx, true, 1);

        var.setTipo(ctx.getChild(0).getText());
        var.setNombre(ctx.getChild(1).getText());
        var.setScope(scope);
        
        if(!tabla.agregarSimbolo( var )){
            System.out.println( "Error: El simbolo " + ctx.getChild(1).getText() + " ya ha sido declarado.\n" );
            //resultado_Parser += ( "\nError: El simbolo " + identificador + " ya ha sido declarado." );
            compilacionExitosa = false;
        }
        
        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion_funcion(@NotNull CGrammarParser.Declaracion_funcionContext ctx) {            
            
        Funcion fun = new Funcion();
           
        fun.setTipo(ctx.getChild(0).getText());
        fun.setNombre(ctx.getChild(1).getText());
        fun.setScope(scope);
           
        if(!tabla.agregarSimbolo( fun )){
            System.out.println( "Error: El simbolo " + ctx.getChild(1).getText() + " ya ha sido declarado." );
            //resultado_Parser += ( "\nError: El simbolo " + identificador + " ya ha sido declarado." );
            compilacionExitosa = false;
        }

        embellecedor.append(ctx.getChild(0).getText(), true, 2);
        embellecedor.append(ctx.getChild(1).getText(), false, 0);
        embellecedor.append(ctx.getChild(2).getText(), false, 0);

        
        //Este cambio de scope es para que las variables declaradas tengan el mismo scope que el bloque
        //pero necesito testearlo
        scope++;
        visit(ctx.getChild(3));
        scope--;

        embellecedor.append(ctx.getChild(4).getText(), false, 0);
        
        if(ctx.getChild(5).getClass().getName().equals("org.antlr.v4.runtime.tree.TerminalNodeImpl")){
        	embellecedor.append(ctx.getChild(5).getText(), false, 0);
        }
        else{
        	visit(ctx.getChild(5));
        }

        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBloque_instrucciones(@NotNull CGrammarParser.Bloque_instruccionesContext ctx) {
        
        scope++;
        embellecedor.append(ctx.CARACTER_LLAVE_ABRE().getText(), true, 1);
        embellecedor.incrementarTabs();
        
        visitChildren(ctx);
        
        System.out.println("Tabla de simbolos incluyendo hasta scope profundidad " + scope );
                     
        System.out.println(tabla.toStringScope(scope));
        tabla.removerSimbolos(scope);
        scope--;
        embellecedor.decrementarTabs();
        embellecedor.append(ctx.CARACTER_LLAVE_CIERRA().getText(), true, 1);
        
        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperador_incremento_decremento(@NotNull CGrammarParser.Operador_incremento_decrementoContext ctx) {

		embellecedor.append(ctx.getText(), false, 0);

		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_if(@NotNull CGrammarParser.Estructura_control_ifContext ctx) {

		PrintAndVisit(ctx, true, 1);

        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLlamada_funcion(@NotNull CGrammarParser.Llamada_funcionContext ctx) {

		visitChildren(ctx);
        embellecedor.append(ctx.getChild(1).getText(), false, 0);
        return null;
    }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValor(@NotNull CGrammarParser.ValorContext ctx) {

        PrintAndVisit(ctx, false, 0);
        
        if(ctx.ID() != null){
        	Variable var = new Variable();
            var.setNombre(ctx.ID().getText());
            var.setScope(scope);

            if(!tabla.existeSimbolo(var)){
	            System.out.println("La variable " + var.getNombre() + " no fue declarada o esta siendo usada fuera de su scope.\n");
	            //resultado_Parser += ( "\nError: La variable " + var.getNombre() + " no fue declarada o esta siendo usada fuera de su scope.\n" );
	            compilacionExitosa = false;
        	}
        	else{
	              
        	}
        }
        
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control(@NotNull CGrammarParser.Estructura_controlContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperador_asignacion_compuesta(@NotNull CGrammarParser.Operador_asignacion_compuestaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTermino_logico(@NotNull CGrammarParser.Termino_logicoContext ctx) {

		PrintAndVisit(ctx, false, 0);

	    return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_terminos_logicos(@NotNull CGrammarParser.Lista_terminos_logicosContext ctx) {

		PrintAndVisit(ctx, false, 0);

	    return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRetorno(@NotNull CGrammarParser.RetornoContext ctx) {


		PrintAndVisit(ctx, true, 1);
                
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametros_en_llamada(@NotNull CGrammarParser.Parametros_en_llamadaContext ctx) {

		PrintAndVisit(ctx, false, 0);

		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValor_funcion(@NotNull CGrammarParser.Valor_funcionContext ctx) {

		Funcion fun = new Funcion();

		PrintAndVisit(ctx, false, 0);
                
        fun.setNombre(ctx.getChild(0).getText());
        fun.setScope(scope);
        
        if(tabla.existeSimbolo(fun)){
            tabla.setUsadoSimbolo(fun.getNombre(), true);
        }
        else{
            System.out.println("La funcion " + fun.getNombre() + " no fue declarada o esta siendo usada fuera de scope.\n");
            compilacionExitosa = false;   
        }
        
        return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_expresiones_logicas(@NotNull CGrammarParser.Lista_expresiones_logicasContext ctx) {

		PrintAndVisit(ctx, false, 0);

	    return null;

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFor_lista_asignaciones(@NotNull CGrammarParser.For_lista_asignacionesContext ctx) {
    
        PrintAndVisit(ctx, true, 1);

	    return null;
    }
}