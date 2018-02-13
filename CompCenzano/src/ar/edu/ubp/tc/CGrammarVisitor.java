// Generated from C:\Users\sebastian\Desktop\FINAL-TC\FinalCenzano\CompCenzano\src\ar\edu\u005Cubp\tc\CGrammar.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CGrammarParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(@NotNull CGrammarParser.InstruccionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(@NotNull CGrammarParser.AsignacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(@NotNull CGrammarParser.Tipo_datoContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(@NotNull CGrammarParser.ProgramaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#for_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_asignacion(@NotNull CGrammarParser.For_asignacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declaraciones_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones_asignacion(@NotNull CGrammarParser.Declaraciones_asignacionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#termino_matematico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino_matematico(@NotNull CGrammarParser.Termino_matematicoContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(@NotNull CGrammarParser.Expresion_logicaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#estructura_control_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control_while(@NotNull CGrammarParser.Estructura_control_whileContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#parametros_en_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_en_declaracion(@NotNull CGrammarParser.Parametros_en_declaracionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#lista_parametros_en_llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros_en_llamada(@NotNull CGrammarParser.Lista_parametros_en_llamadaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#estructura_control_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control_for(@NotNull CGrammarParser.Estructura_control_forContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#estructura_control_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control_else(@NotNull CGrammarParser.Estructura_control_elseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#lista_parametros_en_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros_en_declaracion(@NotNull CGrammarParser.Lista_parametros_en_declaracionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#lista_expresiones_matematicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_expresiones_matematicas(@NotNull CGrammarParser.Lista_expresiones_matematicasContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declaracion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_variable(@NotNull CGrammarParser.Declaracion_variableContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(@NotNull CGrammarParser.Declaracion_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#bloque_instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones(@NotNull CGrammarParser.Bloque_instruccionesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#operador_incremento_decremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_incremento_decremento(@NotNull CGrammarParser.Operador_incremento_decrementoContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#estructura_control_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control_if(@NotNull CGrammarParser.Estructura_control_ifContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(@NotNull CGrammarParser.Llamada_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(@NotNull CGrammarParser.ValorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#estructura_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_control(@NotNull CGrammarParser.Estructura_controlContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#operador_asignacion_compuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_asignacion_compuesta(@NotNull CGrammarParser.Operador_asignacion_compuestaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#termino_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino_logico(@NotNull CGrammarParser.Termino_logicoContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(@NotNull CGrammarParser.ComentarioContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#lista_terminos_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_terminos_logicos(@NotNull CGrammarParser.Lista_terminos_logicosContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#comentario_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario_simple(@NotNull CGrammarParser.Comentario_simpleContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(@NotNull CGrammarParser.RetornoContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#parametros_en_llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_en_llamada(@NotNull CGrammarParser.Parametros_en_llamadaContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#valor_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_funcion(@NotNull CGrammarParser.Valor_funcionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#lista_expresiones_logicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_expresiones_logicas(@NotNull CGrammarParser.Lista_expresiones_logicasContext ctx);

	/**
	 * Visit a parse tree produced by {@link CGrammarParser#for_lista_asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_lista_asignaciones(@NotNull CGrammarParser.For_lista_asignacionesContext ctx);
}