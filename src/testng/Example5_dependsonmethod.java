package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_dependsonmethod 
{   @Test	
	public void login1() 
	{
		Reporter.log("running login tc",true);
	}
	@Test
	public void login2() 
	{
		Reporter.log("running login1",true);
	}

	@Test(dependsOnMethods= {"login1","login2"})
	public void logout() 
	{
	Reporter.log("running logout tc",true);	
	}

}
