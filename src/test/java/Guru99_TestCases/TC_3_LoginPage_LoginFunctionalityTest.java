package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Guru99_Pages.Guru99_HomePage;

public class TC_3_LoginPage_LoginFunctionalityTest extends Guru99_ParentTestCase{
  @Test
  public void loginFunctionality() throws IOException {
	  Guru99_HomePage obj_Guru99_HomePage = obj_Guru99_LoginPage.loginPage_Loginfunctionality();
	  boolean result = obj_Guru99_HomePage.homePage_titleCheck(guru99_driver);
	  Assert.assertTrue(result);
  }
}
