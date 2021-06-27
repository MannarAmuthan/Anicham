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
		OU=26, AAYTHAM=27, GRANTHA_SRI=28, GRANTHA_MEI=29, GRANTHA_OU=30, GRANTHA_OA=31, 
		GRANTHA_O=32, GRANTHA_AI=33, GRANTHA_AE=34, GRANTHA_E=35, GRANTHA_OO=36, 
		GRANTHA_U=37, GRANTHA_EE=38, GRANTHA_I=39, GRANTHA_AA=40, GRANTHA_A=41, 
		GRANTHA_JA=42, GRANTHA_SH=43, GRANTHA_SS=44, GRANTHA_S=45, GRANTHA_H=46, 
		PUNCTUATIONS=47, SOL_SEPARATOR=48, WS=49, STOP_POINT=50, NEWLINE=51;
	public static final int
		RULE_tamizh_script = 0, RULE_patthi = 1, RULE_vaakiyam = 2, RULE_sol = 3, 
		RULE_ezhuththu = 4;
	public static final String[] ruleNames = {
		"tamizh_script", "patthi", "vaakiyam", "sol", "ezhuththu"
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
	public static class Tamizh_scriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TamizhParser.EOF, 0); }
		public List<PatthiContext> patthi() {
			return getRuleContexts(PatthiContext.class);
		}
		public PatthiContext patthi(int i) {
			return getRuleContext(PatthiContext.class,i);
		}
		public Tamizh_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamizh_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterTamizh_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitTamizh_script(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitTamizh_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tamizh_scriptContext tamizh_script() throws RecognitionException {
		Tamizh_scriptContext _localctx = new Tamizh_scriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tamizh_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				patthi();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_O) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_AA) | (1L << UYIR_MEI_A) | (1L << UYIR) | (1L << AAYTHAM) | (1L << GRANTHA_SRI) | (1L << GRANTHA_MEI) | (1L << GRANTHA_OU) | (1L << GRANTHA_OA) | (1L << GRANTHA_O) | (1L << GRANTHA_AI) | (1L << GRANTHA_AE) | (1L << GRANTHA_E) | (1L << GRANTHA_OO) | (1L << GRANTHA_U) | (1L << GRANTHA_EE) | (1L << GRANTHA_I) | (1L << GRANTHA_AA) | (1L << GRANTHA_A))) != 0) );
			setState(15);
			match(EOF);
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

	public static class PatthiContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(TamizhParser.NEWLINE, 0); }
		public List<VaakiyamContext> vaakiyam() {
			return getRuleContexts(VaakiyamContext.class);
		}
		public VaakiyamContext vaakiyam(int i) {
			return getRuleContext(VaakiyamContext.class,i);
		}
		public PatthiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patthi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterPatthi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitPatthi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitPatthi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatthiContext patthi() throws RecognitionException {
		PatthiContext _localctx = new PatthiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_patthi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				vaakiyam();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_O) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_AA) | (1L << UYIR_MEI_A) | (1L << UYIR) | (1L << AAYTHAM) | (1L << GRANTHA_SRI) | (1L << GRANTHA_MEI) | (1L << GRANTHA_OU) | (1L << GRANTHA_OA) | (1L << GRANTHA_O) | (1L << GRANTHA_AI) | (1L << GRANTHA_AE) | (1L << GRANTHA_E) | (1L << GRANTHA_OO) | (1L << GRANTHA_U) | (1L << GRANTHA_EE) | (1L << GRANTHA_I) | (1L << GRANTHA_AA) | (1L << GRANTHA_A))) != 0) );
			setState(22);
			match(NEWLINE);
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
		public TerminalNode STOP_POINT() { return getToken(TamizhParser.STOP_POINT, 0); }
		public List<SolContext> sol() {
			return getRuleContexts(SolContext.class);
		}
		public SolContext sol(int i) {
			return getRuleContext(SolContext.class,i);
		}
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
		VaakiyamContext _localctx = new VaakiyamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vaakiyam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				sol();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_O) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_AA) | (1L << UYIR_MEI_A) | (1L << UYIR) | (1L << AAYTHAM) | (1L << GRANTHA_SRI) | (1L << GRANTHA_MEI) | (1L << GRANTHA_OU) | (1L << GRANTHA_OA) | (1L << GRANTHA_O) | (1L << GRANTHA_AI) | (1L << GRANTHA_AE) | (1L << GRANTHA_E) | (1L << GRANTHA_OO) | (1L << GRANTHA_U) | (1L << GRANTHA_EE) | (1L << GRANTHA_I) | (1L << GRANTHA_AA) | (1L << GRANTHA_A))) != 0) );
			setState(29);
			match(STOP_POINT);
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

	public static class SolContext extends ParserRuleContext {
		public List<EzhuththuContext> ezhuththu() {
			return getRuleContexts(EzhuththuContext.class);
		}
		public EzhuththuContext ezhuththu(int i) {
			return getRuleContext(EzhuththuContext.class,i);
		}
		public TerminalNode SOL_SEPARATOR() { return getToken(TamizhParser.SOL_SEPARATOR, 0); }
		public SolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterSol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitSol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitSol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolContext sol() throws RecognitionException {
		SolContext _localctx = new SolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sol);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(31);
					ezhuththu();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(37);
			_la = _input.LA(1);
			if (_la==SOL_SEPARATOR) {
				{
				setState(36);
				match(SOL_SEPARATOR);
				}
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

	public static class EzhuththuContext extends ParserRuleContext {
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
		public TerminalNode GRANTHA_MEI() { return getToken(TamizhParser.GRANTHA_MEI, 0); }
		public TerminalNode GRANTHA_OU() { return getToken(TamizhParser.GRANTHA_OU, 0); }
		public TerminalNode GRANTHA_OA() { return getToken(TamizhParser.GRANTHA_OA, 0); }
		public TerminalNode GRANTHA_O() { return getToken(TamizhParser.GRANTHA_O, 0); }
		public TerminalNode GRANTHA_AI() { return getToken(TamizhParser.GRANTHA_AI, 0); }
		public TerminalNode GRANTHA_AE() { return getToken(TamizhParser.GRANTHA_AE, 0); }
		public TerminalNode GRANTHA_E() { return getToken(TamizhParser.GRANTHA_E, 0); }
		public TerminalNode GRANTHA_OO() { return getToken(TamizhParser.GRANTHA_OO, 0); }
		public TerminalNode GRANTHA_U() { return getToken(TamizhParser.GRANTHA_U, 0); }
		public TerminalNode GRANTHA_EE() { return getToken(TamizhParser.GRANTHA_EE, 0); }
		public TerminalNode GRANTHA_I() { return getToken(TamizhParser.GRANTHA_I, 0); }
		public TerminalNode GRANTHA_AA() { return getToken(TamizhParser.GRANTHA_AA, 0); }
		public TerminalNode GRANTHA_A() { return getToken(TamizhParser.GRANTHA_A, 0); }
		public TerminalNode GRANTHA_SRI() { return getToken(TamizhParser.GRANTHA_SRI, 0); }
		public EzhuththuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ezhuththu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).enterEzhuththu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TamizhListener ) ((TamizhListener)listener).exitEzhuththu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TamizhVisitor ) return ((TamizhVisitor<? extends T>)visitor).visitEzhuththu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EzhuththuContext ezhuththu() throws RecognitionException {
		EzhuththuContext _localctx = new EzhuththuContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ezhuththu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MEI) | (1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_O) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_AA) | (1L << UYIR_MEI_A) | (1L << UYIR) | (1L << AAYTHAM) | (1L << GRANTHA_SRI) | (1L << GRANTHA_MEI) | (1L << GRANTHA_OU) | (1L << GRANTHA_OA) | (1L << GRANTHA_O) | (1L << GRANTHA_AI) | (1L << GRANTHA_AE) | (1L << GRANTHA_E) | (1L << GRANTHA_OO) | (1L << GRANTHA_U) | (1L << GRANTHA_EE) | (1L << GRANTHA_I) | (1L << GRANTHA_AA) | (1L << GRANTHA_A))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\65,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\6\3"+
		"\25\n\3\r\3\16\3\26\3\3\3\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\5\6\5"+
		"#\n\5\r\5\16\5$\3\5\5\5(\n\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\4\2\3\20"+
		"\35++\2\r\3\2\2\2\4\24\3\2\2\2\6\33\3\2\2\2\b\"\3\2\2\2\n)\3\2\2\2\f\16"+
		"\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3"+
		"\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\25\5\6\4\2\24\23\3\2\2\2\25\26\3"+
		"\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\7\65\2\2\31\5\3"+
		"\2\2\2\32\34\5\b\5\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\37\3\2\2\2\37 \7\64\2\2 \7\3\2\2\2!#\5\n\6\2\"!\3\2\2\2#$\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&(\7\62\2\2\'&\3\2\2\2\'(\3\2\2"+
		"\2(\t\3\2\2\2)*\t\2\2\2*\13\3\2\2\2\7\17\26\35$\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}