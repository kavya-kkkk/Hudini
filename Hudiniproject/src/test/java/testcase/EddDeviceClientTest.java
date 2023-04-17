package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.AddDeviceClientPage;
import PageObject.AdminDashBoardPage;
import PageObject.ClientDashBoardPage;
import PageObject.EditDeviceClientPage;
import PageObject.SignInPage;

public class EddDeviceClientTest extends Baseclass {
	
	@Test
	public void AddDeviceClient() throws InterruptedException {
		
		
		
		   SignInPage sign = new SignInPage(driver);
			Thread.sleep(1000);
			
			
		    sign.EnterEmail("gkrishnamurthy443@gmail.com");
		   
		    sign.EnterPassword("Kavya@1234");
		    
		    sign.ClickSignIn();
		   
		    
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
		Thread.sleep(1000);
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
		    
		    EditDeviceClientPage editdev=new EditDeviceClientPage(driver);
		      Thread.sleep(1000);
		    editdev.clienteditdevice();
		      
		
		   String expectedurl2 = "https://testing.d2okaspacdbhs.amplifyapp.com/devices/client/2c12c9af-fcbe-5558-baf9-5c40c8e54f66";
		    
			   String actualurl2=driver.getCurrentUrl();
			   
			    if(actualurl2.equals(expectedurl1)) 
			    {
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    }
			    else{
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    	
			    }
		    
		    
		    editdev.Enterchromecast_friendly_name("onida44444");
		    Thread.sleep(1000);
		   editdev.chromecast_status("Active");
		   Thread.sleep(1000);
		    editdev.Enterchromecast_ip("1.93.5.67");
		    Thread.sleep(1000);
		   
		    editdev.Enterchromecast_room_no("222222");
		    Thread.sleep(1000);
		    editdev.Save_Button();
		    Thread.sleep(1000);
		    
		    editdev.okpopup();
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
