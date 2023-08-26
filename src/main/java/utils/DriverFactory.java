package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.automationTestStoreRegistrationPage;
import pageObjects.automationTestStore_AddItemsToCartAndCheckOutPage;

public class DriverFactory {
	public static WebDriver driver;
	public static automationTestStoreRegistrationPage automationTestStoreRegistrationPage;
	public static automationTestStore_AddItemsToCartAndCheckOutPage automationTestStore_AddItemsToCartAndCheckOutPage;
	
	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			String filename = "/Users/raghav/eclipse-workspace/CucumberFramework/src/main/java/properties/config.properties";
			FileInputStream fi = new FileInputStream(filename);
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "chrome":
				// code
				if (null == driver) {
					//System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					//CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			
			/*/case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			

			case "ie":
				// code
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break; /*/
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			automationTestStoreRegistrationPage = PageFactory.initElements(driver, automationTestStoreRegistrationPage.class);
			automationTestStore_AddItemsToCartAndCheckOutPage = PageFactory.initElements(driver, automationTestStore_AddItemsToCartAndCheckOutPage.class);
		}
		return driver;
	}
}
