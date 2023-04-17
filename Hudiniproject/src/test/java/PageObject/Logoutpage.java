package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	
	
	WebDriver driver2;
	
	
	@FindBy(xpath="//*[@id='icon-user1']")
	WebElement LogoutIcon;
	@FindBy(xpath = "//*[@id='main-wrapper']/div[3]/div/nav/div/ul/li[2]/div/a/span")
	WebElement logout;
	@FindBy(xpath = "//div/button[.=OK]")
	WebElement popupokbtn;
	@FindBy(xpath = "//div/button[.='Cancel']")
	WebElement popupcancelbtn;
	
	
	public Logoutpage(WebDriver driver1) 
	
	{ driver2=driver1;
		PageFactory.initElements(driver1,this);
	}
	
public void clickLogoutIcon() {
	 LogoutIcon.click();
}

public void clicklogout() {
	 logout.click();
}
public void clickpopupokbtn() {
	popupokbtn.click();
}
public void clickpopupcancelbtn() {
	popupcancelbtn.click();
}



}
