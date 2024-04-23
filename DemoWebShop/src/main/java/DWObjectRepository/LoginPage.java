package DWObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DDBase.DDBaseClass;

public class LoginPage extends DDBaseClass {

	WebDriver driver;
	
	@FindBy(id = "Email")
	WebElement UserName;
	@FindBy(id = "Password")
	WebElement Password;
	@FindBy(className = "login-button")
	WebElement LoginPageLoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String username) {
		UserName.sendKeys(username);
		System.out.println("UserName is Entered");
	}
	public void enterpassword(String password) {
		Password.sendKeys(password);
		System.out.println("Password is Entered");
	}
	public void clickloginpageloginbutton() {
		LoginPageLoginButton.click();
		System.out.println("Login Page Login Button is Clicked");
	}
}
