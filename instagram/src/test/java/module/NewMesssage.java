package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMesssage {
	
	@FindBy (xpath = "//input[@autocomplete='off']")
	private WebElement To;
	
	@FindBy (xpath = "//span[text()='ajinkyahedaoo013']")
	private WebElement ajinkyahedaoo013 ;
	
	@FindBy (xpath = "//div[text()='Next']")
	private WebElement next ;
	
	public NewMesssage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendOnToSearchBox() {
		To.sendKeys("Ajinkya Hedaoo");
	}
	public void clickOnajinkyahedaoo013() {
		ajinkyahedaoo013.click();
	}
	public void clickOnNextButton() {
		next.click();
	}
  
			

}
