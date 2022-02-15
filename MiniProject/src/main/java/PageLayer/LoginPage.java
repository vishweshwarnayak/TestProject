package PageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.Base;

public class LoginPage extends Base {

	@FindBy(xpath = "//input[@name='uid']")
	WebElement userBox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passBox;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginBtn;

	// Initializing the Page Objects:
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// Action - validate Login and action on Elements
	public HomePage login22(String un, String pwd) throws IOException {
		/*
		 * Performing actions on identified objects
		 */
		userBox.sendKeys(un);
		passBox.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
