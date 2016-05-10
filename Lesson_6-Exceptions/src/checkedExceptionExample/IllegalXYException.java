package checkedExceptionExample;

//The class Exception and any subclasses that are not also subclasses of RuntimeException
//are CHECKED EXCEPTIONS. Checked exceptions need to be declared in a method or constructor's 
//'throws' clause if they can be thrown by the execution of the method or constructor and propagate 
//outside the method or constructor boundary. They must be handles with a try/catch block.
public class IllegalXYException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalXYException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalXYException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalXYException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalXYException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalXYException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
