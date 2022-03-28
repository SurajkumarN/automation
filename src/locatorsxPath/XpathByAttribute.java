package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/demo1.html");
		Thread.sleep(2000);
		//Relative xPath
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button' and @value='B']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@checked]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}

