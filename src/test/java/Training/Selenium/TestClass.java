package Training.Selenium;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.base;

public class TestClass extends base {

	@Test
	public void homepage() throws IOException {

		driver = initialisewebdriver();
		String url = prop.getProperty("url");
		driver.get(url);

		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);

		hp.clicklogin();
		lp.enteremailid("abc@qw.com");
		lp.enterpassword("12345");
		lp.clicklogin();
	}

	@DataProvider
	public void getdata() {

		// row is how many different data set
		// column is how many values for each data set
		Object[][] data = new Object[1][1];

	}

}
