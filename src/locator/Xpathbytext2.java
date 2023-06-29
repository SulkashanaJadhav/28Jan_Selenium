package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext2
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	
	//click on create log in button
	
	driver.findElement(By.xpath("//font[text()='Create a new account']")).click();
}
}
