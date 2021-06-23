// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TamizhParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MEI=1, PRIMARY_UYIR_MEI=2, UYIR=3, PULLI=4, WS=5, NEWLINE=6;
	public static final int
		RULE_sentence = 0, RULE_word = 1;
	public static final String[] ruleNames = {
		"sentence", "word"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'\\u0BCD'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MEI", "PRIMARY_UYIR_MEI", "UYIR", "PULLI", "WS", "NEWLINE"
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

	@Override
	public String getGrammarFileName() { return "Tamizh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TamizhParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TamizhParser.WS, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TamizhParser.EOF, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			int _alt;
			setState(16);
			switch (_input.LA(1)) {
			case MEI:
			case PRIMARY_UYIR_MEI:
			case UYIR:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(5);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(4);
					match(WS);
					}
				}

				setState(8); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(7);
						word();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(10); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(13);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << PRIMARY_UYIR_MEI) | (1L << UYIR) | (1L << PULLI) | (1L << WS) | (1L << NEWLINE))) != 0)) {
					{
					setState(12);
					matchWildcard();
					}
				}

				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public List<TerminalNode> UYIR() { return getTokens(TamizhParser.UYIR); }
		public TerminalNode UYIR(int i) {
			return getToken(TamizhParser.UYIR, i);
		}
		public List<TerminalNode> MEI() { return getTokens(TamizhParser.MEI); }
		public TerminalNode MEI(int i) {
			return getToken(TamizhParser.MEI, i);
		}
		public List<TerminalNode> PRIMARY_UYIR_MEI() { return getTokens(TamizhParser.PRIMARY_UYIR_MEI); }
		public TerminalNode PRIMARY_UYIR_MEI(int i) {
			return getToken(TamizhParser.PRIMARY_UYIR_MEI, i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_word);
		try {
			int _alt;
			setState(33);
			switch (_input.LA(1)) {
			case UYIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(18);
						match(UYIR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(21); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case MEI:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(23);
						match(MEI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(26); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PRIMARY_UYIR_MEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(28);
						match(PRIMARY_UYIR_MEI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(31); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\b&\4\2\t\2\4\3\t"+
		"\3\3\2\5\2\b\n\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\5\2\20\n\2\3\2\5\2\23\n"+
		"\2\3\3\6\3\26\n\3\r\3\16\3\27\3\3\6\3\33\n\3\r\3\16\3\34\3\3\6\3 \n\3"+
		"\r\3\16\3!\5\3$\n\3\3\3\2\2\4\2\4\2\2,\2\22\3\2\2\2\4#\3\2\2\2\6\b\7\7"+
		"\2\2\7\6\3\2\2\2\7\b\3\2\2\2\b\n\3\2\2\2\t\13\5\4\3\2\n\t\3\2\2\2\13\f"+
		"\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\20\13\2\2\2\17\16\3\2"+
		"\2\2\17\20\3\2\2\2\20\23\3\2\2\2\21\23\7\2\2\3\22\7\3\2\2\2\22\21\3\2"+
		"\2\2\23\3\3\2\2\2\24\26\7\5\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30$\3\2\2\2\31\33\7\3\2\2\32\31\3\2\2\2\33\34\3\2\2"+
		"\2\34\32\3\2\2\2\34\35\3\2\2\2\35$\3\2\2\2\36 \7\4\2\2\37\36\3\2\2\2 "+
		"!\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\25\3\2\2\2#\32\3\2\2\2#\37"+
		"\3\2\2\2$\5\3\2\2\2\n\7\f\17\22\27\34!#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}