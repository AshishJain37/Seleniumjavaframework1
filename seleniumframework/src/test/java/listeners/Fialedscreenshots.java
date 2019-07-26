package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Fialedscreenshots extends Maintest{
	

	public static void getscrnshot(String path) {
		System.out.println("Taking Screenshoysssssssss");
		try {
			TakesScreenshot t= (TakesScreenshot)d;
			File src= t.getScreenshotAs(OutputType.FILE);
			File des= new File("./Screnshots/"+path+".png");

			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
