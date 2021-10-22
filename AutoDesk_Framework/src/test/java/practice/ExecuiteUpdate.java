package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuiteUpdate {

	@Test
	public void execuiteQuery() throws SQLException
	{
		Connection con=null;
		try
		{
		//Step1: Regester the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Step2: establish connection with database
	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root","root");//my connector url in google
		//Step3: Issue create statement
		Statement stat=con.createStatement();
		//Step4: Execuite the query
		int result=stat.executeUpdate("insert into customer vues(6,'raj','yadav','Ap')");
		if(result==1)
		{
			System.out.println("project is created successfully");
		}
		else
		{
			System.out.println("Query failed");
		}
		}
		catch(Exception e)
		{
			
		}
		finally {
		//closing the data base
		con.close();
}
}
}