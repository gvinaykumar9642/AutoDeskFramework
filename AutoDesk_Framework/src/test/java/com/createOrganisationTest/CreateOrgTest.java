package com.createOrganisationTest;

import static org.testng.Assert.fail;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.createOrganisationTest.CreatingNeworganizations;
import com.crm.createOrganisationTest.Home1;
import com.crm.createOrganisationTest.Login1;
import com.crm.createOrganisationTest.OrgInfoPage;
import com.crm.createOrganisationTest.Organizations;
import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

@Listeners(com.crm.vtiger.GenericUtils.ListenersClass.class)

public class CreateOrgTest extends BaseClass {

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
		
		/* Read test data */
		String OrgName=elib.getExcelData("Sheet1",1,1) + " "+Jlib.getRandomData();
		
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
		/*else
		{
			driver=new ChromeDriver();
		}*/
		
		/* step 2: login to app */      
		Login1 lp=new Login1(driver);
		driver.get(url);
		lp.LoginToApp(USERNAME, PASSWORD);
		
	/*	/* step3; navigate to org */
		Home1 hp=new Home1(driver);
		hp.getOrgLink().click();
		//Assert.assertEquals("A","a");
		
		/* step4:navigate to create org page */
		Organizations op=new Organizations(driver);
		op.getCreateOrgBtn().click();
		
		
         /*step5: create org */
		CreatingNeworganizations cnop=new CreatingNeworganizations(driver);
		cnop.getCreateorg().sendKeys(OrgName);
		
		/* clicking save button */
		CreatingNeworganizations SBtn=new CreatingNeworganizations(driver);
		SBtn.getSaveBtn().click();
		Assert.assertEquals("A","a");
	
		/*step6: verify */
		OrgInfoPage oinfop=new OrgInfoPage(driver);
		wlib.waitForElementVisibility(driver, oinfop.getOrginfo());
		String actSucmsg=oinfop.getOrginfo().getText();
		if(actSucmsg.contains(OrgName))
		{
			System.out.println(OrgName+"org is created successfully==>pass");
		}
		else
		{
			System.out.println(OrgName+"org is not created successfully==>fail");
		}
		
//		/*step7: logout */
//		hp.Logout();
//		
//		/*step8: close the browser */
//		driver.close();
	}
}
