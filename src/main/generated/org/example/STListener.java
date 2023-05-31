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
	 * Enter a parse tree produced by the {@code blockRule}
	 * labeled alternative in {@link STParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockRule(STParser.BlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockRule}
	 * labeled alternative in {@link STParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockRule(STParser.BlockRuleContext ctx);
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
	 * Enter a parse tree produced by the {@code assignmentRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentRule(STParser.AssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentRule(STParser.AssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfRule(STParser.IfRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfRule(STParser.IfRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileRule(STParser.WhileRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileRule(STParser.WhileRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCaseRule(STParser.CaseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseRule}
	 * labeled alternative in {@link STParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCaseRule(STParser.CaseRuleContext ctx);
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
	 * Enter a parse tree produced by the {@code idAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterIdAssignment(STParser.IdAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitIdAssignment(STParser.IdAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ouputAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterOuputAssignment(STParser.OuputAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ouputAssignment}
	 * labeled alternative in {@link STParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitOuputAssignment(STParser.OuputAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBranch}
	 * labeled alternative in {@link STParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIfBranch(STParser.IfBranchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBranch}
	 * labeled alternative in {@link STParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIfBranch(STParser.IfBranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseBranch}
	 * labeled alternative in {@link STParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElseBranch(STParser.ElseBranchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseBranch}
	 * labeled alternative in {@link STParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElseBranch(STParser.ElseBranchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link STParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(STParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link STParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(STParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionValue(STParser.ExpressionValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionValue}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionValue(STParser.ExpressionValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAdd}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdd(STParser.ExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAdd}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdd(STParser.ExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionSub}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSub(STParser.ExpressionSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionSub}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSub(STParser.ExpressionSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLT}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLT(STParser.ExpressionLTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLT}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLT(STParser.ExpressionLTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMod}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMod(STParser.ExpressionModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMod}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMod(STParser.ExpressionModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionGT}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGT(STParser.ExpressionGTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionGT}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGT(STParser.ExpressionGTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionMul}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMul(STParser.ExpressionMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionMul}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMul(STParser.ExpressionMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBrackets}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBrackets(STParser.ExpressionBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBrackets}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBrackets(STParser.ExpressionBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionXor}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionXor(STParser.ExpressionXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionXor}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionXor(STParser.ExpressionXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDiv}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDiv(STParser.ExpressionDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDiv}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDiv(STParser.ExpressionDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionLE}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLE(STParser.ExpressionLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionLE}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLE(STParser.ExpressionLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNeg}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNeg(STParser.ExpressionNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNeg}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNeg(STParser.ExpressionNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionEquals}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEquals(STParser.ExpressionEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionEquals}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEquals(STParser.ExpressionEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNot(STParser.ExpressionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNot}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNot(STParser.ExpressionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAnd(STParser.ExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAnd}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAnd(STParser.ExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionGE}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGE(STParser.ExpressionGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionGE}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGE(STParser.ExpressionGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOr(STParser.ExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOr}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOr(STParser.ExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDiff}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDiff(STParser.ExpressionDiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDiff}
	 * labeled alternative in {@link STParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDiff(STParser.ExpressionDiffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseStatement}
	 * labeled alternative in {@link STParser#case}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(STParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseStatement}
	 * labeled alternative in {@link STParser#case}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(STParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseBranch}
	 * labeled alternative in {@link STParser#case_branch}.
	 * @param ctx the parse tree
	 */
	void enterCaseBranch(STParser.CaseBranchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseBranch}
	 * labeled alternative in {@link STParser#case_branch}.
	 * @param ctx the parse tree
	 */
	void exitCaseBranch(STParser.CaseBranchContext ctx);
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
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(STParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link STParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(STParser.IdValueContext ctx);
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