package pages;

import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

import baseClass.BaseClass;

public class SearchPage extends BaseClass{
	public SearchPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@id='flightScreenRight']//div[contains(@class,'FlightList')][contains(@class,'flight-list')]")
	public List<WebElement> flightsListNew;
	
	public int getNumberOfFlightsListed() {
		int numberOfFlights = flightsListNew.size();
		return numberOfFlights;
	}
}
