package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NameTab {
	@FindBy (xpath = "//main//h2")
	private WebElement ajinkyaHedaooMsg;
	
	@FindBy (xpath = "//span[@class='_aacl _aaco _aacw _aacx _aad7 _aade']")
	private WebElement ajinkyaHedaooText;
	
	@FindBy (xpath = "//div[text()='Message']")
	private WebElement message;
	

	public NameTab(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String getajinkyaHedaooMsg() {
		return ajinkyaHedaooMsg.getText();
	}
	public String getajinkyaHedaooText() {
		return ajinkyaHedaooText.getText();
	}
	public void clickOnmessage() {
		message.click();
	}
	

}
