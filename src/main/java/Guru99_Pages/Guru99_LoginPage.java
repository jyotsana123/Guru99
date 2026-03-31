package Guru99_Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_Utility.ConfigReader;
import Guru99_Utility.Utility_Guru99;

public class Guru99_LoginPage {

	WebDriver driver;
	ConfigReader config;

	@FindBy(name = "uid")
	WebElement userId_WE;

	@FindBy(name = "password")
	WebElement password_WE;

	@FindBy(name = "btnLogin")
	WebElement loginButton_WE;

	@FindBy(name = "btnReset")
	WebElement resetbutton_WE;

	@FindBy(linkText = "here")
	WebElement here_WE;
	
	public Guru99_LoginPage(WebDriver driverb) {
		this.driver = driverb;
		PageFactory.initElements(driver, this);
	}

	

/*	public Guru99_HomePage loginPage_Loginfunctionality() throws IOException {
		// Read credentials from Excel
		String[] credentials = Utility_Guru99
				.getLoginCredentials("C://Users//jyotsana.pandey//Documents//Test Data//TestDataWorkbook.xlsx", "TestData");
		String userId = credentials[0];
		String password = credentials[1];

		userId_WE.sendKeys(userId);
		password_WE.sendKeys(password);
		loginButton_WE.click();
		Guru99_HomePage obj_Guru99_HomePage = new Guru99_HomePage(driver);
		// Guru99_HomePage obj_Guru99_HomePage = PageFactory.initElements(driver,
		// Guru99_HomePage.class);
		return obj_Guru99_HomePage;
	} */
	
	public Guru99_HomePage loginPage_Loginfunctionality(String userId, String password) throws IOException {
		// Read credentials from Excel
//		String[] credentials = Utility_Guru99
//				.getLoginCredentials("C://Users//jyotsana.pandey//Documents//Test Data//TestDataWorkbook.xlsx", "TestData");
//		String userId = credentials[0];
//		String password = credentials[1];

		userId_WE.sendKeys(userId);
		password_WE.sendKeys(password);
		loginButton_WE.click();
		Guru99_HomePage obj_Guru99_HomePage = new Guru99_HomePage(driver);
		// Guru99_HomePage obj_Guru99_HomePage = PageFactory.initElements(driver,
		// Guru99_HomePage.class);
		return obj_Guru99_HomePage;
	}

	public boolean loginPage_titleCheck(WebDriver driver) {
		boolean result = true;

		config = new ConfigReader();
		String expectedTitle = config.getProperties("loginPageTitle");
		result = Utility_Guru99.checkTitle(driver, expectedTitle);

		return result;
	}

	public boolean loginPage_UICheck(WebDriver driver) {
		boolean result = true;

		ArrayList<WebElement> list = new ArrayList<>();
		Collections.addAll(list, userId_WE, password_WE, loginButton_WE, resetbutton_WE, here_WE);

		for (int i = 0; i < list.size(); i++) {
			result = Utility_Guru99.checkUI(driver, list.get(i), 20);
		}
		return result;
	}

}
