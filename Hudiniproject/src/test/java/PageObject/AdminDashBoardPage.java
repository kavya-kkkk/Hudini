package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashBoardPage {
	
	WebDriver driver;
	public AdminDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id='main-wrapper']/div[2]/div/div[1]/ul/li[2]/a/span")
	WebElement Client_dpd;
	
	@FindBy(xpath = "//a[.='Clients list']")
	WebElement ClientList_btn;
	
	@FindBy(xpath = "//span[.='Chromecast']")
	WebElement ChromeCast_dpd;
	
	@FindBy(xpath = "//a[.='Client Chromecast list']")
	WebElement ClientChromecastlist_btn;
	
	
	public void ClickClientDpd() 
	{
	
		Client_dpd.click();
}
	public void ClickClientListd() 
	{
	
		ClientList_btn.click();
}
	public void ClickChromeCast() 
	{
	
		ChromeCast_dpd.click();
}
	public void ClientChromecastlist() 
	{
	
		ClientChromecastlist_btn.click();
		
		driver.quit();
}
}
