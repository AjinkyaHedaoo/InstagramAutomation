package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTab {
	@FindBy (xpath = "//input[@aria-label='Search input']")
	private WebElement Search ;
	
	@FindBy (xpath = "//span[text()='ajinkyahedaoo013']")
	private WebElement SearchName ;
	
	
	public SearchTab (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void SendOnSearch () {
		Search.sendKeys("Ajinkya Hedaoo");
	}
	public String GetTextOfSearch () {
		String text = Search.getAttribute("placeholder");
		return text;
	}
	public void clickOnSearchName() {
		SearchName.click();
	}
	
	
		
	

}
