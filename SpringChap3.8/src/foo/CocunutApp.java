package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CocunutApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("script.xml");
		Coconut coconut = (Coconut) context.getBean("coconut");
		coconut.drinkThemBothUp();
		/*
		 * Sleep added to check refresh script tag.
		 */
		try {
			Thread.currentThread().sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		coconut.drinkThemBothUp();
	}

}
