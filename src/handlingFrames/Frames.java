package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/page1.html");
		//using string
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("b");
		//using webElement
		WebElement weAddress = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(weAddress);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("d");
		Thread.sleep(3000);
		driver.close();
	}
}
