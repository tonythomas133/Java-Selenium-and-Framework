package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.HomePage;
import pages.SearchPage;
import utilities.ExcelUtil;

public class TC5_VerifyOneWay extends BaseClass{
	
	HomePage homePage; 
	SearchPage searchPage; //object reference
	
	@BeforeClass
	public void setup() throws IOException {
		browserInitialization();
		homePage = new HomePage();
		searchPage = new SearchPage(); //object creation
		ExcelUtil.setExcelFile(); //setting up excel test data file
		logger= report.createTest("TC5_VerifyOneWay");
	}
	
	
  @Test
  public void verify() {  
	  homePage.verifyHomePage();
  }
  
  
}
