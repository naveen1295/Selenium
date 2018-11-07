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
	By passwrd = By.cssSelector("[type='password']");
	By login = By.cssSelector("[value='Log In']");

	public WebElement getwebelement(By locator) {
		return driver.findElement(locator);
	}

	public void enteremailid(String email) {
		getwebelement(emailid).sendKeys(email);
	}

	public void enterpassword(String password) {
		getwebelement(passwrd).sendKeys(password);
	}

	public void clicklogin() {
		getwebelement(login).click();
	}

}
