package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutText {
	@FindBy (xpath ="(//*[local-name()='svg' and @aria-label='Settings'])[1]")
	private WebElement logout;
	
	public LogoutText(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickOnlogoutText() {
		logout.click();
	}


}
