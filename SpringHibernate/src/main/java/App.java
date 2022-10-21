
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.UserService;
import com.demo.UserServiceImpl;


public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean("userServiceImpl",UserServiceImpl.class);
		userService.save();
		// Close the context
		context.close();
	}
}