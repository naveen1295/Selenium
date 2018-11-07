package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center > h2");

	public WebElement getwebelement(By locator) {
		return driver.findElement(locator);
	}

	public String gettitle() {
		return getwebelement(title).getText();
	}

	public void clicklogin() {
		getwebelement(signin).click();
	}

}
