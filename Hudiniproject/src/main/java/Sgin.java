

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sgin
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
	
	
	

	}


