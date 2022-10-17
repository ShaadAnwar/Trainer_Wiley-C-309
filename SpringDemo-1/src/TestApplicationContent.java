import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Customer;

public class TestApplicationContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
//		System.out.println("ApplicationContext Loaded!~");
		
		//ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans1.xml","beans2.xml");
		
//		ApplicationContext applicationContext =new ClassPathXmlApplicationContext(
//					new String[] {"beans1.xml","beans2.xml"}
//					
//				);
//		
//		System.out.println("application context initiated ");
//		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
//		Employee e1=(Employee)applicationContext.getBean("emp1");Employee e2=(Employee)applicationContext.getBean("emp2");
//		Employee e3=(Employee)applicationContext.getBean("emp3");
//		
//		System.out.println(e1+" "+e2+" "+e3);
		
		
//		Employee e1=(Employee)applicationContext.getBean("empConst1");
//		System.out.println(e1);
//		
//		Employee e2=(Employee)applicationContext.getBean("empConst2");
//		System.out.println(e2);

		
		Customer customer=(Customer)applicationContext.getBean("customer1");
		System.out.println(customer);
	}
	

}
