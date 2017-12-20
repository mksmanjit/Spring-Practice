package foo;

import java.lang.reflect.Field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverApp {
	public static void main(String args[]){
		ApplicationContext context =  new ClassPathXmlApplicationContext("driver.xml");
		Object driverClass = (DriverClass) context.getBean("driver");
		//System.out.println(driverClass.getDriverClassName());
		Field[] fields = driverClass.getClass().getDeclaredFields();
		for(int i=0;i<fields.length;i++){
			fields[i].setAccessible(true);
			try {
				String fieldValue = (String) fields[i].get(driverClass);
				System.out.println(fields[i] + ">>" + fieldValue);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
