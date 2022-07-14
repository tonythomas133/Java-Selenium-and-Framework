package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_VerifyPageSourceLength {

	public static void main(String[] args) {
		/*
		 1)Launch Chrome browser
2)Open musafir.com
3)get title & length
4)Verify pagesource length is greater than 1000
5)close the browser
		 */
		System.setProperty("webdriver.chrome.driver", "F:\\selenium training\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.musafir.com/");
		String pageSourceCode = driver.getPageSource();
		String pageTitle = driver.getTitle();
		System.out.println("the title :" + pageTitle);
		System.out.println("The length of title :" + pageTitle.length());
		if(pageSourceCode.length() >1000)
			System.out.println("The pageSource is longer than 1000");
		else
			System.out.println("The pageSource is less than 1000");
		driver.quit();
	}

}
