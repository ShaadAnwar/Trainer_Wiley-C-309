import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
//		System.out.println("ApplicationContext Loaded!~");
		
		//ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans1.xml","beans2.xml");
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext(
					new String[] {"beans1.xml","beans2.xml"}
					
				);
		
		System.out.println("application context initiated ");
		
		

	}

}
