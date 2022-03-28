package genericLibrary.methodsForWebDriverElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is the generic method for WebDriver
 * 
 * @author SURAJ
 * @param args
 */
public class WebDriverCommonLib {
	/**
	 * This is the implicit wait for page to load
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * This is the explicit wait for element load
	 * 
	 * @param element
	 */
	public void waitForElementVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This is the custom wait for element to Displayed
	 * 
	 * @param element
	 */

	public void customWait(WebElement element) {
		int i = 0;
		while (i < 1000) {
			try {
				element.isDisplayed();
				break;

			} catch (Exception e) {
				i++;
			}
		}
	}

	/**
	 * select the value from the listbox based on the index
	 * 
	 * @param element
	 * @param i
	 */
	public void selectOption(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	/**
	 * Select the value from listbox based on the text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
}