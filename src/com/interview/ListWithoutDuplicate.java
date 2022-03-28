package com.interview;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListWithoutDuplicate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void list() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/selenium/autoscript/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		List<WebElement> allopns = s.getOptions();
		HashSet<String> hs=new HashSet<>();
		for(int i=0; i<allopns.size();i++) {
			String txt = allopns.get(i).getText();
			hs.add(txt);
		}
		for(String list:hs) {
			System.out.println(list);
		}
		driver.close();
	}
}
