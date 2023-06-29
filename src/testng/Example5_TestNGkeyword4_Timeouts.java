package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGkeyword4_Timeouts 
{   @Test(timeOut=5000)
	public void TC1() throws InterruptedException 
	{   Thread.sleep(7000);
		Reporter.log("running TC1",true);
	}

}
