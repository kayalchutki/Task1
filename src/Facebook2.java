import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
	
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-09\\eclipse-kayal\\Locator2\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");

}
	}
