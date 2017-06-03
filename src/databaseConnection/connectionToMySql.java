package databaseConnection;

import java.sql.*;

public class connectionToMySql {

	static final String dbURL = "jdbc:mysql://localhost:3306/world";
	static final String username="root";
	static final String password="root";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			Connection conn=null;
			
			try {
				conn= DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connection to mySql established successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
			finally{
				conn.close();
			}
			
		
	}

}
