package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcase.TestScript;

public class SignInPageClient {
	
	
	public WebDriver driver1;
	
	public SignInPageClient(WebDriver rdriver)
	{
		driver1=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath ="//*[@id='root']/div/div/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/input")
	WebElement Email_txt;
	
	@FindBy(xpath ="//*[@id='password']")
	WebElement Password_txt;
	
	@FindBy(xpath ="//button[@type='submit']")
	WebElement Sigin_btn;
	

	
	
	public void EnterEmail(String email) 
	{
	   Email_txt.sendKeys(email); 
	}
	
	public void EnterPassword(String password) 
	{
		Password_txt.sendKeys(password);
	}
	
	public void ClickSignIn() 
	{
	    Sigin_btn.click();
	
	}
	
}

