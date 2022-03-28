package popups;
import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopups {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notification");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
	}
		
		
		
}
