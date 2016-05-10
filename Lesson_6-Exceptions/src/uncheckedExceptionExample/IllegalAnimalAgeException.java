package uncheckedExceptionExample;

//This exception extends RuntimeException. It and it's subclasses are UNCHECKES EXCEPTIONS that do not need
//to be declared in a method or constructor's 'throws' clause if they can be thrown by the execution of the 
//method or constructor and propagate outside the method or constructor boundary. As oppose to the class Exception
//which is a CHECKED EXCEPTION that must be handled in the code using try/catch block and 'throws' declaration.
public class IllegalAnimalAgeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalAnimalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAnimalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
