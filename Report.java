package Javapoint.com.Cucumber;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	
	public static ExtentReports getReport()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\rmsha\\eclipse\\java-2021-06\\eclipse\\Index.html");
		reporter.config().setReportName("Amazon Order Project");
		reporter.config().setDocumentTitle("Automation Testing");
	
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "SHAN");
		extent.setSystemInfo("Environment", "QV");
		extent.setSystemInfo("TestType", "SIT");
		return extent;
		
	}

}
