package locatorsxPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndependent_Dependent {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='testing']/../.."));
		driver.findElement(By.xpath("//a[text()='support']/../../td[5]/a"));
		driver.findElement(By.xpath("//a[text()='engineering']/../../td[4]/span"));
		driver.findElement(By.xpath("//p[text()='Ruby']/../p[2]/a"));
		driver.findElement(By.xpath("//p[text()='Python']/../p[2]/a"));
	}

}
