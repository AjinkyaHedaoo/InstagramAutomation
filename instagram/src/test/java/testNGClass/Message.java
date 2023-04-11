package testNGClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browserSetUp.Base;
import module.LogoutText;
import module.NewMesssage;
import page.Logout;
import page.MessagePage;
import page.MsgImage;
import page.MsgName;
import page.NameTab;
import page.SaveYourLoginInfo;
import page.SearchPage;
import page.SearchTab;
import page.SignInpage;
import page.TurnOnNotifications;

public class Message extends Base {
	WebDriver driver;
	SaveYourLoginInfo saveYourLoginInfo;
	TurnOnNotifications turnOnNotifications;
	SearchPage searchPage;
	SearchTab searchTab  ;
	NameTab nameTab;
	SoftAssert soft;
	MsgImage msgImage;
	MsgName msgName;
	NewMesssage newMesssage;
	MessagePage messagePage;
	Logout logout;
	LogoutText logoutText;
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		System.out.println("Before Test");
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();
		}
		if(browserName.equals("Edge"))
		{
			driver = openEdgeBrowser();
		}	
	}
	
	@BeforeClass
	public void before() {
		System.out.println("Before Class");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void method() {
		System.out.println("Before Method");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		SignInpage signInpage = new SignInpage(driver);
		signInpage.sendUsername();
		signInpage.sendpassword();
		signInpage.clickOnLogin();
		
		saveYourLoginInfo = new SaveYourLoginInfo(driver);
		saveYourLoginInfo.ClickOnNotNowButton();
		turnOnNotifications = new TurnOnNotifications(driver);
		turnOnNotifications.ClickOnNotNowNotificationsButton();	
	}
	@Test (priority=1)
	public void verifyThemessageButton() {
		System.out.println("Test");
		soft = new SoftAssert();
		msgImage = new MsgImage(driver);
		msgImage.clickOnmsgButton();
		
		msgName = new MsgName(driver);
		String actualResult = msgName.getYourMessage();
		String expectedResult = "";
		soft.assertEquals(actualResult, expectedResult);
		
		String actualText = msgName.getSendPhotoAndMessage();
		String expectedText = "Send private photos and messages to a friend or group.";
		soft.assertEquals(actualText, expectedText);
		
		msgName.clickOnSendMsg();
		
		newMesssage = new NewMesssage(driver);
		
		newMesssage.sendOnToSearchBox();
		newMesssage.clickOnajinkyahedaoo013();
		newMesssage.clickOnNextButton();
		
		messagePage = new MessagePage(driver);
		messagePage.sendOnMessage();
		messagePage.clickOnSendButton();
		
		soft.assertAll();	
	}
	@AfterMethod 
	public void aftermethod () {
		System.out.println("After CLass");
		logout = new Logout(driver);
		logout.clickOnlogoutButton();
		
		logoutText = new LogoutText(driver);
		logoutText.clickOnlogoutText();	
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
		
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("After Test");
		driver.quit();
        System.gc();
	}

}

	


