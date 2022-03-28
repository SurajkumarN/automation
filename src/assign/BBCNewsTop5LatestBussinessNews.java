package assign;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNewsTop5LatestBussinessNews {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");

		List<WebElement> z1 = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']"));
		int count1 = z1.size();
		System.out.println(count1);
		List<WebElement> z2 = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count2 = z2.size();
		System.out.println(count2);

		for (int i = 0; i < count1; i++) {
			String txt1 = z1.get(i).getText();
			String txt2 = z2.get(i).getText();
			System.out.println(txt1+"."+txt2);
			
		}
		driver.close();

	}
}
