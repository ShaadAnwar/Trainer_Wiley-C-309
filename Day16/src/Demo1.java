import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/wiley";
		String username="root";
		String password="root123";
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection established!!");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select employee_id, first_name, last_name from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}

	}

}
