package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTagNameFromHtmlCode {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String tag = driver.findElement(By.linkText("actiTIME Inc.")).getTagName();
		System.out.println(tag);
		String atag = "a";
		if (atag.equals(tag)) {
			System.out.println("link tag is a");
		}
		else {
			System.out.println("link tag is not a");
		}
		driver.close();
	}

}
