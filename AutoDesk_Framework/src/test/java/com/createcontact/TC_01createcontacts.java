package com.createcontact;

import java.io.IOException;
/**
 * 
 * @author VINAYKUMARYADAV
 */

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.createcontactTest.Homepage;
import com.createcontactTest.Loginpage;
import com.createcontactTest.contactspage;
import com.crm.createOrganisationTest.CreatingNeworganizations;
import com.crm.createOrganisationTest.Home1;
import com.crm.createOrganisationTest.Login1;
import com.crm.createOrganisationTest.OrgInfoPage;
import com.crm.createOrganisationTest.Organizations;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_01createcontacts 
{

	@Test
	public  void createContact() throws IOException, EncryptedDocumentException, InvalidFormatException 
	{
		/* create objects */
		ExcelUtility elib=new ExcelUtility();
		FileUtility flib=new FileUtility();
		JavaUtility Jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		WebDriver driver=null;
		
		/* Read common Data */
		String BROWSER= flib.getpropertykeyvalue("browser");
		String url= flib.getpropertykeyvalue("url");
		String USERNAME= flib.getpropertykeyvalue("username");
		String PASSWORD= flib.getpropertykeyvalue("password");
		
	//	/* Read test data */
	//	String OrgName=elib.getExcelData("Sheet1",1,1) + " "+Jlib.getRandomData();
		
		/* step1:launch the browser */
		if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(BROWSER.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		
		
		/* step 2: login to app */      
		Loginpage lp=new Loginpage(driver);
		driver.get(url);
		lp.LoginToApp(USERNAME, PASSWORD);
		
	   /* click on contact link */
        Homepage hp=new Homepage(driver);
        hp.getContactLink().click();
        
        /* clicking lastviewed contacts */
        contactspage hp1=new contactspage(driver);
        hp1.getLastviewed().click();
        
        /* mouseover to anministerimg for signout link */
        Homepage hp2=new Homepage(driver);
        hp2.getAdministerimg().click();
        
        // Logout link
        Homepage hp3=new Homepage(driver);
        hp3.getSignout().click();
		
		/*step8: close the browser */
		driver.close();
	}
}
