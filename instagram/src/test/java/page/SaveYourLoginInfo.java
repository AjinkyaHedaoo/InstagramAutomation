package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaveYourLoginInfo {
	@FindBy (xpath= "//div[text()='Not Now']")
	private WebElement NotNowButton ;
	
	public SaveYourLoginInfo (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnNotNowButton () {
		NotNowButton.click();
	}
	

}
