package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	WebDriver driver;
	
	@BeforeTest
	public void openapp() throws Exception {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(1000);

	driver.get("https://testing.d2okaspacdbhs.amplifyapp.com/login/");
	}

	
	
	
	@AfterTest
	public void closebrower() throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
		driver.quit();
	}
}
