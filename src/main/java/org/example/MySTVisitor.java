package org.example;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MySTVisitor extends AbstractParseTreeVisitor<String> implements STVisitor<String>{
    @Override
    public String visitMultipleStatements(STParser.MultipleStatementsContext ctx) {
        String module = "(module \n    (import \"IO\" \"getpin\" (func $getpin (param $pin i8) (result i8)))\n" +
                "    (import \"IO\" \"setpin\" (func $setpin (param $pin i8)))\n(start $program)\n(func $program";
        StringBuilder contents = new StringBuilder();
        for(STParser.StatementContext s : ctx.statement()){
            contents.append(this.visit(s));
            contents.append("\n");
        }
        module += contents;
        module+=")\n)";
        return module;
    }

    @Override
    public String visitVariableBlockRule(STParser.VariableBlockRuleContext ctx) {
        return this.visit(ctx.var_block());
    }

    @Override
    public String visitAssignmentRule(STParser.AssignmentRuleContext ctx) {
        return this.visit(ctx.assignment());
    }

    @Override
    public String visitVariableBlock(STParser.VariableBlockContext ctx) {
        StringBuilder a = new StringBuilder();
        for(STParser.Variable_declarationContext c : ctx.variables){
            String visitResult = this.visit(c);
            a.append('\n');
            a.append(visitResult);
        }
        return a.toString();
    }

    @Override
    public String visitVariableDeclaration(STParser.VariableDeclarationContext ctx) {
        StringBuilder finalRes = new StringBuilder();
        String varName = ctx.ID().getText();
        String type = this.visit(ctx.type_rule());
        String declaration_line = "(local $" + varName+ " " + type + ")";
        finalRes.append(declaration_line);
        if(ctx.value()!=null){
            String val = this.visit(ctx.value());
            finalRes.append('\n');
            finalRes.append(val);
            finalRes.append('\n');
            finalRes.append("(local.set $" + varName + ")\n");
        }
        return finalRes.toString();
    }

    @Override
    public String visitBooleanType(STParser.BooleanTypeContext ctx) {
        return "i8";
    }

    @Override
    public String visitIntegerType(STParser.IntegerTypeContext ctx) {
        return "i8";
    }

    @Override
    public String visitIdAssignment(STParser.IdAssignmentContext ctx) {
        String id = ctx.ID().getText();
        StringBuilder result = new StringBuilder();
        result.append(this.visit(ctx.expression()) + "\n");
        result.append("(local.set $" + id + ")\n");
        return result.toString();
    }

    @Override
    public String visitOuputAssignment(STParser.OuputAssignmentContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append("(local.get $" + this.visit(ctx.expression()) + ")\n"); //add expression value to stack
        String portNumber = ctx.OUTPUT_PIN().getText().split("_")[2];
        result.append("(i8.const "+ portNumber  + ") ;;ouput port number \n"); //add pport number
        result.append("(call $setpin)");
        return result.toString();
    }

    @Override
    public String visitExpressionValue(STParser.ExpressionValueContext ctx) {
        return this.visit(ctx.value());
    }

    @Override
    public String visitBooleanValue(STParser.BooleanValueContext ctx) {
        StringBuilder boolVal = new StringBuilder();
        boolVal.append("(i8.const ");
        boolVal.append(this.visit(ctx.boolean_literal()));
        boolVal.append(")");
        return boolVal.toString();
    }

    @Override
    public String visitNumericLiteralValue(STParser.NumericLiteralValueContext ctx) {
        StringBuilder result = new StringBuilder();
        String id = ctx.numeric_literal().getText();
        result.append("(i8.const " + id + ")");
        return result.toString();
    }

    @Override
    public String visitInputPinValue(STParser.InputPinValueContext ctx) {
        //add pin number to stack
        StringBuilder result = new StringBuilder();
        String inputPinNr = ctx.INPUT_PIN().getText().split("_")[2];
        System.out.println(inputPinNr);
        String addValueToStack = "(i8.const "+ inputPinNr +") ;;input port number";
        result.append(addValueToStack);
        result.append('\n');
        //call getpin value
        result.append("(call $getpin)");
        return result.toString();
    }

    @Override
    public String visitIdValue(STParser.IdValueContext ctx) {
        StringBuilder result = new StringBuilder();
        String id = ctx.ID().getText();
        return id;
    }

    @Override
    public String visitTrueValue(STParser.TrueValueContext ctx) {
        return "1";
    }

    @Override
    public String visitFalseValue(STParser.FalseValueContext ctx) {
        return "0";
    }

    @Override
    public String visitBinaryValue(STParser.BinaryValueContext ctx) {
        return null;
    }

    @Override
    public String visitOctalValue(STParser.OctalValueContext ctx) {
        return null;
    }

    @Override
    public String visitDecimalValue(STParser.DecimalValueContext ctx) {
        return null;
    }

    @Override
    public String visitFloatValue(STParser.FloatValueContext ctx) {
        return null;
    }

    @Override
    public String visitHexValue(STParser.HexValueContext ctx) {
        return null;
    }

    @Override
    public String visitString_literal(STParser.String_literalContext ctx) {
        return null;
    }
}
