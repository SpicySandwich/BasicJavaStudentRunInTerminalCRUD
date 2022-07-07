package Student;

public enum SubjectType {
	
	ITF("IT Fundamentals"),
	P("Programming"),
	DS("Discrete Structure"),
	CO("Computer Organization");
	
	private String subject;
	
	private SubjectType(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	

}
