package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditClientPPage {
	
	WebDriver driver;
	public EditClientPPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//div/a/i")
WebElement editbutton;
	
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

	
	@FindBy(xpath="//*[@id='linuxMachine_keyType']")
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
	
	@FindBy(xpath = "//button[.='Save']")
	WebElement Clienteditsave_btn;
	
	@FindBy(xpath = "//button[.='Cancel']")
	WebElement ClientCancel_btn;
	
	@FindBy(xpath="/html/body/div[2]/div/div[3]")
	WebElement popupokbtn;
	

	public void Click_clienteditbtn() 
	{
	
		editbutton.click();
}
	public void Enterclient_name(String clientname) throws Exception 
	{
		client_name.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		client_name.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		
		client_name.sendKeys(clientname);
}
	public void Enterclient_email(String clientemail) throws InterruptedException 
	{
		client_email.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		client_email.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		client_email.sendKeys(clientemail);
}
	public void Enterclient_phone(String clientphone) throws InterruptedException 
	{
	client_phone.sendKeys(Keys.CONTROL+"a");
	 Thread.sleep(1000);
	client_phone.sendKeys(Keys.DELETE);
	
	 Thread.sleep(1000);
		client_phone.sendKeys(clientphone);
}

	public void Enterclient_status() 
	{
	
		Select status=new Select(client_status);
		
		status.selectByVisibleText("Active");
		
}
	public void EnterchromeCast_devices(String chromeCastdevices) throws InterruptedException 
	{
		chromeCast_devices.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 chromeCast_devices.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		chromeCast_devices.sendKeys(chromeCastdevices);
}
	public void EnterchromeCast_validity(String chromeCastvalidity) throws InterruptedException 
	{
		chromeCast_validity.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 chromeCast_validity.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		chromeCast_validity.sendKeys(chromeCastvalidity);
}
	public void EnterchromeCast_subStartDatePassword(String chromeCastsubStartDate) throws InterruptedException 
	{

		chromeCast_subStartDate.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 chromeCast_subStartDate.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		chromeCast_subStartDate.sendKeys(chromeCastsubStartDate);
}
	
	
	public void EnterchromeCast_subEndDate(String chromesubEndDate) throws InterruptedException 
	{

		chromeCastsubEndDate.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 chromeCastsubEndDate.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
	
		chromeCastsubEndDate.sendKeys(chromesubEndDate);
}
	public void EnterlinuxMachine_ip(String linuxMachineip) throws InterruptedException 
	{
		linuxMachine_ip.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 linuxMachine_ip.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
	
		linuxMachine_ip.sendKeys(linuxMachineip);
}
	public void EnterlinuxMachine_userName(String linuxMachineuserName) throws InterruptedException 
	{
		linuxMachine_userName.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 linuxMachine_userName.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		linuxMachine_userName.sendKeys(linuxMachineuserName);
}

	public void Enterlinux_key() throws InterruptedException 
	{
		
		Select key=new Select(linuxMachine_keyType);
		key.deselectByVisibleText("Private");
}

	public void Enterlinux_keytext(String linuxsecretkey) throws InterruptedException 
	{

		linuxMachine_secretKey.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 linuxMachine_secretKey.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		linuxMachine_secretKey.sendKeys(linuxsecretkey);
}
	
	
	public void Enterdb_name(String dbname) throws InterruptedException 
	{
		db_name.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 db_name.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
	
		db_name.sendKeys(dbname);
}
	public void Enterdb_port(String dbport) throws InterruptedException 
	{

		db_port.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 db_port.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
		db_port.sendKeys(dbport);
}
	public void Enterdb_password(String dbpassword) throws InterruptedException 
	{
	
		db_password.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		db_password.sendKeys(Keys.DELETE);
		db_password.sendKeys(dbpassword);
}
	
	
	public void Enterdb_hostname(String  dbhostname) throws InterruptedException 
	{
		 db_hostname.sendKeys(Keys.CONTROL+"a");
		 Thread.sleep(1000);
		 db_hostname.sendKeys(Keys.DELETE);
		 Thread.sleep(1000);
	
		 db_hostname.sendKeys(dbhostname);
}
	
	public void Clienteditsave_btn() throws InterruptedException 
	{
		
		 Thread.sleep(1000);
		Clienteditsave_btn.click();
}
	public void ClientCancel_btn() throws InterruptedException 
	{
		
		 Thread.sleep(1000);
		ClientCancel_btn.click();
}
	
	public void popupok_btn() throws InterruptedException 
	{
		
		popupokbtn.click();
		
}

}
