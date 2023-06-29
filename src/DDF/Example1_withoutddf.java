package DDF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_withoutddf 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//click on sign in
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
	//phone no
	driver.findElement(By.xpath(" //input[@id='central-login-module-sign-mobile'])[2]"))
	.sendKeys("7058348246");
	//click on sign in with pass
	
	driver.findElement(By.xpath("//span[text()='Sign in with Password'])[2]")).click();
	
}
}
