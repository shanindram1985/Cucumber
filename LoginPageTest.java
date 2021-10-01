package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Javapoint.com.Cucumber.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.annotations.DataProvider;

@Listeners (Javapoint.com.Cucumber.Listener.class)
public class LoginPageTest {
	
	WebDriver driver = null;
	PageObject element = null;
	

	@BeforeTest
	public void preques()
	{
		System.out.println("preques");
	}
	
	@Test
	public void prequestt()
	{
		System.out.println("preques");
	}
	
	@Given("^the user on the user registration page$")
	public void browserCall()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmsha\\eclipse\\java-2021-06\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
	}
	
	@Given("^the user on the user registration$")
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmsha\\eclipse\\java-2021-06\\eclipse\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Assert.assertTrue(driver.getTitle().contains("Amazon0111"));
	}
	
	@When("^user enter invalid data on the page$")  
	public void loginPage()
	{
		element = new PageObject(driver);
		Actions action = new Actions(driver);
		action.moveToElement(element.getloginSignInLink()).build().perform();
		element.getLoginSignInButton().click();
		element.getLoginUserName().sendKeys("rmshanmuganathan@gmail.com");
		element.getLoginContinue().click();
		element.getLoginPassword().sendKeys("Sujitha@2");
		element.getLoginSubmit().click();
		Assert.assertTrue(element.getloginConfirm().getText().contains("Shan"));
		
	}
	

	@Then("^the user registration should be successful$") 
	public void orderItems()
	{
		
	}
	
	@After public void prequest()
	{
		System.out.println("prequest");
	}

}
