package Javapoint.com.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {
	
	WebDriver driver;
	By loginSignInLink = By.id("nav-link-accountList-nav-line-1");
	By loginSignInButton =By.className("nav-action-inner");
	By loginuserName = By.id("ap_email");
	By loginPassword = By.id("ap_password");
	By loginSubmit = By.id("signInSubmit");
	By loginContinue = By.id("continue");
	By loginConfirm = By.id("glow-ingress-line1");
	
	public PageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getLoginUserName()
	{
		return driver.findElement(loginuserName);
	}
	
	public WebElement getLoginPassword()
	{
		return driver.findElement(loginPassword);
	}
	
	public WebElement getLoginSubmit()
	{
		return driver.findElement(loginSubmit);
	}
	
	public WebElement getloginSignInLink()
	{
		return driver.findElement(loginSignInLink);
	}
	
	public WebElement getLoginSignInButton()
	{
		return driver.findElement(loginSignInButton);
	}
	
	public WebElement getLoginContinue()
	{
		return driver.findElement(loginContinue);
	}
	
	public WebElement getloginConfirm()
	{
		return driver.findElement(loginConfirm);
	}


}
