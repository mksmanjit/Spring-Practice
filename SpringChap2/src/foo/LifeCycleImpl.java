package foo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleImpl implements LifeCycle, BeanNameAware,
		BeanFactoryAware, BeanPostProcessor, InitializingBean, DisposableBean,ApplicationContextAware {
	private Long counter;

	

	public LifeCycleImpl() {
		System.out.println("0.Instantiate Bean");
	}

	

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("2.setBeanName>>" + arg0+">>"+ ++this.counter);

	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("3.setBeanFactory>>" + arg0+">>" + ++this.counter);
	}
	public void init(){
		System.out.println("Bean is going through Init");
	}
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("7.postProcessAfterInitialization" + arg0 + ">>"
				+ arg1+">>" + ++this.counter);
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5.postProcessBeforeInitialization" + arg0 + ">>"
				+ arg1+">>" + ++this.counter);
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("6.afterPropertiesSet"+">>" + ++this.counter);

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("8.destroy");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4.setApplicationContext"+ ">>" + ++this.counter);
		
	}
	public Long getCounter() {
		System.out.println("Getter Value");
		return counter;
	}

	public void setCounter(Long counter) {
		System.out.println("1.Property Injected");
		this.counter = counter;
	}
	
}
