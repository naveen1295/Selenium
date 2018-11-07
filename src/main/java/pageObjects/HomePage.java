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

	public WebElement loginlink() {
		return driver.findElement(signin);
	}

	public void clicklogin() {
		loginlink().click();
	}

}
