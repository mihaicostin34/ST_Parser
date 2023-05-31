package org.example;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MySTVisitor extends AbstractParseTreeVisitor<String> implements STVisitor<String>{
    static int loop_counter = 0;
    @Override
    public String visitMultipleStatements(STParser.MultipleStatementsContext ctx) {
        String module = "(module \n    (import \"IO\" \"getpin\" (func $getpin (param $pin i32) (result i32)))\n" +
                "    (import \"IO\" \"setpin\" (func $setpin (param $pin i32) (param $value i32)))\n(func (export \"run\") ";
        StringBuilder contents = new StringBuilder();
        contents.append(this.visit(ctx.block()));
        module += contents;
        module+=")\n)";
        return module;
    }

    @Override
    public String visitBlockRule(STParser.BlockRuleContext ctx) {
        StringBuilder contents = new StringBuilder();
        for(STParser.StatementContext s : ctx.statement()){
            contents.append(this.visit(s));
            contents.append("\n");
        }
        return contents.toString();
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
    public String visitIfRule(STParser.IfRuleContext ctx) {
        return this.visit(ctx.if_());
    }

    @Override
    public String visitWhileRule(STParser.WhileRuleContext ctx) {
        return this.visit(ctx.while_());
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
        String declaration_line = "local $" + varName+ " " + type + "";
        finalRes.append(declaration_line);
        if(ctx.value()!=null){
            String val = this.visit(ctx.value());
            finalRes.append('\n');
            finalRes.append(val);
            finalRes.append('\n');
            finalRes.append("local.set $" + varName + "\n");
        }
        return finalRes.toString();
    }

    @Override
    public String visitBooleanType(STParser.BooleanTypeContext ctx) {
        return "i32";
    }

    @Override
    public String visitIntegerType(STParser.IntegerTypeContext ctx) {
        return "i32";
    }

    @Override
    public String visitIdAssignment(STParser.IdAssignmentContext ctx) {
        String id = ctx.ID().getText();
        StringBuilder result = new StringBuilder();
        result.append(this.visit(ctx.expression()) + "\n");
        result.append("local.set $" + id + "\n");
        return result.toString();
    }

    @Override
    public String visitOuputAssignment(STParser.OuputAssignmentContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(this.visit(ctx.expression())); //add expression value to stack
        String portNumber = ctx.OUTPUT_PIN().getText().split("_")[2];
        result.append("\n i32.const "+ portNumber  + " \n"); //add pport number
        result.append("call $setpin");
        return result.toString();
    }

    @Override
    public String visitIfBranch(STParser.IfBranchContext ctx) {
        StringBuilder result = new StringBuilder();
        String ex = this.visit(ctx.expression());
        result.append(ex);
        String if_ = "if \n";
        result.append(if_);
        String blk = this.visit(ctx.if_block);
        result.append(blk);
        if(ctx.else_clause!=null){
            result.append("else \n");
            String els = this.visit(ctx.else_clause);
            result.append(els);
        }
        result.append("end");
        return result.toString();
    }

    @Override
    public String visitElseBranch(STParser.ElseBranchContext ctx) {
        return this.visit(ctx.else_block);
    }

    @Override
    public String visitWhileLoop(STParser.WhileLoopContext ctx) {
        int current_counter = loop_counter;
        StringBuilder result = new StringBuilder();
        String block_label = "block $endwhile" + current_counter + "\n";
        result.append(block_label);
        String loop_label = "loop $while" + current_counter + "\n";
        result.append(loop_label);
        String exp = this.visit(ctx.expression());
        result.append(exp);
        result.append("br_if $endwhile" + "\n");
        result.append(this.visit(ctx.block()));
        result.append("br $while" + current_counter + "\n");
        result.append("end $while" + current_counter + "\n");
        result.append("end $endwhile" + current_counter + "\n");
        return result.toString();
    }

    @Override
    public String visitExpressionValue(STParser.ExpressionValueContext ctx) {
        return this.visit(ctx.value());
    }

    @Override
    public String visitExpressionDiv(STParser.ExpressionDivContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.div_s" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionLE(STParser.ExpressionLEContext ctx) {
        return null;
    }

    @Override
    public String visitExpressionNeg(STParser.ExpressionNegContext ctx) {
        String ex = this.visit(ctx.expression());
        String cst = "i32.const -1";
        String op = "i32.mul";
        StringBuilder result = new StringBuilder();
        result.append(ex);
        result.append(cst);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionEquals(STParser.ExpressionEqualsContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.eq" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionNot(STParser.ExpressionNotContext ctx) {
        return null;
    }

    @Override
    public String visitExpressionAnd(STParser.ExpressionAndContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.and" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionGE(STParser.ExpressionGEContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.ge" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionOr(STParser.ExpressionOrContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.or" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionDiff(STParser.ExpressionDiffContext ctx) {
        return null;
    }

    @Override
    public String visitExpressionAdd(STParser.ExpressionAddContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.add" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionSub(STParser.ExpressionSubContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.sub" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionLT(STParser.ExpressionLTContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.lt" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionMod(STParser.ExpressionModContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.rem" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionGT(STParser.ExpressionGTContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.gt" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionMul(STParser.ExpressionMulContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.mul" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitExpressionBrackets(STParser.ExpressionBracketsContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public String visitExpressionXor(STParser.ExpressionXorContext ctx) {
        String left = this.visit(ctx.left) + '\n';
        String right = this.visit(ctx.right) + '\n';
        String op = "i32.xor" + '\n';
        StringBuilder result = new StringBuilder();
        result.append(left);
        result.append(right);
        result.append(op);
        return result.toString();
    }

    @Override
    public String visitBooleanValue(STParser.BooleanValueContext ctx) {
        StringBuilder boolVal = new StringBuilder();
        boolVal.append("i32.const ");
        boolVal.append(this.visit(ctx.boolean_literal()));
        boolVal.append("");
        return boolVal.toString();
    }

    @Override
    public String visitNumericLiteralValue(STParser.NumericLiteralValueContext ctx) {
        StringBuilder result = new StringBuilder();
        String id = ctx.numeric_literal().getText();
        result.append("i32.const " + id + "");
        return result.toString();
    }

    @Override
    public String visitInputPinValue(STParser.InputPinValueContext ctx) {
        //add pin number to stack
        StringBuilder result = new StringBuilder();
        String inputPinNr = ctx.INPUT_PIN().getText().split("_")[2];
        System.out.println(inputPinNr);
        String addValueToStack = "i32.const "+ inputPinNr +"";
        result.append(addValueToStack);
        result.append('\n');
        //call getpin value
        result.append("call $getpin");
        return result.toString();
    }

    @Override
    public String visitIdValue(STParser.IdValueContext ctx) {
        StringBuilder result = new StringBuilder();
        String id = ctx.ID().getText();
        return "local.get " + id + "\n";
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
