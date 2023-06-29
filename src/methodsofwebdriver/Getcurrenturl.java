package methodsofwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https/www.facebook.com/");
	String url =driver.getCurrentUrl();
	System.out.println(url);
}
}
