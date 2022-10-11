import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;

//import com.sun.xml.internal.ws.wsdl.writer.document.Types;

public class Demo3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/wiley";
		String username="root";
		String password="root123";
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con=DriverManager.getConnection(url, username, password);
		/*
		 * con.createStatement() : statement
		 * con.preparedStatement(String sql) : PreparedStatement
		 * con.prepareCall({String sql which represents query to invoke procedure}): CallableStatement 
		 */
//		CallableStatement callableStatement=con.prepareCall("{call getCityData()}");
//		ResultSet rs=callableStatement.executeQuery();
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		CallableStatement callableStatement=con.prepareCall("{call accountHolderClass(?,?)}");
		
		callableStatement.setString(1, "ACC2");
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		
		callableStatement.executeUpdate();
		String holderType=callableStatement.getString(2);
		System.out.println(holderType);
		
		con.close();
	}

}