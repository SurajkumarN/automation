package handlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBisMultiple {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist = d.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("b");
		Thread.sleep(2000);
		s.selectByVisibleText("dosa");
		Thread.sleep(2000);
		
		if(s.isMultiple()) {
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("b");
			Thread.sleep(2000);
			s.deselectByVisibleText("dosa");
			Thread.sleep(2000);
		
		}
		d.close();
	}
}
