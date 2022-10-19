import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anno.bean.Customer;
import com.anno.bean.CustomerConfiguration;

public class TestCustomerConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfiguration.class);
		Customer customer=(Customer)context.getBean("customer1");
		System.out.println(customer.getCustomerId()+" "+customer.getCustomerName());

	}

}
