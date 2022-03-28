package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListAssending {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@Test
	public void listAssendibgOrder() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/selenium/autoscript/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlist);
		List<WebElement> dupopns = s.getOptions();
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<dupopns.size();i++) {
			String txt = dupopns.get(i).getText();
			al.add(txt);
		}
		Collections.sort(al);
		for(String sortedlist:al) {
			System.out.println(sortedlist);
		}
		
		driver.close();

	}
	
	
}
