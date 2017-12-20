package foo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {

	public static void main(String args[]){
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src\\com\\hello.xml"));
		//ApplicationContext factory = new ClassPathXmlApplicationContext("com\\hello.xml");
		GreetingService greetingService = (GreetingService) factory.getBean("greetingService");
		greetingService.sayGreeting();
	}
}
