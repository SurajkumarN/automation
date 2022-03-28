package com.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage {
	
	@FindBy(name = "username")
	private WebElement untxt;

	@FindBy(name = "pwd")
	private WebElement pwdtxt;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgnbtn;

	public POMLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	public void setLogin(String un, String pwd) {
//		untxt.sendKeys(un);
//		pwdtxt.sendKeys(pwd);
//		lgnbtn.click();
//	}
	public void untxt(String un) {
		untxt.sendKeys(un);
	}
	public void pwdtxt(String pwd) {
		pwdtxt.sendKeys(pwd);
	}
	public void lgnbtn() {
		lgnbtn.click();
	}
}
