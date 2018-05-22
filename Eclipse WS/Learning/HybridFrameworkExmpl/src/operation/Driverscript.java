package operation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverscript
{
	//create function for chromedriver and its return type should be webdriver
	public WebDriver Chromedriver()
		{
		//system.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		}
	
	//create function for IEdriver and its return type should be webdriver
	public WebDriver IEdriver()
		{
	//system.setProperty(key,value)
		System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	
		}
	

}
