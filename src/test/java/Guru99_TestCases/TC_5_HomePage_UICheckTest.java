package Guru99_TestCases;

import java.io.IOException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_Pages.Guru99_HomePage;
import Guru99_Utility.JsonDataProvider;

public class TC_5_HomePage_UICheckTest extends Guru99_ParentTestCase {
  @Test(dataProvider="jsonData", dataProviderClass=JsonDataProvider.class)
  public void homePage_UICheck(JSONObject data) throws IOException {
	  Guru99_HomePage obj_Guru99_HomePage = obj_Guru99_LoginPage.loginPage_Loginfunctionality(data.getString("User ID"), data.getString("Password"));
	 boolean result =  obj_Guru99_HomePage.homePage_UICheck(guru99_driver);
	 Assert.assertTrue(result);
  }
}
