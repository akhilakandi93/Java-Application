package databaseConnection;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class testResultSet {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			Connection conn=null;
			Statement stmt= null;
			ResultSet rs=null;
			try{
				conn=DBUtil.getConnection(DBType.ORACLEDB);
				stmt=(Statement) conn.createStatement();
				rs=stmt.executeQuery("SELECT * FROM USERDETAILS");
				String format= "%-4s%-20s%-10s%-17s%-17s%-2s%-2s\n";
				while(rs.next()){
					System.out.format(format, rs.getString("USERNAME"),rs.getString("FIRSTNAME"),rs.getString("LASTNAME"),rs.getString("PASSWORD"),rs.getString("EMAIL"),rs.getString("FILES"), rs.getString("IMAGES"));
				}
			}catch(SQLException e){
				
				System.out.println("no file found");
			}finally{
				rs.close();
				stmt.close();
				conn.close();
			}
	}

}
