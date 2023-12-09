package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage extends TestBase {



@FindBy(xpath="/html/body/aside/nav/div[2]/ul/li[7]/a")
static WebElement link_transfermenuaccounts;


@FindBy(xpath="//select[@class='form-control']")
static WebElement click_formcontrol;


@FindBy(xpath="//select[@id='toAccount']")
static WebElement click_tocontrol;

@FindBy(id="amount")
static WebElement Btn_value;

@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/button[1]")
static WebElement Btn_Click;

public void clickLoginLink() {
	link_transfermenuaccounts.click();
}

public void  submitbutton()
{
	Btn_Click.click();
}
public void clickfromaccount(String option) {
	click_formcontrol.click();
	click_formcontrol.sendKeys(option);
}
public void clicktoacount(String value) {
	click_tocontrol.click();
	click_tocontrol.sendKeys(value);
}
public void  selectamount(String value)
{
	
	Btn_value.sendKeys(value);
	
}

public Homepage()
{
	PageFactory.initElements(driver,this);
}

}
