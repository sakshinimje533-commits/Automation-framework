package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{   //ITestListener inheritance ahe tyachya kde methods ahe onTestStart,onTestSucess,etc.
	
	@Override
	public void onTestStart(ITestResult result) { //ITestResult result - object ahe
		Reporter.log("TC " +result.getName()+" execution started", true); // te ithe use kel result
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("TC " +result.getName()+" Completed Successfully", true);	
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TC " +result.getName()+" failed", true);	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("TC " +result.getName()+" skipped", true);	
	}

}
