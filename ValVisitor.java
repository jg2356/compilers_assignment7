import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValVisitor extends SchemeBaseVisitor<Val> {
    private Stack<Map<String, Val>> stack;

    public ValVisitor() {
        stack = new Stack<Map<String, Val>>();
        stack.push(new HashMap<String, Val>());
    }

    private Val getVar(String id) {
        Val value = null;
        for(int i = stack.size(); i > 0; i--) {    
            Map<String, Val> variables = stack.get(i - 1);
            value = variables.get(id);
            if (value != null) break;
        }
        return value;
    }

    private void setVar(String id, Val value) {
        Map<String, Val> variables = stack.peek();
        variables.put(id, value);
    }
    

    @Override public Val visitDefvar(SchemeParser.DefvarContext ctx) {
        String id = ctx.ID().getText();
        Val value = visit(ctx.expr());
        setVar(id, value);
        return value;
    }

    @Override public Val visitRefvar(SchemeParser.RefvarContext ctx) {
        String id = ctx.ID().getText();
        Val value = getVar(id);
        if (value == null)
            throw new RuntimeException(id + " is not defined.");
        return value;
    }

    @Override public Val visitProg(SchemeParser.ProgContext ctx) {
        Val result = null;
        for(SchemeParser.ExprContext ectx : ctx.expr()) {
            result = visit(ectx);
        }
        if (result != null)
            System.out.println(result.getValue());
        return result;
    }

    @Override public Val visitBoolean(SchemeParser.BooleanContext ctx) { 
        Boolean value = new Boolean(ctx.BOOLEAN().getText());
        return new Val(value);
    }

    @Override public Val visitDouble(SchemeParser.DoubleContext ctx) {
        Double value = new Double(ctx.DOUBLE().getText()); 
        return new Val(value);
    }

    @Override public Val visitIfexpr(SchemeParser.IfexprContext ctx) {
        if (visit(ctx.expr(0)).getBoolean()) {
            return visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(2));
        }
    }

    @Override public Val visitPrintexpr(SchemeParser.PrintexprContext ctx) {
        Val result = visit(ctx.expr());
        System.out.println(result.getValue());
        return result;
    }

    @Override public Val visitWloopexpr(SchemeParser.WloopexprContext ctx) {
        Val result = new Val(0D);
        while(visit(ctx.expr(0)).getBoolean()) {
            result = visit(ctx.expr(1));
        }
        return result;
    }

    @Override public Val visitBlockexpr(SchemeParser.BlockexprContext ctx) {
        Val result = null;
        for(SchemeParser.ExprContext ectx : ctx.expr()) {
            result = visit(ectx);
        }
        return result;
    }

    @Override public Val visitLetexpr(SchemeParser.LetexprContext ctx) {
    	stack.push(new HashMap<String, Val>());
    	visit(ctx.letvector());
    	Val result = visit(ctx.expr());
    	stack.pop();
        return result;
    }

    @Override public Val visitLetvector(SchemeParser.LetvectorContext ctx) {
    	for(int i = 0; i < ctx.ID().size(); i++) {
    		String id = ctx.ID(i).getText();
    		Val value = visit(ctx.expr(i));
    		setVar(id, value);
    	}
        return null;
    }

    @Override public Val visitOpexpr(SchemeParser.OpexprContext ctx) {
        String op = ctx.RATOR().getText();
        switch(op) {
            case "+":
                {
                    Double result = 0.0;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result + visit(expr).getDouble();              
                    }
                    return new Val(result);
                }
            case "*":
                {
                    Double result = 1.0;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result * visit(expr).getDouble();
                    }
                    return new Val(result);
                }
            case "^":
                {
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 1.0;
                    }
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (result == null) {
                            result = visit(expr).getDouble();
                            continue;
                        }
                        result = Math.pow(result, visit(expr).getDouble());
                    }
                    return new Val(result);
                }                
            case "/":
                {
                    if (ctx.expr().isEmpty())
                        throw new RuntimeException("illegal: (/ )");
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 1.0;
                    }
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (result == null) {
                            result = visit(expr).getDouble();
                            continue;
                        }                        
                        result = result / visit(expr).getDouble();
                    }
                    return new Val(result);
                }               
            case "-":
                {
                    if (ctx.expr().isEmpty())
                        throw new RuntimeException("illegal: (- )");
                    Double result = null;
                    if (ctx.expr().size() < 2) {
                        result = 0.0;
                    }
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (result == null) {
                            result = visit(expr).getDouble();
                            continue;
                        }                    
                        result = result - visit(expr).getDouble();
                    }
                    return new Val(result);
                }
            case "&":
                {
                    Boolean result = true;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result && visit(expr).getBoolean();
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case "|":
                {
                    Boolean result = false;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = visit(expr).getBoolean();
                        if (result) break;
                    }
                    return new Val(result);
                }
            case "!":
                {
                    if (ctx.expr().size() != 1)
                        throw new RuntimeException("illegal: ! operator must have exactly 1 expr argument.");
                    Boolean result = visit(ctx.expr(0)).getBoolean();
                    return new Val(!result);
                }
            case "=":
                {
                    Boolean result = true;
                    Object pvalue = null;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null) {
                            pvalue = visit(expr).getValue();
                            continue;
                        }
                        Object cvalue = visit(expr).getValue();
                        result = result && (pvalue.equals(cvalue));
                        pvalue = cvalue;
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case ">":
                {
                    Boolean result = true;
                    Double pvalue = null;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null) {
                            pvalue = visit(expr).getDouble();
                            continue;
                        }
                        Double cvalue = visit(expr).getDouble();
                        result = result && (pvalue > cvalue);
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case "<":
                {
                    Boolean result = true;
                    Double pvalue = null;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null) {
                            pvalue = visit(expr).getDouble();
                            continue;
                        }
                        Double cvalue = visit(expr).getDouble();
                        result = result && (pvalue < cvalue);
                        if (!result) break;
                    }
                    return new Val(result);
                }                
            default:
                throw new RuntimeException("illegal operator: " + op);
        }
    }
}
