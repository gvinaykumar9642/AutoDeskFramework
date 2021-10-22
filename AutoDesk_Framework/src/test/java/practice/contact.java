package practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class contact {
@Test
public void org(XmlTest xml)
{
	System.out.println("execuite1");
	String URL = xml.getParameter("url");
	String username = xml.getParameter("username");
	String password = xml.getParameter("password");
	String browser = xml.getParameter("browser");
	System.out.println(URL);
	System.out.println(username);
	System.out.println(password);
	System.out.println(browser);
}
}
