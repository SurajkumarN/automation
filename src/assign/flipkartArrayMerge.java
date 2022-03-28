package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartArrayMerge {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		List<WebElement> ip = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 ')]/../..//div//div[1]/div[1]/div"));
		int count=ip.size(); 
		int count1 = price.size();
		System.out.println(count);
		System.out.println(count1);
	for(int i=0; i<count1;i++) {
			String txt=ip.get(i).getText();
			String txt2=price.get(i).getText();
			System.out.println(txt+"--->"+txt2);
	}
	driver.close();
		
	}
}
