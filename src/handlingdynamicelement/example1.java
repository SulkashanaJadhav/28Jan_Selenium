package handlingdynamicelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.filpkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click on cancel button
		driver.findElement(By.xpath("//button[@class='_2kpz61_2doB4z'")).click();
		//text on search btn
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("redmi 9 power");
		
		
		
		
		
		



	}
}
