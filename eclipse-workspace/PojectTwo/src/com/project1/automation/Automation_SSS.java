package com.project1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation_SSS {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.amazon.in/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement parent = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement child = driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));
		Actions act=new Actions(driver);
		act.moveToElement(parent).perform();
		Thread.sleep(1000);
		child.click();
		Thread.sleep(1000);
		driver.close();

		
		

	}
	
}
