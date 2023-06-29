package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https:/www.google.com/");
	
	driver.navigate().to("https:/www.google.com/");
	driver.navigate().to("https:/www.facebook.com/");
	
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

}
