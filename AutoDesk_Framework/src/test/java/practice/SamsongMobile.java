package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SamsongMobile {
	
	
	@Test
	public void SamsongMobile() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7989227895");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vinay123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();;
		driver.findElement(By.name("q")).sendKeys("samsungmobile"+Keys.ENTER);
		 List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG') and @class]"));
		 
		 for (int i=0;i<product.size();i++)
		 {
			 String text = product.get(i).getText();
			 System.out.println(text);
		 }
		  String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _1_WHN1']")).getText();
		 System.out.println("samsung galaxy:"+price);
		 driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy F22 (Denim Blue, 128 GB)')]")).click();
		 driver.findElement(By.xpath(("(//li[@class='col col-6-12'])[1]"))).click();
		 driver.close();
	}
}

