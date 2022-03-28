package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String crnturl = driver.getCurrentUrl();
		if(crnturl.equals("https://www.selenium.dev/")) {
				System.out.println("url is navigate succesfully and pass");
		}
		else {
			System.out.println("url is not navigate succesfully and failed");
		}
		driver.close();
	}
	
}
