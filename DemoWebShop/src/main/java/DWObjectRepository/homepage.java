package DWObjectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DDBase.DDBaseClass;

public class homepage extends DDBaseClass {
 
	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Log out']")
	WebElement HomePageLogoutButton;
	@FindBy(partialLinkText = "Welcome to our store")
	WebElement VerifyElement;
	@FindBy(xpath = "//ul[@class='top-menu']//a[@href='/books']")
	WebElement BOOKSElement;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void homepagelogoutbutton() {
		HomePageLogoutButton.click();
		System.out.println("Logout Button is Clicked");
	}
	public void verifyelement(String value) {
		String actualResult=VerifyElement.getText();
		String expectedResult="value";
		assertEquals(actualResult, expectedResult);
		System.out.println("Verify Element is succesfully verified");
	}
	public void clickbooelement() {
		BOOKSElement.click();
		System.out.println("Book Element is clicked");
	}
}
