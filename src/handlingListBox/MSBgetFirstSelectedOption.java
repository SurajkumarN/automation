package handlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBgetFirstSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement cplist = d.findElement(By.id("cp"));
		Select s=new Select(cplist);
		Thread.sleep(2000);
		s.selectByIndex(7);
		WebElement fs = s.getFirstSelectedOption();
		String txt = fs.getText();
		System.out.println(txt);
		d.close();
	}
}
