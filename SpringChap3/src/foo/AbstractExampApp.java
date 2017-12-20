package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractExampApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("AbstractExmaple.xml");
		Performer kenny = (Performer) context.getBean("kenny");
		Performer david = (Performer) context.getBean("david");
		Performer taylor = (Performer) context.getBean("taylor");
		kenny.perform();
		david.perform();
		taylor.perform();
	
	}

}
