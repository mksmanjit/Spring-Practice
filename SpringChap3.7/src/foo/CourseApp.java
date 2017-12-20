package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseApp {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("listener.xml");
		Course course  = (Course) context.getBean("course");
		context.publishEvent(new CourseFullEvent(course));
	}

}
