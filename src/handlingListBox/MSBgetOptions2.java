package handlingListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBgetOptions2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement cplist = d.findElement(By.id("cp"));
		Select s = new Select(cplist);
		List<WebElement> allops = s.getOptions();
		int count = allops.size();
		System.out.println(count);
		for (WebElement op : allops) {
			System.out.println(op.getText());
		}

		d.close();
	}
}
