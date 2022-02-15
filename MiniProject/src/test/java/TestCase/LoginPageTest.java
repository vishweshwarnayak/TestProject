package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageLayer.HomePage;
import PageLayer.LoginPage;
import basePackage.Base;

public class LoginPageTest extends Base {
	public LoginPage lp;
	HomePage homePage;

	// Step 1
	public LoginPageTest() throws IOException {
		super();

	}
	// Step2

	@BeforeMethod
	public void SSSetUp() throws IOException {
		/*
		 * Setting up browser and website to execute test scripts
		 */
		initialization();
		/*
		 * To access all login elements and actions we made an object of LoginPageNew
		 * class
		 */
		lp = new LoginPage();
	}

	@Test
	public void validateLoginnnn() throws IOException {

		homePage= lp.login22(prop.getProperty("username"), prop.getProperty("password"));
	}
}
