package testcase;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

import PageObject.SignInPage;

public class Sigintestread extends ReadBaseClass
{
	
	


	@Test
	public void Signin() throws InterruptedException
	{
		
	   SignInPage sign = new SignInPage(driver);
		Thread.sleep(1000);
		
		
	    sign.EnterEmail(email);
	    Thread.sleep(1000);
	    sign.EnterPassword(password);
	    Thread.sleep(1000);
	    sign.ClickSignIn();
	    Thread.sleep(1000);
	    
	    String expectedurl = "https://testing.d2okaspacdbhs.amplifyapp.com/dashboard";
	    
	   String actualurl=driver.getCurrentUrl();
	   
	    if(actualurl.equals(expectedurl)) 
	    {
	    	Reporter.log(actualurl+"...is matching to the..."+expectedurl, true);
	    }
	    else{
	    	Reporter.log(actualurl+"...is matching to the..."+expectedurl, true);
	    	
	    }
	    
	    
	}

	
	
	
}
