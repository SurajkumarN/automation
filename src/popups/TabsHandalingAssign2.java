package popups;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandalingAssign2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class=\"popup_menu_icon\"])[4]")).click();
		driver.findElement(By.linkText("User Guide")).click();
	
		Set<String> awh = driver.getWindowHandles();
		for (String li : awh) {
			driver.switchTo().window(li);
				List<WebElement> next = driver.findElements(By.xpath("//li/span"));
				int count=next.size();
				for(int i=0; i<count;i++) {
					System.out.println(next.get(i).getText());
			}
		}
	}
}
