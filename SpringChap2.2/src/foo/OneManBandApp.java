package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneManBandApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("oneManBand.xml");
		Performer performer = (Performer)ctx.getBean("oneManBand");
		Performer performerMap = (Performer) ctx.getBean("oneManBandMap");
		Performer performerProp = (Performer) ctx.getBean("oneManBandProp");
		System.out.println("LIST/SET------------------------------------------");
		performer.perform();
		System.out.println("MAP------------------------------------------");
		performerMap.perform();
		System.out.println("PROPERTY------------------------------------------");
		performerProp.perform();
	}

}
