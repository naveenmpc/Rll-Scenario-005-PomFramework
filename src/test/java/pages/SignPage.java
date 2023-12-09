package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignPage extends TestBase {
	
	
		@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[1]/input")
		static WebElement TxtBox_Username;
		
		@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[2]/input")
		static WebElement TxtBox_Password;
	    
		@FindBy(id="submit")
		static WebElement Btn_submit;

		
	public void enterLoginDetails(String emailid ,String password)
	{
		TxtBox_Username.sendKeys(emailid);
		TxtBox_Password.sendKeys(password);
		Btn_submit.click();
	}
	public SignPage()
	{
		PageFactory.initElements(driver,this);
	}


	}
