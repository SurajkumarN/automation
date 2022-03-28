package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBoxPresentInActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		boolean cb = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		System.out.println(cb);
		if(cb==true)
		{
			System.out.println("checkbox is selected and test pass");
		}
		else
		{
			System.out.println("checkbox is not selected and test fail");
		}
		driver.close();
	}

}
