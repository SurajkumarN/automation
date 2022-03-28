package findElementsBy;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromUserInputFindCheckBox {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the url");
		String url = sc.nextLine();
		driver.get(url);
		
		List<WebElement> d1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int c = d1.size();
		System.out.println(c);
		
		driver.close();
	}

}
