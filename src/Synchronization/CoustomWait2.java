package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoustomWait2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[.='Login ']")).click();
		
		for(int i=0;i<100; i++) {
			try {
				d.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(NoSuchElementException e) {
				System.out.println("NoSuchelementException");
			}
		System.out.println(i);
		d.close();
		}
	}
}
