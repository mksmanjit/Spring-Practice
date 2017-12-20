package foo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionsApp {

	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("springTrans.xml");
		IEmployeeDao employeeDao =  (IEmployeeDao) context.getBean("empDao");
		Employee emp = new Employee();
		emp.setEmpName("manjit");
		employeeDao.saveEmployee(emp);
	}
	
	
}
