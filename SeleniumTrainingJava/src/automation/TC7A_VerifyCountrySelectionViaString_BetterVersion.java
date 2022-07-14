package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC7A_VerifyCountrySelectionViaString_BetterVersion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL_UAE = "https://www.musafir.com/";
		String baseURL_India = "https://in.musafir.com/";
		String baseURL_Qatar = "https://qa.musafir.com/";
		driver.get(baseURL_Qatar);
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement defaultCountry = driver.findElement(By.xpath(
				"//li[@class='country']/a[contains(@href,'Default')] | //header[@id='pageHeader']//div[contains(@class,'country')]/span"));
		String defCountryText = defaultCountry.getText();
		String expDefCountry = "Qatar";
		Thread.sleep(1000);
		WebElement countryOption = driver.findElement(By.xpath(
				"//li[@class='country'] | //*[contains(@class,'MarketSwitcher')][contains(@class,'country')]"));
		
		if (defCountryText.equals(expDefCountry)) {
			System.out.println("Default country is " + expDefCountry + " as expected.");
		} else {
			System.out.println("Default country is not " + expDefCountry + ". Selecting " + expDefCountry + "...");
		
			if (defCountryText.equals("Qatar")) {
				act.moveToElement(countryOption).click().build().perform();
			} else {
				act.moveToElement(countryOption).build().perform();
			}
			WebElement countryToSelect = driver.findElement(By.xpath("//a[text()='" + expDefCountry
					+ "'] | //*[contains(@class,'MarketSwitcher')][contains(@class,'list')]//span[text()='"
					+ expDefCountry + "']"));
			//a[text()='India'] | //*[contains(@class,'MarketSwitcher')][contains(@class,'list')]//span[text()='India']
			
			Thread.sleep(5000);
			countryToSelect.click();
			Thread.sleep(1000);

//			Use try catch or xpath

//			String defaultCountryAfterSelText = null;
//			try {
//				WebElement defaultCountryAfterSel = driver.findElement(By.xpath("//li[@class='country']/a[contains(@href,'Default')]"));
//				defaultCountryAfterSelText = defaultCountryAfterSel.getText();
//				
//			}catch (NoSuchElementException ex) {
//				// TODO: handle exception
//				WebElement defaultCountryAfterSel = driver.findElement(By.xpath("//header[@id='pageHeader']//div[contains(@class,'country')]/span"));
//				defaultCountryAfterSelText = defaultCountryAfterSel.getText();
//			}

			WebElement defaultCountryAfterSel = driver.findElement(By.xpath(
					"//li[@class='country']/a[contains(@href,'Default')] | //header[@id='pageHeader']//div[contains(@class,'country')]/span"));
			String defaultCountryAfterSelText = defaultCountryAfterSel.getText();
			if (defaultCountryAfterSelText.equals(expDefCountry)) {
				System.out.println("Country Changed to " + expDefCountry + " as expected");

			} else {
				System.out.println("Country not changed even after selecting the expected");

			}
		}

		driver.quit();

	}

}
