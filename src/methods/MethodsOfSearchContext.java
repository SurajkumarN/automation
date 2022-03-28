package methods;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfSearchContext {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		SearchContext sc=new ChromeDriver();
		sc.findElement(null);
		sc.findElements(null);
	}
}
