package com.paratussoftware.parseival.parsers.ruby;

// Generated from Ruby.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		IF=9, THEN=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, EQUAL=26, NOT_EQUAL=27, GREATER=28, LESS=29, LESS_EQUAL=30, GREATER_EQUAL=31, 
		ASSIGN=32, PLUS_ASSIGN=33, MINUS_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, 
		MOD_ASSIGN=37, EXP_ASSIGN=38, BIT_AND=39, BIT_OR=40, BIT_XOR=41, BIT_NOT=42, 
		BIT_SHL=43, BIT_SHR=44, AND=45, OR=46, NOT=47, LEFT_RBRACKET=48, RIGHT_RBRACKET=49, 
		LEFT_SBRACKET=50, RIGHT_SBRACKET=51, NIL=52, SL_COMMENT=53, ML_COMMENT=54, 
		WS=55, INT=56, FLOAT=57, ID=58, ID_GLOBAL=59, ID_FUNCTION=60;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", 
		"DEF", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", 
		"BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"EXP", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID", "ID_GLOBAL", "ID_FUNCTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", "'\n'", "'require'", "'end'", "'def'", "'return'", 
		"'if'", "'then'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
		"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'**'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'", "'>>'", 
		null, null, null, "'('", "')'", "'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
		"RETURN", "IF", "THEN", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
		"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "EQUAL", 
		"NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID", "ID_GLOBAL", "ID_FUNCTION"
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


	  public int SemanticErrorsNum = 0;
	  public int NumStr = 1;
	  java.util.LinkedList<String> definitions = new java.util.LinkedList<String>();

	  public static boolean is_defined(java.util.LinkedList<String> definitions, String variable) {
	       int index = definitions.indexOf(variable);
	       if (index == -1) {
	         return false;
	       }
	       return true;
	  }


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u0190\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3\3\3\3"+
		"\3\3\3\3\3\7\3\u008d\n\3\f\3\16\3\u0090\13\3\3\3\5\3\u0093\n\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		"-\3.\3.\3.\3/\3/\3/\3/\3/\5/\u0132\n/\3\60\3\60\3\60\3\60\5\60\u0138\n"+
		"\60\3\61\3\61\3\61\3\61\5\61\u013e\n\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u014e\n\67\f\67\16\67\u0151"+
		"\13\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\78\u015f\n8\f8\168"+
		"\u0162\138\38\38\38\38\38\38\38\38\39\69\u016d\n9\r9\169\u016e\39\39\3"+
		":\6:\u0174\n:\r:\16:\u0175\3;\7;\u0179\n;\f;\16;\u017c\13;\3;\3;\6;\u0180"+
		"\n;\r;\16;\u0181\3<\3<\7<\u0186\n<\f<\16<\u0189\13<\3=\3=\3=\3>\3>\3>"+
		"\5\u0085\u008e\u0160\2?\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63"+
		"\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61"+
		"c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>\3\2\b\4\2\f\f\17\17\4\2\13\13\""+
		"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2##AA\2\u019d\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0092"+
		"\3\2\2\2\7\u0094\3\2\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u009a\3\2"+
		"\2\2\17\u00a2\3\2\2\2\21\u00a6\3\2\2\2\23\u00aa\3\2\2\2\25\u00b1\3\2\2"+
		"\2\27\u00b4\3\2\2\2\31\u00b9\3\2\2\2\33\u00be\3\2\2\2\35\u00c4\3\2\2\2"+
		"\37\u00cb\3\2\2\2!\u00d1\3\2\2\2#\u00d7\3\2\2\2%\u00dd\3\2\2\2\'\u00e1"+
		"\3\2\2\2)\u00e6\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2/\u00f0\3\2\2\2\61"+
		"\u00f2\3\2\2\2\63\u00f4\3\2\2\2\65\u00f6\3\2\2\2\67\u00f9\3\2\2\29\u00fc"+
		"\3\2\2\2;\u00ff\3\2\2\2=\u0101\3\2\2\2?\u0103\3\2\2\2A\u0106\3\2\2\2C"+
		"\u0109\3\2\2\2E\u010b\3\2\2\2G\u010e\3\2\2\2I\u0111\3\2\2\2K\u0114\3\2"+
		"\2\2M\u0117\3\2\2\2O\u011a\3\2\2\2Q\u011e\3\2\2\2S\u0120\3\2\2\2U\u0122"+
		"\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0129\3\2\2\2]\u0131\3\2\2\2_"+
		"\u0137\3\2\2\2a\u013d\3\2\2\2c\u013f\3\2\2\2e\u0141\3\2\2\2g\u0143\3\2"+
		"\2\2i\u0145\3\2\2\2k\u0147\3\2\2\2m\u014b\3\2\2\2o\u0156\3\2\2\2q\u016c"+
		"\3\2\2\2s\u0173\3\2\2\2u\u017a\3\2\2\2w\u0183\3\2\2\2y\u018a\3\2\2\2{"+
		"\u018d\3\2\2\2}~\7^\2\2~\177\7$\2\2\177\4\3\2\2\2\u0080\u0085\7$\2\2\u0081"+
		"\u0084\5\3\2\2\u0082\u0084\n\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2"+
		"\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0093\7$\2\2\u0089\u008e\7)\2"+
		"\2\u008a\u008d\5\3\2\2\u008b\u008d\n\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7)\2\2\u0092\u0080\3\2"+
		"\2\2\u0092\u0089\3\2\2\2\u0093\6\3\2\2\2\u0094\u0095\7.\2\2\u0095\b\3"+
		"\2\2\2\u0096\u0097\7=\2\2\u0097\n\3\2\2\2\u0098\u0099\7\f\2\2\u0099\f"+
		"\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7s\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\16\3\2\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7"+
		"f\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7h\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\24\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\26\3\2\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2"+
		"\u00b8\30\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7"+
		"u\2\2\u00bc\u00bd\7g\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\34\3\2\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7u\2\2\u00ca\36\3\2\2\2\u00cb"+
		"\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7g\2"+
		"\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7{\2\2\u00d6\"\3"+
		"\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7m\2\2\u00dc$\3\2\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0&\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2"+
		"\u00e3\7t\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7g\2\2\u00e5(\3\2\2\2\u00e6"+
		"\u00e7\7h\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7u\2\2"+
		"\u00ea\u00eb\7g\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed,\3\2\2\2\u00ee"+
		"\u00ef\7/\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\60\3\2\2\2\u00f2"+
		"\u00f3\7\61\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7\'\2\2\u00f5\64\3\2\2\2"+
		"\u00f6\u00f7\7,\2\2\u00f7\u00f8\7,\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7"+
		"?\2\2\u00fa\u00fb\7?\2\2\u00fb8\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe:\3\2\2\2\u00ff\u0100\7@\2\2\u0100<\3\2\2\2\u0101\u0102\7"+
		">\2\2\u0102>\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7?\2\2\u0105@\3\2"+
		"\2\2\u0106\u0107\7@\2\2\u0107\u0108\7?\2\2\u0108B\3\2\2\2\u0109\u010a"+
		"\7?\2\2\u010aD\3\2\2\2\u010b\u010c\7-\2\2\u010c\u010d\7?\2\2\u010dF\3"+
		"\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7?\2\2\u0110H\3\2\2\2\u0111\u0112"+
		"\7,\2\2\u0112\u0113\7?\2\2\u0113J\3\2\2\2\u0114\u0115\7\61\2\2\u0115\u0116"+
		"\7?\2\2\u0116L\3\2\2\2\u0117\u0118\7\'\2\2\u0118\u0119\7?\2\2\u0119N\3"+
		"\2\2\2\u011a\u011b\7,\2\2\u011b\u011c\7,\2\2\u011c\u011d\7?\2\2\u011d"+
		"P\3\2\2\2\u011e\u011f\7(\2\2\u011fR\3\2\2\2\u0120\u0121\7~\2\2\u0121T"+
		"\3\2\2\2\u0122\u0123\7`\2\2\u0123V\3\2\2\2\u0124\u0125\7\u0080\2\2\u0125"+
		"X\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7>\2\2\u0128Z\3\2\2\2\u0129\u012a"+
		"\7@\2\2\u012a\u012b\7@\2\2\u012b\\\3\2\2\2\u012c\u012d\7c\2\2\u012d\u012e"+
		"\7p\2\2\u012e\u0132\7f\2\2\u012f\u0130\7(\2\2\u0130\u0132\7(\2\2\u0131"+
		"\u012c\3\2\2\2\u0131\u012f\3\2\2\2\u0132^\3\2\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0138\7t\2\2\u0135\u0136\7~\2\2\u0136\u0138\7~\2\2\u0137\u0133\3\2\2"+
		"\2\u0137\u0135\3\2\2\2\u0138`\3\2\2\2\u0139\u013a\7p\2\2\u013a\u013b\7"+
		"q\2\2\u013b\u013e\7v\2\2\u013c\u013e\7#\2\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013eb\3\2\2\2\u013f\u0140\7*\2\2\u0140d\3\2\2\2\u0141"+
		"\u0142\7+\2\2\u0142f\3\2\2\2\u0143\u0144\7]\2\2\u0144h\3\2\2\2\u0145\u0146"+
		"\7_\2\2\u0146j\3\2\2\2\u0147\u0148\7p\2\2\u0148\u0149\7k\2\2\u0149\u014a"+
		"\7n\2\2\u014al\3\2\2\2\u014b\u014f\7%\2\2\u014c\u014e\n\2\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\f\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\b\67\2\2\u0155n\3\2\2\2\u0156\u0157\7?\2\2\u0157\u0158"+
		"\7d\2\2\u0158\u0159\7g\2\2\u0159\u015a\7i\2\2\u015a\u015b\7k\2\2\u015b"+
		"\u015c\7p\2\2\u015c\u0160\3\2\2\2\u015d\u015f\13\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164\7?\2\2\u0164\u0165\7g\2"+
		"\2\u0165\u0166\7p\2\2\u0166\u0167\7f\2\2\u0167\u0168\7\f\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\b8\2\2\u016ap\3\2\2\2\u016b\u016d\t\3\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\b9\2\2\u0171r\3\2\2\2\u0172\u0174\t\4\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176t\3\2\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017c"+
		"\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\7\60\2\2\u017e\u0180\t\4\2\2\u017f\u017e\3"+
		"\2\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"v\3\2\2\2\u0183\u0187\t\5\2\2\u0184\u0186\t\6\2\2\u0185\u0184\3\2\2\2"+
		"\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188x\3"+
		"\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7&\2\2\u018b\u018c\5w<\2\u018c"+
		"z\3\2\2\2\u018d\u018e\5w<\2\u018e\u018f\t\7\2\2\u018f|\3\2\2\2\22\2\u0083"+
		"\u0085\u008c\u008e\u0092\u0131\u0137\u013d\u014f\u0160\u016e\u0175\u017a"+
		"\u0181\u0187\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}