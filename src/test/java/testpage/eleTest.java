package testpage;

import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.elepage;

public class eleTest extends Baselibrary {

	elepage ob;
	
	public void getlaunchurl()
	{
		getlaunchurl("https://www.flipkart.com/");
		ob= new elepage();
	}
	
	@Test()
	
	public void clickonele()
	{
		ob.clickonelectronics();
	}
}
