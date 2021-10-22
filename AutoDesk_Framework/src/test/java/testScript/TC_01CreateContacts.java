package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_01CreateContacts {

	@Test
	public void CreateContacts()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("salutationtype")).sendKeys("Mr.");
		driver.findElement(By.name("firstname")).sendKeys("vinay");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.id("department")).sendKeys("Testing");
		driver.findElement(By.id("email")).sendKeys("vinaykumaryadav9642@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("7989227895");
		driver.findElement(By.id("homephone")).sendKeys("7842246631");
		driver.findElement(By.id("otherphone")).sendKeys("7842210709");
		driver.findElement(By.name("birthday")).sendKeys("16/06/1995");
		driver.findElement(By.id("secondaryemail")).sendKeys("yvinaykumar245@gmail.com");
		Actions a=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		a.moveToElement(target).perform();
		driver.findElement(By.linkText("Sign Out")).click();
}
}