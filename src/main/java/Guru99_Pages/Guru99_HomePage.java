package Guru99_Pages;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_Utility.ConfigReader;
import Guru99_Utility.Utility_Guru99;

public class Guru99_HomePage {

	WebDriver driver;
	ConfigReader config;

	

	@FindBy(linkText = "Manager")
	WebElement manager_WE;
	
	@FindBy(linkText = "New Customer")
	WebElement newCust_WE;

	@FindBy(linkText = "Edit Customer")
	WebElement editCust_WE;
	
	public Guru99_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean homePage_titleCheck(WebDriver driver) {
		boolean result = true;

		config = new ConfigReader();
		String expectedTitle = config.getProperties("homePageTitle");
		result = Utility_Guru99.checkTitle(driver, expectedTitle);

		return result;
	}

	public boolean homePage_UICheck(WebDriver driver) {
		boolean result = true;

		ArrayList<WebElement> list = new ArrayList<>();
		Collections.addAll(list, newCust_WE, manager_WE, editCust_WE);

		for (int i = 0; i < list.size(); i++) {
			result = Utility_Guru99.checkUI(driver, list.get(i), 20);
		}
		return result;
	}
}
