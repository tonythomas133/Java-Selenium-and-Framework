package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pages.HomePage;
import pages.SearchPage;
import utilities.ExcelUtil;

public class TC4_VerifyFlightsListed extends BaseClass{
	
	HomePage homePage; 
	SearchPage searchPage; //object reference
	
	@BeforeClass
	public void setup() throws IOException {
		browserInitialization();
		homePage = new HomePage();
		searchPage = new SearchPage(); //object creation
		ExcelUtil.setExcelFile(); //setting up excel test data file
		logger= report.createTest("TC4_VerifyFlightsListed");
	}
	
	
  @Test
  public void selectTravelType() {  
	  homePage.clickOneWay();
  }
  
  @Test(dependsOnMethods = "selectTravelType")
  public void userEnterTravelDetails() throws InterruptedException {
	  homePage.enterSourceAndDestination(ExcelUtil.getCellData(1, 1), ExcelUtil.getCellData(1, 2));
	  homePage.selectTravelDate(ExcelUtil.getCellData(1, 3), ExcelUtil.getCellData(1, 4));
  }
  
  @Test(dependsOnMethods = "userEnterTravelDetails")
  public void clickFindFlights() throws InterruptedException {
	  homePage.clickFindFlight();
  }
  
  @Test(dependsOnMethods = "clickFindFlights")
  public void verifyFlightsListed() {
	  int flightCount=searchPage.getNumberOfFlightsListed();
	  Assert.assertTrue(flightCount>0, "flights are not listing as expected");
  }
}
