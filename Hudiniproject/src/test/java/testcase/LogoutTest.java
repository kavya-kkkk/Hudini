package testcase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.Logoutpage;
import PageObject.SignInPage;

public class LogoutTest extends Baseclass{

@Test
public void logout() throws InterruptedException
{
	SignInPage sign = new SignInPage(driver);
	Thread.sleep(1000);
	
	
    sign.EnterEmail("kavya.krishnamurthy@rhibhus.com");
    Thread.sleep(1000);
    sign.EnterPassword("Kavya@1234");
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
	
   Logoutpage logout = new Logoutpage(driver);
	Thread.sleep(1000);
    logout.clickLogoutIcon();
    Thread.sleep(1000);
    logout.clicklogout();
    Thread.sleep(1000);
    Alert amsg= (Alert)driver;
    
    logout.clickpopupokbtn();
    Thread.sleep(1000);
    
    String expectedurl2 = "https://testing.d2okaspacdbhs.amplifyapp.com/login/";
    
   String actualurl2=driver.getCurrentUrl();
   
    if(actualurl2.equals(expectedurl2)) 
    {
    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl, true);
    }
    else{
    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl, true);
    	
    }
    
    
}


}
