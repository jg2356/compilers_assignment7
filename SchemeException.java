
public class SchemeException extends RuntimeException {
	public SchemeException(String message) {
		super(message);
	}

    public String toString() {
        return "<" + getMessage() + ">";
    }
}
