package MOOD.ANLYSER;

public class InvalidMoodEx extends Exception {
	/**
	 * 
	 */
	enum ExceptionType{
		Entered_Null,Entered_Empty
	}
	ExceptionType type;
	private static final long serialVersionUID = 1L;
	public InvalidMoodEx(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}

}
