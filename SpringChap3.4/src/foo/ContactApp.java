package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactApp {

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("contact.xml");
		Contact contact = (Contact) context.getBean("contact");
		System.out.println(contact.getPhoneNumber());
		
		
	}
}
