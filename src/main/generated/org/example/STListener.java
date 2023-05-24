// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STParser}.
 */
public interface STListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STParser#pou}.
	 * @param ctx the parse tree
	 */
	void enterPou(STParser.PouContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#pou}.
	 * @param ctx the parse tree
	 */
	void exitPou(STParser.PouContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(STParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(STParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_block(STParser.Var_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_block(STParser.Var_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterType_rule(STParser.Type_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitType_rule(STParser.Type_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(STParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(STParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(STParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(STParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(STParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(STParser.String_literalContext ctx);
}