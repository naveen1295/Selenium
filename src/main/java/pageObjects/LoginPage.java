package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By emailid = By.id("user_email");
	By password = By.cssSelector("[type='password']");
	By login = By.cssSelector("[value='Log In']");

	public WebElement getemailid() {
		return driver.findElement(emailid);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}

	public WebElement getlogin() {
		return driver.findElement(login);
	}

	public void enteremailid(String email) {
		getemailid().sendKeys(email);
	}

	public void enterpassword(String password) {
		getpassword().sendKeys(password);
	}

	public void clicklogin() {
		getlogin().click();
	}

}
