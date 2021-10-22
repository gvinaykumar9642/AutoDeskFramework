package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_01DeleteOrganisation {

	@Test
	public void CreateOrganisation()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		driver.findElement(By.linkText("del")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
}
}