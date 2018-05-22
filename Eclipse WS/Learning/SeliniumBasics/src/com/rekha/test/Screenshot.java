package com.rekha.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Table.Cell;
import com.sun.rowset.internal.Row;

import org.apache.commons.io.*;
import org.apache.poi.hwpf.usermodel.Picture;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Screenshot {

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
        
      //take screenshot and save it as jpg
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
        File dest = new File("D://" + filename+".png");
         FileUtils.copyFile(scrFile, dest);
         
  
         
         
         //create excel and attach screenshot to excel
         XSSFWorkbook wb = new XSSFWorkbook();
         XSSFSheet sheet = wb.createSheet("My Sample Excel");

         //FileInputStream obtains input bytes from the image file
         FileInputStream inputStream = new FileInputStream(scrFile);
         //Get the contents of an InputStream as a byte[].
         byte[] bytes = IOUtils.toByteArray(inputStream);
         //Adds a picture to the workbook
         int pictureIdx = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
         //close the input stream
         inputStream.close();

         //Returns an object that handles instantiating concrete classes
         CreationHelper helper = wb.getCreationHelper();

         //Creates the top-level drawing patriarch.
         Drawing drawing = sheet.createDrawingPatriarch();

         //Create an anchor that is attached to the worksheet
         ClientAnchor anchor = helper.createClientAnchor();
         //set top-left corner for the image
         anchor.setCol1(1);
         anchor.setRow1(2);

         //Creates a picture
         org.apache.poi.ss.usermodel.Picture pict = drawing.createPicture(anchor, pictureIdx);
         //Reset the image to the original size
         pict.resize();

         //Write the Excel file
         FileOutputStream fileOut = null;
         fileOut = new FileOutputStream("D:\\Fund.xls");
         wb.write(fileOut);
         fileOut.close();
         wb.close();


       
   }

	}
