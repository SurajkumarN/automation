package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CuttentUrlOfGmail {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		String crnturl = driver.getCurrentUrl();
		System.out.println(crnturl);
		if(crnturl.contains("accounts.google.com")) {
				System.out.println("url is navigate succesfully and pass");
		}
		else {
			System.out.println("url is not navigate succesfully and failed");
		}
		driver.close();
	}

}
