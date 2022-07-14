
package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_VerifyFlights {

	public static void main(String[] args) throws InterruptedException {
		/*
		 TC4_VerifyFlights
1)Open Browser & Launch Musafir Application
2)Select One Way
3)Enter From-'Kochi, India (COK)' and To-'Mumbai, India (BOM)'
4)Enter date as  20/08/22
5)Click Find Flights
6)Verify Flights are listing
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
		
		WebElement findFlightsBttn = driver.findElement(By.xpath("//a/i[contains(text(),'Find flights')]")); //ORIGINAL XPATH INPUTED: //a[contains(@class, 'flightsOnly_all')]
		findFlightsBttn.click();
		Thread.sleep(5000);
		
		List<WebElement> flightList = driver.findElements(By.xpath("//div[@id='flightScreenRight']//div[contains(@class,'FlightList')][contains(@class,'flight-list')]")); //ALTERNATE //div[@id='flightScreenRight']//div[contains(@class,'FlightList')][not(contains(@class,'grouped'))]
		//ORIGINAL XPATH INPUTED ://div[contains(@class, 'list___iBtBB')]
		int count = flightList.size();
		if(count>0) {
			System.out.println("SUCCESS: Flights are listing");
			System.out.println("Number of Outputs loaded in page: " + count);
		}
		else
			System.out.println("ERROR: Flights are not listing");
		driver.quit();
	}

}
