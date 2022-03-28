package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingClickButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Skip")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/main/div/nav/div[1]/div[2]/div/a[3]/i")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/main/div/nav/div[2]/ul/div/div[1]/li[2]/a")).isEnabled();
		Thread.sleep(2000);
		System.out.println("test pass");
		//driver.close();
	}
}
