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
		MEI=1, UYIR_MEI_EE=2, UYIR_MEI_I=3, UYIR_MEI_AA=4, UYIR_MEI_A=5, UYIR=6, 
		PULLI=7, KAAL=8, SULI=9, NEDIL_SULI=10, WS=11, STOP_POINT=12, NEWLINE=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MEI", "UYIR_MEI_EE", "UYIR_MEI_I", "UYIR_MEI_AA", "UYIR_MEI_A", "UYIR", 
		"PULLI", "KAAL", "SULI", "NEDIL_SULI", "WS", "STOP_POINT", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'\\u0BCD'", "'\\u0BBE'", "'\\u0BBF'", 
		"'\\u0BC0'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MEI", "UYIR_MEI_EE", "UYIR_MEI_I", "UYIR_MEI_AA", "UYIR_MEI_A", 
		"UYIR", "PULLI", "KAAL", "SULI", "NEDIL_SULI", "WS", "STOP_POINT", "NEWLINE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17@\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\6\16;\n\16\r\16\16\16<\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\6\b\2\u0b97\u0b97\u0b9b"+
		"\u0b9c\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\6\2\u0b85\u0b85"+
		"\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b96\4\2\13\13\"\"\3\2\f\f@\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\3\35\3\2\2\2\5 \3\2\2\2\7#\3\2\2\2\t&\3\2\2\2\13)\3\2"+
		"\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\63\3\2\2\2\27"+
		"\65\3\2\2\2\31\67\3\2\2\2\33:\3\2\2\2\35\36\5\13\6\2\36\37\5\17\b\2\37"+
		"\4\3\2\2\2 !\5\13\6\2!\"\5\25\13\2\"\6\3\2\2\2#$\5\13\6\2$%\5\23\n\2%"+
		"\b\3\2\2\2&\'\5\13\6\2\'(\5\21\t\2(\n\3\2\2\2)*\t\2\2\2*\f\3\2\2\2+,\t"+
		"\3\2\2,\16\3\2\2\2-.\7\u0bcf\2\2.\20\3\2\2\2/\60\7\u0bc0\2\2\60\22\3\2"+
		"\2\2\61\62\7\u0bc1\2\2\62\24\3\2\2\2\63\64\7\u0bc2\2\2\64\26\3\2\2\2\65"+
		"\66\t\4\2\2\66\30\3\2\2\2\678\7\60\2\28\32\3\2\2\29;\t\5\2\2:9\3\2\2\2"+
		";<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\b\16\2\2?\34\3\2\2\2\4\2<\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}