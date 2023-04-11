package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TurnOnNotifications {
	@FindBy (xpath ="//button[text()='Not Now']")
	private WebElement NotNowNotificationsButton ;
	
	public TurnOnNotifications (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void ClickOnNotNowNotificationsButton() {
		NotNowNotificationsButton.click();
	}
	
	
	

}
