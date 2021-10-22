package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ExecuiteQuery {
	
	@Test
	public void execuiteQuery() throws SQLException
	{
		
		
		//Step1: Regester the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Step2: establish connection with database
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root","root");//my connector url in google
		//Step3: Issue create statement
		Statement stat=con.createStatement();
		//Step4: Execuite the query
		ResultSet result=stat.executeQuery("select * from customer;");
				{
				while(result.next())
		{
			System.out.println(result.getString(2));
		}
				
	}
	}
}

