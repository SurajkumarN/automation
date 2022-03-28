package com.interview;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QuitMethod {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void quitmethod() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> wh = driver.getWindowHandles();
		for(String multiwindow:wh) {
			driver.switchTo().window(multiwindow);
			Thread.sleep(2000);
			driver.close();
		}
	}
}
