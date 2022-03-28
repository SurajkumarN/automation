package popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileuploadPopups {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/cvupload.html");
		Thread.sleep(2000);
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\HP\\Desktop\\New folder\\cv.docx");
		Thread.sleep(4000);
		driver.close();
	}
}
