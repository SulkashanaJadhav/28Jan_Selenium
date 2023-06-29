package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");


//click on forgotten pw
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
}

}
