package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9_VerifyIframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.musafir.com/");
		
		WebElement blogTab = driver.findElement(By.xpath("//li[contains(@id,'Blogs')]/a"));
		blogTab.click();
		Thread.sleep(2000);
		
		WebElement frame_contactUs = driver.findElement(By.xpath("//iframe[@id='launcher-frame']"));
		driver.switchTo().frame(frame_contactUs);
		WebElement contactUsButton = driver.findElement(By.xpath("//span[text()= 'Contact us']"));
		contactUsButton.click();
		driver.switchTo().defaultContent();
		
		WebElement frameWidget = driver.findElement(By.xpath("//iframe[@id='widget-frame']"));
		driver.switchTo().frame(frameWidget);
		Thread.sleep(2000);
		WebElement closeContactUs = driver.findElement(By.xpath("//div[contains(@class,'WidgetHeader')]//div[contains(@class,'Close')]"));
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.elementToBeClickable(closeContactUs));
		closeContactUs.click();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
//		WebElement homeLogoClickable = driver.findElement(By.xpath("//a[contains(@href,'in.musafir.com')]/img[contains(@class,'white')]"));
		WebElement homeLogoNotClickable = driver.findElement(By.xpath("//a[contains(@href,'in.musafir.com')]/img[contains(@class,'blue')]"));
//		homeLogoClickable.click();
//		homeLogoNotClickable.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", homeLogoNotClickable);
		Thread.sleep(5000);
		driver.quit();
	}

}
