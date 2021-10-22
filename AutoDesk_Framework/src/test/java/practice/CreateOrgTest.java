package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;

  @Listeners(com.crm.vtiger.GenericUtils.ListenersClass.class)
public class CreateOrgTest extends BaseClass {
     
	@Test(retryAnalyzer=com.crm.vtiger.GenericUtils.RetryAnalyser.class)
	public void CreateOrgTesta()
	{
		System.out.println("org creation failed");
        Assert.fail();
	}
}