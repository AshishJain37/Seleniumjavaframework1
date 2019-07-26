package testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Desiredcapabilts {
	static WebDriver d;
	
	static{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setVersion("65.0.3325");
		d= new FirefoxDriver();
		Capabilities caps1 = ((RemoteWebDriver) d).getCapabilities();
		System.out.println("Version: "+caps1.getVersion());
		String browserName = caps1.getBrowserName();
		System.out.println("Name: "+browserName);
		
		
//		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
//		
//		
//		d.get("https://www.google.com");
//		d.findElement(By.name("q")).sendKeys("Mphasis");
//		d.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
	}

}
