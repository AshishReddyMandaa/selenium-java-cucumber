package com.cucumberFramework.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumberFramework.enums.Browsers;
import com.cucumberFramework.enums.OS;


public class TestBase {

	public  static WebDriver driver;

	
	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase(Browsers.EDGE.name())) {
				System.setProperty("webdriver.edge.verboseLogging", System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase(Browsers.EDGE.name())) {
				System.setProperty("webdriver.edge.verboseLogging", System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver");
				driver = new EdgeDriver();
			}
		}
		return driver;
	}
}
