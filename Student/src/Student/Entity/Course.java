package Student.Entity;

import java.util.List;
import java.util.stream.Collectors;

public class Course {
	
	CourseType courseType;
	List<SubjectType> subject;
	
	public Course() {
		super();
	}

	public Course(CourseType courseType, List<SubjectType> subject) {
		super();
		this.courseType = courseType;
		this.subject = subject;
	}
	
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public List<SubjectType> getSubject() {
		return subject;
	}
	public void setSubject(List<SubjectType> subject) {
		this.subject = subject;
	}
	


	@Override
	public String toString() {
		return "Course [courseType=" + courseType.getCourseTypes() + ", subject=" + subject.stream().map(SubjectType :: getSubject).collect(Collectors.toList())+ "]";
	}
	
	
	
	

}
