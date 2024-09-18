package TESTWEBDRIVER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "D:\\foxfox\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://WWW.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		

	}

}
