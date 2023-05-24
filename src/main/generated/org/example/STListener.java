// Generated from java-escape by ANTLR 4.11.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STParser}.
 */
public interface STListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multipleStatements}
	 * labeled alternative in {@link STParser#start}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatements(STParser.MultipleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleStatements}
	 * labeled alternative in {@link STParser#start}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatements(STParser.MultipleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableBlockRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableBlockRule(STParser.VariableBlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableBlockRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableBlockRule(STParser.VariableBlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableBlock}
	 * labeled alternative in {@link STParser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVariableBlock(STParser.VariableBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableBlock}
	 * labeled alternative in {@link STParser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVariableBlock(STParser.VariableBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(STParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link STParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(STParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(STParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(STParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(STParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link STParser#type_rule}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(STParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(STParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(STParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteralValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteralValue(STParser.NumericLiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteralValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteralValue(STParser.NumericLiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputPinValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void enterInputPinValue(STParser.InputPinValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputPinValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void exitInputPinValue(STParser.InputPinValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterTrueValue(STParser.TrueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitTrueValue(STParser.TrueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterFalseValue(STParser.FalseValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link STParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitFalseValue(STParser.FalseValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterBinaryValue(STParser.BinaryValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitBinaryValue(STParser.BinaryValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code octalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterOctalValue(STParser.OctalValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code octalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitOctalValue(STParser.OctalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimalValue(STParser.DecimalValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimalValue(STParser.DecimalValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(STParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(STParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hexValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterHexValue(STParser.HexValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hexValue}
	 * labeled alternative in {@link STParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitHexValue(STParser.HexValueContext ctx);
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