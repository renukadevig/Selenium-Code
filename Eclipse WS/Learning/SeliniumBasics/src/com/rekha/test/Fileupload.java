package com.rekha.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class Fileupload 
{

	public static void main(String args[]) throws InterruptedException, AWTException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Renuka\\Selinium\\Eclipse WS\\Learning\\SeliniumBasics\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mirsal2newsit.dubaiworld.ae/vms-web");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Althaff.Yousuf");
        driver.findElement(By.id("password")).sendKeys("Althaff.Yousuf123");
        driver.findElement(By.className("formButton")).click();
        driver.findElement(By.cssSelector("#sidebar > ul > li:nth-child(3) > ul > li:nth-child(2) > a > span")).click();
        driver.findElement(By.id("vesselNumberToDisplay")).sendKeys("DV7005");
        driver.findElement(By.xpath("//*[@id=\"search\"]/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nextButton\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nextButton\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nextButton\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("documentName")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"uploadDoc\"]/tbody/tr/td/div/div/div[2]/span")).click();
        System.out.println("Clicked");
        Thread.sleep(2000);
        //copy the file absolute path to clipboard
        StringSelection ss=new StringSelection("D:\\Users\\Public\\Pictures\\Sample Pictures\\Blue hills.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    		
	}
}

/*
 * About AutoIT:
AutoIt v3 is a freeware BASIC-like scripting language designed for automating Windows GUI and general scripting. It uses a combination of simulated keystrokes, mouse movement and window/control manipulation in order to automate tasks.

This method is for handling the Windows File Upload dialog, which cannot be handled using Selenium. Please follow below steps:

Download AutoIT
Open SciTE Script Editor
Below script is used to detect the windows file upload dialog

WinWaitActive("File Upload") //File Upload is the dialog's title
Send("Full path of the document") 
Send("{ENTER}")
Save the above script file as Script.au3
Compile the file from SciTE Editor and you will get an Script.exe file
Steps to be followed while running the test:
Click on the File Upload / Choose File button, so that the File Upload dialog is displayed.

driver.findElement(By.id("uploadbutton")).click;
Invoke the Script.exe file

Runtime.getRuntime().exec("Script.exe");
The Script.exe file will handle the file upload
*/
