package DWObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DDBase.DDBaseClass;

public class welcomepage extends DDBaseClass {

	WebDriver driver;
	
	@FindBy(xpath = "//a[.='Log in']")
	WebElement WelcomePageLoginButton;
	@FindBy(xpath = "//a[.='Register']")
	WebElement RegisterButton;
	public welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void welcomepageloginbutton() {
		WelcomePageLoginButton.click();
		System.out.println("Login Page Login Button is Clicked");
	}
	public void registerbutton() {
		RegisterButton.click();
		System.out.println("Register Button is clicked");
	}
}
