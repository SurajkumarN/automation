package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversing {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/traversing.html");
		//Forward traversing
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td"));
		driver.findElement(By.xpath("//tr[1]/td[2]"));//java 100
		//backward traversing
		driver.findElement(By.xpath("//td[2]/../../../../.."));//selenium 300 to html
	}

}
