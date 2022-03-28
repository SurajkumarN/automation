package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/HP/Desktop/New%20folder/demo.html");
		Thread.sleep(2000);
		//Absolute xPath
		driver.findElement(By.xpath("/html/body/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Relative xPath
		driver.findElement(By.xpath("//a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//img")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}
}
