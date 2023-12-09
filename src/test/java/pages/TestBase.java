package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
      public static WebDriver driver;
      
      public static void getBrowser() {
    	  driver = new ChromeDriver();
    	  driver.get("http://dbankdemo.com/bank/login");
      }
}

