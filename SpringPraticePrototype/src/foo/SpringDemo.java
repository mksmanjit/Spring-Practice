package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	private static SpringDemo d = new SpringDemo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avalue =10;
		Byte bvalue = (byte) avalue;
		System.out.println(avalue==bvalue);
		/*Integer i1= new Integer(300);
		byte i = i1.byteValue();
		System.out.println(i);
		int a = 200;
		Integer b = 200;
		System.out.println(a==b);
		int x=30;
		byte m=(byte) x;*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springprototype.xml");
		B b = (B) context.getBean("b1");
		//b.perform();
		A a = b.getLookUpA();
		a.setI(20);
		
		System.out.println(a.getI());
		B b1 = (B) context.getBean("b1");
		A a1= b.getLookUpA();
		System.out.println(a1.getI());
	}

	/**
	 * @return the d
	 */
	public static SpringDemo getD() {
		return d;
	}


}




