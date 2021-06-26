// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamizhLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MEI=1, UYIR_MEI_OU=2, UYIR_MEI_OA=3, UYIR_MEI_O=4, UYIR_MEI_AI=5, UYIR_MEI_AE=6, 
		UYIR_MEI_E=7, UYIR_MEI_OO=8, UYIR_MEI_U=9, UYIR_MEI_EE=10, UYIR_MEI_I=11, 
		UYIR_MEI_AA=12, UYIR_MEI_A=13, UYIR=14, PULLI=15, KAAL=16, SULI=17, NEDIL_SULI=18, 
		U_KURIL=19, U_NEDIL=20, EA_KURIL=21, EA_NEDIL=22, I=23, O_KURIL=24, O_NEDIL=25, 
		OU=26, AAYTHAM=27, GRANTHA_SRI=28, GRANTHA_MEI=29, GRANTHA_OU=30, GRANTHA_OA=31, 
		GRANTHA_O=32, GRANTHA_AI=33, GRANTHA_AE=34, GRANTHA_E=35, GRANTHA_OO=36, 
		GRANTHA_U=37, GRANTHA_EE=38, GRANTHA_I=39, GRANTHA_AA=40, GRANTHA_A=41, 
		GRANTHA_JA=42, GRANTHA_SH=43, GRANTHA_SS=44, GRANTHA_S=45, GRANTHA_H=46, 
		PUNCTUATIONS=47, SOL_SEPARATOR=48, WS=49, STOP_POINT=50, NEWLINE=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", "UYIR_MEI_AE", 
		"UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", "UYIR_MEI_I", 
		"UYIR_MEI_AA", "UYIR_MEI_A", "UYIR", "PULLI", "KAAL", "SULI", "NEDIL_SULI", 
		"U_KURIL", "U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", "O_NEDIL", 
		"OU", "AAYTHAM", "GRANTHA_SRI", "GRANTHA_MEI", "GRANTHA_OU", "GRANTHA_OA", 
		"GRANTHA_O", "GRANTHA_AI", "GRANTHA_AE", "GRANTHA_E", "GRANTHA_OO", "GRANTHA_U", 
		"GRANTHA_EE", "GRANTHA_I", "GRANTHA_AA", "GRANTHA_A", "GRANTHA_JA", "GRANTHA_SH", 
		"GRANTHA_SS", "GRANTHA_S", "GRANTHA_H", "PUNCTUATIONS", "SOL_SEPARATOR", 
		"WS", "STOP_POINT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'\\u0BCD'", "'\\u0BBE'", "'\\u0BBF'", "'\\u0BC0'", 
		"'\\u0BC1'", "'\\u0BC2'", "'\\u0BC6'", "'\\u0BC7'", "'\\u0BC8'", "'\\u0BCA'", 
		"'\\u0BCB'", "'\\u0BCC'", "'\\u0B83'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'\\u0B9C'", "'\\u0BB6'", 
		"'\\u0BB7'", "'\\u0BB8'", "'\\u0BB9'", null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", 
		"UYIR_MEI_AE", "UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", 
		"UYIR_MEI_I", "UYIR_MEI_AA", "UYIR_MEI_A", "UYIR", "PULLI", "KAAL", "SULI", 
		"NEDIL_SULI", "U_KURIL", "U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", 
		"O_NEDIL", "OU", "AAYTHAM", "GRANTHA_SRI", "GRANTHA_MEI", "GRANTHA_OU", 
		"GRANTHA_OA", "GRANTHA_O", "GRANTHA_AI", "GRANTHA_AE", "GRANTHA_E", "GRANTHA_OO", 
		"GRANTHA_U", "GRANTHA_EE", "GRANTHA_I", "GRANTHA_AA", "GRANTHA_A", "GRANTHA_JA", 
		"GRANTHA_SH", "GRANTHA_SS", "GRANTHA_S", "GRANTHA_H", "PUNCTUATIONS", 
		"SOL_SEPARATOR", "WS", "STOP_POINT", "NEWLINE"
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


	public TamizhLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tamizh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\5*\u00da\n*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\6\60\u00e7\n\60\r\60\16\60\u00e8\3\60\3"+
		"\60\3\61\3\61\5\61\u00ef\n\61\3\62\6\62\u00f2\n\62\r\62\16\62\u00f3\3"+
		"\63\3\63\3\64\6\64\u00f9\n\64\r\64\16\64\u00fa\2\2\65\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\b\b\2\u0b97\u0b97\u0b9b"+
		"\u0b9c\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\5\2\u0b87\u0b8c"+
		"\u0b90\u0b92\u0b94\u0b96\b\2#$))//AA^^bb\3\2..\4\2\13\13\"\"\3\2\f\f\u0103"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5l\3\2\2\2\7o\3\2\2"+
		"\2\tr\3\2\2\2\13u\3\2\2\2\rx\3\2\2\2\17{\3\2\2\2\21~\3\2\2\2\23\u0081"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31\u008a\3\2\2\2\33\u008d\3"+
		"\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2"+
		"%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u009d\3\2\2\2-\u009f\3"+
		"\2\2\2/\u00a1\3\2\2\2\61\u00a3\3\2\2\2\63\u00a5\3\2\2\2\65\u00a7\3\2\2"+
		"\2\67\u00a9\3\2\2\29\u00ab\3\2\2\2;\u00b0\3\2\2\2=\u00b3\3\2\2\2?\u00b6"+
		"\3\2\2\2A\u00b9\3\2\2\2C\u00bc\3\2\2\2E\u00bf\3\2\2\2G\u00c2\3\2\2\2I"+
		"\u00c5\3\2\2\2K\u00c8\3\2\2\2M\u00cb\3\2\2\2O\u00ce\3\2\2\2Q\u00d1\3\2"+
		"\2\2S\u00d9\3\2\2\2U\u00db\3\2\2\2W\u00dd\3\2\2\2Y\u00df\3\2\2\2[\u00e1"+
		"\3\2\2\2]\u00e3\3\2\2\2_\u00e6\3\2\2\2a\u00ee\3\2\2\2c\u00f1\3\2\2\2e"+
		"\u00f5\3\2\2\2g\u00f8\3\2\2\2ij\5\33\16\2jk\5\37\20\2k\4\3\2\2\2lm\5\33"+
		"\16\2mn\5\65\33\2n\6\3\2\2\2op\5\33\16\2pq\5\63\32\2q\b\3\2\2\2rs\5\33"+
		"\16\2st\5\61\31\2t\n\3\2\2\2uv\5\33\16\2vw\5/\30\2w\f\3\2\2\2xy\5\33\16"+
		"\2yz\5-\27\2z\16\3\2\2\2{|\5\33\16\2|}\5+\26\2}\20\3\2\2\2~\177\5\33\16"+
		"\2\177\u0080\5)\25\2\u0080\22\3\2\2\2\u0081\u0082\5\33\16\2\u0082\u0083"+
		"\5\'\24\2\u0083\24\3\2\2\2\u0084\u0085\5\33\16\2\u0085\u0086\5%\23\2\u0086"+
		"\26\3\2\2\2\u0087\u0088\5\33\16\2\u0088\u0089\5#\22\2\u0089\30\3\2\2\2"+
		"\u008a\u008b\5\33\16\2\u008b\u008c\5!\21\2\u008c\32\3\2\2\2\u008d\u008e"+
		"\t\2\2\2\u008e\34\3\2\2\2\u008f\u0090\t\3\2\2\u0090\36\3\2\2\2\u0091\u0092"+
		"\7\u0bcf\2\2\u0092 \3\2\2\2\u0093\u0094\7\u0bc0\2\2\u0094\"\3\2\2\2\u0095"+
		"\u0096\7\u0bc1\2\2\u0096$\3\2\2\2\u0097\u0098\7\u0bc2\2\2\u0098&\3\2\2"+
		"\2\u0099\u009a\7\u0bc3\2\2\u009a(\3\2\2\2\u009b\u009c\7\u0bc4\2\2\u009c"+
		"*\3\2\2\2\u009d\u009e\7\u0bc8\2\2\u009e,\3\2\2\2\u009f\u00a0\7\u0bc9\2"+
		"\2\u00a0.\3\2\2\2\u00a1\u00a2\7\u0bca\2\2\u00a2\60\3\2\2\2\u00a3\u00a4"+
		"\7\u0bcc\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7\u0bcd\2\2\u00a6\64\3\2\2\2"+
		"\u00a7\u00a8\7\u0bce\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7\u0b85\2\2\u00aa"+
		"8\3\2\2\2\u00ab\u00ac\5W,\2\u00ac\u00ad\5\37\20\2\u00ad\u00ae\7\u0bb2"+
		"\2\2\u00ae\u00af\5%\23\2\u00af:\3\2\2\2\u00b0\u00b1\5S*\2\u00b1\u00b2"+
		"\5\37\20\2\u00b2<\3\2\2\2\u00b3\u00b4\5S*\2\u00b4\u00b5\5\65\33\2\u00b5"+
		">\3\2\2\2\u00b6\u00b7\5S*\2\u00b7\u00b8\5\63\32\2\u00b8@\3\2\2\2\u00b9"+
		"\u00ba\5S*\2\u00ba\u00bb\5\61\31\2\u00bbB\3\2\2\2\u00bc\u00bd\5S*\2\u00bd"+
		"\u00be\5/\30\2\u00beD\3\2\2\2\u00bf\u00c0\5S*\2\u00c0\u00c1\5-\27\2\u00c1"+
		"F\3\2\2\2\u00c2\u00c3\5S*\2\u00c3\u00c4\5+\26\2\u00c4H\3\2\2\2\u00c5\u00c6"+
		"\5S*\2\u00c6\u00c7\5)\25\2\u00c7J\3\2\2\2\u00c8\u00c9\5S*\2\u00c9\u00ca"+
		"\5\'\24\2\u00caL\3\2\2\2\u00cb\u00cc\5S*\2\u00cc\u00cd\5%\23\2\u00cdN"+
		"\3\2\2\2\u00ce\u00cf\5S*\2\u00cf\u00d0\5#\22\2\u00d0P\3\2\2\2\u00d1\u00d2"+
		"\5S*\2\u00d2\u00d3\5!\21\2\u00d3R\3\2\2\2\u00d4\u00da\5U+\2\u00d5\u00da"+
		"\5W,\2\u00d6\u00da\5Y-\2\u00d7\u00da\5[.\2\u00d8\u00da\5]/\2\u00d9\u00d4"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00daT\3\2\2\2\u00db\u00dc\7\u0b9e\2\2\u00dcV\3\2\2\2\u00dd"+
		"\u00de\7\u0bb8\2\2\u00deX\3\2\2\2\u00df\u00e0\7\u0bb9\2\2\u00e0Z\3\2\2"+
		"\2\u00e1\u00e2\7\u0bba\2\2\u00e2\\\3\2\2\2\u00e3\u00e4\7\u0bbb\2\2\u00e4"+
		"^\3\2\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\b\60\2\2\u00eb`\3\2\2\2\u00ec\u00ef\5c\62\2\u00ed\u00ef\t\5\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00efb\3\2\2\2\u00f0\u00f2\t\6\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4d\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6f\3\2\2\2\u00f7\u00f9"+
		"\t\7\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fbh\3\2\2\2\b\2\u00d9\u00e8\u00ee\u00f3\u00fa\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}