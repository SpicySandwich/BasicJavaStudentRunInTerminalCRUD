package Student.Entity;

public enum CourseType {
	
	BSIT("Bachelor of Science Information Technology"),
	BSCE("Bachelor of Science Computer Engineering"),
	BSA("Bachelor of Science Accountancy"),
	BSTM("Bachelor of Science Tourism Management");
	
	
	private String courseTypes;

	private CourseType(String courseTypes) {
		this.courseTypes = courseTypes;
	}

	public String getCourseTypes() {
		return courseTypes;
	}

	public void setCourseTypes(String courseTypes) {
		this.courseTypes = courseTypes;
	}
	
	
	
	

}
