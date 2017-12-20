package foo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class KnightApp {

	public static void main(String args[]){
			BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src//com//Knight.xml"));
			KnightOfTheRoundTable knight = (KnightOfTheRoundTable) factory.getBean("knight");
			knight.embarkOnQuest();
		
	}
}
