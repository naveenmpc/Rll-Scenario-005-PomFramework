package testPages;






import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignPage;
import pages.TestBase;

public class TestSigninpages extends TestBase{
	SignPage SP;
	@BeforeTest
	public void OpenApp()
	{
		getBrowser();
		SP=new SignPage();
	}
	
	
	
	@Test(priority=1)
	public void testLogin() {
		SP.enterLoginDetails("mnaveenkumar1207@gmail.com", "Naveen@1234567890");

		}

	


}
