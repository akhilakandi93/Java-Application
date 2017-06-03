package databaseConnection;
import java.sql.*;

public class myDatabaseConnection {

	static final String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String username = "hr";
	static final String password = "hr";
	public static void main(String args[]) throws SQLException{
		
		Connection conn=DriverManager.getConnection(dbURL,username,password);
		System.out.println("Connection establishes successfully");
	}
}
