// Generated from grammar/Yaappu/Venba.g4 by ANTLR 4.5.1

    package grammar.Yaappu;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VenbaParser extends Parser {
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
	public static final int
		RULE_venpa = 0, RULE_adi = 1, RULE_eetradi = 2, RULE_seer = 3, RULE_moovasai = 4, 
		RULE_eerasai = 5, RULE_themangai = 6, RULE_themangani = 7, RULE_pulimangai = 8, 
		RULE_pulimangani = 9, RULE_koovilangai = 10, RULE_koovilangani = 11, RULE_karuvilangai = 12, 
		RULE_karuvilangani = 13, RULE_thema = 14, RULE_pulima = 15, RULE_koovilam = 16, 
		RULE_karuvilam = 17, RULE_eetru_seer = 18, RULE_nirai_asai = 19, RULE_ner_asai = 20, 
		RULE_kuril = 21, RULE_nedil = 22, RULE_otru = 23;
	public static final String[] ruleNames = {
		"venpa", "adi", "eetradi", "seer", "moovasai", "eerasai", "themangai", 
		"themangani", "pulimangai", "pulimangani", "koovilangai", "koovilangani", 
		"karuvilangai", "karuvilangani", "thema", "pulima", "koovilam", "karuvilam", 
		"eetru_seer", "nirai_asai", "ner_asai", "kuril", "nedil", "otru"
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

	@Override
	public String getGrammarFileName() { return "Venba.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VenbaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VenpaContext extends ParserRuleContext {
		public EetradiContext eetradi() {
			return getRuleContext(EetradiContext.class,0);
		}
		public List<AdiContext> adi() {
			return getRuleContexts(AdiContext.class);
		}
		public AdiContext adi(int i) {
			return getRuleContext(AdiContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(VenbaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(VenbaParser.NEWLINE, i);
		}
		public VenpaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_venpa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterVenpa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitVenpa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitVenpa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VenpaContext venpa() throws RecognitionException {
		VenpaContext _localctx = new VenpaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_venpa);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(48);
					adi();
					setState(49);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(55);
			eetradi();
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

	public static class AdiContext extends ParserRuleContext {
		public List<SeerContext> seer() {
			return getRuleContexts(SeerContext.class);
		}
		public SeerContext seer(int i) {
			return getRuleContext(SeerContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VenbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VenbaParser.WS, i);
		}
		public AdiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterAdi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitAdi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitAdi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdiContext adi() throws RecognitionException {
		AdiContext _localctx = new AdiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_adi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			seer();
			setState(58);
			match(WS);
			setState(59);
			seer();
			setState(60);
			match(WS);
			setState(61);
			seer();
			setState(62);
			match(WS);
			setState(63);
			seer();
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

	public static class EetradiContext extends ParserRuleContext {
		public List<SeerContext> seer() {
			return getRuleContexts(SeerContext.class);
		}
		public SeerContext seer(int i) {
			return getRuleContext(SeerContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(VenbaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(VenbaParser.WS, i);
		}
		public Eetru_seerContext eetru_seer() {
			return getRuleContext(Eetru_seerContext.class,0);
		}
		public EetradiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eetradi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterEetradi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitEetradi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitEetradi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EetradiContext eetradi() throws RecognitionException {
		EetradiContext _localctx = new EetradiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eetradi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			seer();
			setState(66);
			match(WS);
			setState(67);
			seer();
			setState(68);
			match(WS);
			setState(69);
			eetru_seer();
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

	public static class SeerContext extends ParserRuleContext {
		public EerasaiContext eerasai() {
			return getRuleContext(EerasaiContext.class,0);
		}
		public MoovasaiContext moovasai() {
			return getRuleContext(MoovasaiContext.class,0);
		}
		public SeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterSeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitSeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitSeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeerContext seer() throws RecognitionException {
		SeerContext _localctx = new SeerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_seer);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				eerasai();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				moovasai();
				}
				break;
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

	public static class MoovasaiContext extends ParserRuleContext {
		public ThemangaiContext themangai() {
			return getRuleContext(ThemangaiContext.class,0);
		}
		public PulimangaiContext pulimangai() {
			return getRuleContext(PulimangaiContext.class,0);
		}
		public KoovilangaiContext koovilangai() {
			return getRuleContext(KoovilangaiContext.class,0);
		}
		public KaruvilangaiContext karuvilangai() {
			return getRuleContext(KaruvilangaiContext.class,0);
		}
		public ThemanganiContext themangani() {
			return getRuleContext(ThemanganiContext.class,0);
		}
		public PulimanganiContext pulimangani() {
			return getRuleContext(PulimanganiContext.class,0);
		}
		public KoovilanganiContext koovilangani() {
			return getRuleContext(KoovilanganiContext.class,0);
		}
		public KaruvilanganiContext karuvilangani() {
			return getRuleContext(KaruvilanganiContext.class,0);
		}
		public MoovasaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moovasai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterMoovasai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitMoovasai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitMoovasai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoovasaiContext moovasai() throws RecognitionException {
		MoovasaiContext _localctx = new MoovasaiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moovasai);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				themangai();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				pulimangai();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				koovilangai();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				karuvilangai();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				themangani();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				pulimangani();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				koovilangani();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				karuvilangani();
				}
				break;
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

	public static class EerasaiContext extends ParserRuleContext {
		public KaruvilamContext karuvilam() {
			return getRuleContext(KaruvilamContext.class,0);
		}
		public PulimaContext pulima() {
			return getRuleContext(PulimaContext.class,0);
		}
		public KoovilamContext koovilam() {
			return getRuleContext(KoovilamContext.class,0);
		}
		public ThemaContext thema() {
			return getRuleContext(ThemaContext.class,0);
		}
		public EerasaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eerasai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterEerasai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitEerasai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitEerasai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EerasaiContext eerasai() throws RecognitionException {
		EerasaiContext _localctx = new EerasaiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eerasai);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				karuvilam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				pulima();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				koovilam();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				thema();
				}
				break;
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

	public static class ThemangaiContext extends ParserRuleContext {
		public ThemaContext thema() {
			return getRuleContext(ThemaContext.class,0);
		}
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public ThemangaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_themangai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterThemangai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitThemangai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitThemangai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemangaiContext themangai() throws RecognitionException {
		ThemangaiContext _localctx = new ThemangaiContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_themangai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			thema();
			setState(92);
			ner_asai();
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

	public static class ThemanganiContext extends ParserRuleContext {
		public ThemaContext thema() {
			return getRuleContext(ThemaContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public ThemanganiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_themangani; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterThemangani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitThemangani(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitThemangani(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemanganiContext themangani() throws RecognitionException {
		ThemanganiContext _localctx = new ThemanganiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_themangani);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			thema();
			setState(95);
			nirai_asai();
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

	public static class PulimangaiContext extends ParserRuleContext {
		public PulimaContext pulima() {
			return getRuleContext(PulimaContext.class,0);
		}
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public PulimangaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pulimangai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterPulimangai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitPulimangai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitPulimangai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PulimangaiContext pulimangai() throws RecognitionException {
		PulimangaiContext _localctx = new PulimangaiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pulimangai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			pulima();
			setState(98);
			ner_asai();
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

	public static class PulimanganiContext extends ParserRuleContext {
		public PulimaContext pulima() {
			return getRuleContext(PulimaContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public PulimanganiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pulimangani; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterPulimangani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitPulimangani(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitPulimangani(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PulimanganiContext pulimangani() throws RecognitionException {
		PulimanganiContext _localctx = new PulimanganiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pulimangani);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			pulima();
			setState(101);
			nirai_asai();
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

	public static class KoovilangaiContext extends ParserRuleContext {
		public KoovilamContext koovilam() {
			return getRuleContext(KoovilamContext.class,0);
		}
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public KoovilangaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koovilangai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKoovilangai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKoovilangai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKoovilangai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoovilangaiContext koovilangai() throws RecognitionException {
		KoovilangaiContext _localctx = new KoovilangaiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_koovilangai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			koovilam();
			setState(104);
			ner_asai();
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

	public static class KoovilanganiContext extends ParserRuleContext {
		public KoovilamContext koovilam() {
			return getRuleContext(KoovilamContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public KoovilanganiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koovilangani; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKoovilangani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKoovilangani(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKoovilangani(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoovilanganiContext koovilangani() throws RecognitionException {
		KoovilanganiContext _localctx = new KoovilanganiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_koovilangani);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			koovilam();
			setState(107);
			nirai_asai();
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

	public static class KaruvilangaiContext extends ParserRuleContext {
		public KaruvilamContext karuvilam() {
			return getRuleContext(KaruvilamContext.class,0);
		}
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public KaruvilangaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karuvilangai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKaruvilangai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKaruvilangai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKaruvilangai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KaruvilangaiContext karuvilangai() throws RecognitionException {
		KaruvilangaiContext _localctx = new KaruvilangaiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_karuvilangai);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			karuvilam();
			setState(110);
			ner_asai();
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

	public static class KaruvilanganiContext extends ParserRuleContext {
		public KaruvilamContext karuvilam() {
			return getRuleContext(KaruvilamContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public KaruvilanganiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karuvilangani; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKaruvilangani(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKaruvilangani(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKaruvilangani(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KaruvilanganiContext karuvilangani() throws RecognitionException {
		KaruvilanganiContext _localctx = new KaruvilanganiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_karuvilangani);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			karuvilam();
			setState(113);
			nirai_asai();
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

	public static class ThemaContext extends ParserRuleContext {
		public List<Ner_asaiContext> ner_asai() {
			return getRuleContexts(Ner_asaiContext.class);
		}
		public Ner_asaiContext ner_asai(int i) {
			return getRuleContext(Ner_asaiContext.class,i);
		}
		public ThemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterThema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitThema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitThema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemaContext thema() throws RecognitionException {
		ThemaContext _localctx = new ThemaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			ner_asai();
			setState(116);
			ner_asai();
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

	public static class PulimaContext extends ParserRuleContext {
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public PulimaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pulima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterPulima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitPulima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitPulima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PulimaContext pulima() throws RecognitionException {
		PulimaContext _localctx = new PulimaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pulima);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			nirai_asai();
			setState(119);
			ner_asai();
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

	public static class KoovilamContext extends ParserRuleContext {
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public KoovilamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koovilam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKoovilam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKoovilam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKoovilam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KoovilamContext koovilam() throws RecognitionException {
		KoovilamContext _localctx = new KoovilamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_koovilam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			ner_asai();
			setState(122);
			nirai_asai();
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

	public static class KaruvilamContext extends ParserRuleContext {
		public List<Nirai_asaiContext> nirai_asai() {
			return getRuleContexts(Nirai_asaiContext.class);
		}
		public Nirai_asaiContext nirai_asai(int i) {
			return getRuleContext(Nirai_asaiContext.class,i);
		}
		public KaruvilamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_karuvilam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKaruvilam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKaruvilam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKaruvilam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KaruvilamContext karuvilam() throws RecognitionException {
		KaruvilamContext _localctx = new KaruvilamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_karuvilam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			nirai_asai();
			setState(125);
			nirai_asai();
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

	public static class Eetru_seerContext extends ParserRuleContext {
		public Ner_asaiContext ner_asai() {
			return getRuleContext(Ner_asaiContext.class,0);
		}
		public Nirai_asaiContext nirai_asai() {
			return getRuleContext(Nirai_asaiContext.class,0);
		}
		public ThemaContext thema() {
			return getRuleContext(ThemaContext.class,0);
		}
		public PulimaContext pulima() {
			return getRuleContext(PulimaContext.class,0);
		}
		public Eetru_seerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eetru_seer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterEetru_seer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitEetru_seer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitEetru_seer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eetru_seerContext eetru_seer() throws RecognitionException {
		Eetru_seerContext _localctx = new Eetru_seerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eetru_seer);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				ner_asai();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				nirai_asai();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				thema();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				pulima();
				}
				break;
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

	public static class Nirai_asaiContext extends ParserRuleContext {
		public List<KurilContext> kuril() {
			return getRuleContexts(KurilContext.class);
		}
		public KurilContext kuril(int i) {
			return getRuleContext(KurilContext.class,i);
		}
		public NedilContext nedil() {
			return getRuleContext(NedilContext.class,0);
		}
		public List<OtruContext> otru() {
			return getRuleContexts(OtruContext.class);
		}
		public OtruContext otru(int i) {
			return getRuleContext(OtruContext.class,i);
		}
		public Nirai_asaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nirai_asai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterNirai_asai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitNirai_asai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitNirai_asai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nirai_asaiContext nirai_asai() throws RecognitionException {
		Nirai_asaiContext _localctx = new Nirai_asaiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nirai_asai);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				kuril();
				setState(134);
				kuril();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				kuril();
				setState(137);
				nedil();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				kuril();
				setState(140);
				kuril();
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					otru();
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MEI || _la==AAYTHAM );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				kuril();
				setState(147);
				nedil();
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					otru();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MEI || _la==AAYTHAM );
				}
				break;
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

	public static class Ner_asaiContext extends ParserRuleContext {
		public KurilContext kuril() {
			return getRuleContext(KurilContext.class,0);
		}
		public List<OtruContext> otru() {
			return getRuleContexts(OtruContext.class);
		}
		public OtruContext otru(int i) {
			return getRuleContext(OtruContext.class,i);
		}
		public NedilContext nedil() {
			return getRuleContext(NedilContext.class,0);
		}
		public Ner_asaiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ner_asai; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterNer_asai(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitNer_asai(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitNer_asai(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ner_asaiContext ner_asai() throws RecognitionException {
		Ner_asaiContext _localctx = new Ner_asaiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ner_asai);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				kuril();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				kuril();
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					otru();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MEI || _la==AAYTHAM );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				nedil();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				nedil();
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					otru();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MEI || _la==AAYTHAM );
				}
				break;
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

	public static class KurilContext extends ParserRuleContext {
		public TerminalNode A_UYIR() { return getToken(VenbaParser.A_UYIR, 0); }
		public TerminalNode I_UYIR() { return getToken(VenbaParser.I_UYIR, 0); }
		public TerminalNode U_UYIR() { return getToken(VenbaParser.U_UYIR, 0); }
		public TerminalNode E_UYIR() { return getToken(VenbaParser.E_UYIR, 0); }
		public TerminalNode O_UYIR() { return getToken(VenbaParser.O_UYIR, 0); }
		public TerminalNode UYIR_MEI_A() { return getToken(VenbaParser.UYIR_MEI_A, 0); }
		public TerminalNode UYIR_MEI_I() { return getToken(VenbaParser.UYIR_MEI_I, 0); }
		public TerminalNode UYIR_MEI_U() { return getToken(VenbaParser.UYIR_MEI_U, 0); }
		public TerminalNode UYIR_MEI_E() { return getToken(VenbaParser.UYIR_MEI_E, 0); }
		public TerminalNode UYIR_MEI_O() { return getToken(VenbaParser.UYIR_MEI_O, 0); }
		public KurilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kuril; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterKuril(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitKuril(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitKuril(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KurilContext kuril() throws RecognitionException {
		KurilContext _localctx = new KurilContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_kuril);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UYIR_MEI_O) | (1L << UYIR_MEI_E) | (1L << UYIR_MEI_U) | (1L << UYIR_MEI_I) | (1L << UYIR_MEI_A) | (1L << A_UYIR) | (1L << I_UYIR) | (1L << U_UYIR) | (1L << E_UYIR) | (1L << O_UYIR))) != 0)) ) {
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

	public static class NedilContext extends ParserRuleContext {
		public TerminalNode AA_UYIR() { return getToken(VenbaParser.AA_UYIR, 0); }
		public TerminalNode EE_UYIR() { return getToken(VenbaParser.EE_UYIR, 0); }
		public TerminalNode OO_UYIR() { return getToken(VenbaParser.OO_UYIR, 0); }
		public TerminalNode AE_UYIR() { return getToken(VenbaParser.AE_UYIR, 0); }
		public TerminalNode AI_UYIR() { return getToken(VenbaParser.AI_UYIR, 0); }
		public TerminalNode OA_UYIR() { return getToken(VenbaParser.OA_UYIR, 0); }
		public TerminalNode OU_UYIR() { return getToken(VenbaParser.OU_UYIR, 0); }
		public TerminalNode UYIR_MEI_AA() { return getToken(VenbaParser.UYIR_MEI_AA, 0); }
		public TerminalNode UYIR_MEI_EE() { return getToken(VenbaParser.UYIR_MEI_EE, 0); }
		public TerminalNode UYIR_MEI_OO() { return getToken(VenbaParser.UYIR_MEI_OO, 0); }
		public TerminalNode UYIR_MEI_AE() { return getToken(VenbaParser.UYIR_MEI_AE, 0); }
		public TerminalNode UYIR_MEI_AI() { return getToken(VenbaParser.UYIR_MEI_AI, 0); }
		public TerminalNode UYIR_MEI_OA() { return getToken(VenbaParser.UYIR_MEI_OA, 0); }
		public TerminalNode UYIR_MEI_OU() { return getToken(VenbaParser.UYIR_MEI_OU, 0); }
		public NedilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nedil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterNedil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitNedil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitNedil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NedilContext nedil() throws RecognitionException {
		NedilContext _localctx = new NedilContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nedil);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UYIR_MEI_OU) | (1L << UYIR_MEI_OA) | (1L << UYIR_MEI_AI) | (1L << UYIR_MEI_AE) | (1L << UYIR_MEI_OO) | (1L << UYIR_MEI_EE) | (1L << UYIR_MEI_AA) | (1L << AA_UYIR) | (1L << EE_UYIR) | (1L << OO_UYIR) | (1L << AE_UYIR) | (1L << AI_UYIR) | (1L << OA_UYIR) | (1L << OU_UYIR))) != 0)) ) {
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

	public static class OtruContext extends ParserRuleContext {
		public TerminalNode MEI() { return getToken(VenbaParser.MEI, 0); }
		public TerminalNode AAYTHAM() { return getToken(VenbaParser.AAYTHAM, 0); }
		public OtruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otru; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).enterOtru(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VenbaListener ) ((VenbaListener)listener).exitOtru(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VenbaVisitor ) return ((VenbaVisitor<? extends T>)visitor).visitOtru(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtruContext otru() throws RecognitionException {
		OtruContext _localctx = new OtruContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_otru);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==MEI || _la==AAYTHAM) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6V\n\6\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\5\24\u0086\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u0091\n\25\r\25\16\25\u0092\3\25\3\25\3\25\6\25\u0098"+
		"\n\25\r\25\16\25\u0099\5\25\u009c\n\25\3\26\3\26\3\26\6\26\u00a1\n\26"+
		"\r\26\16\26\u00a2\3\26\3\26\3\26\6\26\u00a8\n\26\r\26\16\26\u00a9\5\26"+
		"\u00ac\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\13\2\6\6\t\t\13\13\r\r\17\20\22"+
		"\22\24\24\26\26\31\31\f\2\4\5\7\b\n\n\f\f\16\16\21\21\23\23\25\25\27\30"+
		"\32\33\4\2\3\3\34\34\u00b4\2\65\3\2\2\2\4;\3\2\2\2\6C\3\2\2\2\bK\3\2\2"+
		"\2\nU\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20`\3\2\2\2\22c\3\2\2\2\24f\3\2\2"+
		"\2\26i\3\2\2\2\30l\3\2\2\2\32o\3\2\2\2\34r\3\2\2\2\36u\3\2\2\2 x\3\2\2"+
		"\2\"{\3\2\2\2$~\3\2\2\2&\u0085\3\2\2\2(\u009b\3\2\2\2*\u00ab\3\2\2\2,"+
		"\u00ad\3\2\2\2.\u00af\3\2\2\2\60\u00b1\3\2\2\2\62\63\5\4\3\2\63\64\7)"+
		"\2\2\64\66\3\2\2\2\65\62\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29:\5\6\4\2:\3\3\2\2\2;<\5\b\5\2<=\7*\2\2=>\5\b\5\2>?\7*\2"+
		"\2?@\5\b\5\2@A\7*\2\2AB\5\b\5\2B\5\3\2\2\2CD\5\b\5\2DE\7*\2\2EF\5\b\5"+
		"\2FG\7*\2\2GH\5&\24\2H\7\3\2\2\2IL\5\f\7\2JL\5\n\6\2KI\3\2\2\2KJ\3\2\2"+
		"\2L\t\3\2\2\2MV\5\16\b\2NV\5\22\n\2OV\5\26\f\2PV\5\32\16\2QV\5\20\t\2"+
		"RV\5\24\13\2SV\5\30\r\2TV\5\34\17\2UM\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3"+
		"\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\13\3\2\2\2W\\\5$\23\2"+
		"X\\\5 \21\2Y\\\5\"\22\2Z\\\5\36\20\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3"+
		"\2\2\2\\\r\3\2\2\2]^\5\36\20\2^_\5*\26\2_\17\3\2\2\2`a\5\36\20\2ab\5("+
		"\25\2b\21\3\2\2\2cd\5 \21\2de\5*\26\2e\23\3\2\2\2fg\5 \21\2gh\5(\25\2"+
		"h\25\3\2\2\2ij\5\"\22\2jk\5*\26\2k\27\3\2\2\2lm\5\"\22\2mn\5(\25\2n\31"+
		"\3\2\2\2op\5$\23\2pq\5*\26\2q\33\3\2\2\2rs\5$\23\2st\5(\25\2t\35\3\2\2"+
		"\2uv\5*\26\2vw\5*\26\2w\37\3\2\2\2xy\5(\25\2yz\5*\26\2z!\3\2\2\2{|\5*"+
		"\26\2|}\5(\25\2}#\3\2\2\2~\177\5(\25\2\177\u0080\5(\25\2\u0080%\3\2\2"+
		"\2\u0081\u0086\5*\26\2\u0082\u0086\5(\25\2\u0083\u0086\5\36\20\2\u0084"+
		"\u0086\5 \21\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\'\3\2\2\2\u0087\u0088\5,\27\2\u0088\u0089"+
		"\5,\27\2\u0089\u009c\3\2\2\2\u008a\u008b\5,\27\2\u008b\u008c\5.\30\2\u008c"+
		"\u009c\3\2\2\2\u008d\u008e\5,\27\2\u008e\u0090\5,\27\2\u008f\u0091\5\60"+
		"\31\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009c\3\2\2\2\u0094\u0095\5,\27\2\u0095\u0097\5."+
		"\30\2\u0096\u0098\5\60\31\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0087\3\2"+
		"\2\2\u009b\u008a\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0094\3\2\2\2\u009c"+
		")\3\2\2\2\u009d\u00ac\5,\27\2\u009e\u00a0\5,\27\2\u009f\u00a1\5\60\31"+
		"\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00ac\5.\30\2\u00a5\u00a7\5.\30\2\u00a6"+
		"\u00a8\5\60\31\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u009d\3\2\2\2\u00ab"+
		"\u009e\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ac+\3\2\2\2"+
		"\u00ad\u00ae\t\2\2\2\u00ae-\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0/\3\2\2\2"+
		"\u00b1\u00b2\t\4\2\2\u00b2\61\3\2\2\2\r\67KU[\u0085\u0092\u0099\u009b"+
		"\u00a2\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}