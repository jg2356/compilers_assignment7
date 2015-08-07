import java.util.List;

public class Function {
	private List<String> args;
	private SchemeParser.ExprContext expr;
	
	public Function(List<String> args, SchemeParser.ExprContext expr) {
		this.args = args;
		this.expr = expr;
	}
	
	public List<String> args() {
		return this.args;
	}
	
	public SchemeParser.ExprContext expr() {
		return this.expr;
	}
	
	public String toString() {
		return "<fun>";
	}
}
