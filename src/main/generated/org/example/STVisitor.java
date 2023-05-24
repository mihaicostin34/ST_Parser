// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STParser#pou}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPou(STParser.PouContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(STParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(STParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_rule(STParser.Type_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(STParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(STParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(STParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(STParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(STParser.String_literalContext ctx);
}