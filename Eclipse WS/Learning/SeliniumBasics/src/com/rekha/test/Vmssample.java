package com.rekha.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Vmssample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\lib\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        String appUrl = "http://mirsal2newsit.dubaiworld.ae/vms-web";
        driver.get(appUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Althaff.Yousuf");
        driver.findElement(By.id("password")).sendKeys("Althaff.Yousuf123");
        driver.findElement(By.className("formButton")).click();
        
        driver.findElement(By.cssSelector("#sidebar > ul > li:nth-child(2) > ul > li:nth-child(1) > a > span")).click();
        
       driver.findElement(By.id("vesselNumber")).sendKeys("DV7006");
       Select listbox = new Select(driver.findElement(By.id("vesselTypeId")));
       listbox.selectByIndex(1);
      
       driver.findElement(By.cssSelector("#vesselCountryPopup > i")).click();
       Thread.sleep(2000);
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
       driver.findElement(By.id("searchCountry")).sendKeys("INDIA");
       driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"search-grid-container\"]/div[2]/div/div/div[1]/table/tbody/tr[1]/td[4]/button")).click();
       driver.switchTo().defaultContent();
       
       Thread.sleep(2000);
       driver.findElement(By.id("vesselName")).sendKeys("test");
       driver.findElement(By.id("ownerName")).sendKeys("test");
       driver.findElement(By.id("vesselNameAr")).sendKeys("test");
       driver.findElement(By.id("ownerNameAr")).sendKeys("test");
       driver.findElement(By.id("vesselLength")).sendKeys("22");
       driver.findElement(By.id("vesselWidth")).sendKeys("22");
       driver.findElement(By.id("netTonnage")).sendKeys("22");
       driver.findElement(By.id("grossTonnage")).sendKeys("22");
       
       Select listbox2 = new Select(driver.findElement(By.name("vesselUOMType")));
       listbox2.selectByIndex(1);
       
       driver.findElement(By.xpath("//*[@id=\"portOfRegistryDiv\"]/div/div/span/button")).click();
       Thread.sleep(2000);
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
       driver.findElement(By.id("searchPort")).sendKeys("Achra");
       driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"search-grid-container\"]/div[2]/div/div/div[1]/table/tbody/tr/td[4]/button/i")).click();
       driver.switchTo().defaultContent();
     
       driver.findElement(By.xpath("//*[@id=\"ownerCountryPopup\"]/i")).click();
       Thread.sleep(3000);
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
       driver.findElement(By.id("searchCountry")).sendKeys("AFGHANISTAN");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"search-grid-container\"]/div[2]/div/div/div[1]/table/tbody/tr/td[4]/button/i")).click();
       driver.switchTo().defaultContent();
       
       driver.findElement(By.xpath("//*[@id=\"create\"]")).click();
       
       String acknowledge=driver.findElement(By.xpath("//*[@id=\"create-vessel-content\"]/div[2]/div/div/div/div/div[1]")).getText();        
       String vesselno= driver.findElement(By.xpath("//*[@id=\"create-vessel-content\"]/div[2]/div/div/div/div/div[2]/label/a")).getText();
       System.out.println(acknowledge);
       System.out.println(vesselno);
       
       driver.findElement(By.cssSelector("#sidebar > ul > li:nth-child(2) > ul > li:nth-child(2) > a > span")).click();
       driver.findElement(By.id("value(vesselNumber)")).sendKeys(vesselno);
       driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
     
       
       
	}

}
