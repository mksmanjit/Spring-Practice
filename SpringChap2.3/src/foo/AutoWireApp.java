package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("autoWiring.xml");
		AutoWire autoWire = (AutoWire)ctx.getBean("autoWireImpl");
		AutowireImpl autowireImpl = (AutowireImpl)autoWire;
		System.out.println(autowireImpl.getName()+">>"+autowireImpl.getCount() +">>"+autowireImpl.getDemo().getName());
	}

}
