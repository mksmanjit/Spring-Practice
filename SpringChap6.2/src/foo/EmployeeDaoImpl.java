package foo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public void saveEmployee(Employee emp) throws IOException{
		Session session = sessionFactory.getCurrentSession();
		emp.setEmpName("Manj1");
		session.save(emp);
		String s = null;
		s.toString();
		throw new IOException();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private SessionFactory sessionFactory;

}
