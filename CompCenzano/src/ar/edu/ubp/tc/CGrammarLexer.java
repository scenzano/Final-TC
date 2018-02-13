// Generated from C:\Users\sebastian\Desktop\FINAL-TC\FinalCenzano\CompCenzano\src\ar\edu\u005Cubp\tc\CGrammar.g4 by ANTLR 4.2.2
package ar.edu.ubp.tc;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ESTRUCTURA_IF=2, ESTRUCTURA_ELSE=3, ESTRUCTURA_FOR=4, ESTRUCTURA_WHILE=5, 
		TIPO_DATO_INT=6, TIPO_DATO_DOUBLE=7, TIPO_DATO_FLOAT=8, TIPO_DATO_CHAR=9, 
		TIPO_DATO_STRING=10, TIPO_DATO_VOID=11, INSTRUCCION_RETURN=12, CARACTER_PARENTESIS_ABRE=13, 
		CARACTER_PARENTESIS_CIERRA=14, CARACTER_LLAVE_ABRE=15, CARACTER_LLAVE_CIERRA=16, 
		ID=17, NUMERO=18, STRING=19, VALORNULL=20, COMPARADOR_IGUAL=21, COMPARADOR_DISTINTO=22, 
		COMPARADOR_MAYOR=23, COMPARADOR_MENOR=24, COMPARADOR_MAYOR_IGUAL=25, COMPARADOR_MENOR_IGUAL=26, 
		OPERADOR_ASIGNACION=27, OPERADOR_SUMA=28, OPERADOR_RESTA=29, OPERADOR_PRODUCTO=30, 
		OPERADOR_DIVISION=31, OPERADOR_SUMA_COMPUESTA=32, OPERADOR_RESTA_COMPUESTA=33, 
		OPERADOR_PRODUCTO_COMPUESTO=34, OPERADOR_DIVISION_COMPUESTA=35, OPERADOR_INCREMENTO=36, 
		OPERADOR_DECREMENTO=37, OPERADOR_AND=38, OPERADOR_OR=39, SIGNO_COMA=40, 
		SIGNO_PUNTO=41, SIGNO_PUNTO_Y_COMA=42, COMENTARIO_SIMPLE=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "'if'", "'else'", "'for'", "'while'", "'int '", "'double '", "'float '", 
		"'char '", "'string '", "'void '", "'return '", "'('", "')'", "'{'", "'}'", 
		"ID", "NUMERO", "STRING", "'null'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'='", "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", "'*='", "'/='", 
		"'++'", "'--'", "'&&'", "'||'", "','", "'.'", "';'", "COMENTARIO_SIMPLE"
	};
	public static final String[] ruleNames = {
		"WS", "ESTRUCTURA_IF", "ESTRUCTURA_ELSE", "ESTRUCTURA_FOR", "ESTRUCTURA_WHILE", 
		"TIPO_DATO_INT", "TIPO_DATO_DOUBLE", "TIPO_DATO_FLOAT", "TIPO_DATO_CHAR", 
		"TIPO_DATO_STRING", "TIPO_DATO_VOID", "INSTRUCCION_RETURN", "CARACTER_PARENTESIS_ABRE", 
		"CARACTER_PARENTESIS_CIERRA", "CARACTER_LLAVE_ABRE", "CARACTER_LLAVE_CIERRA", 
		"LETRA", "DIGITO", "ID", "NUMERO", "STRING", "VALORNULL", "COMPARADOR_IGUAL", 
		"COMPARADOR_DISTINTO", "COMPARADOR_MAYOR", "COMPARADOR_MENOR", "COMPARADOR_MAYOR_IGUAL", 
		"COMPARADOR_MENOR_IGUAL", "OPERADOR_ASIGNACION", "OPERADOR_SUMA", "OPERADOR_RESTA", 
		"OPERADOR_PRODUCTO", "OPERADOR_DIVISION", "OPERADOR_SUMA_COMPUESTA", "OPERADOR_RESTA_COMPUESTA", 
		"OPERADOR_PRODUCTO_COMPUESTO", "OPERADOR_DIVISION_COMPUESTA", "OPERADOR_INCREMENTO", 
		"OPERADOR_DECREMENTO", "OPERADOR_AND", "OPERADOR_OR", "SIGNO_COMA", "SIGNO_PUNTO", 
		"SIGNO_PUNTO_Y_COMA", "COMENTARIO_SIMPLE"
	};


	public CGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\5\24\u00b2\n\24\3\24\3\24\3\24\7\24\u00b7\n"+
		"\24\f\24\16\24\u00ba\13\24\3\25\6\25\u00bd\n\25\r\25\16\25\u00be\3\25"+
		"\3\25\6\25\u00c3\n\25\r\25\16\25\u00c4\5\25\u00c7\n\25\3\26\3\26\7\26"+
		"\u00cb\n\26\f\26\16\26\u00ce\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\3.\7.\u0116\n.\f.\16.\u0119\13.\2\2/\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\2%\2\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A "+
		"C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-\3\2\7\5\2\13\f\17\17\"\"\5\2C\\c|~~\3\2\62"+
		";\3\2$$\3\2\f\f\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5a\3\2\2\2\7d\3"+
		"\2\2\2\ti\3\2\2\2\13m\3\2\2\2\rs\3\2\2\2\17x\3\2\2\2\21\u0080\3\2\2\2"+
		"\23\u0087\3\2\2\2\25\u008d\3\2\2\2\27\u0095\3\2\2\2\31\u009b\3\2\2\2\33"+
		"\u00a3\3\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab"+
		"\3\2\2\2%\u00ad\3\2\2\2\'\u00b1\3\2\2\2)\u00bc\3\2\2\2+\u00c8\3\2\2\2"+
		"-\u00d1\3\2\2\2/\u00d6\3\2\2\2\61\u00d9\3\2\2\2\63\u00dc\3\2\2\2\65\u00de"+
		"\3\2\2\2\67\u00e0\3\2\2\29\u00e3\3\2\2\2;\u00e6\3\2\2\2=\u00e8\3\2\2\2"+
		"?\u00ea\3\2\2\2A\u00ec\3\2\2\2C\u00ee\3\2\2\2E\u00f0\3\2\2\2G\u00f3\3"+
		"\2\2\2I\u00f6\3\2\2\2K\u00f9\3\2\2\2M\u00fc\3\2\2\2O\u00ff\3\2\2\2Q\u0102"+
		"\3\2\2\2S\u0105\3\2\2\2U\u0108\3\2\2\2W\u010a\3\2\2\2Y\u010c\3\2\2\2["+
		"\u010e\3\2\2\2]^\t\2\2\2^_\3\2\2\2_`\b\2\2\2`\4\3\2\2\2ab\7k\2\2bc\7h"+
		"\2\2c\6\3\2\2\2de\7g\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h\b\3\2\2\2ij\7h\2"+
		"\2jk\7q\2\2kl\7t\2\2l\n\3\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr"+
		"\7g\2\2r\f\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2vw\7\"\2\2w\16\3\2\2\2xy"+
		"\7f\2\2yz\7q\2\2z{\7w\2\2{|\7d\2\2|}\7n\2\2}~\7g\2\2~\177\7\"\2\2\177"+
		"\20\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7n\2\2\u0082\u0083\7q\2\2\u0083"+
		"\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\u0086\7\"\2\2\u0086\22\3\2\2\2"+
		"\u0087\u0088\7e\2\2\u0088\u0089\7j\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7\"\2\2\u008c\24\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2"+
		"\u0092\u0093\7i\2\2\u0093\u0094\7\"\2\2\u0094\26\3\2\2\2\u0095\u0096\7"+
		"x\2\2\u0096\u0097\7q\2\2\u0097\u0098\7k\2\2\u0098\u0099\7f\2\2\u0099\u009a"+
		"\7\"\2\2\u009a\30\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7\"\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4\34\3\2"+
		"\2\2\u00a5\u00a6\7+\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8 \3\2"+
		"\2\2\u00a9\u00aa\7\177\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac$"+
		"\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae&\3\2\2\2\u00af\u00b2\5#\22\2\u00b0"+
		"\u00b2\7a\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b8\3\2"+
		"\2\2\u00b3\u00b7\5#\22\2\u00b4\u00b7\5%\23\2\u00b5\u00b7\7a\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9(\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bd\5%\23\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c2\7\60"+
		"\2\2\u00c1\u00c3\5%\23\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7*\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb"+
		"\n\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7$"+
		"\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4"+
		"\7n\2\2\u00d4\u00d5\7n\2\2\u00d5.\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8\60\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db\7?\2\2\u00db\62"+
		"\3\2\2\2\u00dc\u00dd\7@\2\2\u00dd\64\3\2\2\2\u00de\u00df\7>\2\2\u00df"+
		"\66\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e28\3\2\2\2\u00e3"+
		"\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		"<\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7/\2\2\u00eb@"+
		"\3\2\2\2\u00ec\u00ed\7,\2\2\u00edB\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef"+
		"D\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\u00f2\7?\2\2\u00f2F\3\2\2\2\u00f3\u00f4"+
		"\7/\2\2\u00f4\u00f5\7?\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8"+
		"\7?\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7?\2\2\u00fbL"+
		"\3\2\2\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\7-\2\2\u00feN\3\2\2\2\u00ff\u0100"+
		"\7/\2\2\u0100\u0101\7/\2\2\u0101P\3\2\2\2\u0102\u0103\7(\2\2\u0103\u0104"+
		"\7(\2\2\u0104R\3\2\2\2\u0105\u0106\7~\2\2\u0106\u0107\7~\2\2\u0107T\3"+
		"\2\2\2\u0108\u0109\7.\2\2\u0109V\3\2\2\2\u010a\u010b\7\60\2\2\u010bX\3"+
		"\2\2\2\u010c\u010d\7=\2\2\u010dZ\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110"+
		"\7\61\2\2\u0110\u0117\3\2\2\2\u0111\u0116\n\6\2\2\u0112\u0116\5#\22\2"+
		"\u0113\u0116\5%\23\2\u0114\u0116\7a\2\2\u0115\u0111\3\2\2\2\u0115\u0112"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\\\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\f\2\u00b1\u00b6\u00b8\u00be\u00c4\u00c6\u00cc\u0115\u0117\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}