package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.AddClientpage;
import PageObject.AdminDashBoardPage;
import PageObject.EditClientPPage;
import PageObject.SignInPage;

public class EditClientTest extends Baseclass{
	
	@Test
	public void EditClient() throws Exception 
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
	    
		
	    AdminDashBoardPage addc=new AdminDashBoardPage(driver);
	    Thread.sleep(2000);
	    addc.ClickClientDpd();
	    addc.ClickClientListd();   
	    Thread.sleep(2000);
	    String expectedurl3 = "https://testing.d2okaspacdbhs.amplifyapp.com/personal-record";
	    
		   String actualurl3=driver.getCurrentUrl();
		   
		    if(actualurl3.equals(expectedurl3)) 
		    {
		    	Reporter.log(actualurl3+"...is matching to the..."+expectedurl3, true);
		    }
		    else{
		    	Reporter.log(actualurl3+"...is matching to the..."+expectedurl3, true);
		    	
		    }
		    
			EditClientPPage editcpage=new EditClientPPage(driver);
			
		editcpage.Click_clienteditbtn();
		Thread.sleep(2000);
		 String expectedurl1 = "https://testing.d2okaspacdbhs.amplifyapp.com/client/cfea1376-60ef-5359-bb72-2706b237e322";
		    
		   String actualurl1=driver.getCurrentUrl();
		   
		    if(actualurl1.equals(expectedurl1)) 
		    {
		    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
		    }
		    else{
		    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
		    	
		    }
		    
			editcpage.Enterclient_name("skk");
			
			editcpage.Enterclient_email("vijanath10000@gmail.com");
		
			editcpage.Enterclient_phone("12000005");
			
			editcpage.Enterclient_status();
			
			
			editcpage.EnterchromeCast_devices("1");
			
			editcpage.EnterchromeCast_validity("6");
			
		    editcpage.EnterchromeCast_subEndDate("12/12/2023");
			
			editcpage.EnterchromeCast_subStartDatePassword("12/12/2022");
		
			
			editcpage.EnterlinuxMachine_ip("12.34.56.78");
			
			editcpage.EnterlinuxMachine_userName("ewrwer");
			
			//editcpage.Enterlinux_key();
			
			editcpage.Enterlinux_keytext("hdhsayu");
			
			
			editcpage.Enterdb_password("erewre");
			
			editcpage.Enterdb_port("1323");
			
			editcpage.Enterdb_hostname("231223");
			
			editcpage.Enterdb_name("sadsa");
			
			 Thread.sleep(1000);
			editcpage.Clienteditsave_btn();
			
			 Thread.sleep(1000);
			editcpage.popupok_btn();
			 String expectedurl2 = "https://testing.d2okaspacdbhs.amplifyapp.com/personal-record";
			    
			   String actualurl2=driver.getCurrentUrl();
			   
			    if(actualurl2.equals(expectedurl2)) 
			    {
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    }
			    else{
			    	Reporter.log(actualurl2+"...is matching to the..."+expectedurl2, true);
			    	
			    }
 
	

}
	}
