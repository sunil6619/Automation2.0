package baselibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baselibrary {
	
	static public WebDriver driver;
public void getlaunchurl(String url)
{
	System.setProperty("webdriver.chrome.driver","S:\\Eclipse\\Automation2.0\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[text()='✕']")).click();
	
}

public void mousehover(WebElement ele)
{
	Actions act= new Actions(driver);
	act.moveToElement(ele).perform();
}
}
