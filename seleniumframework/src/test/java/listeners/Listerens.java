package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerens implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("ON Finish: "+ arg0.getName());
		
	}

	public void onStart(ITestContext arg0) {
		System.out.println("ON Start: "+ arg0.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("ON Failedpercentage: "+ "YO");
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("ON Failure: ");
		Fialedscreenshots.getscrnshot(arg0.getName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("ON Skipped: "+ arg0.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("ON TestStart: "+ arg0.getName());
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("ON TestSuccess: "+ arg0.getName());
		
	}

}
