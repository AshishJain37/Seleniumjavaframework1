package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jdemo {
	
	public static void main(String[] args) {
		Logger log = LogManager.getLogger(Log4jdemo.class);
		System.out.println("\n**** Hello*****\n");
		log.info("This is info message");
		log.error("This is errorrrrr message");
		log.warn("This is warning");
		
		System.out.println("Completed");
		

	}

}
