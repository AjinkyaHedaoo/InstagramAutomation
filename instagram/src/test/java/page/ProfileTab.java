package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  ProfileTab {
	@FindBy (xpath = "//span[text()='ajinkyahedaoo013']")
	private WebElement SearchName ;
	
	
	public ProfileTab (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	

}
