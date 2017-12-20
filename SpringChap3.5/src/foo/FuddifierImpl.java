package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FuddifierImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("postProcess.xml");
		Rabbit rabbit = (Rabbit) factory.getBean("bugs");
		System.out.println(rabbit.getOriginal());

	}

}
