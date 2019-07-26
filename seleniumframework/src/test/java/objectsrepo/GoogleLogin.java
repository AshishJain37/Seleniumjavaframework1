package objectsrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLogin {


	

	public static WebElement key(WebDriver d) {
		return d.findElement(By.xpath("//input[@type=\"submit\"][3]"));
		
	}

	public static WebElement textbox(WebDriver d) {
		// TODO Auto-generated method stub
		return d.findElement(By.name("q"));
		
	}
	


}
