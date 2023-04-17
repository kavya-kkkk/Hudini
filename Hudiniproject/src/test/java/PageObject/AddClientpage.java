package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddClientpage {
	
	WebDriver driver;
	public AddClientpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//button[.='Add Client']")
WebElement addclientbtn;
	
	@FindBy(id="client_name")
	WebElement client_name;
	
	@FindBy(id="client_email")
	WebElement client_email; 
	
	@FindBy(id="client_status")
	WebElement client_status;
	
	@FindBy(id="client_phone")
	WebElement client_phone;
	
	
	
	@FindBy(id="chromeCast_devices")
	WebElement chromeCast_devices;
	
	@FindBy(id="chromeCast_validity")
	WebElement chromeCast_validity;
	
	@FindBy(id="chromeCast_subStartDate")
	WebElement chromeCast_subStartDate;
	
	@FindBy(id="chromeCast_subEndDate")
	WebElement chromeCastsubEndDate;
	
	@FindBy(id="linuxMachine_ip")
	WebElement linuxMachine_ip;
	
	@FindBy(id="linuxMachine_userName")
	WebElement 	linuxMachine_userName;

	
	@FindBy(id="linuxMachine_keyType")
	WebElement 	linuxMachine_keyType;
	
	@FindBy(id="linuxMachine_secretKey")
	WebElement 	linuxMachine_secretKey;
	
	@FindBy(id="db_name")
	WebElement db_name;
	
	@FindBy(id="db_hostname")
	WebElement db_hostname;
	
	@FindBy(id="db_port")
	WebElement 	db_port;
	
	@FindBy(id="db_password")
	WebElement db_password;
	
	@FindBy(xpath = "//button[.='Add']")
	WebElement ClientAdd_btn;
	
	@FindBy(xpath = "//button[.='Cancel']")
	WebElement ClientCancel_btn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[3]")
	WebElement popupokbtn;
	

	public void Click_clientaddbtn() 
	{
	
		addclientbtn.click();
}
	public void Enterclient_name(String clientname) 
	{
	
		client_name.sendKeys(clientname);
}
	public void Enterclient_email(String clientemail) 
	{
	
		client_email.sendKeys(clientemail);
}
	public void Enterclient_phone(String clientphone) 
	{
	
		client_phone.sendKeys(clientphone);
}

	public void Enterclient_status() 
	{
	
		Select status=new Select(client_status);
		
		status.selectByVisibleText("Active");
		
}
	public void EnterchromeCast_devices(String chromeCastdevices) 
	{
	
		chromeCast_devices.sendKeys(chromeCastdevices);
}
	public void EnterchromeCast_validity(String chromeCastvalidity) 
	{
	
		chromeCast_validity.sendKeys(chromeCastvalidity);
}
	public void EnterchromeCast_subStartDatePassword(String chromeCastsubStartDate) 
	{
	
		chromeCast_subStartDate.sendKeys(chromeCastsubStartDate);
}
	
	
	public void EnterchromeCast_subEndDate(String chromesubEndDate) 
	{
	
		chromeCastsubEndDate.sendKeys(chromesubEndDate);
}
	public void EnterlinuxMachine_ip(String linuxMachineip) 
	{
	
		linuxMachine_ip.sendKeys(linuxMachineip);
}
	public void EnterlinuxMachine_userName(String linuxMachineuserName) 
	{
	
		linuxMachine_userName.sendKeys(linuxMachineuserName);
}

	public void Enterlinux_key() 
	{
	
		Select key=new Select(linuxMachine_keyType);
		key.deselectByVisibleText("Public");
}

	public void Enterlinux_keytext(String linuxsecretkey) 
	{
	
		linuxMachine_secretKey.sendKeys(linuxsecretkey);
}
	
	
	public void Enterdb_name(String dbname) 
	{
	
		db_name.sendKeys(dbname);
}
	public void Enterdb_port(String dbport) 
	{
	
		db_port.sendKeys(dbport);
}
	public void Enterdb_password(String dbpassword) 
	{
	
		db_password.sendKeys(dbpassword);
}
	
	
	public void Enterdb_hostname(String  dbhostname) 
	{
	
		 db_hostname.sendKeys(dbhostname);
}
	
	public void clientAddbtn() 
	{
		ClientAdd_btn.click();
}
	public void ClientCancel_btn() 
	{
		ClientCancel_btn.click();
}
	
	public void popupok_btn() 
	{
		popupokbtn.click();
		
}
	
	

}
