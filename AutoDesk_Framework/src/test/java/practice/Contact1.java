package practice;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Contact1 {
	@Test
	public void contact() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		WebElement ms = driver.findElement(By.name("salutationtype"));
		Select s = new Select(ms);
		s.selectByValue("Ms.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("lastname")).sendKeys("chapiri");
		driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
		driver.findElement(By.name("mobile")).sendKeys("6363281558");
		//Click on Organization Name icon and select Organization
		String pr = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		int count = child.size();
		Iterator<String> itr = child.iterator();
		while(itr.hasNext()) {
			String cwh = itr.next();
			if(!pr.equals(cwh))
			{
				WebDriver a = driver.switchTo().window(cwh);
				System.out.println(a.getTitle());
				driver.findElement(By.linkText("Orbinet Technology")).click();
			}
		}
	}
}