package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MsgImage {
	@FindBy (xpath="//*[local-name()='svg' and @aria-label='Messenger']")
	private WebElement msgButton;
	
	public MsgImage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickOnmsgButton() {
		msgButton.click();
	}
	

}
