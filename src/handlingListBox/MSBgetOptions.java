package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBgetOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist=d.findElement(By.id("mtr"));
		
		Select s=new Select(mtrlist);
		List<WebElement> allops = s.getOptions();
		
		int count=allops.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String txt=allops.get(i).getText(); 
			System.out.println(txt);
			
		}
		d.close();
	}
}
