package seleniumframework;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsertest {
	
	

	public static void main(String[] args) {
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\jaashish\\eclipse-workspace\\seleniumframework\\Driver\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriver d= new ChromeDriver();
		WebDriver d= new FirefoxDriver();
        d.get("https://www.seleniumhq.org/download/");
	}

}
