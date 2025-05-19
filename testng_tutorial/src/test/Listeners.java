package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestListener is a Interface which implements testng listeners
public class Listeners implements ITestListener
{
	@Override
    public void onTestStart(ITestResult result) {
        
    }

    @Override
    public void onTestSuccess(ITestResult result) {
//        System.out.println("test successfully executed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	// Used in case to capture the screenshot or Api response if failed
    	
    	  System.out.println("failed test " + result.getName()+ " method");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        
    }

    @Override
    public void onStart(ITestContext context) {
        
    }

    @Override
    public void onFinish(ITestContext context) {
        
    }

}
