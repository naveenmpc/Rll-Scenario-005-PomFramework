package testPages;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.SignPage;
import pages.TestBase;

public class TestHomePage extends TestBase {

	SignPage SP;
	Homepage HP;
	

	@BeforeTest
	public void openbrowser()
	{
	
		getBrowser();
		SP = new SignPage();
		HP= new Homepage();
	}
	
	
	@Test(priority=1)
	public void clickonTransfer()
	{
		
		HP.clickLoginLink();
	}
	@Test(priority=2)
	public void selectAccountAmount()
	{
		HP.clickfromaccount("Abc (Savings)");
		HP.clicktoacount("Xyz (Savings)");
		HP.selectamount("3000");
		HP.submitbutton();
	}
	@Test(priority=3)
	public void closebrowser()
	{
		
			driver.close();
	}
	
	
	
}
