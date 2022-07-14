package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8_VerifyFlightDateFromCalender {

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
		dateInputTxt.click();
		Thread.sleep(2000);
		WebElement monthForward = driver.findElement(By.xpath("//a[@class='forward']"));
		monthForward.click();
		monthForward.click();
		WebElement dateForward = driver.findElement(By.xpath("//ul[contains(@calendarmonth, 'Aug')]//li[text()=28]"));
		dateForward.click();
		
		
		WebElement findFlightsBttn = driver.findElement(By.xpath("//a/i[contains(text(),'Find flights')]")); 
		findFlightsBttn.click();
		Thread.sleep(5000);
		
		WebElement verifyDate = driver.findElement(By.xpath("//span[text()= '28 Aug']"));
		boolean condition = verifyDate.isDisplayed();
		System.out.println("The date 28 aug was accurately selected: " + condition);
		
		
		List<WebElement> flightList = driver.findElements(By.xpath("//div[@id='flightScreenRight']//div[contains(@class,'FlightList')][contains(@class,'flight-list')]")); 
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
