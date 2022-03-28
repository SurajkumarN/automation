package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule0 {
	
	@Test(priority = 1)
	public void createCustomer() {
		Reporter.log("createCustome",true);
	}
	@Test(priority = 2, dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifycustomer",true);
	}
	@Test(priority = 0, dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deletecustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
