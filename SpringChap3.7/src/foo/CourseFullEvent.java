package foo;

import org.springframework.context.ApplicationEvent;

public class CourseFullEvent extends ApplicationEvent {
	private Course course;
	public CourseFullEvent(Object source) {
		super(source);
		this.course = course;
		System.out.println("PUBLISH");
		// TODO Auto-generated constructor stub
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

}
