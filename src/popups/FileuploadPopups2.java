package popups;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadPopups2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/cvupload.html");
		Thread.sleep(2000);
		File f=new File("./data/cv.docx");
		String abslpath = f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("cv")).sendKeys(abslpath);
		//Thread.sleep(4000);
		//driver.close();
	}
}
