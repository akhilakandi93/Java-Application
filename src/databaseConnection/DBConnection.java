package databaseConnection;
import java.sql.*;

public class DBConnection {

	public static void main(String[] args) throws SQLException {
		String ak="ak";
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("Select EMPLOYEE_ID, FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER from EMPLOYEES");
		
		while(rs.next()){
			System.out.println(rs.getString("EMPLOYEE_ID")+"	"+rs.getString("FIRST_NAME")+"		"+rs.getString("LAST_NAME")+"    "+rs.getString("EMAIL")+"    "+rs.getString("PHONE_NUMBER"));
		}

		conn.close();
	}

}
