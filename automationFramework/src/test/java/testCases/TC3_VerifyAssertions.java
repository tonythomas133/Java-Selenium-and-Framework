package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC3_VerifyAssertions {
	@Test
	  public void step1() {
		SoftAssert sa = new SoftAssert();
		  System.out.println("Soft Assert method started");
		  sa.assertTrue(false,"System not working as expected-SoftAssert");
		  System.out.println("Soft Assert method executed");
		  sa.assertAll(); // if you use soft assert , this command is mandatory
	  }
	
	
    @Test
      public void step2() {
    	  System.out.println("Hard Assert method started");
    	  Assert.assertFalse(true, "System not working as expected-Hard Assert");
    	  System.out.println("Hard Assert method executed"); //as line 21 fails , line 22 will not be executed as this is a hard assert
    	  

//    	  String actual = driver.element.gettext();
//    	  String expected = "Musafir";
//    	  Assert.assertEquals(actual,expected,"Page title not showing as expected");
//    	  Assert.assertNotEquals(actual,expected);

  }
  
}
