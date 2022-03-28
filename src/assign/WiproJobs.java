package assign;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.xpath("/html/body/div[1]//div/div[2]/input")).sendKeys("wipro jobs");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.linkText("100+ more jobs")).click();
		Thread.sleep(2000);
		List<WebElement> jobs = driver.findElements(By.xpath("//*[@id=\"immersive_desktop_root\"]/div/div[3]/div[1]/div[1]/div[3]/ul/li[1]/div/div[1]/div[2]/div/div"));
		int count=jobs.size();
		System.out.println(count);
		for(WebElement wj:jobs) {
			String jobTitle = wj.getText();
			System.out.println(jobTitle);
		}
		driver.close();
		
		//*[@id="immersive_desktop_root"]/div/div[3]/div[1]/div[1]/div[3]/ul/li[2]/div/div[2]/div[2]/div/div
		//*[@id="immersive_desktop_root"]/div/div[3]/div[1]/div[1]/div[3]/ul/li[1]/div/div[1]/div[2]/div/div
		//*[@id="VoQFxe"]/div[1]/div/ul/li[2]/div/div[2]/div[2]/div/div
	}
}
