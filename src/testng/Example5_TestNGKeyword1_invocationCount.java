package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGKeyword1_invocationCount 
{
@Test(invocationCount=5)	
public void TC1() 
{
Reporter.log("running TC1",true);
}
}
