package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public void saveEmployee(Employee emp){
		transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus ts) {
				Session session =  getSessionFactory().getCurrentSession();
				try {
				session.save(emp);
				long i = 2/0;
				} catch(Exception e){
					System.out.println("ERROR in DAO");
					//ts.setRollbackOnly();
					throw e;
				}
				return null;
			}
		});

	}



	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}




	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}



	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	private TransactionTemplate transactionTemplate;

	private SessionFactory sessionFactory;

}
