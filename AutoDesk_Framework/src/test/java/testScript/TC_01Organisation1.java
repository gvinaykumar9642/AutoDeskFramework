package testScript;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;


public class TC_01Organisation1 {

	@Test
	public void CreateOrganisation() throws Throwable
	{
		
		// using property file
	   FileUtility file=new FileUtility();
	   String url=file.getpropertykeyvalue("url");
	    String username=file.getpropertykeyvalue("username");
	    String password=file.getpropertykeyvalue("password");
	    
	    //read data from json
		/* FileUtility file=new FileUtility();
	    String url=file.getDataFromJson("url");
	    String username=file.getDataFromJson("username");
	    String password=file.getDataFromJson("password");*/
	    
	  
	      
	    WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).submit();
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys("G vinaykumar11"+getRandomData());//for duplicates we use javautility.getrabdomdata
		driver.findElement(By.name("website")).sendKeys("www.gmail.com");
		driver.findElement(By.name("employees")).sendKeys("2000");
		driver.findElement(By.name("email2")).sendKeys("vinaykumaryadav9642@gmail.com");
		WebElement industry = driver.findElement(By.name("industry"));
		Select s=new Select(industry);
		s.selectByValue("Engineering");
		WebElement Accounttype= driver.findElement(By.name("accounttype"));
		Select s1=new Select(Accounttype);
		s1.selectByValue("Analyst");
		driver.findElement(By.name("emailoptout")).click();
		driver.findElement(By.id("phone")).sendKeys("7989227895");
		driver.findElement(By.id("otherphone")).sendKeys("7842246631");
		driver.findElement(By.id("email1")).sendKeys("vinaykumaryadav9642@gmail.com");
		driver.findElement(By.name("annual_revenue")).clear();
		driver.findElement(By.name("annual_revenue")).sendKeys("350000");
		WebElement rating= driver.findElement(By.name("rating"));
		Select s2=new Select(rating);
		s2.selectByValue("Acquired");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]"));
		a.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
}

	private String getRandomData() {
		// TODO Auto-generated method stub
		return null;
	}
}