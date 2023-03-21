package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import baselibrary.Baselibrary;

public class elepage extends Baselibrary{
	
		
	@FindBy (xpath="//*[text()='Electronics']")
	private WebElement electronics;

	public void clickonelectronics()
	{
		mousehover(electronics);;
	}
	

	
	
}
