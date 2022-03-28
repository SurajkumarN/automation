package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser", true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void logut() {
		Reporter.log("Logut", true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer", true);
	}
	@Test
	public void modifyCustomer() {
		Reporter.log("Modify customer", true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("Delete Customer", true);
	}
}
