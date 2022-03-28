package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginButtonDiplayed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
 boolean button = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		if(button==true)
		{
			System.out.println("button is enabled and test pass");
		}
		else
		{
			System.out.println("button is not enabled test fail");
		}
		driver.close();
	}
}
