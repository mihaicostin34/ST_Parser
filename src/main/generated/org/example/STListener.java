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
	 * Enter a parse tree produced by {@link STParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(STParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(STParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(STParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(STParser.Function_blockContext ctx);
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
	 * Enter a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(STParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(STParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(STParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(STParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(STParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(STParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(STParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(STParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(STParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(STParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(STParser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(STParser.Pointer_typeContext ctx);
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
	 * Enter a parse tree produced by {@link STParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(STParser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(STParser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link STParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(STParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link STParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(STParser.LiteralContext ctx);
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