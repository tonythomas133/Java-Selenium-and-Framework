package testCases;

import org.testng.annotations.Test;

import baseClass.BaseClass;

public class TC2_VerifyAnnotation extends BaseClass{
	@Test
	  public void step1() {
		  System.out.println("This is step 1 off TC2");
	  }
	 
	  @Test
	  public void step2() {
		  System.out.println("This is step 2 off TC2");
	  }
}
