import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.bean.Customer;

@ComponentScan(basePackages = {"com.anno.bean"})
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println("Customer retrieved!!");
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getCustomerAddress().getAddressCity());
		System.out.println(c.getCustomerAddress().getAddressState());
		

	}

}
