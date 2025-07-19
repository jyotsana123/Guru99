package Guru99_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Utility_Guru99 {
	
	static String filePath = "C://Users//jyotsana.pandey//Documents//Test Data//TestDataWorkbook.xlsx";
	static String sheetName = "TestData";
	
	public static boolean checkTitle(WebDriver driver, String expedtedTitle)
	{
		boolean result = true;
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		result = expedtedTitle.equals(actualTitle);
		
		return result;	
		
	}
	
	public static boolean checkUI(WebDriver driver, WebElement element, int timer)
	{
		boolean result = true;
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timer));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
		
	}
	
	public static String[] getLoginCredentials(String filePath, String sheetName) {
        String[] credentials = new String[2]; // [0] = user id, [1] = password
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
 
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(1);
 
            credentials[0] = row.getCell(0).getStringCellValue();
            credentials[1] = row.getCell(1).getStringCellValue(); 
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		return credentials;
    }


}
