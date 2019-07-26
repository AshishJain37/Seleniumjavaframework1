package autoIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P1 {
	
	static{
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
	}

	public static void main(String[] args) {
		a();
		

	}
	
	public static void a() {
		WebDriver d= new FirefoxDriver();
		d.get("http://demo.guru99.com/test/autoit.html");
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.findElement(By.id("input_5")).click();
	}

}
