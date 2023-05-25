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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INPUT_PIN=7, OUTPUT_PIN=8, 
		Binary_literal=9, Octal_literal=10, Decimal_literal=11, Pure_decimal_digits=12, 
		Hexadecimal_literal=13, Floating_point_literal=14, Static_string_literal=15, 
		ID=16, MUL=17, DIV=18, MOD=19, ADD=20, SUB=21, NOT=22, LP=23, RP=24, AND=25, 
		OR=26, XOR=27, GT=28, GE=29, LT=30, LE=31, EQ=32, DIFF=33, BOOLEAN=34, 
		INTEGER=35, WS=36, SEMICOLON=37, Block_comment=38;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_var_block = 2, RULE_variable_declaration = 3, 
		RULE_type_rule = 4, RULE_assignment = 5, RULE_expression = 6, RULE_value = 7, 
		RULE_boolean_literal = 8, RULE_numeric_literal = 9, RULE_string_literal = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "var_block", "variable_declaration", "type_rule", 
			"assignment", "expression", "value", "boolean_literal", "numeric_literal", 
			"string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VAR'", "'END_VAR'", "':'", "':='", "'TRUE'", "'FALSE'", null, 
			null, null, null, null, null, null, null, null, null, "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'!'", "'('", "')'", "'and'", "'or'", "'xor'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", "' BOOL'", "' INT'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INPUT_PIN", "OUTPUT_PIN", 
			"Binary_literal", "Octal_literal", "Decimal_literal", "Pure_decimal_digits", 
			"Hexadecimal_literal", "Floating_point_literal", "Static_string_literal", 
			"ID", "MUL", "DIV", "MOD", "ADD", "SUB", "NOT", "LP", "RP", "AND", "OR", 
			"XOR", "GT", "GE", "LT", "LE", "EQ", "DIFF", "BOOLEAN", "INTEGER", "WS", 
			"SEMICOLON", "Block_comment"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 65794L) != 0 );
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
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentRuleContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterAssignmentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitAssignmentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitAssignmentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableBlockRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				var_block();
				}
				break;
			case OUTPUT_PIN:
			case ID:
				_localctx = new AssignmentRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				assignment();
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
			setState(31);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(32);
				((VariableBlockContext)_localctx).variable_declaration = variable_declaration();
				((VariableBlockContext)_localctx).variables.add(((VariableBlockContext)_localctx).variable_declaration);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
			setState(40);
			match(ID);
			setState(41);
			match(T__2);
			setState(42);
			type_rule();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(43);
				match(T__3);
				setState(44);
				value();
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
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
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuputAssignmentContext extends AssignmentContext {
		public TerminalNode OUTPUT_PIN() { return getToken(STParser.OUTPUT_PIN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OuputAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterOuputAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitOuputAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitOuputAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(STParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIdAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIdAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIdAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__3);
				setState(53);
				expression();
				}
				break;
			case OUTPUT_PIN:
				_localctx = new OuputAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(OUTPUT_PIN);
				setState(55);
				match(T__3);
				setState(56);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionValueContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExpressionValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			_localctx = new ExpressionValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			value();
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
	public static class IdValueContext extends ValueContext {
		public TerminalNode ID() { return getToken(STParser.ID, 0); }
		public IdValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIdValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIdValue(this);
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
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
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
				setState(62);
				numeric_literal();
				}
				break;
			case INPUT_PIN:
				_localctx = new InputPinValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(INPUT_PIN);
				}
				break;
			case ID:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(ID);
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
		enterRule(_localctx, 16, RULE_boolean_literal);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__5);
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
		enterRule(_localctx, 18, RULE_numeric_literal);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new BinaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(71);
					match(SUB);
					}
				}

				setState(74);
				match(Binary_literal);
				}
				break;
			case 2:
				_localctx = new OctalValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(75);
					match(SUB);
					}
				}

				setState(78);
				match(Octal_literal);
				}
				break;
			case 3:
				_localctx = new DecimalValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(79);
					match(SUB);
					}
				}

				setState(82);
				match(Decimal_literal);
				}
				break;
			case 4:
				_localctx = new FloatValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(83);
					match(SUB);
					}
				}

				setState(86);
				match(Floating_point_literal);
				}
				break;
			case 5:
				_localctx = new HexValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(87);
					match(SUB);
					}
				}

				setState(90);
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
		enterRule(_localctx, 20, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		"\u0004\u0001&`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018\b\u0000"+
		"\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0003\u0001\u001e\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002\n\u0002\f\u0002%"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u00042\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001"+
		"\b\u0001\b\u0003\bF\b\b\u0001\t\u0003\tI\b\t\u0001\t\u0001\t\u0003\tM"+
		"\b\t\u0001\t\u0001\t\u0003\tQ\b\t\u0001\t\u0001\t\u0003\tU\b\t\u0001\t"+
		"\u0001\t\u0003\tY\b\t\u0001\t\u0003\t\\\b\t\u0001\n\u0001\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0000g\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000"+
		"\b1\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001\u0000"+
		"\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010E\u0001\u0000\u0000\u0000"+
		"\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001e"+
		"\u0003\u0004\u0002\u0000\u001c\u001e\u0003\n\u0005\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003\u0001"+
		"\u0000\u0000\u0000\u001f#\u0005\u0001\u0000\u0000 \"\u0003\u0006\u0003"+
		"\u0000! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0002\u0000\u0000\'\u0005\u0001\u0000\u0000"+
		"\u0000()\u0005\u0010\u0000\u0000)*\u0005\u0003\u0000\u0000*-\u0003\b\u0004"+
		"\u0000+,\u0005\u0004\u0000\u0000,.\u0003\u000e\u0007\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000"+
		"/2\u0005\"\u0000\u000002\u0005#\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\t\u0001\u0000\u0000\u000034\u0005\u0010\u0000"+
		"\u000045\u0005\u0004\u0000\u00005:\u0003\f\u0006\u000067\u0005\b\u0000"+
		"\u000078\u0005\u0004\u0000\u00008:\u0003\f\u0006\u000093\u0001\u0000\u0000"+
		"\u000096\u0001\u0000\u0000\u0000:\u000b\u0001\u0000\u0000\u0000;<\u0003"+
		"\u000e\u0007\u0000<\r\u0001\u0000\u0000\u0000=B\u0003\u0010\b\u0000>B"+
		"\u0003\u0012\t\u0000?B\u0005\u0007\u0000\u0000@B\u0005\u0010\u0000\u0000"+
		"A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000B\u000f\u0001\u0000\u0000\u0000CF\u0005"+
		"\u0005\u0000\u0000DF\u0005\u0006\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000F\u0011\u0001\u0000\u0000\u0000GI\u0005\u0015"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\\\u0005\t\u0000\u0000KM\u0005\u0015\u0000\u0000LK"+
		"\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\\\u0005\n\u0000\u0000OQ\u0005\u0015\u0000\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\\\u0005"+
		"\u000b\u0000\u0000SU\u0005\u0015\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\\\u0005\u000e\u0000"+
		"\u0000WY\u0005\u0015\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0005\r\u0000\u0000[H\u0001"+
		"\u0000\u0000\u0000[L\u0001\u0000\u0000\u0000[P\u0001\u0000\u0000\u0000"+
		"[T\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000\\\u0013\u0001\u0000"+
		"\u0000\u0000]^\u0005\u000f\u0000\u0000^\u0015\u0001\u0000\u0000\u0000"+
		"\u000e\u0019\u001d#-19AEHLPTX[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}