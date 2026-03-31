package Guru99_TestCases;

import java.io.IOException;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import Guru99_Pages.Guru99_HomePage;
import Guru99_Utility.JsonDataProvider;

public class TC_3_LoginPage_LoginFunctionalityTest extends Guru99_ParentTestCase{
  @Test(dataProvider="jsonData", dataProviderClass=JsonDataProvider.class)
  public void loginFunctionality(JSONObject data) throws IOException {
	  Guru99_HomePage obj_Guru99_HomePage = obj_Guru99_LoginPage.loginPage_Loginfunctionality(data.getString("User ID"), data.getString("Password"));
	  boolean result = obj_Guru99_HomePage.homePage_titleCheck(guru99_driver);
	  Assert.assertTrue(result);
  }
}
