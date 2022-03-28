package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBgetAllSelectedOption {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement cplist = d.findElement(By.id("cp"));
		Select s=new Select(cplist);
		List<WebElement> allselectedop = s.getAllSelectedOptions();
		int count = allselectedop.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			String txt=allselectedop.get(i).getText();
			System.out.println(txt);
		}
		d.close();
	}
}
