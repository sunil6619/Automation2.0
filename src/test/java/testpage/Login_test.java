package testpage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Login_page;

public class Login_test extends Baselibrary {
	Login_page ob;
	@BeforeTest
	
	public void getlaunchUrl()
	{
		getlaunchurl("https://www.flipkart.com/");
		ob=new Login_page();
	}
	@Test
	public void gettitle()
	{
		ob.getTitleecomm();
	}
}
