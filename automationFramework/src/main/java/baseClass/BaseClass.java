package baseClass;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>(); //this makes the driver variable accessible throughout the framework. declaring it as ThreadLocal<RemoteDriver> enables thread execution or parallel execution
	
	//reporting using ExtentReport
	public static ExtentReports report;
	public static ExtentTest logger; //to write to report
	public static ExtentHtmlReporter extent;
	
	public void setDriver(RemoteWebDriver driverValue) {
		driver.set(driverValue); //setter, to set the value
	}

	public RemoteWebDriver getDriver() {
		return driver.get(); //getter, to get the value
	}
	
	
	public void browserInitialization() {
		WebDriverManager.chromedriver().setup(); //WebDriverManager replaces the setProperty step and also avoid the step of downloading the required browser driver. WebDriverManager accesses the pom.xml file where we have already added the dependancies for the maven project
		setDriver(new ChromeDriver()); 
		getDriver();
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		String url = "https://in.musafir.com/";
		getDriver().get(url);
	}
	
	@AfterClass
	public void terminateBrowser() {
		getDriver().quit();
	}
	
	@BeforeSuite
	public void reportSetUp() 
	{
		//For creating folder and html
		extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/ExtentSelenium.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}	
	public String captureScreenshot() throws Exception {
		Date date = new Date();
		String timestamp = "IMG"+date.getTime();
		String fileWithPath = System.getProperty("user.dir") + 
				"\\screenshots\\" + timestamp + ".png";  //screenshots folder has to be created manually
		TakesScreenshot scrShot = ((TakesScreenshot)getDriver());  //TakesScreenshot is selenium capability for taking screenshot 
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE); //File is java.io capability 
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
		return fileWithPath;
	}
	@AfterMethod
	public void stepStatus(ITestResult result) { //ITestResult is a listener that listens the status of each @Test
		
		if (result.getStatus() == ITestResult.FAILURE)
		{
			try {
				logger.fail("FAILED: "+result.getName(),MediaEntityBuilder.createScreenCaptureFromPath(captureScreenshot()).build()); //result.getName() will display the function name. MediaEntityBuilder is used to attach the screenshot
				logger.fail("Reason for Failure:"+result.getThrowable());
			} catch (Exception e) {
			}
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			try {
				logger.pass("PASSED: "+result.getName());
			} catch (Exception e) {
			}
		}
		else if(result.getStatus() == ITestResult.SKIP)
		{
			try {
				logger.skip("SKIPPED: "+result.getName());
			} catch (Exception e) {
			}
		}
		report.flush(); //clears the data in report
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	  @BeforeMethod
//	  public void beforeMethod() {
//		 System.out.println("This will execute before every test Method");
//	  }
//
//	  @AfterMethod
//	  public void afterMethod() {
//		  System.out.println("This will execute after every test Method");
//	  }
//
//	  @BeforeClass
//	  public void beforeClass() {
//		  System.out.println("This will execute before the TestNG Class");
//	  }
//
//	  @AfterClass
//	  public void afterClass() {
//		  System.out.println("This will execute after the TestNG Class");
//	  }
//
//	  @BeforeTest
//	  public void beforeTest() {
//		  System.out.println("This will execute before the first Test");
//	  }
//
//	  @AfterTest
//	  public void afterTest() {
//		  System.out.println("This will execute after the last Test");
//	  }
//
//	  @BeforeSuite
//	  public void beforeSuite() {
//		  System.out.println("This will execute before the Test Suite");
//	  }
//
//	  @AfterSuite
//	  public void afterSuite() {
//		  System.out.println("This will execute after the Test Suite");
//	  }

	

}
