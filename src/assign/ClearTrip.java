package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).click();
		driver.findElement(By.xpath("//li/p[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).click();
		driver.findElement(By.xpath("//li/p[contains(text(),'Goa, IN - Dabolim Airport (GOI)')]")).click();
		driver.findElement(By.xpath("//h4[text()='Depart on']/../../../div[3]//div/button")).click();
		WebElement sdgDSG = driver.findElement(By.xpath("(//div[text()='31'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", sdgDSG);
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		List<WebElement> flight = driver.findElements(By.xpath("//div/div[1]/div/div/div/img"));
		Thread.sleep(10000);
		List<WebElement> deptTime = driver.findElements(
				By.xpath("//div/div[1]/div/div/div/img/../../../../../../../..//div[2]/div[2]/div/div[1]/p"));
		int count = flight.size();
		int count1 = deptTime.size();
		System.out.println(count);
		System.out.println(count1);
		for (int i = 0; i < count; i++) {
			String name = flight.get(i).getAttribute("alt");
			String time = deptTime.get(i).getText();
			System.out.println(name + "-------------------------->" + time);
		}
		//driver.close();
	}
}