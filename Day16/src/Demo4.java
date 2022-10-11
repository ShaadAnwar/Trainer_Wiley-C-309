import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;





public class Demo4 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/wiley";
		String username="root";
		String password="root123";
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("Connection established!!");
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery("select * from employee");
//		
//		ResultSetMetaData rsmetadata=  rs.getMetaData();
//		
//		int count=rsmetadata.getColumnCount();
//		for(int i=1;i<=count;i++) {
//			System.out.println(rsmetadata.getColumnName(i));
//		}
	
		DatabaseMetaData dbmetadata=con.getMetaData();
		
		System.out.println("Product Name:"+dbmetadata.getDatabaseProductName());
		System.out.println(dbmetadata.getConnection().toString());
		
		
		
		
		con.close();
	}

}