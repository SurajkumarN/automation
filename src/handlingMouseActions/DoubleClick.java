package handlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/"); 
		WebElement hover = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		a.moveToElement(hover).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement click = driver.findElement(By.linkText("READ FULL STORY"));
		a.moveToElement(click).doubleClick(click).perform();
		boolean he = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).isDisplayed();
		if(he==true) {
			System.out.println("Displayed");
		}
		else {
			System.out.println("notDisplayed");
		}
		driver.close();
	}
}
