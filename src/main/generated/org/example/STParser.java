// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class STParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INPUT_PIN=8, OUTPUT_PIN=9, 
		Binary_literal=10, Octal_literal=11, Decimal_literal=12, Pure_decimal_digits=13, 
		Hexadecimal_literal=14, Floating_point_literal=15, Static_string_literal=16, 
		ID=17, MUL=18, DIV=19, MOD=20, ADD=21, SUB=22, NOT=23, LP=24, RP=25, AND=26, 
		OR=27, XOR=28, GT=29, GE=30, LT=31, LE=32, EQ=33, DIFF=34, BOOLEAN=35, 
		INTEGER=36, WS=37, Block_comment=38;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_var_block = 2, RULE_variable_declaration = 3, 
		RULE_type_rule = 4, RULE_value = 5, RULE_boolean_literal = 6, RULE_numeric_literal = 7, 
		RULE_string_literal = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "var_block", "variable_declaration", "type_rule", 
			"value", "boolean_literal", "numeric_literal", "string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VAR'", "'END_VAR'", "':'", "':='", "';'", "'TRUE'", "'FALSE'", 
			null, null, null, null, null, null, null, null, null, null, "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'!'", "'('", "')'", "'and'", "'or'", "'xor'", "'>'", 
			"'>='", "'<'", "'<='", "'=='", "'!='", "' BOOL'", "' INT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INPUT_PIN", "OUTPUT_PIN", 
			"Binary_literal", "Octal_literal", "Decimal_literal", "Pure_decimal_digits", 
			"Hexadecimal_literal", "Floating_point_literal", "Static_string_literal", 
			"ID", "MUL", "DIV", "MOD", "ADD", "SUB", "NOT", "LP", "RP", "AND", "OR", 
			"XOR", "GT", "GE", "LT", "LE", "EQ", "DIFF", "BOOLEAN", "INTEGER", "WS", 
			"Block_comment"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleStatementsContext extends StartContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MultipleStatementsContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterMultipleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitMultipleStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitMultipleStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new MultipleStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableBlockRuleContext extends StatementContext {
		public Var_blockContext var_block() {
			return getRuleContext(Var_blockContext.class,0);
		}
		public VariableBlockRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariableBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariableBlockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariableBlockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new VariableBlockRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			var_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_blockContext extends ParserRuleContext {
		public Var_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_block; }
	 
		public Var_blockContext() { }
		public void copyFrom(Var_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableBlockContext extends Var_blockContext {
		public Variable_declarationContext variable_declaration;
		public List<Variable_declarationContext> variables = new ArrayList<Variable_declarationContext>();
		public List<Variable_declarationContext> variable_declaration() {
			return getRuleContexts(Variable_declarationContext.class);
		}
		public Variable_declarationContext variable_declaration(int i) {
			return getRuleContext(Variable_declarationContext.class,i);
		}
		public VariableBlockContext(Var_blockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariableBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariableBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariableBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_blockContext var_block() throws RecognitionException {
		Var_blockContext _localctx = new Var_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_block);
		int _la;
		try {
			_localctx = new VariableBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			match(T__0);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(26);
				((VariableBlockContext)_localctx).variable_declaration = variable_declaration();
				((VariableBlockContext)_localctx).variables.add(((VariableBlockContext)_localctx).variable_declaration);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	 
		public Variable_declarationContext() { }
		public void copyFrom(Variable_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends Variable_declarationContext {
		public TerminalNode ID() { return getToken(STParser.ID, 0); }
		public Type_ruleContext type_rule() {
			return getRuleContext(Type_ruleContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableDeclarationContext(Variable_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaration);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(T__2);
			setState(36);
			type_rule();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(37);
				match(T__3);
				setState(38);
				value();
				}
			}

			setState(41);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_ruleContext extends ParserRuleContext {
		public Type_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_rule; }
	 
		public Type_ruleContext() { }
		public void copyFrom(Type_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends Type_ruleContext {
		public TerminalNode BOOLEAN() { return getToken(STParser.BOOLEAN, 0); }
		public BooleanTypeContext(Type_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerTypeContext extends Type_ruleContext {
		public TerminalNode INTEGER() { return getToken(STParser.INTEGER, 0); }
		public IntegerTypeContext(Type_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIntegerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIntegerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_ruleContext type_rule() throws RecognitionException {
		Type_ruleContext _localctx = new Type_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_rule);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(INTEGER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputPinValueContext extends ValueContext {
		public TerminalNode INPUT_PIN() { return getToken(STParser.INPUT_PIN, 0); }
		public InputPinValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterInputPinValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitInputPinValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitInputPinValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanValueContext extends ValueContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public BooleanValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericLiteralValueContext extends ValueContext {
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public NumericLiteralValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterNumericLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitNumericLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitNumericLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				boolean_literal();
				}
				break;
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case SUB:
				_localctx = new NumericLiteralValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				numeric_literal();
				}
				break;
			case INPUT_PIN:
				_localctx = new InputPinValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(INPUT_PIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	 
		public Boolean_literalContext() { }
		public void copyFrom(Boolean_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseValueContext extends Boolean_literalContext {
		public FalseValueContext(Boolean_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFalseValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFalseValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFalseValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueValueContext extends Boolean_literalContext {
		public TrueValueContext(Boolean_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterTrueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitTrueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitTrueValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolean_literal);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_literalContext extends ParserRuleContext {
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
	 
		public Numeric_literalContext() { }
		public void copyFrom(Numeric_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalValueContext extends Numeric_literalContext {
		public TerminalNode Decimal_literal() { return getToken(STParser.Decimal_literal, 0); }
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public DecimalValueContext(Numeric_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterDecimalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitDecimalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitDecimalValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexValueContext extends Numeric_literalContext {
		public TerminalNode Hexadecimal_literal() { return getToken(STParser.Hexadecimal_literal, 0); }
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public HexValueContext(Numeric_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterHexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitHexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitHexValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatValueContext extends Numeric_literalContext {
		public TerminalNode Floating_point_literal() { return getToken(STParser.Floating_point_literal, 0); }
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public FloatValueContext(Numeric_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitFloatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctalValueContext extends Numeric_literalContext {
		public TerminalNode Octal_literal() { return getToken(STParser.Octal_literal, 0); }
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public OctalValueContext(Numeric_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterOctalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitOctalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitOctalValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryValueContext extends Numeric_literalContext {
		public TerminalNode Binary_literal() { return getToken(STParser.Binary_literal, 0); }
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public BinaryValueContext(Numeric_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBinaryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBinaryValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBinaryValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric_literal);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new BinaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(56);
					match(SUB);
					}
				}

				setState(59);
				match(Binary_literal);
				}
				break;
			case 2:
				_localctx = new OctalValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(60);
					match(SUB);
					}
				}

				setState(63);
				match(Octal_literal);
				}
				break;
			case 3:
				_localctx = new DecimalValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(64);
					match(SUB);
					}
				}

				setState(67);
				match(Decimal_literal);
				}
				break;
			case 4:
				_localctx = new FloatValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(68);
					match(SUB);
					}
				}

				setState(71);
				match(Floating_point_literal);
				}
				break;
			case 5:
				_localctx = new HexValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(72);
					match(SUB);
					}
				}

				setState(75);
				match(Hexadecimal_literal);
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

	@SuppressWarnings("CheckReturnValue")
	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode Static_string_literal() { return getToken(STParser.Static_string_literal, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(Static_string_literal);
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
		"\u0004\u0001&Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002\n"+
		"\u0002\f\u0002\u001f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003(\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004.\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u00053\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0003\u00067\b\u0006\u0001\u0007\u0003\u0007:\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007>\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"B\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007F\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007J\b\u0007\u0001\u0007\u0003\u0007M\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0000W\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000"+
		"\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000"+
		"\b-\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f6\u0001\u0000"+
		"\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0003\u0001\u0000\u0000\u0000"+
		"\u0019\u001d\u0005\u0001\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !"+
		"\u0005\u0002\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0005\u0011"+
		"\u0000\u0000#$\u0005\u0003\u0000\u0000$\'\u0003\b\u0004\u0000%&\u0005"+
		"\u0004\u0000\u0000&(\u0003\n\u0005\u0000\'%\u0001\u0000\u0000\u0000\'"+
		"(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0005\u0000"+
		"\u0000*\u0007\u0001\u0000\u0000\u0000+.\u0005#\u0000\u0000,.\u0005$\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\t\u0001\u0000"+
		"\u0000\u0000/3\u0003\f\u0006\u000003\u0003\u000e\u0007\u000013\u0005\b"+
		"\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000021\u0001"+
		"\u0000\u0000\u00003\u000b\u0001\u0000\u0000\u000047\u0005\u0006\u0000"+
		"\u000057\u0005\u0007\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007\r\u0001\u0000\u0000\u00008:\u0005\u0016\u0000\u000098\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";M\u0005\n\u0000\u0000<>\u0005\u0016\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?M\u0005\u000b\u0000"+
		"\u0000@B\u0005\u0016\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CM\u0005\f\u0000\u0000DF\u0005\u0016"+
		"\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GM\u0005\u000f\u0000\u0000HJ\u0005\u0016\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KM\u0005\u000e\u0000\u0000L9\u0001\u0000\u0000\u0000L=\u0001\u0000"+
		"\u0000\u0000LA\u0001\u0000\u0000\u0000LE\u0001\u0000\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\u0010\u0000"+
		"\u0000O\u0011\u0001\u0000\u0000\u0000\f\u0015\u001d\'-269=AEIL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}