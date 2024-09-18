package javabasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.driver.chrome","\"D:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://WWW.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("One plus tv");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}

}
