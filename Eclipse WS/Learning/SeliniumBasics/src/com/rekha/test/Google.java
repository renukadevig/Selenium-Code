package com.rekha.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\TestPath\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        String appUrl = "http://www.google.com";
        driver.get(appUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"_eEe\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("download");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
        Thread.sleep(2000);
        String str="Download WhatsApp";
        
        for (int i=1;i<10;i++)
        {
        	String stg = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div["+i+"]/div/div/h3/a")).getText();
        	System.out.println(stg);
        	Thread.sleep(2000);
        	driver.findElement(By.linkText(str)).click();
        		
        }
        
        
	}

}
