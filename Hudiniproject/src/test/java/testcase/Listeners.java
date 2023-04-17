package testcase;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
	// we are using listener for if test case is skipped or failure this methods will called automatically
	public void onTestStart(ITestResult tr)
	{
		System.out.println("start");
	}
	
	
	public void onTestSkip(ITestResult tr)
	{
		System.out.println("Skipped");
	}
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("success");
	}
	public void onTestfailure(ITestResult tr)
	{
		System.out.println("failure");
	}
	
}
