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
		MEI=1, UYIR_MEI_OU=2, UYIR_MEI_OA=3, UYIR_MEI_O=4, UYIR_MEI_AI=5, UYIR_MEI_AE=6, 
		UYIR_MEI_E=7, UYIR_MEI_OO=8, UYIR_MEI_U=9, UYIR_MEI_EE=10, UYIR_MEI_I=11, 
		UYIR_MEI_AA=12, UYIR_MEI_A=13, UYIR=14, PULLI=15, KAAL=16, SULI=17, NEDIL_SULI=18, 
		U_KURIL=19, U_NEDIL=20, EA_KURIL=21, EA_NEDIL=22, I=23, O_KURIL=24, O_NEDIL=25, 
		OU=26, AAYTHAM=27, SRI=28, GRANTHA_JA=29, GRANTHA_SH=30, GRANTHA_SS=31, 
		GRANTHA_S=32, GRANTHA_H=33, WS=34, STOP_POINT=35, NEWLINE=36;
	public static final int
		RULE_start = 0, RULE_vaakiyam = 1, RULE_vaarthai = 2, RULE_elutthu = 3;
	public static final String[] ruleNames = {
		"start", "vaakiyam", "vaarthai", "elutthu"
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
	public static class StartContext extends ParserRuleContext {
		public VaakiyamContext vaakiyam() {
			return getRuleContext(VaakiyamContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TamizhParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(10);
			switch (_input.LA(1)) {
			case MEI:
			case UYIR_MEI_OU:
			case UYIR_MEI_OA:
			case UYIR_MEI_O:
			case UYIR_MEI_AI:
			case UYIR_MEI_AE:
			case UYIR_MEI_E:
			case UYIR_MEI_OO:
			case UYIR_MEI_U:
			case UYIR_MEI_EE:
			case UYIR_MEI_I:
			case UYIR_MEI_AA:
			case UYIR_MEI_A:
			case UYIR:
			case AAYTHAM:
			case SRI:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				vaakiyam(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
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

	public static class VaakiyamContext extends ParserRuleContext {
		public VaarthaiContext vaarthai() {
			return getRuleContext(VaarthaiContext.class,0);
		}
		public List<VaakiyamContext> vaakiyam() {
			return getRuleContexts(VaakiyamContext.class);
		}
		public VaakiyamContext vaakiyam(int i) {
			return getRuleContext(VaakiyamContext.class,i);
		}
		public TerminalNode WS() { return getToken(TamizhParser.WS, 0); }
		public VaakiyamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vaakiyam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterVaakiyam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitVaakiyam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitVaakiyam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaakiyamContext vaakiyam() throws RecognitionException {
		return vaakiyam(0);
	}

	private VaakiyamContext vaakiyam(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VaakiyamContext _localctx = new VaakiyamContext(_ctx, _parentState);
		VaakiyamContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_vaakiyam, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			vaarthai();
			}
			_ctx.stop = _input.LT(-1);
			setState(20);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VaakiyamContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_vaakiyam);
					setState(15);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(16);
					match(WS);
					setState(17);
					vaakiyam(2);
					}
					} 
				}
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VaarthaiContext extends ParserRuleContext {
		public List<ElutthuContext> elutthu() {
			return getRuleContexts(ElutthuContext.class);
		}
		public ElutthuContext elutthu(int i) {
			return getRuleContext(ElutthuContext.class,i);
		}
		public VaarthaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vaarthai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterVaarthai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitVaarthai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitVaarthai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaarthaiContext vaarthai() throws RecognitionException {
		VaarthaiContext _localctx = new VaarthaiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vaarthai);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
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
					elutthu();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElutthuContext extends ParserRuleContext {
		public TerminalNode UYIR() { return getToken(TamizhParser.UYIR, 0); }
		public TerminalNode MEI() { return getToken(TamizhParser.MEI, 0); }
		public TerminalNode AAYTHAM() { return getToken(TamizhParser.AAYTHAM, 0); }
		public TerminalNode UYIR_MEI_OU() { return getToken(TamizhParser.UYIR_MEI_OU, 0); }
		public TerminalNode UYIR_MEI_OA() { return getToken(TamizhParser.UYIR_MEI_OA, 0); }
		public TerminalNode UYIR_MEI_O() { return getToken(TamizhParser.UYIR_MEI_O, 0); }
		public TerminalNode UYIR_MEI_AI() { return getToken(TamizhParser.UYIR_MEI_AI, 0); }
		public TerminalNode UYIR_MEI_AE() { return getToken(TamizhParser.UYIR_MEI_AE, 0); }
		public TerminalNode UYIR_MEI_E() { return getToken(TamizhParser.UYIR_MEI_E, 0); }
		public TerminalNode UYIR_MEI_OO() { return getToken(TamizhParser.UYIR_MEI_OO, 0); }
		public TerminalNode UYIR_MEI_U() { return getToken(TamizhParser.UYIR_MEI_U, 0); }
		public TerminalNode UYIR_MEI_EE() { return getToken(TamizhParser.UYIR_MEI_EE, 0); }
		public TerminalNode UYIR_MEI_I() { return getToken(TamizhParser.UYIR_MEI_I, 0); }
		public TerminalNode UYIR_MEI_AA() { return getToken(TamizhParser.UYIR_MEI_AA, 0); }
		public TerminalNode UYIR_MEI_A() { return getToken(TamizhParser.UYIR_MEI_A, 0); }
		public TerminalNode SRI() { return getToken(TamizhParser.SRI, 0); }
		public ElutthuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elutthu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterElutthu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitElutthu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitElutthu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElutthuContext elutthu() throws RecognitionException {
		ElutthuContext _localctx = new ElutthuContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elutthu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_O) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_AA) | (1L << UYIR_MEI_A) | (1L << UYIR) | (1L << AAYTHAM) | (1L << SRI))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return vaakiyam_sempred((VaakiyamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean vaakiyam_sempred(VaakiyamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&!\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\25\n\3"+
		"\f\3\16\3\30\13\3\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\3\5\2\3\4\6\2\4\6"+
		"\b\2\3\4\2\3\20\35\36\37\2\f\3\2\2\2\4\16\3\2\2\2\6\32\3\2\2\2\b\36\3"+
		"\2\2\2\n\r\5\4\3\2\13\r\7\2\2\3\f\n\3\2\2\2\f\13\3\2\2\2\r\3\3\2\2\2\16"+
		"\17\b\3\1\2\17\20\5\6\4\2\20\26\3\2\2\2\21\22\f\3\2\2\22\23\7$\2\2\23"+
		"\25\5\4\3\4\24\21\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27"+
		"\5\3\2\2\2\30\26\3\2\2\2\31\33\5\b\5\2\32\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\37\t\2\2\2\37\t\3\2\2\2\5\f"+
		"\26\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}