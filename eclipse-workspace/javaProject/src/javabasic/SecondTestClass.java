package javabasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SecondTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.safari.driver", "D:\\Safari\\SafariSetup.exe");	
	WebDriver driver=new SafariDriver();
	driver.get("https://WWW.google.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='globalheader']")).click();
	}
	
}
