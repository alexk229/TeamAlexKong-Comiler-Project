// Generated from Hello.g4 by ANTLR 4.4

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__73=1, T__72=2, T__71=3, T__70=4, T__69=5, T__68=6, T__67=7, T__66=8, 
		T__65=9, T__64=10, T__63=11, T__62=12, T__61=13, T__60=14, T__59=15, T__58=16, 
		T__57=17, T__56=18, T__55=19, T__54=20, T__53=21, T__52=22, T__51=23, 
		T__50=24, T__49=25, T__48=26, T__47=27, T__46=28, T__45=29, T__44=30, 
		T__43=31, T__42=32, T__41=33, T__40=34, T__39=35, T__38=36, T__37=37, 
		T__36=38, T__35=39, T__34=40, T__33=41, T__32=42, T__31=43, T__30=44, 
		T__29=45, T__28=46, T__27=47, T__26=48, T__25=49, T__24=50, T__23=51, 
		T__22=52, T__21=53, T__20=54, T__19=55, T__18=56, T__17=57, T__16=58, 
		T__15=59, T__14=60, T__13=61, T__12=62, T__11=63, T__10=64, T__9=65, T__8=66, 
		T__7=67, T__6=68, T__5=69, T__4=70, T__3=71, T__2=72, T__1=73, T__0=74, 
		DecimalLiteral=75, FloatingPointLiteral=76, CharacterLiteral=77, StringLiteral=78, 
		ENUM=79, Identifier=80, COMMENT=81, WS=82, LINE_COMMENT=83;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'", "'@'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'"
	};
	public static final String[] ruleNames = {
		"T__73", "T__72", "T__71", "T__70", "T__69", "T__68", "T__67", "T__66", 
		"T__65", "T__64", "T__63", "T__62", "T__61", "T__60", "T__59", "T__58", 
		"T__57", "T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", 
		"T__49", "T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", 
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "DecimalLiteral", "IntegerTypeSuffix", "FloatingPointLiteral", 
		"Exponent", "FloatTypeSuffix", "CharacterLiteral", "StringLiteral", "EscapeSequence", 
		"ENUM", "Identifier", "Letter", "COMMENT", "WS", "LINE_COMMENT"
	};


	  protected boolean enumIsKeyword = true;
	  protected boolean assertIsKeyword = true;


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 82: ENUM_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ENUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: if (!enumIsKeyword) setType(Identifier); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2U\u027e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\39\39\3:"+
		"\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G"+
		"\3G\3G\3H\3H\3H\3H\3H\3I\3I\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\7L\u01f0"+
		"\nL\fL\16L\u01f3\13L\5L\u01f5\nL\3L\5L\u01f8\nL\3M\3M\3N\6N\u01fd\nN\r"+
		"N\16N\u01fe\3N\3N\7N\u0203\nN\fN\16N\u0206\13N\3N\5N\u0209\nN\3N\5N\u020c"+
		"\nN\3N\3N\6N\u0210\nN\rN\16N\u0211\3N\5N\u0215\nN\3N\5N\u0218\nN\3N\6"+
		"N\u021b\nN\rN\16N\u021c\3N\3N\5N\u0221\nN\3N\6N\u0224\nN\rN\16N\u0225"+
		"\3N\5N\u0229\nN\3O\3O\5O\u022d\nO\3O\6O\u0230\nO\rO\16O\u0231\3P\3P\3"+
		"Q\3Q\3Q\5Q\u0239\nQ\3Q\3Q\3R\3R\3R\7R\u0240\nR\fR\16R\u0243\13R\3R\3R"+
		"\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\7U\u0253\nU\fU\16U\u0256\13U\3V\3"+
		"V\3W\3W\3W\3W\7W\u025e\nW\fW\16W\u0261\13W\3W\3W\3W\3W\3W\3X\6X\u0269"+
		"\nX\rX\16X\u026a\3X\3X\3Y\3Y\3Y\3Y\7Y\u0273\nY\fY\16Y\u0276\13Y\3Y\5Y"+
		"\u0279\nY\3Y\3Y\3Y\3Y\3\u025f\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085"+
		"D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099"+
		"\2\u009bN\u009d\2\u009f\2\u00a1O\u00a3P\u00a5\2\u00a7Q\u00a9R\u00ab\2"+
		"\u00adS\u00afT\u00b1U\3\2\f\4\2NNnn\4\2GGgg\4\2--//\6\2FFHHffhh\4\2))"+
		"^^\4\2$$^^\n\2$$))^^ddhhppttvv\16\2&&C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02\ua001\uf902\ufb01\5\2"+
		"\13\f\16\17\"\"\4\2\f\f\17\17\u0292\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009b\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3\3\2\2\2\5\u00b9\3\2\2\2\7\u00c1"+
		"\3\2\2\2\t\u00c5\3\2\2\2\13\u00c9\3\2\2\2\r\u00cc\3\2\2\2\17\u00d1\3\2"+
		"\2\2\21\u00d6\3\2\2\2\23\u00dc\3\2\2\2\25\u00de\3\2\2\2\27\u00e1\3\2\2"+
		"\2\31\u00e4\3\2\2\2\33\u00e6\3\2\2\2\35\u00e8\3\2\2\2\37\u00ec\3\2\2\2"+
		"!\u00f1\3\2\2\2#\u00f4\3\2\2\2%\u00f6\3\2\2\2\'\u00fe\3\2\2\2)\u0100\3"+
		"\2\2\2+\u0106\3\2\2\2-\u010d\3\2\2\2/\u0112\3\2\2\2\61\u0116\3\2\2\2\63"+
		"\u011f\3\2\2\2\65\u0124\3\2\2\2\67\u0127\3\2\2\29\u0129\3\2\2\2;\u012b"+
		"\3\2\2\2=\u012d\3\2\2\2?\u0131\3\2\2\2A\u0138\3\2\2\2C\u0142\3\2\2\2E"+
		"\u0147\3\2\2\2G\u014d\3\2\2\2I\u014f\3\2\2\2K\u0151\3\2\2\2M\u0158\3\2"+
		"\2\2O\u015d\3\2\2\2Q\u0162\3\2\2\2S\u0168\3\2\2\2U\u016b\3\2\2\2W\u016d"+
		"\3\2\2\2Y\u0178\3\2\2\2[\u017f\3\2\2\2]\u0181\3\2\2\2_\u0189\3\2\2\2a"+
		"\u018c\3\2\2\2c\u018e\3\2\2\2e\u0194\3\2\2\2g\u0199\3\2\2\2i\u019b\3\2"+
		"\2\2k\u019d\3\2\2\2m\u01a2\3\2\2\2o\u01a4\3\2\2\2q\u01a7\3\2\2\2s\u01ab"+
		"\3\2\2\2u\u01af\3\2\2\2w\u01b1\3\2\2\2y\u01b3\3\2\2\2{\u01b6\3\2\2\2}"+
		"\u01b8\3\2\2\2\177\u01bb\3\2\2\2\u0081\u01c2\3\2\2\2\u0083\u01c8\3\2\2"+
		"\2\u0085\u01ca\3\2\2\2\u0087\u01cc\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u01d1"+
		"\3\2\2\2\u008d\u01d6\3\2\2\2\u008f\u01dc\3\2\2\2\u0091\u01e1\3\2\2\2\u0093"+
		"\u01e3\3\2\2\2\u0095\u01e5\3\2\2\2\u0097\u01f4\3\2\2\2\u0099\u01f9\3\2"+
		"\2\2\u009b\u0228\3\2\2\2\u009d\u022a\3\2\2\2\u009f\u0233\3\2\2\2\u00a1"+
		"\u0235\3\2\2\2\u00a3\u023c\3\2\2\2\u00a5\u0246\3\2\2\2\u00a7\u0249\3\2"+
		"\2\2\u00a9\u0250\3\2\2\2\u00ab\u0257\3\2\2\2\u00ad\u0259\3\2\2\2\u00af"+
		"\u0268\3\2\2\2\u00b1\u026e\3\2\2\2\u00b3\u00b4\7H\2\2\u00b4\u00b5\7n\2"+
		"\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7v\2\2\u00b8\4\3"+
		"\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7x\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\6\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7w\2\2\u00c3\u00c4\7p"+
		"\2\2\u00c4\b\3\2\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7y\2\2\u00c8\n\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca\u00cb\7?\2\2\u00cb\f"+
		"\3\2\2\2\u00cc\u00cd\7D\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\16\3\2\2\2\u00d1\u00d2\7x\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7k\2\2\u00d4\u00d5\7f\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7g\2\2"+
		"\u00db\22\3\2\2\2\u00dc\u00dd\7}\2\2\u00dd\24\3\2\2\2\u00de\u00df\7\60"+
		"\2\2\u00df\u00e0\7\60\2\2\u00e0\26\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3"+
		"\7(\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5\32\3\2\2\2\u00e6\u00e7"+
		"\7`\2\2\u00e7\34\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\36\3\2\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7n\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\"\3\2\2\2\u00f4\u00f5\7*\2\2\u00f5$\3\2\2\2\u00f6\u00f7"+
		"\7r\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7m\2\2\u00fa"+
		"\u00fb\7c\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7g\2\2\u00fd&\3\2\2\2\u00fe"+
		"\u00ff\7.\2\2\u00ff(\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105*\3\2\2\2\u0106"+
		"\u0107\7v\2\2\u0107\u0108\7j\2\2\u0108\u0109\7t\2\2\u0109\u010a\7q\2\2"+
		"\u010a\u010b\7y\2\2\u010b\u010c\7u\2\2\u010c,\3\2\2\2\u010d\u010e\7D\2"+
		"\2\u010e\u010f\7{\2\2\u010f\u0110\7v\2\2\u0110\u0111\7g\2\2\u0111.\3\2"+
		"\2\2\u0112\u0113\7x\2\2\u0113\u0114\7c\2\2\u0114\u0115\7t\2\2\u0115\60"+
		"\3\2\2\2\u0116\u0117\7c\2\2\u0117\u0118\7d\2\2\u0118\u0119\7u\2\2\u0119"+
		"\u011a\7v\2\2\u011a\u011b\7t\2\2\u011b\u011c\7c\2\2\u011c\u011d\7e\2\2"+
		"\u011d\u011e\7v\2\2\u011e\62\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7"+
		"p\2\2\u0121\u0122\7k\2\2\u0122\u0123\7v\2\2\u0123\64\3\2\2\2\u0124\u0125"+
		"\7-\2\2\u0125\u0126\7-\2\2\u0126\66\3\2\2\2\u0127\u0128\7>\2\2\u01288"+
		"\3\2\2\2\u0129\u012a\7_\2\2\u012a:\3\2\2\2\u012b\u012c\7\u0080\2\2\u012c"+
		"<\3\2\2\2\u012d\u012e\7n\2\2\u012e\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130"+
		">\3\2\2\2\u0131\u0132\7u\2\2\u0132\u0133\7v\2\2\u0133\u0134\7c\2\2\u0134"+
		"\u0135\7v\2\2\u0135\u0136\7k\2\2\u0136\u0137\7e\2\2\u0137@\3\2\2\2\u0138"+
		"\u0139\7r\2\2\u0139\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b\u013c\7v\2\2"+
		"\u013c\u013d\7g\2\2\u013d\u013e\7e\2\2\u013e\u013f\7v\2\2\u013f\u0140"+
		"\7g\2\2\u0140\u0141\7f\2\2\u0141B\3\2\2\2\u0142\u0143\7E\2\2\u0143\u0144"+
		"\7j\2\2\u0144\u0145\7c\2\2\u0145\u0146\7t\2\2\u0146D\3\2\2\2\u0147\u0148"+
		"\7h\2\2\u0148\u0149\7k\2\2\u0149\u014a\7p\2\2\u014a\u014b\7c\2\2\u014b"+
		"\u014c\7n\2\2\u014cF\3\2\2\2\u014d\u014e\7-\2\2\u014eH\3\2\2\2\u014f\u0150"+
		"\7\61\2\2\u0150J\3\2\2\2\u0151\u0152\7t\2\2\u0152\u0153\7g\2\2\u0153\u0154"+
		"\7v\2\2\u0154\u0155\7w\2\2\u0155\u0156\7t\2\2\u0156\u0157\7p\2\2\u0157"+
		"L\3\2\2\2\u0158\u0159\7v\2\2\u0159\u015a\7t\2\2\u015a\u015b\7w\2\2\u015b"+
		"\u015c\7g\2\2\u015cN\3\2\2\2\u015d\u015e\7N\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7i\2\2\u0161P\3\2\2\2\u0162\u0163\7e\2\2\u0163"+
		"\u0164\7n\2\2\u0164\u0165\7c\2\2\u0165\u0166\7u\2\2\u0166\u0167\7u\2\2"+
		"\u0167R\3\2\2\2\u0168\u0169\7~\2\2\u0169\u016a\7~\2\2\u016aT\3\2\2\2\u016b"+
		"\u016c\7=\2\2\u016cV\3\2\2\2\u016d\u016e\7k\2\2\u016e\u016f\7p\2\2\u016f"+
		"\u0170\7u\2\2\u0170\u0171\7v\2\2\u0171\u0172\7c\2\2\u0172\u0173\7p\2\2"+
		"\u0173\u0174\7e\2\2\u0174\u0175\7g\2\2\u0175\u0176\7q\2\2\u0176\u0177"+
		"\7h\2\2\u0177X\3\2\2\2\u0178\u0179\7F\2\2\u0179\u017a\7q\2\2\u017a\u017b"+
		"\7w\2\2\u017b\u017c\7d\2\2\u017c\u017d\7n\2\2\u017d\u017e\7g\2\2\u017e"+
		"Z\3\2\2\2\u017f\u0180\7\177\2\2\u0180\\\3\2\2\2\u0181\u0182\7g\2\2\u0182"+
		"\u0183\7z\2\2\u0183\u0184\7v\2\2\u0184\u0185\7g\2\2\u0185\u0186\7p\2\2"+
		"\u0186\u0187\7f\2\2\u0187\u0188\7u\2\2\u0188^\3\2\2\2\u0189\u018a\7k\2"+
		"\2\u018a\u018b\7h\2\2\u018b`\3\2\2\2\u018c\u018d\7A\2\2\u018db\3\2\2\2"+
		"\u018e\u018f\7d\2\2\u018f\u0190\7t\2\2\u0190\u0191\7g\2\2\u0191\u0192"+
		"\7c\2\2\u0192\u0193\7m\2\2\u0193d\3\2\2\2\u0194\u0195\7y\2\2\u0195\u0196"+
		"\7j\2\2\u0196\u0197\7g\2\2\u0197\u0198\7p\2\2\u0198f\3\2\2\2\u0199\u019a"+
		"\7(\2\2\u019ah\3\2\2\2\u019b\u019c\7,\2\2\u019cj\3\2\2\2\u019d\u019e\7"+
		"v\2\2\u019e\u019f\7j\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7u\2\2\u01a1l"+
		"\3\2\2\2\u01a2\u01a3\7\60\2\2\u01a3n\3\2\2\2\u01a4\u01a5\7/\2\2\u01a5"+
		"\u01a6\7@\2\2\u01a6p\3\2\2\2\u01a7\u01a8\7\60\2\2\u01a8\u01a9\7\60\2\2"+
		"\u01a9\u01aa\7\60\2\2\u01aar\3\2\2\2\u01ab\u01ac\7K\2\2\u01ac\u01ad\7"+
		"p\2\2\u01ad\u01ae\7v\2\2\u01aet\3\2\2\2\u01af\u01b0\7<\2\2\u01b0v\3\2"+
		"\2\2\u01b1\u01b2\7]\2\2\u01b2x\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b5"+
		"\7?\2\2\u01b5z\3\2\2\2\u01b6\u01b7\7~\2\2\u01b7|\3\2\2\2\u01b8\u01b9\7"+
		"/\2\2\u01b9\u01ba\7/\2\2\u01ba~\3\2\2\2\u01bb\u01bc\7r\2\2\u01bc\u01bd"+
		"\7w\2\2\u01bd\u01be\7d\2\2\u01be\u01bf\7n\2\2\u01bf\u01c0\7k\2\2\u01c0"+
		"\u01c1\7e\2\2\u01c1\u0080\3\2\2\2\u01c2\u01c3\7U\2\2\u01c3\u01c4\7j\2"+
		"\2\u01c4\u01c5\7q\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7v\2\2\u01c7\u0082"+
		"\3\2\2\2\u01c8\u01c9\7@\2\2\u01c9\u0084\3\2\2\2\u01ca\u01cb\7#\2\2\u01cb"+
		"\u0086\3\2\2\2\u01cc\u01cd\7\'\2\2\u01cd\u0088\3\2\2\2\u01ce\u01cf\7k"+
		"\2\2\u01cf\u01d0\7p\2\2\u01d0\u008a\3\2\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3"+
		"\7n\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7g\2\2\u01d5\u008c\3\2\2\2\u01d6"+
		"\u01d7\7u\2\2\u01d7\u01d8\7w\2\2\u01d8\u01d9\7r\2\2\u01d9\u01da\7g\2\2"+
		"\u01da\u01db\7t\2\2\u01db\u008e\3\2\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de"+
		"\7g\2\2\u01de\u01df\7n\2\2\u01df\u01e0\7h\2\2\u01e0\u0090\3\2\2\2\u01e1"+
		"\u01e2\7+\2\2\u01e2\u0092\3\2\2\2\u01e3\u01e4\7/\2\2\u01e4\u0094\3\2\2"+
		"\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7o\2\2\u01e7\u01e8\7r\2\2\u01e8\u01e9"+
		"\7q\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7v\2\2\u01eb\u0096\3\2\2\2\u01ec"+
		"\u01f5\7\62\2\2\u01ed\u01f1\4\63;\2\u01ee\u01f0\4\62;\2\u01ef\u01ee\3"+
		"\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01ec\3\2\2\2\u01f4\u01ed\3\2"+
		"\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\5\u0099M\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u0098\3\2\2\2\u01f9\u01fa\t\2\2\2\u01fa\u009a\3\2"+
		"\2\2\u01fb\u01fd\4\62;\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\7\60"+
		"\2\2\u0201\u0203\4\62;\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0209\5\u009dO\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u020c\5\u009fP\2\u020b\u020a\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u0229\3\2\2\2\u020d\u020f\7\60\2\2\u020e\u0210\4\62;\2"+
		"\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\5\u009dO\2\u0214\u0213\3\2\2"+
		"\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0218\5\u009fP\2\u0217"+
		"\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0229\3\2\2\2\u0219\u021b\4\62"+
		";\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\5\u009dO\2\u021f\u0221"+
		"\5\u009fP\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0229\3\2\2"+
		"\2\u0222\u0224\4\62;\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\5\u009fP"+
		"\2\u0228\u01fc\3\2\2\2\u0228\u020d\3\2\2\2\u0228\u021a\3\2\2\2\u0228\u0223"+
		"\3\2\2\2\u0229\u009c\3\2\2\2\u022a\u022c\t\3\2\2\u022b\u022d\t\4\2\2\u022c"+
		"\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0230\4\62"+
		";\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u009e\3\2\2\2\u0233\u0234\t\5\2\2\u0234\u00a0\3\2"+
		"\2\2\u0235\u0238\7)\2\2\u0236\u0239\5\u00a5S\2\u0237\u0239\n\6\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\7)"+
		"\2\2\u023b\u00a2\3\2\2\2\u023c\u0241\7$\2\2\u023d\u0240\5\u00a5S\2\u023e"+
		"\u0240\n\7\2\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0245\7$\2\2\u0245\u00a4\3\2\2\2\u0246\u0247\7^\2"+
		"\2\u0247\u0248\t\b\2\2\u0248\u00a6\3\2\2\2\u0249\u024a\7g\2\2\u024a\u024b"+
		"\7p\2\2\u024b\u024c\7w\2\2\u024c\u024d\7o\2\2\u024d\u024e\3\2\2\2\u024e"+
		"\u024f\bT\2\2\u024f\u00a8\3\2\2\2\u0250\u0254\5\u00abV\2\u0251\u0253\5"+
		"\u00abV\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2"+
		"\u0254\u0255\3\2\2\2\u0255\u00aa\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258"+
		"\t\t\2\2\u0258\u00ac\3\2\2\2\u0259\u025a\7\61\2\2\u025a\u025b\7,\2\2\u025b"+
		"\u025f\3\2\2\2\u025c\u025e\13\2\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3"+
		"\2\2\2\u025f\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0262\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0263\7,\2\2\u0263\u0264\7\61\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\bW\3\2\u0266\u00ae\3\2\2\2\u0267\u0269\t\n\2\2\u0268"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u026d\bX\3\2\u026d\u00b0\3\2\2\2\u026e"+
		"\u026f\7\61\2\2\u026f\u0270\7\61\2\2\u0270\u0274\3\2\2\2\u0271\u0273\n"+
		"\13\2\2\u0272\u0271\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u0279\7\17"+
		"\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027b\7\f\2\2\u027b\u027c\3\2\2\2\u027c\u027d\bY\3\2\u027d\u00b2\3\2"+
		"\2\2\33\2\u01f1\u01f4\u01f7\u01fe\u0204\u0208\u020b\u0211\u0214\u0217"+
		"\u021c\u0220\u0225\u0228\u022c\u0231\u0238\u023f\u0241\u0254\u025f\u026a"+
		"\u0274\u0278\4\3T\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}