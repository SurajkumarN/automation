package findElementsBy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allSuggestion = e.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allSuggestion.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String txt = allSuggestion.get(i).getText();
			System.out.println(txt);
		}
		allSuggestion.get(1).click();
		Thread.sleep(3000);
		driver.close();
	}
}
