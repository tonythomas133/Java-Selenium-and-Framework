package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_VeriftOneWaySelector {

	public static void main(String[] args) throws InterruptedException {
	/*
	 TC5_VeriftOneWaySelector
	1)Open Browser & Launch Musafir Application
	2)Select One Way
	3)Enter From-'Kochi, India (COK)' and To-'Mumbai, India (BOM)'
	4)Select the Date - 20 August 2022 from calendar
	5)Click Find Flights
	6)Click on Change button
	7)Verify One Way is selected
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
		
		WebElement findFlightsBttn = driver.findElement(By.xpath("//a/i[contains(text(),'Find flights')]")); 
		findFlightsBttn.click();
		Thread.sleep(5000);
		
		WebElement changeBttn = driver.findElement(By.xpath("//span[text()= 'Change']"));
		changeBttn.click();
		Thread.sleep(2000);
		
		WebElement onewayRadioBttn = driver.findElement(By.xpath("//input[@id= 'tripType_oneWay']"));
		System.out.println("Oneway radio button selection is " + onewayRadioBttn.isSelected());
		driver.quit();
	}

}
