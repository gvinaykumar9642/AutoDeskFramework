package practice;

import org.testng.annotations.Test;

public class CreateCustomerTest {

	@Test
	public void CreateCustomerTest()
	{
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		String BROWSER=System.getProperty("browser");
		
		System.out.println("Execuite1");
		System.out.println("---->"+USERNAME);
		System.out.println("---->"+PASSWORD);
		System.out.println("---->"+BROWSER);
	}
}
