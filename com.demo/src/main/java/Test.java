import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 Session session=factory.openSession();
		 //System.out.println("working");
		 
		 	session.beginTransaction();

			Student student = new Student();
			student.setStudentId(103L);
			student.setFirstName("abc");
			student.setLastName("Dykes");
			student.setContactNo("+1-408-575-1317");
			session.save(student);

			
			session.getTransaction().commit();

			TypedQuery<Student> q = session.createQuery("From Student", Student.class);

			@SuppressWarnings("deprecation")
			List<Student> resultList = q.getResultList();
			
			
		
			System.out.println("total sudents:" + resultList.size());
			
			for (Student s : resultList) {
				System.out.println("student : " + s);
			}
	}

}
