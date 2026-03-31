package Guru99_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Guru99_Utility.ScreenshotUtils;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		Object testClass = result.getInstance();
		WebDriver driver = ((Guru99_ParentTestCase) testClass).guru99_driver;

		String testName = result.getMethod().getMethodName();

		try {
			ScreenshotUtils.captureScreenshot(driver, testName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Screenshot captured for failed test: " + testName);
	}
}
