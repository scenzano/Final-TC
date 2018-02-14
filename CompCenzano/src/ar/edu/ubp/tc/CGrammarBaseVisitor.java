// Generated from C:\Users\sebastian\Desktop\FINAL-TC\FinalCenzano\Final-TC\CompCenzano\src\ar\edu\u005Cubp\tc\CGrammar.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc;
import ar.edu.ubp.tc.embellecedor.Embellecedor;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

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
		embellecedor.append(ctx.getText(), true, 1);
		return visitChildren(ctx);
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTipo_dato(@NotNull CGrammarParser.Tipo_datoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrograma(@NotNull CGrammarParser.ProgramaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFor_asignacion(@NotNull CGrammarParser.For_asignacionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaraciones_asignacion(@NotNull CGrammarParser.Declaraciones_asignacionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTermino_matematico(@NotNull CGrammarParser.Termino_matematicoContext ctx) { return visitChildren(ctx); }

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
            
            embellecedor.append(ctx.getChild(0).getText(), true, 1);
            embellecedor.append(ctx.getChild(1).getText(), false, 0);
            embellecedor.append(ctx.getChild(2).getText(), false, 0);
            embellecedor.append(ctx.getChild(3).getText(), false, 0);
            
            return visitChildren(ctx);
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametros_en_declaracion(@NotNull CGrammarParser.Parametros_en_declaracionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_parametros_en_llamada(@NotNull CGrammarParser.Lista_parametros_en_llamadaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_for(@NotNull CGrammarParser.Estructura_control_forContext ctx) {
            /*
            embellecedor.append(ctx.ESTRUCTURA_FOR().getText(), true, 2);
            embellecedor.append(ctx.CARACTER_PARENTESIS_ABRE().getText(), false, 0);
            embellecedor.append(ctx.getChild(2).getText(),false, 0);
            embellecedor.append(ctx.SIGNO_PUNTO_Y_COMA(0).getText(), false, 0);
            embellecedor.append(ctx.getChild(4).getText(),false, 0);
            embellecedor.append(ctx.SIGNO_PUNTO_Y_COMA(1).getText(), false, 0);
            embellecedor.append(ctx.getChild(6).getText(),false, 0);
            embellecedor.append(ctx.CARACTER_PARENTESIS_CIERRA().getText(), false, 0);
            */
            
            embellecedor.append(ctx.getChild(0).getText(), true, 2);
            embellecedor.append(ctx.getChild(1).getText(), false, 0);
            embellecedor.append(ctx.getChild(2).getText(),false, 0);
            embellecedor.append(ctx.getChild(3).getText(), false, 0);
            embellecedor.append(ctx.getChild(4).getText(),false, 0);
            embellecedor.append(ctx.getChild(5).getText(), false, 0);
            embellecedor.append(ctx.getChild(6).getText(),false, 0);
            embellecedor.append(ctx.getChild(7).getText(), false, 0);
            
            return visitChildren(ctx);
            
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_else(@NotNull CGrammarParser.Estructura_control_elseContext ctx) {
            
            embellecedor.append(ctx.getChild(0).getText(), true, 1);
            visitChildren(ctx);

            return null;   
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_parametros_en_declaracion(@NotNull CGrammarParser.Lista_parametros_en_declaracionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_expresiones_matematicas(@NotNull CGrammarParser.Lista_expresiones_matematicasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion_variable(@NotNull CGrammarParser.Declaracion_variableContext ctx) {

		embellecedor.append(ctx.getText(), true, 1);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclaracion_funcion(@NotNull CGrammarParser.Declaracion_funcionContext ctx) {
            /*
            embellecedor.append(ctx.tipo_dato().getText(), false, 0);
            embellecedor.append(ctx.ID().getText(), false, 0);
            embellecedor.append(ctx.CARACTER_PARENTESIS_ABRE().getText(), false, 0);
            embellecedor.append(ctx.parametros_en_declaracion().getText(), false, 0);
            embellecedor.append(ctx.CARACTER_PARENTESIS_CIERRA().getText(), true, 0);
            return visitChildren(ctx);
            */
            embellecedor.append(ctx.getChild(0).getText(), false, 0);
            embellecedor.append(ctx.getChild(1).getText(), false, 0);
            embellecedor.append(ctx.getChild(2).getText(), false, 0);
            embellecedor.append(ctx.getChild(3).getText(), false, 0);
            embellecedor.append(ctx.getChild(4).getText(), true, 0);
            return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBloque_instrucciones(@NotNull CGrammarParser.Bloque_instruccionesContext ctx) {

            embellecedor.append(ctx.CARACTER_LLAVE_ABRE().getText(), true, 1);
            embellecedor.incrementarTabs();
            visitChildren(ctx);
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
	@Override public T visitOperador_incremento_decremento(@NotNull CGrammarParser.Operador_incremento_decrementoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEstructura_control_if(@NotNull CGrammarParser.Estructura_control_ifContext ctx) {

            embellecedor.append(ctx.getChild(0).getText(), true, 1);
            embellecedor.append(ctx.getChild(1).getText(), false, 0);
            embellecedor.append(ctx.getChild(2).getText(), false, 0);
            embellecedor.append(ctx.getChild(3).getText(), false, 0);
            visitChildren(ctx);
            
            
            return null;
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLlamada_funcion(@NotNull CGrammarParser.Llamada_funcionContext ctx) {
            embellecedor.append(ctx.getText(), true, 0);
            return visitChildren(ctx);
        }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValor(@NotNull CGrammarParser.ValorContext ctx) { return visitChildren(ctx); }

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
	@Override public T visitTermino_logico(@NotNull CGrammarParser.Termino_logicoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_terminos_logicos(@NotNull CGrammarParser.Lista_terminos_logicosContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitRetorno(@NotNull CGrammarParser.RetornoContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParametros_en_llamada(@NotNull CGrammarParser.Parametros_en_llamadaContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValor_funcion(@NotNull CGrammarParser.Valor_funcionContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLista_expresiones_logicas(@NotNull CGrammarParser.Lista_expresiones_logicasContext ctx) { return visitChildren(ctx); }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFor_lista_asignaciones(@NotNull CGrammarParser.For_lista_asignacionesContext ctx) {
            return visitChildren(ctx);
        }
}