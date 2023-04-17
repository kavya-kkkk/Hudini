package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDeviceClientPage {
	
	WebDriver driver;
	public AddDeviceClientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[.='Add Device']")
	WebElement clientadddevice;
	
	@FindBy(id="chromecast_friendly_name")
	WebElement chromecast_friendly_name;
	
	@FindBy(id="chromecast_ip")
	WebElement chromecast_ip;
	
	@FindBy(id="chromecast_room_no")
	WebElement chromecast_room_no;
	
	
	
	@FindBy(xpath = "//button[.='Add']")
	WebElement Adddev_Button;
	
	@FindBy(xpath ="//button[.='Cancel']")
	WebElement Canceldev_btn;
	
	
	public void Enterchromecast_friendly_name(String chromecastfriendlyname) 
	{
	
		chromecast_friendly_name.sendKeys(chromecastfriendlyname);
}
	public void Enterchromecast_ip(String chromecastip) 
	{
	
		chromecast_ip.sendKeys(chromecastip);
}
	

	public void Enterchromecast_room_no(String chromecastroomno) 
	{
	
		chromecast_room_no.sendKeys(chromecastroomno);
}
	
	
	public void Add_Button() 
	{
	
		Adddev_Button.click();
}
	
	public void Cancel_btn() 
	{
		Canceldev_btn.click();
}
	
  public void clientadddevice()
  {
  clientadddevice.click();
  
  }
}
