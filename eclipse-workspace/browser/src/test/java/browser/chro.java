package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chro
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chrome.google.com");
		driver.quit();

	}

}
