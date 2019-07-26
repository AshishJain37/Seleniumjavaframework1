package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import junit.framework.Assert;


//@Listeners(listeners.Listerens.class)
public class ListernsTest extends Maintest {
	

	@BeforeTest
	public void a() {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	@Test
	public void test1() {
		System.out.println("Inside test1");
	}
	@Test
	public void test2() {
		d= new FirefoxDriver();
		d.get("https://www.seleniumhq.org/");
		String f=d.getTitle();
		Assert.assertEquals(f, "abc");
		
	}
	@Test
	public void test3() {
		d= new FirefoxDriver();
		d.get("https://www.google.com/");
		String f=d.getTitle();
		Assert.assertEquals(f, "abc");


}
}
