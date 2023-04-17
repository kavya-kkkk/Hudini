package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.AddDeviceClientPage;
import PageObject.AdminDashBoardPage;
import PageObject.ClientDashBoardPage;
import PageObject.SignInPage;

public class AddDeviceClientTest extends Baseclass {
	
	@Test
	public void AddDeviceClient() throws InterruptedException {
		
		
		
		   SignInPage sign = new SignInPage(driver);
			Thread.sleep(1000);
			
			
		    sign.EnterEmail("gkrishnamurthy443@gmail.com");
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
		
		
		
		ClientDashBoardPage cdb=new ClientDashBoardPage(driver);
		
		cdb.ClickChromeCast();
		Thread.sleep(1000);
		cdb.ClientChromecastlist();
		 String expectedurl1 = "https://testing.d2okaspacdbhs.amplifyapp.com/device-record";
		    
		   String actualurl1=driver.getCurrentUrl();
		   
		    if(actualurl1.equals(expectedurl1)) 
		    {
		    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
		    }
		    else{
		    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
		    	
		    }
		    
		    
		   // AdminDashBoardPage addd=new AdminDashBoardPage(driver);
		    
		    
		 //   addd.ClickClientDpd();
		    
		   /// addd.ClickClientListd();
		    
		    AddDeviceClientPage adddev=new AddDeviceClientPage(driver);
		      Thread.sleep(1000);
		    adddev.clientadddevice();
		      
		
		   String expectedurl2 = "https://testing.d2okaspacdbhs.amplifyapp.com/devices/client/ADD";
		    
			   String actualurl2=driver.getCurrentUrl();
			   
			    if(actualurl2.equals(expectedurl1)) 
			    {
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    }
			    else{
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    	
			    }
		    
		    
		    adddev.Enterchromecast_friendly_name("onida44");
		    Thread.sleep(1000);
		   
		    adddev.Enterchromecast_ip("1.23.45.67");
		    Thread.sleep(1000);
		   
		    adddev.Enterchromecast_room_no("1233211");
		    Thread.sleep(1000);
		    adddev.Add_Button();
		    Thread.sleep(1000);
		    String expectedurl3 = "https://testing.d2okaspacdbhs.amplifyapp.com/device-record";
		    
			   String actualurl3=driver.getCurrentUrl();
			   
			    if(actualurl2.equals(expectedurl1)) 
			    {
			    	Reporter.log(actualurl3+"...is matching to the..."+expectedurl3, true);
			    }
			    else{
			    	Reporter.log(actualurl3+"...is matching to the..."+expectedurl3, true);
			    	
			    }
		  
		  
		 	}

	
}
