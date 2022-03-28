package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthOfUNandPWDTextBoxes {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int unh = driver.findElement(By.id("email")).getSize().getHeight();
		int unw = driver.findElement(By.id("email")).getSize().getWidth();
		int pwdh = driver.findElement(By.id("passContainer")).getSize().getHeight();
		int pwdw = driver.findElement(By.id("passContainer")).getSize().getWidth();
		
		System.out.println(unh +": height of text box");
		System.out.println(unw +": width of text box");
		System.out.println(pwdh +": height of password");
		System.out.println(pwdw +": width of passward");
		if (unh==pwdh&&unw==pwdw) {
			System.out.println("height and width is same");
		}
		else {
			System.out.println("height and width is not same");
		}
		driver.close();
	}
}
