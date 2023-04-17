package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

import PageObject.AddClientpage;
import PageObject.AdminDashBoardPage;

public class Clientadd extends Baseclass {

@Test
	public void AddClient() throws InterruptedException {
	
		
		Demologin login=new Demologin();
		
		login.Signin();
	
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
		AddClientpage addcpage=new AddClientpage(driver);
		
	addcpage.Click_clientaddbtn();
	Thread.sleep(2000);
	 String expectedurl1 = "https://testing.d2okaspacdbhs.amplifyapp.com/devices/client/ADD";
	    
	   String actualurl1=driver.getCurrentUrl();
	   
	    if(actualurl1.equals(expectedurl1)) 
	    {
	    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
	    }
	    else{
	    	Reporter.log(actualurl1+"...is matching to the..."+expectedurl1, true);
	    	
	    }
	    
		addcpage.Enterclient_name("suseela");
		
		addcpage.Enterclient_email("vijanath1344@gmail.com");
	
		addcpage.Enterclient_phone("12352345");
		
		addcpage.Enterclient_status();
		
		
		addcpage.EnterchromeCast_devices("123");
		
		addcpage.EnterchromeCast_validity("12");
		
		addcpage.EnterchromeCast_subEndDate("12/12/2023");
		
		addcpage.EnterchromeCast_subStartDatePassword("12/12/2022");
	
		
		addcpage.EnterlinuxMachine_ip("12.34.56.78");
		
		addcpage.EnterlinuxMachine_userName("ewrwer");
		
		//addcpage.Enterlinux_key();
		
		addcpage.Enterlinux_keytext("hdhsayu");
		
		
		addcpage.Enterdb_password("erewre");
		addcpage.Enterdb_port("1323");
		addcpage.Enterdb_hostname("231223");
		addcpage.Enterdb_name("sadsa");
		 Thread.sleep(2000);
		addcpage.clientAddbtn();
		 Thread.sleep(2000);
		addcpage.popupok_btn();
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
