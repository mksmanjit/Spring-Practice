package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightApp {

	public static void main(String args[]){
			//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src//com//minstrel.xml"));
		 ApplicationContext ctx = 
			        new ClassPathXmlApplicationContext("minstrel.xml");
		 	Knight knight = (Knight) ctx.getBean("knight");
			knight.embarkOnQuest();
		
	}
}
