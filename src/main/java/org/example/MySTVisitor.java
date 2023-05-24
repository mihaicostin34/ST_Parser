package org.example;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MySTVisitor extends AbstractParseTreeVisitor<String> implements STVisitor<String>{

    @Override
    public String visitPou(STParser.PouContext ctx) {
        return null;
    }

    @Override
    public String visitStatement(STParser.StatementContext ctx) {
        return null;
    }

    @Override
    public String visitVar_block(STParser.Var_blockContext ctx) {
        return null;
    }

    @Override
    public String visitVariable_declaration(STParser.Variable_declarationContext ctx) {
        return null;
    }

    @Override
    public String visitType_rule(STParser.Type_ruleContext ctx) {
        return null;
    }

    @Override
    public String visitValue(STParser.ValueContext ctx) {
        return null;
    }

    @Override
    public String visitBoolean_literal(STParser.Boolean_literalContext ctx) {
        return null;
    }

    @Override
    public String visitNumeric_literal(STParser.Numeric_literalContext ctx) {
        return null;
    }

    @Override
    public String visitInteger_literal(STParser.Integer_literalContext ctx) {
        return null;
    }

    @Override
    public String visitString_literal(STParser.String_literalContext ctx) {
        return null;
    }
}
