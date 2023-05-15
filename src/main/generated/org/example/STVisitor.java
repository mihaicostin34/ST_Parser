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
	 * Visit a parse tree produced by {@link STParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(STParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(STParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(STParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(STParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(STParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(STParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(STParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(STParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_type(STParser.Pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(STParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#variable_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer(STParser.Variable_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(STParser.LiteralContext ctx);
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