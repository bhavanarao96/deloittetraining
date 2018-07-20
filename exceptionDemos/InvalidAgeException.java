package exceptionDemos;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException() {
	}
	public InvalidAgeException(String s) {
		super(s);
	}
}
