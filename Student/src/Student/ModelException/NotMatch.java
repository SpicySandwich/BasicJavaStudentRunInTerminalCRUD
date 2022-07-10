package Student.ModelException;

public class NotMatch extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NotMatch(String message) {
		super(message);
	}

}
