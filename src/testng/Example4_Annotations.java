package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_Annotations 
{   
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("Open Browser",true);
	}
	
    @BeforeMethod
	public void loginToApp()
	{
		Reporter.log("login TO App",true);
	}
	@Test
	public void verifyFullName()
	{
		Reporter.log("running verifyFullName TC",true);
	}
	@Test
	public void verifyFullName2()
	{
		Reporter.log("running verifyFullName TC",true);
	}
	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("running verify logout From App",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("close browser",true);
	}
}

