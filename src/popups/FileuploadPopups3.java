package popups;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadPopups3 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		File f=new File("./data/Raveendra Resume (1).pdf");
		String path = f.getAbsolutePath();
		Thread.sleep(1000);
		driver.findElement(By.id("file_upload")).sendKeys(path);
		Thread.sleep(4000);
		driver.quit();
	}
}
