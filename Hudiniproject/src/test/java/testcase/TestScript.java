package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.AddClientpage;
import PageObject.AdminDashBoardPage;
import PageObject.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript
{
	public static WebDriver driver;

	
	
	@BeforeTest
	public void BrowerLaunch() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("driver"+driver);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testing.d2okaspacdbhs.amplifyapp.com/login/");
		
	}
	
	
	
@Test
public void Signin() throws InterruptedException
{
	
	
	SignInPage sign = new SignInPage(driver);
	
    sign.EnterEmail("kavya");
    sign.EnterPassword("123123");	
    sign.ClickSignIn();

	
    AdminDashBoardPage addc=new AdminDashBoardPage(driver);
    Thread.sleep(2000);
    addc.ClickClientDpd();
    Thread.sleep(2000);
    addc.ClickClientListd();
    Thread.sleep(2000);
    
	  AddClientpage addcpage=new AddClientpage(driver);
	  addcpage.Click_clientaddbtn();
	  Thread.sleep(2000);
		addcpage.Enterclient_name("suseela");
		
		addcpage.Enterclient_email("vijanath134@gmail.com");
	
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
		
		
	}

	}


