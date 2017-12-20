package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		//Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		//Transaction tx = session.beginTransaction();
		//Session session = getTransactionManager().getSessionFactory().openSession();
		Session session = sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		emp.setEmpName("Manj1");
		session.save(emp);
		tx.commit();
		session.close();
		//tx.commit();
		//session.close();
	}
	

	public HibernateTransactionManager getTransactionManager() {
		return transactionManager;
	}


	public void setTransactionManager(HibernateTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	private HibernateTransactionManager transactionManager;
	private SessionFactory sessionFactory;

}
