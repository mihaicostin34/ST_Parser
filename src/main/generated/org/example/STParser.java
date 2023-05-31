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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INPUT_PIN=14, OUTPUT_PIN=15, Binary_literal=16, 
		Octal_literal=17, Decimal_literal=18, Pure_decimal_digits=19, Hexadecimal_literal=20, 
		Floating_point_literal=21, Static_string_literal=22, ID=23, MUL=24, DIV=25, 
		MOD=26, ADD=27, SUB=28, NOT=29, LP=30, RP=31, AND=32, OR=33, XOR=34, GT=35, 
		GE=36, LT=37, LE=38, EQ=39, DIFF=40, BOOLEAN=41, INTEGER=42, WS=43, SEMICOLON=44, 
		Block_comment=45;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_statement = 2, RULE_var_block = 3, 
		RULE_variable_declaration = 4, RULE_type_rule = 5, RULE_assignment = 6, 
		RULE_if = 7, RULE_else = 8, RULE_while = 9, RULE_expression = 10, RULE_value = 11, 
		RULE_boolean_literal = 12, RULE_numeric_literal = 13, RULE_string_literal = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "statement", "var_block", "variable_declaration", "type_rule", 
			"assignment", "if", "else", "while", "expression", "value", "boolean_literal", 
			"numeric_literal", "string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VAR'", "'END_VAR'", "':'", "':='", "'IF'", "'THEN'", "'END_IF'", 
			"'ELSE'", "'WHILE'", "'DO'", "'END_WHILE'", "'TRUE'", "'FALSE'", null, 
			null, null, null, null, null, null, null, null, null, "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'!'", "'('", "')'", "'and'", "'or'", "'xor'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", "' BOOL'", "' INT'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INPUT_PIN", "OUTPUT_PIN", "Binary_literal", "Octal_literal", 
			"Decimal_literal", "Pure_decimal_digits", "Hexadecimal_literal", "Floating_point_literal", 
			"Static_string_literal", "ID", "MUL", "DIV", "MOD", "ADD", "SUB", "NOT", 
			"LP", "RP", "AND", "OR", "XOR", "GT", "GE", "LT", "LE", "EQ", "DIFF", 
			"BOOLEAN", "INTEGER", "WS", "SEMICOLON", "Block_comment"
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			_localctx = new MultipleStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockRuleContext extends BlockContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockRuleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterBlockRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitBlockRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitBlockRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			_localctx = new BlockRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 8421922L) != 0 );
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
	@SuppressWarnings("CheckReturnValue")
	public static class WhileRuleContext extends StatementContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public WhileRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterWhileRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitWhileRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitWhileRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfRuleContext extends StatementContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfRuleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIfRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIfRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIfRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableBlockRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				var_block();
				}
				break;
			case OUTPUT_PIN:
			case ID:
				_localctx = new AssignmentRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				assignment();
				}
				break;
			case T__4:
				_localctx = new IfRuleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				if_();
				}
				break;
			case T__8:
				_localctx = new WhileRuleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				while_();
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
		enterRule(_localctx, 6, RULE_var_block);
		int _la;
		try {
			_localctx = new VariableBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(43);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44);
				((VariableBlockContext)_localctx).variable_declaration = variable_declaration();
				((VariableBlockContext)_localctx).variables.add(((VariableBlockContext)_localctx).variable_declaration);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		enterRule(_localctx, 8, RULE_variable_declaration);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__2);
			setState(54);
			type_rule();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(55);
				match(T__3);
				setState(56);
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
		enterRule(_localctx, 10, RULE_type_rule);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				setState(64);
				match(T__3);
				setState(65);
				expression(0);
				}
				break;
			case OUTPUT_PIN:
				_localctx = new OuputAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(OUTPUT_PIN);
				setState(67);
				match(T__3);
				setState(68);
				expression(0);
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
	public static class IfContext extends ParserRuleContext {
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	 
		public IfContext() { }
		public void copyFrom(IfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBranchContext extends IfContext {
		public BlockContext if_block;
		public ElseContext else_clause;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfBranchContext(IfContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterIfBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitIfBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitIfBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if);
		int _la;
		try {
			_localctx = new IfBranchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(72);
			expression(0);
			setState(73);
			match(T__5);
			setState(74);
			((IfBranchContext)_localctx).if_block = block();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(75);
				((IfBranchContext)_localctx).else_clause = else_();
				}
			}

			setState(78);
			match(T__6);
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
	public static class ElseContext extends ParserRuleContext {
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	 
		public ElseContext() { }
		public void copyFrom(ElseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseBranchContext extends ElseContext {
		public BlockContext else_block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBranchContext(ElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterElseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitElseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitElseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else);
		try {
			_localctx = new ElseBranchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__7);
			setState(81);
			((ElseBranchContext)_localctx).else_block = block();
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
	public static class WhileContext extends ParserRuleContext {
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	 
		public WhileContext() { }
		public void copyFrom(WhileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends WhileContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(WhileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		try {
			_localctx = new WhileLoopContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__8);
			setState(84);
			expression(0);
			setState(85);
			match(T__9);
			setState(86);
			block();
			setState(87);
			match(T__10);
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
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(STParser.ADD, 0); }
		public ExpressionAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionSubContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public ExpressionSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLTContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(STParser.LT, 0); }
		public ExpressionLTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionLT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionModContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(STParser.MOD, 0); }
		public ExpressionModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGTContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(STParser.GT, 0); }
		public ExpressionGTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionGT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMulContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(STParser.MUL, 0); }
		public ExpressionMulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionBracketsContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(STParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(STParser.RP, 0); }
		public ExpressionBracketsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionXorContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode XOR() { return getToken(STParser.XOR, 0); }
		public ExpressionXorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionXor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionXor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDivContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(STParser.DIV, 0); }
		public ExpressionDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLEContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LE() { return getToken(STParser.LE, 0); }
		public ExpressionLEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionLE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNegContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(STParser.SUB, 0); }
		public ExpressionNegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionEqualsContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(STParser.EQ, 0); }
		public ExpressionEqualsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNotContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(STParser.NOT, 0); }
		public ExpressionNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAndContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(STParser.AND, 0); }
		public ExpressionAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGEContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GE() { return getToken(STParser.GE, 0); }
		public ExpressionGEContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionGE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionOrContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(STParser.OR, 0); }
		public ExpressionOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDiffContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIFF() { return getToken(STParser.DIFF, 0); }
		public ExpressionDiffContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).enterExpressionDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STListener ) ((STListener)listener).exitExpressionDiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STVisitor ) return ((STVisitor<? extends T>)visitor).visitExpressionDiff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				value();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(LP);
				setState(92);
				expression(0);
				setState(93);
				match(RP);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				((ExpressionNotContext)_localctx).op = match(NOT);
				setState(96);
				expression(11);
				}
				break;
			case 4:
				{
				_localctx = new ExpressionNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((ExpressionNegContext)_localctx).op = match(SUB);
				setState(98);
				expression(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionMulContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(102);
						((ExpressionMulContext)_localctx).op = match(MUL);
						setState(103);
						((ExpressionMulContext)_localctx).right = expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionDivContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(105);
						((ExpressionDivContext)_localctx).op = match(DIV);
						setState(106);
						((ExpressionDivContext)_localctx).right = expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionModContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(108);
						((ExpressionModContext)_localctx).op = match(MOD);
						setState(109);
						((ExpressionModContext)_localctx).right = expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionAddContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(111);
						((ExpressionAddContext)_localctx).op = match(ADD);
						setState(112);
						((ExpressionAddContext)_localctx).right = expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionSubContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(114);
						((ExpressionSubContext)_localctx).op = match(SUB);
						setState(115);
						((ExpressionSubContext)_localctx).right = expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionOrContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(117);
						((ExpressionOrContext)_localctx).op = match(OR);
						setState(118);
						((ExpressionOrContext)_localctx).right = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionAndContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionAndContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(120);
						((ExpressionAndContext)_localctx).op = match(AND);
						setState(121);
						((ExpressionAndContext)_localctx).right = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionXorContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionXorContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(123);
						((ExpressionXorContext)_localctx).op = match(XOR);
						setState(124);
						((ExpressionXorContext)_localctx).right = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionEqualsContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionEqualsContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(126);
						((ExpressionEqualsContext)_localctx).op = match(EQ);
						setState(127);
						((ExpressionEqualsContext)_localctx).right = expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionDiffContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionDiffContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(129);
						((ExpressionDiffContext)_localctx).op = match(DIFF);
						setState(130);
						((ExpressionDiffContext)_localctx).right = expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionGEContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionGEContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(132);
						((ExpressionGEContext)_localctx).op = match(GE);
						setState(133);
						((ExpressionGEContext)_localctx).right = expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionGTContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionGTContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(135);
						((ExpressionGTContext)_localctx).op = match(GT);
						setState(136);
						((ExpressionGTContext)_localctx).right = expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionLTContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionLTContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(138);
						((ExpressionLTContext)_localctx).op = match(LT);
						setState(139);
						((ExpressionLTContext)_localctx).right = expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionLEContext(new ExpressionContext(_parentctx, _parentState));
						((ExpressionLEContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(140);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(141);
						((ExpressionLEContext)_localctx).op = match(LE);
						setState(142);
						((ExpressionLEContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
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
				setState(149);
				numeric_literal();
				}
				break;
			case INPUT_PIN:
				_localctx = new InputPinValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(INPUT_PIN);
				}
				break;
			case ID:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
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
		enterRule(_localctx, 24, RULE_boolean_literal);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new TrueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new FalseValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__12);
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
		enterRule(_localctx, 26, RULE_numeric_literal);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new BinaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(158);
					match(SUB);
					}
				}

				setState(161);
				match(Binary_literal);
				}
				break;
			case 2:
				_localctx = new OctalValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(162);
					match(SUB);
					}
				}

				setState(165);
				match(Octal_literal);
				}
				break;
			case 3:
				_localctx = new DecimalValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(166);
					match(SUB);
					}
				}

				setState(169);
				match(Decimal_literal);
				}
				break;
			case 4:
				_localctx = new FloatValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(170);
					match(SUB);
					}
				}

				setState(173);
				match(Floating_point_literal);
				}
				break;
			case 5:
				_localctx = new HexValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(174);
					match(SUB);
					}
				}

				setState(177);
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
		enterRule(_localctx, 28, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001#\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004:\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005>\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"F\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007M\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nd\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0090\b\n\n"+
		"\n\f\n\u0093\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0099\b\u000b\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001\r\u0003\r"+
		"\u00a0\b\r\u0001\r\u0001\r\u0003\r\u00a4\b\r\u0001\r\u0001\r\u0003\r\u00a8"+
		"\b\r\u0001\r\u0001\r\u0003\r\u00ac\b\r\u0001\r\u0001\r\u0003\r\u00b0\b"+
		"\r\u0001\r\u0003\r\u00b3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0001\u0014\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0000\u00ce\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002!\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006"+
		"+\u0001\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fE\u0001\u0000\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012S\u0001\u0000\u0000\u0000\u0014c\u0001"+
		"\u0000\u0000\u0000\u0016\u0098\u0001\u0000\u0000\u0000\u0018\u009c\u0001"+
		"\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00b4\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$\u0003\u0001\u0000\u0000\u0000%*\u0003\u0006\u0003\u0000&*\u0003"+
		"\f\u0006\u0000\'*\u0003\u000e\u0007\u0000(*\u0003\u0012\t\u0000)%\u0001"+
		"\u0000\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")(\u0001\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+/\u0005\u0001"+
		"\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u0000"+
		"3\u0007\u0001\u0000\u0000\u000045\u0005\u0017\u0000\u000056\u0005\u0003"+
		"\u0000\u000069\u0003\n\u0005\u000078\u0005\u0004\u0000\u00008:\u0003\u0016"+
		"\u000b\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\t\u0001"+
		"\u0000\u0000\u0000;>\u0005)\u0000\u0000<>\u0005*\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=<\u0001\u0000\u0000\u0000>\u000b\u0001\u0000\u0000\u0000"+
		"?@\u0005\u0017\u0000\u0000@A\u0005\u0004\u0000\u0000AF\u0003\u0014\n\u0000"+
		"BC\u0005\u000f\u0000\u0000CD\u0005\u0004\u0000\u0000DF\u0003\u0014\n\u0000"+
		"E?\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000F\r\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0005\u0000\u0000HI\u0003\u0014\n\u0000IJ\u0005\u0006\u0000"+
		"\u0000JL\u0003\u0002\u0001\u0000KM\u0003\u0010\b\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0007"+
		"\u0000\u0000O\u000f\u0001\u0000\u0000\u0000PQ\u0005\b\u0000\u0000QR\u0003"+
		"\u0002\u0001\u0000R\u0011\u0001\u0000\u0000\u0000ST\u0005\t\u0000\u0000"+
		"TU\u0003\u0014\n\u0000UV\u0005\n\u0000\u0000VW\u0003\u0002\u0001\u0000"+
		"WX\u0005\u000b\u0000\u0000X\u0013\u0001\u0000\u0000\u0000YZ\u0006\n\uffff"+
		"\uffff\u0000Zd\u0003\u0016\u000b\u0000[\\\u0005\u001e\u0000\u0000\\]\u0003"+
		"\u0014\n\u0000]^\u0005\u001f\u0000\u0000^d\u0001\u0000\u0000\u0000_`\u0005"+
		"\u001d\u0000\u0000`d\u0003\u0014\n\u000bab\u0005\u001c\u0000\u0000bd\u0003"+
		"\u0014\n\ncY\u0001\u0000\u0000\u0000c[\u0001\u0000\u0000\u0000c_\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d\u0091\u0001\u0000\u0000"+
		"\u0000ef\n\u0011\u0000\u0000fg\u0005\u0018\u0000\u0000g\u0090\u0003\u0014"+
		"\n\u0012hi\n\u0010\u0000\u0000ij\u0005\u0019\u0000\u0000j\u0090\u0003"+
		"\u0014\n\u0011kl\n\u000f\u0000\u0000lm\u0005\u001a\u0000\u0000m\u0090"+
		"\u0003\u0014\n\u0010no\n\u000e\u0000\u0000op\u0005\u001b\u0000\u0000p"+
		"\u0090\u0003\u0014\n\u000fqr\n\r\u0000\u0000rs\u0005\u001c\u0000\u0000"+
		"s\u0090\u0003\u0014\n\u000etu\n\t\u0000\u0000uv\u0005!\u0000\u0000v\u0090"+
		"\u0003\u0014\n\nwx\n\b\u0000\u0000xy\u0005 \u0000\u0000y\u0090\u0003\u0014"+
		"\n\tz{\n\u0007\u0000\u0000{|\u0005\"\u0000\u0000|\u0090\u0003\u0014\n"+
		"\b}~\n\u0006\u0000\u0000~\u007f\u0005\'\u0000\u0000\u007f\u0090\u0003"+
		"\u0014\n\u0007\u0080\u0081\n\u0005\u0000\u0000\u0081\u0082\u0005(\u0000"+
		"\u0000\u0082\u0090\u0003\u0014\n\u0006\u0083\u0084\n\u0004\u0000\u0000"+
		"\u0084\u0085\u0005$\u0000\u0000\u0085\u0090\u0003\u0014\n\u0005\u0086"+
		"\u0087\n\u0003\u0000\u0000\u0087\u0088\u0005#\u0000\u0000\u0088\u0090"+
		"\u0003\u0014\n\u0004\u0089\u008a\n\u0002\u0000\u0000\u008a\u008b\u0005"+
		"%\u0000\u0000\u008b\u0090\u0003\u0014\n\u0003\u008c\u008d\n\u0001\u0000"+
		"\u0000\u008d\u008e\u0005&\u0000\u0000\u008e\u0090\u0003\u0014\n\u0002"+
		"\u008fe\u0001\u0000\u0000\u0000\u008fh\u0001\u0000\u0000\u0000\u008fk"+
		"\u0001\u0000\u0000\u0000\u008fn\u0001\u0000\u0000\u0000\u008fq\u0001\u0000"+
		"\u0000\u0000\u008ft\u0001\u0000\u0000\u0000\u008fw\u0001\u0000\u0000\u0000"+
		"\u008fz\u0001\u0000\u0000\u0000\u008f}\u0001\u0000\u0000\u0000\u008f\u0080"+
		"\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000\u0000\u0000\u008f\u0086"+
		"\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000\u0000\u0000\u008f\u008c"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0015"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0099"+
		"\u0003\u0018\f\u0000\u0095\u0099\u0003\u001a\r\u0000\u0096\u0099\u0005"+
		"\u000e\u0000\u0000\u0097\u0099\u0005\u0017\u0000\u0000\u0098\u0094\u0001"+
		"\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u0017\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0005\f\u0000\u0000\u009b\u009d\u0005\r"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u00a0\u0005\u001c"+
		"\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00b3\u0005\u0010"+
		"\u0000\u0000\u00a2\u00a4\u0005\u001c\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00b3\u0005\u0011\u0000\u0000\u00a6\u00a8\u0005\u001c"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b3\u0005\u0012"+
		"\u0000\u0000\u00aa\u00ac\u0005\u001c\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b3\u0005\u0015\u0000\u0000\u00ae\u00b0\u0005\u001c"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0005\u0014"+
		"\u0000\u0000\u00b2\u009f\u0001\u0000\u0000\u0000\u00b2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00b2\u00a7\u0001\u0000\u0000\u0000\u00b2\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3\u001b\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u001d\u0001\u0000"+
		"\u0000\u0000\u0012#)/9=ELc\u008f\u0091\u0098\u009c\u009f\u00a3\u00a7\u00ab"+
		"\u00af\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}