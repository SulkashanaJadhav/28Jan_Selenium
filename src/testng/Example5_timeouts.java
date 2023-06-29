package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_timeouts
{
	@Test(timeOut=5000)
	public void TC1() throws InterruptedException 
	{   Thread.sleep(3000);
		Reporter.log("running TC1",true);
	}
}
