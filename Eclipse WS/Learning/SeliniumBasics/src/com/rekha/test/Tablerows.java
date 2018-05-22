package com.rekha.test;


import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class Tablerows {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\lib\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        String appUrl = "http://mirsal2newsit.dubaiworld.ae/vms-web";
        driver.get(appUrl);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Althaff.Yousuf");
        driver.findElement(By.id("password")).sendKeys("Althaff.Yousuf123");
        driver.findElement(By.className("formButton")).click();
        
        driver.findElement(By.cssSelector("#sidebar > ul > li:nth-child(3) > ul > li:nth-child(3) > a > span")).click();
        Thread.sleep(2000);
        Select list=new Select(driver.findElement(By.id("searchByStr")));
        list.selectByIndex(6);
        driver.findElement(By.id("search")).click();
        Thread.sleep(2000);
        
        WebElement baseTable=driver.findElement(By.tagName("tbody"));
        List<WebElement> rows= baseTable.findElements(By.tagName("tr"));
        int row_count= rows.size();
        System.out.println(row_count);
        
        for (int row=0;row<row_count;row++)
        {
        	List<WebElement> cols= rows.get(row).findElements(By.tagName("td"));
        	int col_count = cols.size();
        	System.out.println(col_count);
        	
        	for (int col=0;col<col_count;col++)
        	{
        		String celtext = cols.get(col).getText();
        		System.out.println("Cell value of row number"+row+"Cell value of col number"+col+"cell text"+celtext);
        	}
        	
        }
                
        driver.findElement(By.linkText("DV7004")).click();
    
        
     
   }

	}



