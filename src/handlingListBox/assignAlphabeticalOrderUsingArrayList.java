package handlingListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignAlphabeticalOrderUsingArrayList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrlist);
		List<WebElement> allops = s.getOptions();
				
		ArrayList<String> a1=new ArrayList<>();
		for(WebElement ops:allops) {
			String txt=ops.getText();
			a1.add(txt);
		}
		Collections.sort(a1);
			for(String txt:a1) {
				System.out.println(txt);
			}
		driver.close();
	}
}
