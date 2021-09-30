package Javapoint.com.Cucumber;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener implements ITestListener {
	
	ExtentReports extent = Report.getReport();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult Result)
	{
		test = extent.createTest(Result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSuccess(ITestResult  Result)
	{
		test.pass("Cucumber Test Case Passed Successfully");
		test.log(Status.PASS, "SUCCESS");
		extent.flush();
	}
	
	@Override 
	public void onTestFailure(ITestResult Resut)
	{
		test.pass("Test Case Passed Successfully");
		test.log(Status.FAIL, "FAIL");
		extent.flush();
	}

}
