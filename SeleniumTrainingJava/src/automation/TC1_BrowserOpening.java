package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_BrowserOpening {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //INTERVIEW QUESTION: why is there a difference in initiallizing the class. ans . webdriver is the interface (interface is an empty body where only declaration of functions are done: an object cannot be created of an interface)  and chromedriver is a class
		driver.get("https://in.musafir.com/");
		driver.manage().window().maximize(); //maximize the browser window
		
		
	}

}
