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
		OU=26, AAYTHAM=27, SRI=28, GRANTHA_JA=29, GRANTHA_SH=30, GRANTHA_SS=31, 
		GRANTHA_S=32, GRANTHA_H=33, WS=34, STOP_POINT=35, NEWLINE=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", "UYIR_MEI_AE", 
		"UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", "UYIR_MEI_I", 
		"UYIR_MEI_AA", "UYIR_MEI_A", "UYIR", "PULLI", "KAAL", "SULI", "NEDIL_SULI", 
		"U_KURIL", "U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", "O_NEDIL", 
		"OU", "AAYTHAM", "SRI", "GRANTHA_JA", "GRANTHA_SH", "GRANTHA_SS", "GRANTHA_S", 
		"GRANTHA_H", "WS", "STOP_POINT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'\\u0BCD'", "'\\u0BBE'", "'\\u0BBF'", "'\\u0BC0'", 
		"'\\u0BC1'", "'\\u0BC2'", "'\\u0BC6'", "'\\u0BC7'", "'\\u0BC8'", "'\\u0BCA'", 
		"'\\u0BCB'", "'\\u0BCC'", "'\\u0B83'", null, "'\\u0B9C'", "'\\u0BB6'", 
		"'\\u0BB7'", "'\\u0BB8'", "'\\u0BB9'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MEI", "UYIR_MEI_OU", "UYIR_MEI_OA", "UYIR_MEI_O", "UYIR_MEI_AI", 
		"UYIR_MEI_AE", "UYIR_MEI_E", "UYIR_MEI_OO", "UYIR_MEI_U", "UYIR_MEI_EE", 
		"UYIR_MEI_I", "UYIR_MEI_AA", "UYIR_MEI_A", "UYIR", "PULLI", "KAAL", "SULI", 
		"NEDIL_SULI", "U_KURIL", "U_NEDIL", "EA_KURIL", "EA_NEDIL", "I", "O_KURIL", 
		"O_NEDIL", "OU", "AAYTHAM", "SRI", "GRANTHA_JA", "GRANTHA_SH", "GRANTHA_SS", 
		"GRANTHA_S", "GRANTHA_H", "WS", "STOP_POINT", "NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16v\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\6%\u00a8\n%\r%\16%\u00a9\3%\3%\2\2&\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&\3\2\6\b\2\u0b97\u0b97\u0b9b\u0b9c\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac"+
		"\u0bb0\u0bb7\6\2\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b96\4\2\13"+
		"\13\"\"\3\2\f\f\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7Q\3\2\2\2\t"+
		"T\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17]\3\2\2\2\21`\3\2\2\2\23c\3\2\2\2\25"+
		"f\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2"+
		"!{\3\2\2\2#}\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0085"+
		"\3\2\2\2-\u0087\3\2\2\2/\u0089\3\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2"+
		"\2\65\u008f\3\2\2\2\67\u0091\3\2\2\29\u0093\3\2\2\2;\u0098\3\2\2\2=\u009a"+
		"\3\2\2\2?\u009c\3\2\2\2A\u009e\3\2\2\2C\u00a0\3\2\2\2E\u00a2\3\2\2\2G"+
		"\u00a4\3\2\2\2I\u00a7\3\2\2\2KL\5\33\16\2LM\5\37\20\2M\4\3\2\2\2NO\5\33"+
		"\16\2OP\5\65\33\2P\6\3\2\2\2QR\5\33\16\2RS\5\63\32\2S\b\3\2\2\2TU\5\33"+
		"\16\2UV\5\61\31\2V\n\3\2\2\2WX\5\33\16\2XY\5/\30\2Y\f\3\2\2\2Z[\5\33\16"+
		"\2[\\\5-\27\2\\\16\3\2\2\2]^\5\33\16\2^_\5+\26\2_\20\3\2\2\2`a\5\33\16"+
		"\2ab\5)\25\2b\22\3\2\2\2cd\5\33\16\2de\5\'\24\2e\24\3\2\2\2fg\5\33\16"+
		"\2gh\5%\23\2h\26\3\2\2\2ij\5\33\16\2jk\5#\22\2k\30\3\2\2\2lm\5\33\16\2"+
		"mn\5!\21\2n\32\3\2\2\2ov\t\2\2\2pv\5;\36\2qv\5=\37\2rv\5? \2sv\5A!\2t"+
		"v\5C\"\2uo\3\2\2\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v"+
		"\34\3\2\2\2wx\t\3\2\2x\36\3\2\2\2yz\7\u0bcf\2\2z \3\2\2\2{|\7\u0bc0\2"+
		"\2|\"\3\2\2\2}~\7\u0bc1\2\2~$\3\2\2\2\177\u0080\7\u0bc2\2\2\u0080&\3\2"+
		"\2\2\u0081\u0082\7\u0bc3\2\2\u0082(\3\2\2\2\u0083\u0084\7\u0bc4\2\2\u0084"+
		"*\3\2\2\2\u0085\u0086\7\u0bc8\2\2\u0086,\3\2\2\2\u0087\u0088\7\u0bc9\2"+
		"\2\u0088.\3\2\2\2\u0089\u008a\7\u0bca\2\2\u008a\60\3\2\2\2\u008b\u008c"+
		"\7\u0bcc\2\2\u008c\62\3\2\2\2\u008d\u008e\7\u0bcd\2\2\u008e\64\3\2\2\2"+
		"\u008f\u0090\7\u0bce\2\2\u0090\66\3\2\2\2\u0091\u0092\7\u0b85\2\2\u0092"+
		"8\3\2\2\2\u0093\u0094\5=\37\2\u0094\u0095\5\37\20\2\u0095\u0096\7\u0bb2"+
		"\2\2\u0096\u0097\5%\23\2\u0097:\3\2\2\2\u0098\u0099\7\u0b9e\2\2\u0099"+
		"<\3\2\2\2\u009a\u009b\7\u0bb8\2\2\u009b>\3\2\2\2\u009c\u009d\7\u0bb9\2"+
		"\2\u009d@\3\2\2\2\u009e\u009f\7\u0bba\2\2\u009fB\3\2\2\2\u00a0\u00a1\7"+
		"\u0bbb\2\2\u00a1D\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3F\3\2\2\2\u00a4\u00a5"+
		"\7\60\2\2\u00a5H\3\2\2\2\u00a6\u00a8\t\5\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\b%\2\2\u00acJ\3\2\2\2\5\2u\u00a9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}