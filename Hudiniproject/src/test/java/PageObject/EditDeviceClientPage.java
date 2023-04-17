package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditDeviceClientPage {
	
	WebDriver driver;
	public EditDeviceClientPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='main-wrapper']/div[4]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div/a[1]")
	WebElement clienteditevice;
	
	@FindBy(id="chromecast_friendly_name")
	WebElement chromecast_friendly_name;
	
	
	
	@FindBy(id="chromecast_status")
	WebElement chromecast_status;
	@FindBy(id="chromecast_ip")
	WebElement chromecast_ip;
	
	@FindBy(id="chromecast_room_no")
	WebElement chromecast_room_no;
	
	
	
	@FindBy(xpath = "//button[.='Save']")
	WebElement Savedev_Button;
	
	@FindBy(xpath = "//button[.='OK']")
	WebElement OKpopup_Button;
	
	@FindBy(xpath ="//button[.='Cancel']")
	WebElement Canceldev_btn;
	
	
	public void Enterchromecast_friendly_name(String chromecastfriendlyname) throws InterruptedException 
	{
		chromecast_friendly_name.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		chromecast_friendly_name.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(1000);
		chromecast_friendly_name.sendKeys(chromecastfriendlyname);
}
	public void Enterchromecast_ip(String chromecastip) throws InterruptedException 
	{
		chromecast_ip.sendKeys(Keys.CONTROL+"a");
	  Thread.sleep(1000);
	  chromecast_ip.sendKeys(Keys.CONTROL+"x");
	  Thread.sleep(1000);
		
		chromecast_ip.sendKeys(chromecastip);
}

	public void chromecast_status(String chromecaststatus) 
	{
		Select dp=new Select(chromecast_status);
	
		dp.selectByVisibleText(chromecaststatus);
	}

	public void Enterchromecast_room_no(String chromecastroomno) throws InterruptedException 
	{
		
		chromecast_room_no.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		chromecast_room_no.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(1000);
		chromecast_room_no.sendKeys(chromecastroomno);
}
	
	
	public void Save_Button() 
	{
		
	
		Savedev_Button.click();
}
	
	public void Cancel_btn() 
	{
		Canceldev_btn.click();
}
	
  public void clienteditdevice()
    {
  clienteditevice.click();
  
    }
  
  public void okpopup()
  {
        OKpopup_Button.click();

  }
}
