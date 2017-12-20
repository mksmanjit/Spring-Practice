package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigureApp {
	
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("InjectNonSpringBean.xml");
		Performer performer = (Performer) context.getBean("pianist");
		performer.performer();
	}
	

}
