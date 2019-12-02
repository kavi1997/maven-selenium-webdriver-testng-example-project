package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	options.addArguments("no-sandbox");
	options.addArguments("disable-dev-shm-usage");
	options.addArguments("window-size=1200x600");
	WebDriver driver = new ChromeDriver(options);
		
		return driver;
	}

}
