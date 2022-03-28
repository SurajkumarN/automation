package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
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
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		List<WebElement> flight = driver.findElements(By.xpath("//div/div[1]/div/div/div/img"));
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		List<WebElement> deptTime = driver
				.findElements(By.xpath("//div/div[1]/div/div/div/img/../../../../../div[2]/div/div/p"));
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		int count = flight.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String name = flight.get(i).getAttribute("alt");
			String time = deptTime.get(i).getText();
			System.out.println(name + "--->" + time);
		}
		//driver.close();

	}
}