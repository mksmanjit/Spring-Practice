package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CocunutApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("script.xml");
		ICoconut coconut = (ICoconut) context.getBean("coconut");
		coconut.drinkThemBothUp();
	}

}
