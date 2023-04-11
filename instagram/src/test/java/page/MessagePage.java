package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
	@FindBy (xpath ="//textarea[@style='height: 18px !important;']")
	private WebElement message;
	
	@FindBy (xpath ="//div[text()='Send']")
	private WebElement sendButton;
	
	public MessagePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendOnMessage() {
		message.sendKeys("hii");
	}
	public void clickOnSendButton() {
		sendButton.click();
    }
}