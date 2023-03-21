package oops;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	public static void main(String[] args) {
		
		WebDriver driver;
		String location = "110059";
		String path ="S:\\Eclipse\\Automation2.0\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//test case1
		WebElement select_address= driver.findElement(By.xpath("//div[@id=\"glow-ingress-block\"]/child::span[@id=\"glow-ingress-line2\"]"));
		select_address.click();
		
		WebElement enter_pincode = driver.findElement(By.xpath("//div[@id=\"a-popover-content-1\"]//ancestor-or-self::div//input[@id=\"GLUXZipUpdateInput\"]"));
		enter_pincode.sendKeys(location);
		
		WebElement submit_pincode = driver.findElement(By.xpath("(//div[@id=\"a-popover-content-1\"]//input[contains(@type,'submit')])[3]"));
		
		submit_pincode.click();
		
		WebElement verify_location= driver.findElement(By.xpath("//div[@id=\"glow-ingress-block\"]/child::span[@id=\"glow-ingress-line2\"]"));
		   String verify_location_text = verify_location.getText();
		   if(verify_location_text.contains(location))
		   {
			   
			   System.out.println("location is verify ");
		   }
		//test case2
		   
		   WebElement sign_click= driver.findElement(By.xpath("//div//span[@id=\"nav-link-accountList-nav-line-1\"]"));
		   sign_click.click();
		   
		  
		  WebElement send_user_name = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		  send_user_name.sendKeys("xxxd") ;
		  WebElement submit_button = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		   submit_button.click();
		  
		
		  
		  
	}
	
}

