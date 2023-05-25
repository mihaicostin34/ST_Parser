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
	 * Visit a parse tree produced by the {@code multipleStatements}
	 * labeled alternative in {@link STParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatements(STParser.MultipleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableBlockRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBlockRule(STParser.VariableBlockRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentRule(STParser.AssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableBlock}
	 * labeled alternative in {@link STParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableBlock(STParser.VariableBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(STParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(STParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(STParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAssignment(STParser.IdAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ouputAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuputAssignment(STParser.OuputAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionValue(STParser.ExpressionValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(STParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteralValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteralValue(STParser.NumericLiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputPinValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputPinValue(STParser.InputPinValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValue(STParser.IdValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(STParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(STParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryValue(STParser.BinaryValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code octalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctalValue(STParser.OctalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalValue(STParser.DecimalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatValue(STParser.FloatValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hexValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexValue(STParser.HexValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link STParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(STParser.String_literalContext ctx);
}