package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextMethod {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Please identify yourself']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']"));
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
