import java.util.HashMap;

public class Environment {
	private Environment parent;
	private HashMap<String, Val> symbols;
	
	public Environment(Environment parent) {
		this.parent = parent;
		this.symbols = new HashMap<String, Val>();
	}
	
	public Environment getParent() {
		return this.parent;
	}
	
	public void set(String id, Val value) {
		symbols.put(id, value);
	}
	
	public Val get(String id) {
		Val result = symbols.get(id);
		if (result == null
				&& parent != null) {
			result = parent.get(id);
		}
		return result;
	}
}
