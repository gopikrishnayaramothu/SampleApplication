package demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	public static void main(String[] args)
	{
		try {
			System.out.println(new Dbconnection().getConnection());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		System.out.println("connection failed before");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("connection failed after");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Sid-PC:1521:xe","sid","sid");
		if(con==null)
			System.out.println("connection failed");
		else
			System.out.println("connection success");
	
		return con;
	}


}
