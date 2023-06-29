package scrollupdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

Thread.sleep(2000);

//scroll down

((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");

Thread.sleep(2000);

//scroll up

((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");

//scroll right
//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,0)");

//scroll left
//((JavascriptExecutor)driver).executeScript("window.scroll.By(-100,0)");



}

}
