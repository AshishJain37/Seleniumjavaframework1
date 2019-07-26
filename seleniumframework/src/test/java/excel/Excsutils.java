package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excsutils {
	static WebDriver d;

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"./Driver/geckodriver.exe");
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com");
		
		Exclbase ex= new Exclbase(path+"/Excl/excldata.xlsx", "Sheet1");
		d.findElement(By.name(Exclbase.getcelldataString(0,1))).sendKeys("Mphasis");
		d.findElement(By.xpath("(//input[@name=\"btnK\"])[2]")).click();
		System.out.println(Exclbase.getrowcount());
		System.out.println(Exclbase.getcoloumcount());

	}
	
	
	 
	

}
