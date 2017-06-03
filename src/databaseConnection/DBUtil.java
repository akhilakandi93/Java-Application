package databaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	static final String OracledbURL = "jdbc:mysql://localhost:3306/world";
	static final String ORusername="root";
	static final String ORpassword="root";
	static final String MySqldbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String MySqlusername = "hr";
	static final String MySqlpassword = "hr";
	
	public static Connection getConnection(DBType dbtype) throws SQLException{
		switch(dbtype){
		case ORACLEDB:
			return DriverManager.getConnection(OracledbURL, ORusername, ORpassword);
		    //break;
		case MYSQLDB:
			return DriverManager.getConnection(MySqldbURL, MySqlusername, MySqlpassword);
			//break;
	    default:
	    	return null;
		
		}
	}
	
	
}
