package Guru99_TestCases;

import org.testng.annotations.Test;
import Guru99_Pages.Guru99_LoginPage;
import Guru99_Utility.ConfigReader;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Guru99_ParentTestCase {

	WebDriver guru99_driver;
	Guru99_LoginPage obj_Guru99_LoginPage;
	ConfigReader config;

	@BeforeMethod
	public void initTest() throws IOException {

		config = new ConfigReader();
		String browserName = config.getProperties("browser");
		if (browserName.equals("chrome")) {
			guru99_driver = new ChromeDriver();
		}

		else if (browserName.equals("edge")) {
			guru99_driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser name specified in config.properties");
		}
		guru99_driver.manage().window().maximize();

		guru99_driver.get(config.getProperties("url"));

		obj_Guru99_LoginPage = new Guru99_LoginPage(guru99_driver);
	}

	@AfterMethod
	public void tearDown() {
		guru99_driver.quit();
	}

}
