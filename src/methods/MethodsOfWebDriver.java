package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebDriver {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		
		wd.close();
		wd.get(null);
		wd.getCurrentUrl();
		wd.getPageSource();
		wd.getTitle();
		wd.getWindowHandle();
		wd.getWindowHandles();
		wd.manage();
		wd.navigate();
		wd.quit();
		wd.switchTo();
		
	}
}
