package methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOFWebElements {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebElement we= (WebElement) new ChromeDriver();
		we.clear();
		we.click();
		we.getAttribute(null);
		we.getCssValue(null);
		we.getLocation();
		we.getRect();
		we.getSize();
		we.getTagName();
		we.getText();
		we.isDisplayed();
		we.isEnabled();
		we.isSelected();
		we.sendKeys(args);
		we.submit();
	}
}
