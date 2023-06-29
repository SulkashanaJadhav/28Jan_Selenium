package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_XpathbyAttribute
{
public static void main(String[] args) throws
InterruptedException
{
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/");
  
  //enter UN
  //drive.findElement("locator type")
  //driver.findElement(By.xpath("xpathExpression"));
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sulkashana");
  
  //enter pw
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");

 //enter
    driver.findElement(By.xpath("//button[@name='login']")).click();

	
	
	
	
	
	
}
}
