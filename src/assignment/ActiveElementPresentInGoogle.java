package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElementPresentInGoogle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("java");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java");
		driver.close();
	}
}
