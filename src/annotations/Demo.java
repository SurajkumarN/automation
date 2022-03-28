package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo {
	@Test
	public void testDemo() {
		Reporter.log("WelCome");
		Reporter.log("Welcome to testng ", true);
	}
}
