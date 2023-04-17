package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import utilites.readconfig;

public class ReadBaseClass { 
	
	readconfig read=new readconfig();
	
	public String baseurl=read.getappurl();
	public String email=read.getemail();
	public String password=read.getpassword();
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openapp(String br) throws Exception {
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox")){
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie")){
			driver=new InternetExplorerDriver();
		}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(1000);

	driver.get(baseurl);
	
	
	}

	
	
	
	@AfterTest
	public void closebrower() throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
		driver.quit();
	}
}
