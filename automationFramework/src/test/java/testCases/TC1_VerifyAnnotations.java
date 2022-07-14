package testCases;

import org.testng .annotations.Test;

import baseClass.BaseClass;

public class TC1_VerifyAnnotations extends BaseClass {
  @Test(priority = 0)
  public void step1() {
	  System.out.println("This is step 1 off TC1");
  }
 
  @Test(priority = 1)
  public void step2() {
	  System.out.println("This is step 2 off TC1");
  }
}
