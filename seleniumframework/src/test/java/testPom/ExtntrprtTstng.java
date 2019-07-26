package testPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import objectsrepo.GoogleLogin;

public class ExtntrprtTstng {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver d;
	
	// POM+------Testng-----+-------Extentreport
	
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extnTestng.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);}
		
	@BeforeTest
	public void a1() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectpath+"/Driver/geckodriver.exe");
			
	}
	@Test
	public void a2() {
		test = extent.createTest("MyFirstTest", "Sample description");
		d= new FirefoxDriver();
		test.log(Status.INFO, "Starting test case 1");
		d.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		
		// POM
		GoogleLogin.textbox(d).sendKeys("Mphasis");
		test.pass("Entered text in search box");

	}
	
	@Test
	public void a5() {
		test = extent.createTest("MySecondTest", "Sample description");
		d= new FirefoxDriver();
		test.log(Status.INFO, "Starting test case 2");
		d.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		GoogleLogin.textbox(d).sendKeys("Mphasis");
		test.fail("Entered text failed in search box");

	}
	@AfterMethod
	public void a3() {
		d.quit();
		test.pass("Test completed");
		test.info("Test completed");
		
	}
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
}
