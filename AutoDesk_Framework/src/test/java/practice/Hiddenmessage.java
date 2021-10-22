package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.WebDriverUtility;


public class Hiddenmessage {
  
	
//	@Test
//	public void Hiddenmessage() throws EncryptedDocumentException, InvalidFormatException, IOException
//	{
//		
//	WebDriver driver=new ChromeDriver();
//	ExcelUtility ecel=new ExcelUtility();
//	String url = ecel.getExcelData("Sheet1",4,1);
//	driver.get(url);

	
    public class XpathAssignment extends WebDriverUtility {
		@Test
		public void xpathAssignmentTest() throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/tool-tips");
			WebElement button = driver.findElement(By.id("toolTipButton"));
			mouseOver(driver, button);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement text = driver.findElement(By.xpath("//div[text()='You hovered over the Button'and @class='tooltip-inner']"));
			String data = text.getText();
			System.out.println(data);
			driver.findElement(By.id("toolTipTextField")).sendKeys(data);
}
}
}