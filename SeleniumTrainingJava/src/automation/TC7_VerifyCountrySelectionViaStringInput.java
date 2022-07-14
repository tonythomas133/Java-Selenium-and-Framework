package automation;

import java.util.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC7_VerifyCountrySelectionViaStringInput {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.musafir.com/");
		List <String> countryNames = new ArrayList <String>();
		String expOutput= "India";
		
		//finding the default country in the webpage
		WebElement countryMouseOver = driver.findElement(By.xpath("//li[@class='country']/a[contains(@href, 'Default')]"));
		String countryName= countryMouseOver.getText();
		System.out.println("The default country :" + countryName);
		
		//checking is the expected output matches the actual output
		if(countryName.equals(expOutput))
			System.out.println("The default country is the same as the expected output");
		else {
			System.out.println("The default country does not match the expected output");
			System.out.println("the default country is " + countryName);
		}
		
		
		//mouse over to the flag
		WebElement countryFlag = driver.findElement(By.xpath("//li[@class='country']//a"));
		Actions act = new Actions(driver);
		act.moveToElement(countryFlag).build().perform();
		
		//listing the countries and storing those names to an arraylist
		List<WebElement> countryList = driver.findElements(By.xpath("//li[@class='country']//a"));
		System.out.println("The list of countries the website supports:\n");
		for(int i=0; i<countryList.size(); i++) 
		 countryNames.add(countryList.get(i).getText());
		System.out.println(countryNames);
		
	//	driver.manage().window().minimize();
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for UAE and 2 for Qatar");
		int a=sc.nextInt();
		
		
		
	//	driver.manage().window().maximize();
		
		*/
		//String option = countryNames.get(2);
		
		
		//changing the default country
		WebElement changeCountry = driver.findElement(By.xpath("//li[@class='country']//li/a[contains(text(),'Qatar')]"));
		act.click(changeCountry).build().perform();
		Thread.sleep(5000);
		
		//verifying the country change
		countryMouseOver = driver.findElement(By.xpath("//li[@class='country']/a[contains(@href, 'Default')] | //div[contains(@class, MarketSwitcher)] [contains(@class, 'country')]/span"));
		countryName= countryMouseOver.getText();
		System.out.println("The new default country :" + countryName);
		
		driver.quit();
		
		

	}

}
