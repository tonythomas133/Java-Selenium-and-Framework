package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.BaseClass;

public class HomePage extends BaseClass{
 
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//input[@id='trip_one']/following-sibling::label") 
	public WebElement oneWay;
	
	@FindBy(xpath = "//input[@name='Origin']")
	public WebElement fromLoc;
	
	@FindBy(xpath = "//input[@name='Destination']")
	public WebElement toLoc;
	
	@FindBy(xpath = "//input[@name='StartDate']")
	public WebElement startDate;
	
	@FindBy(xpath = "//div[@id='calendar']//h3")
	public WebElement curMnthYr;
	
	@FindBy(xpath = "//select[@name='AdultsFlight']")
	public WebElement numberOfAdults;
	
	@FindBy(xpath = "//div[@id='calendar']//a[@class='forward']")
	public WebElement forwardOption_Calendar;
		
	
	@FindBy(xpath = "//a/i[contains(text(),'Find flights')]")
	public WebElement findFlights;
	
	
	public void clickOneWay() {
		oneWay.click();
	}
	
	public void enterSourceAndDestination(String source, String destination)  {
		fromLoc.clear();
		fromLoc.sendKeys(source);
		toLoc.clear();
		toLoc.sendKeys(destination);
	}
	
	public void selectTravelDate(String monthYear, String day) throws InterruptedException {
		startDate.click();
		Thread.sleep(2000);
//		System.out.println("Current Month & Year.." + curMnthYr.getText());
		if (!curMnthYr.getText().contentEquals(monthYear)) {
			do {
				forwardOption_Calendar.click();
			} while (!curMnthYr.getText().contentEquals(monthYear));
		}
		
		WebElement dateSel = getDriver().findElement(By.xpath("//li[contains(text(),'"+day+"')]"));
		dateSel.click();
	}
	
	public void clickFindFlight() throws InterruptedException  {
		findFlights.click();
	}
	public void verifyHomePage() {
		Assert.assertTrue(oneWay.isDisplayed());
	}
}
