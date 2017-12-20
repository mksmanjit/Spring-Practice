package foo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CourseFullEventListener implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Listen>>"+event.getSource());
		
	}

}
