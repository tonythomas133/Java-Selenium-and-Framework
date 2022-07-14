package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC6_VerifyAllDropDownOptions_NumberOfPassengers {

	public static void main(String[] args) throws InterruptedException {
		/*
		 TC5_VeriftOneWaySelector
		1)Open Browser & Launch Musafir Application
		2)Select One Way
		3)Enter From-'Kochi, India (COK)' and To-'Mumbai, India (BOM)'
		4)Select the Date - 20 August 2022 from calendar
		5)Select number of adults, children and infant using the 3 methods
		6)Click Find Flights
		 */
			System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://in.musafir.com/");
			
			WebElement oneWayToClick = driver.findElement(By.xpath("//label[contains(text(), 'One way')]"));
			oneWayToClick.click();
			
			WebElement fromInputTxt = driver.findElement(By.xpath("//input[contains(@name, 'Origin')]"));
			fromInputTxt.sendKeys("Kochi, India(COK)");
			
			WebElement toInputTxt = driver.findElement(By.xpath("//input[contains(@name, 'Destination')]"));
			toInputTxt.sendKeys("Mumbai, India (BOM)");
			
			WebElement dateInputTxt = driver.findElement(By.xpath("//input[@name='StartDate']"));
			dateInputTxt.clear();
			dateInputTxt.sendKeys("20/08/22");
			
			WebElement numberOfAdults = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
			Select dropDown1 = new Select(numberOfAdults);
			dropDown1.selectByIndex(1); 
			
			WebElement numberOfChildren = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
			Select dropDown2 = new Select(numberOfChildren);
			dropDown2.selectByValue("4"); 
			
			WebElement numberOfInfants = driver.findElement(By.xpath("//select[@name='InfantsFlight']"));
			Select dropDown3 = new Select(numberOfInfants);
			dropDown3.selectByVisibleText("2 infants");
			
			WebElement findFlightsBttn = driver.findElement(By.xpath("//a/i[contains(text(),'Find flights')]")); 
			findFlightsBttn.click();
			Thread.sleep(5000);
			
			driver.quit();

	}

}
