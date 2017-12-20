package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectMethodApp {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("InjectMethod.xml");
		Performer stieve = (Performer) context.getBean("steive");
		stieve.Perform();
	}
}
