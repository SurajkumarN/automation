package handlingListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MSBgetWrapedElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlist);
		WebElement wrapped = s.getWrappedElement();
		String txt = wrapped.getText();
		System.out.println(txt);
		driver.close();
	}
}
