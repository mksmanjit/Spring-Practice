package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstrumentApp {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
		
	}

}
