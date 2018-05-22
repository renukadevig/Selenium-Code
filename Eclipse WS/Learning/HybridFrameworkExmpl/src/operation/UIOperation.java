package operation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIOperation 
{
	WebDriver driver;
	public void InitiateDriver() throws InterruptedException 
	{
		//initiate object for driverscript class
		Driverscript objdrv=new Driverscript();
		
		driver = objdrv.Chromedriver();
		Thread.sleep(2000);
	}	
	
	public void perform(Properties p,String operation,String objectName, String objectType, String value) throws Exception
	{
		switch(operation.toUpperCase())
		{
		case "CLICK":
			driver.findElement(this.getObject(p,objectName,objectType)).click();
			break;
		case "SETTEXT":
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			break;
		case "GOTOURL":
			driver.get(p.getProperty(value));
			break;
		default:
	        break;	
		}
		
	}
	
	
	private By getObject(Properties p,String objectName,String objectType) throws Exception
	{
		
		if (objectType.equalsIgnoreCase("XPATH"))
		{
			return By.xpath(p.getProperty(objectName));
			
		}
		
		else if (objectType.equalsIgnoreCase("CLASSNAME"))
		{
			return By.className(p.getProperty(objectName));
			
		}
		
		else if (objectType.equalsIgnoreCase("NAME"))
		{
			return By.name(p.getProperty(objectName));
			
		}
		
		else if (objectType.equalsIgnoreCase("CSS"))
		{
			return By.cssSelector(p.getProperty(objectName));
			
		}
		
		else if(objectType.equalsIgnoreCase("LINK"))
		{
            
            return By.linkText(p.getProperty(objectName));
            
        }
		
		else if(objectType.equalsIgnoreCase("PARTIALLINK")){
            
            return By.partialLinkText(p.getProperty(objectName));
            
        }
		else
        {
            throw new Exception("Wrong object type");
        }

	}

}
