package foo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApp {
	public static void main(String args[]){
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("lifeCycle.xml");
		//ctx.getBean("holder");
		LifeCycle lifeCycle = (LifeCycle)ctx.getBean("lifeCycle");
		//LifeCycleImpl lifeCycleImpl = (LifeCycleImpl)lifeCycle;
		ctx.registerShutdownHook();
	}

}
