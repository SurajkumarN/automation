package genericLibrary.methodsForWebDriverElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.waitForPageLoad(driver);
		WebElement element = null;
		w.waitForElementVisible(driver, element);
		w.customWait(element);
		w.selectOption(element, 1);
		w.selectOption(element, "idly");
	}
}
