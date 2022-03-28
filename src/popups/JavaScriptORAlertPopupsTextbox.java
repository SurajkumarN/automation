package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptORAlertPopupsTextbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a=driver.switchTo().alert();
	String txt = a.getText();
	System.out.println(txt);
	a.sendKeys("suraj");
	a.accept();
	String txt1 = driver.findElement(By.id("demo1")).getText();
	System.out.println(txt1);
	driver.close();
	}
}
