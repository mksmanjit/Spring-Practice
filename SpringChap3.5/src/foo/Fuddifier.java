package foo;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Fuddifier implements BeanPostProcessor,InitializingBean {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		Field[] fields = bean.getClass().getDeclaredFields();
		System.out.println("postProcessAfterInitialization>>"+bean);
		try{
			for(int i=0;i<fields.length;i++){
				if(fields[i].getType().equals(java.lang.String.class)){
					fields[i].setAccessible(true);
					String original = (String)fields[i].get(bean);
					fields[i].set(bean, fuddify(original));
				}
			}
		}catch(IllegalAccessException e ){
			e.printStackTrace();
		}
		return bean;
	}

	private Object fuddify(String original) {
		// TODO Auto-generated method stub
		if(original == null) return original;
		return original.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After prototype set");
	}
	

}
