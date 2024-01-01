import java.util.ArrayList;

public class BuildAstVisitor extends ExprBaseVisitor<ExprTree>{
    @Override
    public ExprTree visitProg(ExprParser.ProgContext ctx) {
        ExprTree prog = new ExprTree();
        prog.current.type = node_type.ROOT;
        
        for(int i = 0; i < ctx.decl().size(); i++)
            prog.children.add(visit(ctx.decl(i)));
        prog.children.add(visit(ctx.expr()));

        return prog;
    }

    @Override
    public ExprTree visitDecl(ExprParser.DeclContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.DECL;
        node.current.str = "DECL";

        node.children.add(visit(ctx.var(0))); // first: function name
        
        // middle: parameters
        for(int i = 1; i < ctx.var().size(); i++)
            node.children.add(visit(ctx.var(i)));

        node.children.add(visit(ctx.expr())); // last: function body
        
        return node;
    }

    @Override
    public ExprTree visitVar(ExprParser.VarContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.VAR;
        if(ctx.FUNCTION() != null)
            node.current.str = ctx.FUNCTION().getText();
        else if(ctx.VARIABLE() != null)
            node.current.str = ctx.VARIABLE().getText();

        return node;
    }

    @Override
    public ExprTree visitLetinExpr(ExprParser.LetinExprContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.LETIN;
        node.current.str = "LETIN";

        node.children.add(visit(ctx.var()));
        node.children.add(visit(ctx.expr(0)));
        node.children.add(visit(ctx.expr(1)));

        return node;
    }

    @Override
    public ExprTree visitCallExpr(ExprParser.CallExprContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.CALL;
        node.current.str = "Call";

        node.children.add(visit(ctx.var())); // first: function name
        
        // second ~ end: argument list
        for(int i = 0; i < ctx.expr().size(); i++)
            node.children.add(visit(ctx.expr(i)));

        return node;
    }

    @Override
    public ExprTree visitInfixExpr(ExprParser.InfixExprContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.INFIX;

        String op = ctx.getChild(1).getText();
        switch(op) {
        case "+":
            node.current.str = "ADD";
            break;
        case "-":
            node.current.str = "SUB";
            break;
        }

        node.children.add(visit(ctx.expr(0)));
        node.children.add(visit(ctx.expr(1)));
        return node;
    }

    @Override
    public ExprTree visitParenExpr(ExprParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExprTree visitNumberExpr(ExprParser.NumberExprContext ctx) {
        return visit(ctx.number());
    }

    Integer sign = 1;
    @Override
    public ExprTree visitNumber(ExprParser.NumberContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.NUM;

        Double result = 0.0;
        if(ctx.number() != null) {
            sign = -1;
            return visit(ctx.number());
        } else if(ctx.INT() != null)
            result = sign * Double.parseDouble(ctx.INT().getText());
        else
            result = sign * Double.parseDouble(ctx.REAL().getText());
        
        node.current.value = result;
        sign = 1;
        return node;
    }

    @Override
    public ExprTree visitNegationExpr(ExprParser.NegationExprContext ctx) {
        ExprTree node = new ExprTree();
        node.current.type = node_type.NEG;
        node.current.str = "NEG";

        node.children.add(visit(ctx.expr()));

        return node;
    }

    @Override
    public ExprTree visitVarExpr(ExprParser.VarExprContext ctx) {
        return visit(ctx.var());
    }
}