import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/wiley";
		String username="root";
		String password="root123";
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection established!!");
		
		String sqlInsert="insert into users(user,password) values(?,?)";
		PreparedStatement prestat=con.prepareStatement(sqlInsert);
		prestat.setString(1, "abc");
		prestat.setString(2, "abc123");
		
		prestat.executeUpdate();
		
		System.out.println("Record inserted ");
		prestat.clearParameters();
		
		prestat.close();
		con.close();
	}

}