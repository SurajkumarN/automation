package com.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class t_001_actitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		POMLoginPage pl = new POMLoginPage(driver);
		// pl.setLogin("admin", "manager");
		pl.untxt("admin");
		pl.pwdtxt("manager");
		pl.lgnbtn();
		// driver.close(); }

	}
}
