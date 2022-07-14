package automation;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2_Commands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //INTERVIEW QUESTION: why is there a difference in initiallizing the class. ans . webdriver is the interface (interface is an empty body where only declaration of functions are done: an object cannot be created of an interface)  and chromedriver is a class
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize(); //maximize the browser window
		
		String returnURL= driver.getCurrentUrl(); //this returns the current url
		String pageTitle = driver.getTitle(); //getTitle() will give us the browser tab heading
		String pageSourceCode = driver.getPageSource();//getPageSource is not used frequently
		driver.close(); //INTERVIEW QUESTION: at a time driver can have control of only one tab at a time. current tab is closed
		driver.quit(); //INTERVIEW QUESTION:close the entire browser.  
		
		//navigate command
		driver.navigate().to("https://in.musafir.com/"); //similar to driver.get
		driver.navigate().refresh(); //refresh browser window
		driver.navigate().forward(); //move forward in page instance
		driver.navigate().back(); // move backward in page instance
		
		/*
		 id
		 name
		 class -usually not unique
		 xpath  -more dependable
		 linkText
		 partialLinkText
		 CSS -cascade style sheet - rarely used
		 tagname
		 */
		WebElement elementName = driver.findElement(By.xpath("xpath value")); //WebElement is the class to be used. This will interact with the first available element and hence you are expected to use xpath that procduces a 1 of 1
		elementName.click(); //click command
		List<WebElement> offerlst = driver.findElements(By.xpath(" ")); //INTERVIEW QUESTION difference between findElement and findElements , findElements expects multiple elements
		offerlst.get(0).isDisplayed(); //
		offerlst.get(2).click();
		int count = offerlst.size();
		
		//typing text in browser
		WebElement fromLoc = driver.findElement(By.xpath(""));
		fromLoc.clear(); //considered best practice, it will make sure that if there is some text it will remove it before you type in 
		fromLoc.sendKeys("kochi, India(COK)");
		
		Thread.sleep(1000); //this will make the program wait for 1000 ms or 1 second.  you have to add throw InterruptedException to remove the error 
		
		
		boolean condition = fromLoc.isDisplayed(); //the true value will always work. in case of false it will probably not work   
		fromLoc.isEnabled(); //this checks if the element is clickable. eg: text box
		fromLoc.isSelected(); // radio button, checkbox
		
		WebElement oneWayTrvlType_Lnk;
		String elementText= oneWayTrvlType_Lnk.getText(); //will display the text in the element
		String elementTag = fromLoc.getTagName(); //rarely used, will give the tagname
		String attributeName = fromLoc.getAttribute("name");//will give the attribute value
		
		
		WebElement numberOfAdults = driver.findElement(By.xpath("//select[@name='AdultFlights'])"));
		Select dropDown = new Select(numberOfAdults);
		dropDown.selectByIndex(1); //index starts from 0  ..this is not prefered as the index is not constant and more over you have to find the index position which can be time consuming if the list is too long
		dropDown.selectByValue("4"); //take values from the value tag . the code will probably loose its context because the value field will not give an indication of what the field represents
		dropDown.selectByVisibleText("9 adults"); //the exact visible text has to be entered.. most preferred as it solves the problems of the previous 2 options
		
		List<WebElement> dropDownValues = dropDown.getOptions(); //use to get all options from a drop down
		for(int i=0; i<dropDownValues.size(); i++) {
			String dropDownText = dropDownValues.get(i).getText();
			System.out.println("Drop down values in adults: "+ dropDownText);
			
		
		//Action class
		Actions act = new Actions(driver);
		act.moveToElement(numberOfAdults).build().perform(); //mouse over
		act.click().build().perform(); //build.perform has to be used after using action class
		act.moveToElement(numberOfAdults).click().build().perform(); //single line alternative of above 2 lines
		act.click(numberOfAdults).build().perform();
		act.contextClick(numberOfAdults).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		act.doubleClick(numberOfAdults).build().perform();
		act.dragAndDrop(fromLoc, numberOfAdults).build().perform();//only works 60%
		act.clickAndHold(fromLoc).moveToElement(numberOfAdults).build().perform(); //replacement for previous line
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		
		
		//handling iframe
		driver.switchTo().frame(0); //indexing method : check ho many iframes are there and check which iframe you require , indexing starts from 0
		driver.switchTo().frame("launcher-frame"); //id
		WebElement frame_contactUs = driver.findElement(By.xpath(dropDownText)); //prefered
		//do whatever action you have to do
		driver.switchTo().defaultContent(); //this has to be used to exit the iframe
		
		//wait methods
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //only handles no such element exception   this only has to be declared once. whenever a wait is required it will call it  
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(numberOfAdults));
		 //INTERVIEW QUESTION: implicit and explicit wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

		//multiple window handling
		//when new window is opened , from selenium perspective the control is still held by old window we have to switch control using logic and use switchback to go back control to old browser window
		//INTERVIEW QUESTION: difference between getWindowHandles() and getWindowHandle()
		
		Set<String> windowIDs=driver.getWindowHandles();
		String currentWindowID = driver.getWindowHandle();
		driver.switchTo().window(currentWindowID);
		
		
//		Get the current window ID
		String parentWin =  driver.getWindowHandle();
		System.out.println(">>>>>"+parentWin);
		Thread.sleep(3000);
		WebElement dubaiAirLnk = driver.findElement(By.xpath("//a[text()='Dubai visa']"));
		dubaiAirLnk.click();
		Thread.sleep(3000);
		
//		Switch to new window
		for(String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		
		System.out.println("New page title>>>"+driver.getTitle());
		//Actions to be done
		driver.close();
//		Switch to old window using window ID
		driver.switchTo().window(parentWin);
		
		System.out.println("Old page title>>>"+driver.getTitle());
		
		driver.quit();
		
		
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		simpleAlert.dismiss();
		
		//eg
		WebElement simpleAlertBtn = driver.findElement(By.id("alertButton"));
		simpleAlertBtn.click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
//		-----------For checking Implicit Wait---------
//		WebElement oneWayTrvlType_Lnk = driver.findElement(By.xpath("//input[@id='trip_one']/following-sibling::label"));
//		oneWayTrvlType_Lnk.click();
		
		WebElement simpleTimerAlertBtn = driver.findElement(By.id("timerAlertButton"));
		simpleTimerAlertBtn.click();
//		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.alertIsPresent());
        
        
		Alert simpleTimerAlert = driver.switchTo().alert();
		simpleTimerAlert.accept();
		
		
		WebElement confirmAlertBtn = driver.findElement(By.id("confirmButton"));
		confirmAlertBtn.click();
		Alert confirmAlertAccept = driver.switchTo().alert();
		String alertText = confirmAlertAccept.getText();
		System.out.println("Confirmation alert text is>>>> " + alertText);
		confirmAlertAccept.accept();
//		confirmAlertBtn.click();
//		Alert confirmAlertDismiss = driver.switchTo().alert();
//		confirmAlertDismiss.dismiss();
		
		WebElement promptAlertBtn = driver.findElement(By.id("promtButton"));
		promptAlertBtn.click();
		Alert promptAlert = driver.switchTo().alert();
		String alertText1 = promptAlert.getText();
		System.out.println("Prompt alert text is>>>> " + alertText1);
		promptAlert.sendKeys("Test User");
		promptAlert.accept();

		driver.quit();
		
		
		
		}
		
		
		
	}

}
