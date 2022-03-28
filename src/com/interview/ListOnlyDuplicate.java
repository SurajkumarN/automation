package com.interview;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListOnlyDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void onlyduplicate() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/selenium/autoscript/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlist);
		List<WebElement> dupopns = s.getOptions();
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < dupopns.size(); i++) {
			String opns = dupopns.get(i).getText();
			if (hs.add(opns) == false) {
				System.out.println(opns);
				System.out.println(".............................");
			}
		}
		driver.close();
	}
}
