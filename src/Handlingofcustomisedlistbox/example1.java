package Handlingofcustomisedlistbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("//htpps://www.facebook.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 
	//step1:
WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			
			
	//step2:
	Actions act=new Actions(driver);
	
	//step3:
	act.click(month).perform();
	
	//step4:navigate 1 option to top using'Arrow up'key
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(1000);
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(2000);
	
	
	//step5:
	act.sendKeys(Keys.ENTER).perform();
	
}
}
