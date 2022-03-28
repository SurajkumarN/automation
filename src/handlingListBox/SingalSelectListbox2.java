package handlingListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingalSelectListbox2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create New Account")).click();
		WebElement dlist = d.findElement(By.id("day"));
		Select s=new Select(dlist);
		s.selectByIndex(7);
		WebElement mlist=d.findElement(By.id("month"));
		Select s1=new Select(mlist);
		s1.selectByValue("4");
		WebElement ylist=d.findElement(By.id("year"));
		Select s2=new Select(ylist);
		s2.selectByVisibleText("1996");
		d.close();
	}
}
