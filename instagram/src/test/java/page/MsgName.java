package page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MsgName {
		@FindBy (xpath="(//span)[7]")
		private WebElement yourMessage;
		
		@FindBy (xpath="//div[@class='_aacl _aaco _aacu _aacy _aad6 _aadb']")
		private WebElement sendPhotoAndMessage;
		
		@FindBy (xpath="//button[text()='Send Message']")
		private WebElement sendMsg;

		public MsgName(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		public String getYourMessage() {
			return yourMessage.getText();
		}
		public String getSendPhotoAndMessage() {
			return sendPhotoAndMessage.getText();
		}
		public void clickOnSendMsg() {
			sendMsg.click();
		}
		


}
