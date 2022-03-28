package handlingListBox;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignFromUserInputSearchOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/HP/Desktop/New%20folder/multilistbox.html");
		WebElement mtrlist = driver.findElement(By.id("mtr"));
		System.out.println("Enter the options which you want to search");
		Scanner sc=new Scanner(System.in);
		String expectedoption = sc.nextLine();
		
		Select s=new Select(mtrlist);
		List<WebElement> allops = s.getOptions();
		int counter = 0;
		int count=allops.size();
		for(int i=0; i<count;i++) {
			String actualOption = allops.get(i).getText();
			if (expectedoption.equalsIgnoreCase(actualOption)) {
				counter++;
			}
		}
		if(counter==0){
			System.out.println(expectedoption+" item is not present");
		}
		else if(counter==1){
			System.out.println(expectedoption+" item is present");
		}
		else if (counter>1) {
			System.out.println(expectedoption+" item is present with duplicate");
		}
		driver.close();
	}
}
