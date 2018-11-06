package Training.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initialisewebdriver() throws IOException {

		String usrdir = System.getProperty("user.dir");
		prop = new Properties();
		FileInputStream datafile = new FileInputStream(
				usrdir + "\\src\\main\\java\\Training\\Selenium\\data.properties");
		prop.load(datafile);

		String broswer = prop.getProperty("browser");

		if (broswer.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", usrdir + "\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (broswer.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", usrdir + "\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (broswer.equals("IE")) {
			System.setProperty("webdriver.edge.driver", usrdir + "\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}

		return driver;
	}

}
