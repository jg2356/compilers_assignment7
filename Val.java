public class Val {
    private Object value;
    
    public Val(Object value) {
    	this.value = value;
    }

    public <T> T get(Class<T> t) {
    	Class<?> vt = value.getClass();    
    	if (!t.isAssignableFrom(vt))
    		throw new RuntimeException("Type mismatch: expected " + t.getName() + " instead of " + vt.getName());
    	return t.cast(value);
    }
      
    public Object get() {
    	return value;
    }
} 
