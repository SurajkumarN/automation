package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandaling {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> tabs = driver.getWindowHandles();
		for (String mtab : tabs) {
			driver.switchTo().window(mtab);
			String title = driver.getTitle();
			System.out.println(mtab);
			System.out.println(title);
		}
		driver.close();
	}
}
