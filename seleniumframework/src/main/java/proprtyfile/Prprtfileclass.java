package proprtyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Prprtfileclass {
	
	static WebDriver d;
	static Properties prop;
	
	public static void getProperty() throws IOException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",path+"/Driver/geckodriver.exe");
		 prop = new Properties();
		System.out.println(path);
		FileInputStream input= new FileInputStream(path+"/src/main/java/proprtyfile/config.properties");
        prop.load(input);
		
	}

	public static void main(String[] args) throws IOException {
		
		Prprtfileclass.getProperty();
		d=new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		
        d.findElement(By.name(prop.getProperty("textbox"))).sendKeys("Mphasis");
        d.findElement(By.xpath(prop.getProperty("googlesearch"))).click();
	}

}
