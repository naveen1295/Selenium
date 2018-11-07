package Training.Selenium;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;

public class ValidateTitle extends base {
	@Test()
	public void homepage() throws IOException {

		driver = initialisewebdriver();
		String url = prop.getProperty("url");
		driver.get(url);

		HomePage hp = new HomePage(driver);
		Assert.assertEquals(hp.gettitle(), "FEATURED COURSES");

		driver.close();
	}
}
