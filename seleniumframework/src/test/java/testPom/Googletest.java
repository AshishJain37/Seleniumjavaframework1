package testPom;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectsrepo.*;

public class Googletest {
	
	static WebDriver d;
	
	static{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		WebDriverManager.chromedriver().setup();
		 d= new FirefoxDriver();
		test.log(Status.INFO, "Starting test case");
		d.get("https://www.google.com/");
		test.pass("Navigated to google.com");
		GoogleLogin.textbox(d).sendKeys("Mphasis");
		test.pass("Entered text in search box");
		d.close();
		d.quit();
		test.pass("Browser closed");
		test.info("Test completed");
		extent.flush();
		
		
		
		//r.textbox1("Mphasis");
		

	}

}
