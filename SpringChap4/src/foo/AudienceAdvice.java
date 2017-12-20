package foo;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class AudienceAdvice implements MethodBeforeAdvice,AfterReturningAdvice,ThrowsAdvice {
	private Audience audience;
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		audience.takeSeats();
		audience.takeSeats();
	}
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		audience.applaud();
		
	}

	public void afterThrowing(Throwable throwable){
		audience.demandRefund();
	}
	public Audience getAudience() {
		return audience;
	}

	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	

}
