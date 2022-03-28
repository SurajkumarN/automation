package qsp;
//instead of close using quit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.naukri.com/");
		driver.navigate().back();
		driver.close();//use to close the current browser
		driver.quit();//is used to close all the browser
		
	}

}
