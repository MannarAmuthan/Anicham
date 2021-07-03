// Generated from grammar/Yaappu/Venba.g4 by ANTLR 4.5.1

    package grammar.Yaappu;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VenbaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MEI=1, UYIR_MEI_OU=2, UYIR_MEI_OA=3, UYIR_MEI_O=4, UYIR_MEI_AI=5, UYIR_MEI_AE=6, 
		UYIR_MEI_E=7, UYIR_MEI_OO=8, UYIR_MEI_U=9, UYIR_MEI_EE=10, UYIR_MEI_I=11, 
		UYIR_MEI_AA=12, UYIR_MEI_A=13, A_UYIR=14, AA_UYIR=15, I_UYIR=16, EE_UYIR=17, 
		U_UYIR=18, OO_UYIR=19, E_UYIR=20, AE_UYIR=21, AI_UYIR=22, O_UYIR=23, OA_UYIR=24, 
		OU_UYIR=25, AAYTHAM=26, PULLI=27, KAAL=28, SULI=29, NEDIL_SULI=30, U_KURIL=31, 
		U_NEDIL=32, EA_KURIL=33, EA_NEDIL=34, I=35, O_KURIL=36, O_NEDIL=37, OU=38, 
		NEWLINE=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", "UYIR_MEI_AE", 
		"UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", "UYIR_MEI_I", 
		"UYIR_MEI_AA", "UYIR_MEI_A", "A_UYIR", "AA_UYIR", "I_UYIR", "EE_UYIR", 
		"U_UYIR", "OO_UYIR", "E_UYIR", "AE_UYIR", "AI_UYIR", "O_UYIR", "OA_UYIR", 
		"OU_UYIR", "AAYTHAM", "PULLI", "KAAL", "SULI", "NEDIL_SULI", "U_KURIL", 
		"U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", "O_NEDIL", "OU", "NEWLINE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'\\u0B85'", "'\\u0B86'", "'\\u0B87'", "'\\u0B88'", "'\\u0B89'", 
		"'\\u0B8A'", "'\\u0B8E'", "'\\u0B8F'", "'\\u0B90'", "'\\u0B92'", "'\\u0B93'", 
		"'\\u0B94'", "'\\u0B83'", "'\\u0BCD'", "'\\u0BBE'", "'\\u0BBF'", "'\\u0BC0'", 
		"'\\u0BC1'", "'\\u0BC2'", "'\\u0BC6'", "'\\u0BC7'", "'\\u0BC8'", "'\\u0BCA'", 
		"'\\u0BCB'", "'\\u0BCC'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", 
		"UYIR_MEI_AE", "UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", 
		"UYIR_MEI_I", "UYIR_MEI_AA", "UYIR_MEI_A", "A_UYIR", "AA_UYIR", "I_UYIR", 
		"EE_UYIR", "U_UYIR", "OO_UYIR", "E_UYIR", "AE_UYIR", "AI_UYIR", "O_UYIR", 
		"OA_UYIR", "OU_UYIR", "AAYTHAM", "PULLI", "KAAL", "SULI", "NEDIL_SULI", 
		"U_KURIL", "U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", "O_NEDIL", 
		"OU", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VenbaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Venba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00b5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\6(\u00ad\n(\r(\16(\u00ae\3)\6)\u00b2\n)\r)\16)\u00b3"+
		"\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\5\b\2\u0b97\u0b97\u0b9b\u0b9c\u0ba0\u0ba1"+
		"\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\3\2\f\f\4\2\13\13\"\"\u00b6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5V\3\2"+
		"\2\2\7Y\3\2\2\2\t\\\3\2\2\2\13_\3\2\2\2\rb\3\2\2\2\17e\3\2\2\2\21h\3\2"+
		"\2\2\23k\3\2\2\2\25n\3\2\2\2\27q\3\2\2\2\31t\3\2\2\2\33w\3\2\2\2\35y\3"+
		"\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2"+
		"\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008d"+
		"\3\2\2\2\63\u008f\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\29\u0095\3\2"+
		"\2\2;\u0097\3\2\2\2=\u0099\3\2\2\2?\u009b\3\2\2\2A\u009d\3\2\2\2C\u009f"+
		"\3\2\2\2E\u00a1\3\2\2\2G\u00a3\3\2\2\2I\u00a5\3\2\2\2K\u00a7\3\2\2\2M"+
		"\u00a9\3\2\2\2O\u00ac\3\2\2\2Q\u00b1\3\2\2\2ST\5\33\16\2TU\5\67\34\2U"+
		"\4\3\2\2\2VW\5\33\16\2WX\5M\'\2X\6\3\2\2\2YZ\5\33\16\2Z[\5K&\2[\b\3\2"+
		"\2\2\\]\5\33\16\2]^\5I%\2^\n\3\2\2\2_`\5\33\16\2`a\5G$\2a\f\3\2\2\2bc"+
		"\5\33\16\2cd\5E#\2d\16\3\2\2\2ef\5\33\16\2fg\5C\"\2g\20\3\2\2\2hi\5\33"+
		"\16\2ij\5A!\2j\22\3\2\2\2kl\5\33\16\2lm\5? \2m\24\3\2\2\2no\5\33\16\2"+
		"op\5=\37\2p\26\3\2\2\2qr\5\33\16\2rs\5;\36\2s\30\3\2\2\2tu\5\33\16\2u"+
		"v\59\35\2v\32\3\2\2\2wx\t\2\2\2x\34\3\2\2\2yz\7\u0b87\2\2z\36\3\2\2\2"+
		"{|\7\u0b88\2\2| \3\2\2\2}~\7\u0b89\2\2~\"\3\2\2\2\177\u0080\7\u0b8a\2"+
		"\2\u0080$\3\2\2\2\u0081\u0082\7\u0b8b\2\2\u0082&\3\2\2\2\u0083\u0084\7"+
		"\u0b8c\2\2\u0084(\3\2\2\2\u0085\u0086\7\u0b90\2\2\u0086*\3\2\2\2\u0087"+
		"\u0088\7\u0b91\2\2\u0088,\3\2\2\2\u0089\u008a\7\u0b92\2\2\u008a.\3\2\2"+
		"\2\u008b\u008c\7\u0b94\2\2\u008c\60\3\2\2\2\u008d\u008e\7\u0b95\2\2\u008e"+
		"\62\3\2\2\2\u008f\u0090\7\u0b96\2\2\u0090\64\3\2\2\2\u0091\u0092\7\u0b85"+
		"\2\2\u0092\66\3\2\2\2\u0093\u0094\7\u0bcf\2\2\u00948\3\2\2\2\u0095\u0096"+
		"\7\u0bc0\2\2\u0096:\3\2\2\2\u0097\u0098\7\u0bc1\2\2\u0098<\3\2\2\2\u0099"+
		"\u009a\7\u0bc2\2\2\u009a>\3\2\2\2\u009b\u009c\7\u0bc3\2\2\u009c@\3\2\2"+
		"\2\u009d\u009e\7\u0bc4\2\2\u009eB\3\2\2\2\u009f\u00a0\7\u0bc8\2\2\u00a0"+
		"D\3\2\2\2\u00a1\u00a2\7\u0bc9\2\2\u00a2F\3\2\2\2\u00a3\u00a4\7\u0bca\2"+
		"\2\u00a4H\3\2\2\2\u00a5\u00a6\7\u0bcc\2\2\u00a6J\3\2\2\2\u00a7\u00a8\7"+
		"\u0bcd\2\2\u00a8L\3\2\2\2\u00a9\u00aa\7\u0bce\2\2\u00aaN\3\2\2\2\u00ab"+
		"\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00afP\3\2\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"R\3\2\2\2\6\2\u00ae\u00b1\u00b3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}