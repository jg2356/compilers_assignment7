
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    

    @Override public Val visitDefExpr(SchemeParser.DefExprContext ctx) {
        String id = ctx.ID().getText();
        Val value = visit(ctx.expr());
        setVar(id, value);
        return value;
    }

    @Override public Val visitRefExpr(SchemeParser.RefExprContext ctx) {
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
            System.out.println(result.get());
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

    @Override public Val visitIfExpr(SchemeParser.IfExprContext ctx) {
        if (visit(ctx.expr(0)).get(Boolean.class)) {
            return visit(ctx.expr(1));
        } else {
            return visit(ctx.expr(2));
        }
    }

    @Override public Val visitPrintExpr(SchemeParser.PrintExprContext ctx) {
        Val result = visit(ctx.expr());
        System.out.println(result.get());
        return result;
    }

    @Override public Val visitWhileExpr(SchemeParser.WhileExprContext ctx) {
        Val result = new Val(0D);
        while(visit(ctx.expr(0)).get(Boolean.class)) {
            result = visit(ctx.expr(1));
        }
        return result;
    }

    @Override public Val visitBlockExpr(SchemeParser.BlockExprContext ctx) {
        Val result = null;
        for(SchemeParser.ExprContext ectx : ctx.expr()) {
            result = visit(ectx);
        }
        return result;
    }

    @Override public Val visitLetExpr(SchemeParser.LetExprContext ctx) {
    	stack.push(new HashMap<String, Val>());
    	visit(ctx.bind());
    	Val result = visit(ctx.expr());
    	stack.pop();
        return result;
    }

    @Override public Val visitBind(SchemeParser.BindContext ctx) {
    	for(int i = 0; i < ctx.ID().size(); i++) {
    		String id = ctx.ID(i).getText();
    		Val value = visit(ctx.expr(i));
    		setVar(id, value);
    	}
        return null;
    }
    
	@Override public Val visitFuncExpr(SchemeParser.FuncExprContext ctx) {
		List<String> args = new ArrayList<String>();
		for(int i = 0; i < ctx.ID().size(); i++) {
			args.add(ctx.ID(i).getText());
		}
		Function func = new Function(args, ctx.expr()); 
		return new Val(func);
	}
	
	@Override public Val visitDefFuncExpr(SchemeParser.DefFuncExprContext ctx) {
        String id = ctx.ID(0).getText();
        List<String> args = new ArrayList<String>();
        for(int i = 1; i < ctx.ID().size(); i++) {
        	args.add(ctx.ID(i).getText());
        }
        Function func = new Function(args, ctx.expr());
        Val value = new Val(func);
        setVar(id, value);
        return value;
	}

	@Override public Val visitCallExpr(SchemeParser.CallExprContext ctx) {
		Function funCtx = visit(ctx.expr(0)).get(Function.class);
		stack.push(new HashMap<String, Val>());
		for(int i = 0; i < funCtx.args().size(); i++) {
			String id = funCtx.args().get(i);
			Val arg = visit(ctx.expr(i+1));
			setVar(id, arg);
		}
		Val result = visit(funCtx.expr());
		stack.pop();
		return result;
	}
	
	@Override public Val visitTryCatchExpr(SchemeParser.TryCatchExprContext ctx) {
		try {
			return visit(ctx.expr(0));
		}
		catch (Exception e) {
			return visit(ctx.expr(1));
		}
	}

    @Override public Val visitOpExpr(SchemeParser.OpExprContext ctx) {
        String op = ctx.RATOR().getText();
        switch(op) {
            case "+":
                {
                    Double result = 0.0;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result + visit(expr).get(Double.class);              
                    }
                    return new Val(result);
                }
            case "*":
                {
                    Double result = 1.0;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result * visit(expr).get(Double.class);
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
                            result = visit(expr).get(Double.class);
                            continue;
                        }
                        result = Math.pow(result, visit(expr).get(Double.class));
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
                            result = visit(expr).get(Double.class);
                            continue;
                        }                        
                        result = result / visit(expr).get(Double.class);
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
                            result = visit(expr).get(Double.class);
                            continue;
                        }                    
                        result = result - visit(expr).get(Double.class);
                    }
                    return new Val(result);
                }
            case "&":
                {
                    Boolean result = true;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = result && visit(expr).get(Boolean.class);
                        if (!result) break;
                    }
                    return new Val(result);
                }
            case "|":
                {
                    Boolean result = false;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        result = visit(expr).get(Boolean.class);
                        if (result) break;
                    }
                    return new Val(result);
                }
            case "!":
                {
                    if (ctx.expr().size() != 1)
                        throw new RuntimeException("illegal: ! operator must have exactly 1 expr argument.");
                    Boolean result = visit(ctx.expr(0)).get(Boolean.class);
                    return new Val(!result);
                }
            case "=":
                {
                    Boolean result = true;
                    Object pvalue = null;
                    for (SchemeParser.ExprContext expr : ctx.expr()) {
                        if (pvalue == null) {
                            pvalue = visit(expr).get();
                            continue;
                        }
                        Object cvalue = visit(expr).get();
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
                            pvalue = visit(expr).get(Double.class);
                            continue;
                        }
                        Double cvalue = visit(expr).get(Double.class);
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
                            pvalue = visit(expr).get(Double.class);
                            continue;
                        }
                        Double cvalue = visit(expr).get(Double.class);
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
