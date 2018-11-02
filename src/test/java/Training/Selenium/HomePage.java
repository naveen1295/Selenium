package Training.Selenium;

import java.io.IOException;

import org.testng.annotations.*;

public class HomePage extends base {


	@Test
	public void homepage() throws IOException {
		
		driver = initialisewebdriver();
		String url = prop.getProperty("url");
		driver.get(url);
	}
	
	

}
