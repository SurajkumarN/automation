package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButtonsInCreateAccountOfFaceBook {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		int h1 = driver.findElement(By.name("birthday_day")).getLocation().getY();
		int h2 = driver.findElement(By.name("birthday_month")).getLocation().getY();
		int h3 = driver.findElement(By.name("birthday_year")).getLocation().getY();
		System.out.println(h1 +": height of 1st text box");
		System.out.println(h2 +": height of 2nd text box");
		System.out.println(h3 +": height of 3nd text box");
		if(h1==h2&&h2==h3) {
			System.out.println("properly alligned in horizontal");
		}
		else {
			System.out.println("properly not alligned in horizontal");
		}
		driver.close();
	}
}

