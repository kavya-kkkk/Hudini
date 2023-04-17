package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientScreenSetupPage {
	WebDriver driver;
	public ClientScreenSetupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(id="client_wifi_name")
	WebElement client_wifi_name;
	
	@FindBy(id="client_wifi_password")
	WebElement client_wifi_password;
	
	@FindBy(id="client_welcome_text")
	WebElement client_welcome_text;
	
	@FindBy(id="client_image_names")
	WebElement client_image_names;
	
	@FindBy(xpath = "//div/i[@class='fa fa-trash']")
	WebElement PreviewDeleteimg_btn;
	
	@FindBy(xpath = "//button[.='Save']")
	WebElement Save_Button;
	
	@FindBy(xpath ="//button[.='Cancel']")
	WebElement Cancel_btn;
	
	
	
	
	public void Enterclient_wifi_name(String clientwifiname) 
	{
	
		client_wifi_name.sendKeys(clientwifiname);
}
	public void Enterclient_wifi_password(String clientwifipassword) 
	{
	
		client_wifi_password.sendKeys(clientwifipassword);
}
	

	public void Enterclient_welcome_text(String clientwelcometext) 
	{
	
		client_welcome_text.sendKeys(clientwelcometext);
}
	public void Selectclient_image_names() 
	{
	
		client_image_names.click();
	}
	public void PreviewDeleteimg_btn() 
	{
	
		PreviewDeleteimg_btn.click();
}
	
	public void Save_Button() 
	{
	
		Save_Button.click();
}
	
	public void Cancel_btn() 
	{
		Cancel_btn.click();
}
	
	
}


