// Generated from C:\Users\sebastian\Desktop\FINAL-TC\FinalCenzano\Final-TC\CompCenzano\src\ar\edu\u005Cubp\tc\CGrammar.g4 by ANTLR 4.2.2
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
		CARACTER_LLAVE_ABRE=1, CARACTER_LLAVE_CIERRA=2, CARACTER_PARENTESIS_ABRE=3, 
		CARACTER_PARENTESIS_CIERRA=4, TIPO_DATO_INT=5, TIPO_DATO_DOUBLE=6, TIPO_DATO_FLOAT=7, 
		TIPO_DATO_CHAR=8, TIPO_DATO_STRING=9, TIPO_DATO_VOID=10, ESTRUCTURA_IF=11, 
		ESTRUCTURA_ELSE=12, ESTRUCTURA_FOR=13, ESTRUCTURA_WHILE=14, INSTRUCCION_RETURN=15, 
		ID=16, VALORNULL=17, NUMERO=18, STRING=19, COMPARADOR_IGUAL=20, COMPARADOR_DISTINTO=21, 
		COMPARADOR_MAYOR=22, COMPARADOR_MENOR=23, COMPARADOR_MAYOR_IGUAL=24, COMPARADOR_MENOR_IGUAL=25, 
		OPERADOR_ASIGNACION=26, OPERADOR_SUMA=27, OPERADOR_RESTA=28, OPERADOR_PRODUCTO=29, 
		OPERADOR_DIVISION=30, OPERADOR_SUMA_COMPUESTA=31, OPERADOR_RESTA_COMPUESTA=32, 
		OPERADOR_PRODUCTO_COMPUESTO=33, OPERADOR_DIVISION_COMPUESTA=34, OPERADOR_INCREMENTO=35, 
		OPERADOR_DECREMENTO=36, OPERADOR_AND=37, OPERADOR_OR=38, SIGNO_COMA=39, 
		SIGNO_PUNTO=40, SIGNO_PUNTO_Y_COMA=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'}'", "'('", "')'", "'int '", "'double '", "'float '", "'char '", 
		"'string '", "'void '", "'if'", "'else'", "'for'", "'while'", "'return '", 
		"ID", "'null'", "NUMERO", "STRING", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'='", "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", "'*='", "'/='", 
		"'++'", "'--'", "'&&'", "'||'", "','", "'.'", "';'", "WS"
	};
	public static final String[] ruleNames = {
		"CARACTER_LLAVE_ABRE", "CARACTER_LLAVE_CIERRA", "CARACTER_PARENTESIS_ABRE", 
		"CARACTER_PARENTESIS_CIERRA", "TIPO_DATO_INT", "TIPO_DATO_DOUBLE", "TIPO_DATO_FLOAT", 
		"TIPO_DATO_CHAR", "TIPO_DATO_STRING", "TIPO_DATO_VOID", "ESTRUCTURA_IF", 
		"ESTRUCTURA_ELSE", "ESTRUCTURA_FOR", "ESTRUCTURA_WHILE", "INSTRUCCION_RETURN", 
		"LETRA", "DIGITO", "ID", "VALORNULL", "NUMERO", "STRING", "COMPARADOR_IGUAL", 
		"COMPARADOR_DISTINTO", "COMPARADOR_MAYOR", "COMPARADOR_MENOR", "COMPARADOR_MAYOR_IGUAL", 
		"COMPARADOR_MENOR_IGUAL", "OPERADOR_ASIGNACION", "OPERADOR_SUMA", "OPERADOR_RESTA", 
		"OPERADOR_PRODUCTO", "OPERADOR_DIVISION", "OPERADOR_SUMA_COMPUESTA", "OPERADOR_RESTA_COMPUESTA", 
		"OPERADOR_PRODUCTO_COMPUESTO", "OPERADOR_DIVISION_COMPUESTA", "OPERADOR_INCREMENTO", 
		"OPERADOR_DECREMENTO", "OPERADOR_AND", "OPERADOR_OR", "SIGNO_COMA", "SIGNO_PUNTO", 
		"SIGNO_PUNTO_Y_COMA", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\5\23\u00ac\n\23\3\23\3\23\3\23\7\23\u00b1\n\23\f\23\16\23\u00b4"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00bc\n\25\r\25\16\25\u00bd"+
		"\3\25\3\25\6\25\u00c2\n\25\r\25\16\25\u00c3\5\25\u00c6\n\25\3\26\3\26"+
		"\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3"+
		"-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\2#\2%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34"+
		";\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,\3\2\6\4\2C\\c|\3\2\62;\3\2$$"+
		"\5\2\13\f\17\17\"\"\u0111\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\t"+
		"a\3\2\2\2\13c\3\2\2\2\rh\3\2\2\2\17p\3\2\2\2\21w\3\2\2\2\23}\3\2\2\2\25"+
		"\u0085\3\2\2\2\27\u008b\3\2\2\2\31\u008e\3\2\2\2\33\u0093\3\2\2\2\35\u0097"+
		"\3\2\2\2\37\u009d\3\2\2\2!\u00a5\3\2\2\2#\u00a7\3\2\2\2%\u00ab\3\2\2\2"+
		"\'\u00b5\3\2\2\2)\u00bb\3\2\2\2+\u00c7\3\2\2\2-\u00d0\3\2\2\2/\u00d3\3"+
		"\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2\2\2\67\u00dd\3\2"+
		"\2\29\u00e0\3\2\2\2;\u00e2\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8"+
		"\3\2\2\2C\u00ea\3\2\2\2E\u00ed\3\2\2\2G\u00f0\3\2\2\2I\u00f3\3\2\2\2K"+
		"\u00f6\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2\2\2Q\u00ff\3\2\2\2S\u0102\3\2"+
		"\2\2U\u0104\3\2\2\2W\u0106\3\2\2\2Y\u0108\3\2\2\2[\\\7}\2\2\\\4\3\2\2"+
		"\2]^\7\177\2\2^\6\3\2\2\2_`\7*\2\2`\b\3\2\2\2ab\7+\2\2b\n\3\2\2\2cd\7"+
		"k\2\2de\7p\2\2ef\7v\2\2fg\7\"\2\2g\f\3\2\2\2hi\7f\2\2ij\7q\2\2jk\7w\2"+
		"\2kl\7d\2\2lm\7n\2\2mn\7g\2\2no\7\"\2\2o\16\3\2\2\2pq\7h\2\2qr\7n\2\2"+
		"rs\7q\2\2st\7c\2\2tu\7v\2\2uv\7\"\2\2v\20\3\2\2\2wx\7e\2\2xy\7j\2\2yz"+
		"\7c\2\2z{\7t\2\2{|\7\"\2\2|\22\3\2\2\2}~\7u\2\2~\177\7v\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7i\2\2\u0083"+
		"\u0084\7\"\2\2\u0084\24\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7q\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089\u008a\7\"\2\2\u008a\26\3"+
		"\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d\30\3\2\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091\u0092\7g\2\2\u0092"+
		"\32\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096"+
		"\34\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\36\3\2\2\2\u009d\u009e\7t\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7t\2\2"+
		"\u00a2\u00a3\7p\2\2\u00a3\u00a4\7\"\2\2\u00a4 \3\2\2\2\u00a5\u00a6\t\2"+
		"\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8$\3\2\2\2\u00a9\u00ac\5"+
		"!\21\2\u00aa\u00ac\7a\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00b2\3\2\2\2\u00ad\u00b1\5!\21\2\u00ae\u00b1\5#\22\2\u00af\u00b1\7a"+
		"\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3&\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7n\2\2\u00b9(\3\2\2\2\u00ba\u00bc\5#\22\2\u00bb\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c5\3\2\2\2\u00bf\u00c1\7\60\2\2\u00c0\u00c2\5#\22\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6*\3\2\2\2"+
		"\u00c7\u00cb\7$\2\2\u00c8\u00ca\n\4\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7?\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		"\60\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7>\2\2\u00d9"+
		"\64\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc\7?\2\2\u00dc\66\3\2\2\2\u00dd"+
		"\u00de\7>\2\2\u00de\u00df\7?\2\2\u00df8\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1"+
		":\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5>"+
		"\3\2\2\2\u00e6\u00e7\7,\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9"+
		"B\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb\u00ec\7?\2\2\u00ecD\3\2\2\2\u00ed\u00ee"+
		"\7/\2\2\u00ee\u00ef\7?\2\2\u00efF\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7?\2\2\u00f5J"+
		"\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7\u00f8\7-\2\2\u00f8L\3\2\2\2\u00f9\u00fa"+
		"\7/\2\2\u00fa\u00fb\7/\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\u00fe"+
		"\7(\2\2\u00feP\3\2\2\2\u00ff\u0100\7~\2\2\u0100\u0101\7~\2\2\u0101R\3"+
		"\2\2\2\u0102\u0103\7.\2\2\u0103T\3\2\2\2\u0104\u0105\7\60\2\2\u0105V\3"+
		"\2\2\2\u0106\u0107\7=\2\2\u0107X\3\2\2\2\u0108\u0109\t\5\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\b-\2\2\u010bZ\3\2\2\2\n\2\u00ab\u00b0\u00b2\u00bd"+
		"\u00c3\u00c5\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}