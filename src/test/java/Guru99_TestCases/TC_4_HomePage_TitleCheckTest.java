package Guru99_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Guru99_Pages.Guru99_HomePage;

public class TC_4_HomePage_TitleCheckTest extends Guru99_ParentTestCase{
  @Test
  public void homePage_titleCheck() throws IOException {
	  Guru99_HomePage obj_Guru99_HomePage = obj_Guru99_LoginPage.loginPage_Loginfunctionality();
		 boolean result =  obj_Guru99_HomePage.homePage_titleCheck(guru99_driver);
		 Assert.assertTrue(result);
  }
}
