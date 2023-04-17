package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientDashBoardPage {
	WebDriver driver;
	public ClientDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Chromecast']")
	WebElement ChromeCast_dpd;
	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div/div[1]/ul/li[2]/ul/li/a")
	WebElement ClientChromecastlist_btn;
	
	@FindBy(xpath = "//span[.='Screen Setup']")
	WebElement  ScreenSetup_dpd;
	
	public void ClickChromeCast() 
	{
	
		ChromeCast_dpd.click();
}
	public void ClientChromecastlist() 
	{
	
		ClientChromecastlist_btn.click();
}
	
	public void ScreenSetup() 
	{
	
		ScreenSetup_dpd.click();
}
}
