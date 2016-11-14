package exceptions;
import java.sql.*;
public class Account {
	
	public Connection getConn() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/";
		String user = "abc";
		String password = "abc";
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		
		return conn;
	}

	public void withdraw(int amount) throws SQLException{
		getConn();
		

	}

}
