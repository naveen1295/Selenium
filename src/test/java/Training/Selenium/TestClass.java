package Training.Selenium;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.base;

public class TestClass extends base {

	@Test(dataProvider = "getData")
	public void homepage(String username, String password) throws IOException {

		driver = initialisewebdriver();
		String url = prop.getProperty("url");
		driver.get(url);

		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);

		hp.clicklogin();
		lp.enteremailid(username);
		lp.enterpassword(password);
		lp.clicklogin();

		driver.close();
	}

	@DataProvider
	public Object[][] getData() {

		// row is how many different data set
		// column is how many values for each data set
		Object[][] data = new Object[2][2];

		data[0][0] = "abc@abc.com";
		data[0][1] = "1234";

		data[1][0] = "abc1@abc.com";
		data[1][1] = "12334";

		return data;
	}

}
