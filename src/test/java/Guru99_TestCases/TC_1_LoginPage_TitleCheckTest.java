package Guru99_TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners({ Guru99_Utility.TestListener.class })
public class TC_1_LoginPage_TitleCheckTest extends Guru99_ParentTestCase{
  @Test
  public void loginPage_titleCheck() {
	  boolean result = obj_Guru99_LoginPage.loginPage_titleCheck(guru99_driver);
	  Assert.assertTrue(result);
	  
  }
}
