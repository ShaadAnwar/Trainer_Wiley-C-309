import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestBeanFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFatory=new XmlBeanFactory(new ClassPathResource("beans1.xml")); 
		//BeanFactory beanFatory=new XmlBeanFactory(new new FileSystemResource("d:\\beans1.xml")); 
		System.out.println("BeanFActory instantiated!!");
	}

}
