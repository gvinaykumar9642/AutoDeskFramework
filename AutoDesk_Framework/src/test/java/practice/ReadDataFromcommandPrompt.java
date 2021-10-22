package practice;

import org.testng.annotations.Test;

public class ReadDataFromcommandPrompt {

	@Test
	public void Readcommondatapromot()
	{
		String UN=System.getProperty("username");
		System.out.println(UN);
		String PW=System.getProperty("password");
		System.out.println(PW);
		String URL=System.getProperty("url");
		System.out.println(URL);
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
	}
}
