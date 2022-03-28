package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/demo.html");
		
		//Relative xPath
		driver.findElement(By.xpath("//a[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//img")).click();
		driver.navigate().back();
		driver.close();
	}
}
