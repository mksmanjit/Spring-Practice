package foo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class AudienceAroundAdvice implements MethodInterceptor {
	private Audience audience;
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		try {
			System.out.println("From Around Advcie");
			getAudience().takeSeats();
			getAudience().turnOfCellPhones();
			Object returnValue = invocation.proceed();
			getAudience().applaud();

			return returnValue;
		} catch (Throwable throwable) {
			getAudience().demandRefund();
			throw throwable;
		}
	}
	public Audience getAudience() {
		return audience;
	}
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

}
