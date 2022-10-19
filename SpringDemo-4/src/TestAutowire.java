import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.beans.EmployeeBean;


public class TestAutowire  {
  public static void main(String[] args) {
 
        ApplicationContext context =
                  new ClassPathXmlApplicationContext("beans.xml");
           
        EmployeeBean employee = (EmployeeBean) context.getBean ("employee");
 
        System.out.println(employee.getFullName());
 
        System.out.println(employee.getDepartmentBean().getName());
    }
}
