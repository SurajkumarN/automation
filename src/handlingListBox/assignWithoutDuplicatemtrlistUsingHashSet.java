package handlingListBox;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignWithoutDuplicatemtrlistUsingHashSet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrlist);
		List<WebElement> allops = s.getOptions();
		int count=allops.size();
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<count;i++) {
			String txt=allops.get(i).getText();
			hs.add(txt);
		}
		for(String text:hs) {
			System.out.println(text);
		}
		driver.close();
	}
}
