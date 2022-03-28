package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptORAlertPopupsDismiss {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//ul/li[2]/a[@class='analystic']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'display a confirm box ')]")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.alertIsPresent());
	Alert a=driver.switchTo().alert();
	String txt = a.getText();
	System.out.println(txt);
	a.accept();
	boolean disp1 = driver.findElement(By.xpath("//p[contains(text(),'You pressed Ok')]")).isDisplayed();
	if(disp1==true) {
		System.out.println("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	driver.findElement(By.xpath("//button[contains(text(),'display a confirm box ')]")).click();
	a.dismiss();
	boolean disp2 = driver.findElement(By.xpath("//p[contains(text(),'You Pressed Cancel')]")).isDisplayed();
	if(disp2==true) {
		System.out.println("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	driver.close();
	}
}
