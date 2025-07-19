package Guru99_TestCases;

import org.testng.annotations.Test;

import Guru99_Pages.Guru99_LoginPage;

public class TC_2_LoginPage_UICheckTest extends Guru99_ParentTestCase {
  @Test
  public void loginPage_UICheck() {
	  obj_Guru99_LoginPage.loginPage_UICheck(guru99_driver);
  }
}
