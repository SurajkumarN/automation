package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoleteXpath{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/demo.html");
		Thread.sleep(2000);
		
		//Absolute xPath
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a/img")).click();
		driver.navigate().back();
		driver.close();
	}
}
