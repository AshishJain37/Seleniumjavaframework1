package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Multiplebrowsers {
	private WebDriver d;
	
	@Parameters("browsername")
	@BeforeTest
	void setup(String brsname){
		
		if(brsname.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			d=new ChromeDriver();
		}
		if(brsname.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			d= new FirefoxDriver();
		}
		if(brsname.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			d= new InternetExplorerDriver();
		}
		
	}
	
	@Test
	public void tst1() {
		d.get("https://www.google.com");	
		
	}
	
	@AfterTest
	public void close() {
		d.close();
		System.out.println("Test successful");
	}

}
