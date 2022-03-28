package com.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class List {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void list() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/selenium/autoscript/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlist);
		java.util.List<WebElement> allopns = s.getOptions();
		int count = allopns.size();
		System.out.println(count);
		for(WebElement opns:allopns) {
			String txt = opns.getText();
			System.out.println(txt);
		}
		driver.close();
	}
}
