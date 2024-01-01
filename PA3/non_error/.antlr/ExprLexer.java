// Generated from /root/PA3/non_error/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NEWLINE=13, INT=14, REAL=15, PARAMETER=16, 
		VARIABLE=17, FUNCTION=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NEWLINE", "INT", "REAL", "PARAMETER", "VARIABLE", 
			"FUNCTION", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'def'", "'='", "'endef'", "'let'", "'in'", "'('", "','", 
			"')'", "'+'", "'-'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NEWLINE", "INT", "REAL", "PARAMETER", "VARIABLE", "FUNCTION", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\u0013t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0004\fJ\b\f\u000b\f\f\fK\u0001"+
		"\r\u0004\rO\b\r\u000b\r\f\rP\u0001\u000e\u0004\u000eT\b\u000e\u000b\u000e"+
		"\f\u000eU\u0001\u000e\u0001\u000e\u0005\u000eZ\b\u000e\n\u000e\f\u000e"+
		"]\t\u000e\u0001\u000f\u0004\u000f`\b\u000f\u000b\u000f\f\u000fa\u0001"+
		"\u0010\u0004\u0010e\b\u0010\u000b\u0010\f\u0010f\u0001\u0011\u0004\u0011"+
		"j\b\u0011\u000b\u0011\f\u0011k\u0001\u0012\u0004\u0012o\b\u0012\u000b"+
		"\u0012\f\u0012p\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0006\u0002\u0000\n\n\r"+
		"\r\u0001\u000009\u0003\u0000AZ__az\u0004\u0000--AZ__az\u0003\u000009A"+
		"Zaz\u0003\u0000\t\n\r\r  {\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001"+
		"\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000"+
		"\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000\u0000\u0011"+
		"@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015D\u0001"+
		"\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000"+
		"\u0000\u001bN\u0001\u0000\u0000\u0000\u001dS\u0001\u0000\u0000\u0000\u001f"+
		"_\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#i\u0001\u0000\u0000"+
		"\u0000%n\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005d\u0000\u0000*+\u0005e\u0000\u0000+,\u0005f\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000.\u0006\u0001"+
		"\u0000\u0000\u0000/0\u0005e\u0000\u000001\u0005n\u0000\u000012\u0005d"+
		"\u0000\u000023\u0005e\u0000\u000034\u0005f\u0000\u00004\b\u0001\u0000"+
		"\u0000\u000056\u0005l\u0000\u000067\u0005e\u0000\u000078\u0005t\u0000"+
		"\u00008\n\u0001\u0000\u0000\u00009:\u0005i\u0000\u0000:;\u0005n\u0000"+
		"\u0000;\f\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000=\u000e\u0001\u0000"+
		"\u0000\u0000>?\u0005,\u0000\u0000?\u0010\u0001\u0000\u0000\u0000@A\u0005"+
		")\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005+\u0000\u0000C\u0014"+
		"\u0001\u0000\u0000\u0000DE\u0005-\u0000\u0000E\u0016\u0001\u0000\u0000"+
		"\u0000FG\u0005~\u0000\u0000G\u0018\u0001\u0000\u0000\u0000HJ\u0007\u0000"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\u001a\u0001\u0000\u0000"+
		"\u0000MO\u0007\u0001\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u001c"+
		"\u0001\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W[\u0005.\u0000\u0000XZ\u0007\u0001"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^`\u0007\u0002\u0000\u0000_^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000b \u0001\u0000\u0000\u0000ce\u0007\u0003\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\"\u0001\u0000\u0000\u0000hj\u0007\u0004"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l$\u0001\u0000\u0000\u0000"+
		"mo\u0007\u0005\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0006\u0012\u0000\u0000s&\u0001\u0000\u0000\u0000\t\u0000"+
		"KPU[afkp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}