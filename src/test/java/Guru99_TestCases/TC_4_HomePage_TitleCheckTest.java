package Guru99_TestCases;

import java.io.IOException;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_Pages.Guru99_HomePage;
import Guru99_Utility.JsonDataProvider;

public class TC_4_HomePage_TitleCheckTest extends Guru99_ParentTestCase{
  @Test(dataProvider="jsonData", dataProviderClass=JsonDataProvider.class)
  public void homePage_titleCheck(JSONObject data) throws IOException {
	  Guru99_HomePage obj_Guru99_HomePage = obj_Guru99_LoginPage.loginPage_Loginfunctionality(data.getString("User ID"), data.getString("Password"));
		 boolean result =  obj_Guru99_HomePage.homePage_titleCheck(guru99_driver);
		 Assert.assertTrue(result);
  }
}
