package page;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	@FindBy (xpath ="//*[local-name()='svg' and @aria-label='Search']")
	private WebElement  SearchButton ;

	
	public SearchPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	
	}		
	
	public void ClickOnSearchButton () {
		SearchButton.click();
	}

}
