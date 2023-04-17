package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientsTabPage {
	
	WebDriver driver;
	public ClientsTabPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(className = "nav-link active")
	WebElement ArchiveClient_btn;
	
	@FindBy(xpath = "//button[.='Activate']")
	WebElement Active_btn;
	
	@FindBy(className ="page-link")
	WebElement Pagenition_Dpd;
	
	@FindBy(xpath = "//div/a/i")
	WebElement Edit_icon;
	
	@FindBy(className ="page-link")
	WebElement Delete_icon;
	
	@FindBy(className ="active page-item")
	WebElement PageNumber_btn;
	
	@FindBy(className ="//button[.='Add Client']")
	WebElement Addclient_btn;
	
	
	@FindBy(className ="//button[.='Activate']")
	WebElement ArchiveClientActive_btn;
	
	public void ClickArchiveClient() 
	{
	
		ArchiveClient_btn.click();
}
	public void ClickActive_btn() 
	{
	
		Active_btn.click();
}
	
	public void Pagenition() 
	{
	
		Pagenition_Dpd.click();
}
	
	public void Editicon() 
	{
	
		Edit_icon.click();
}
	
	public void Deleteicon() 
	{
	
		Delete_icon.click();
}
	
	public void PageNumberbtn() 
	{
	
		PageNumber_btn.click();
}
	
	public void Addclientbtn() 
	{
		Addclient_btn.click();
}
	public void ArchiveClientActivebtn() 
	{
		ArchiveClientActive_btn.click();
}
	
	

}
