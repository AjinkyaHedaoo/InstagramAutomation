package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInpage {
	@FindBy (xpath  = "//input[@name='username']")
	private WebElement  username;
	
	@FindBy (xpath = "//input[@name='password']")
	private WebElement password ;
	
	@FindBy (xpath = "//div[text()='Log in']")
	private WebElement login ;
	

    public SignInpage (WebDriver driver) {
	PageFactory.initElements(driver,this);

}
    public void sendUsername () {
    	username.sendKeys("ajinkyahedaoo786@gmail.com");;
    }
    public void sendpassword () {
    	password.sendKeys("shishimanu@1");;
    }
    public void clickOnLogin () {
    	login.click();
    }

}