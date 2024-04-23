package DDBase;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import DWObjectRepository.LoginPage;
import DWObjectRepository.homepage;
import DWObjectRepository.welcomepage;

public class DDBaseClass {
	public ExtentReports report;
	public WebDriver driver;
	public ExtentTest test;

	@BeforeSuite
	public void beforesuite() {
		report = new ExtentReports(
				"D:\\Automation Testing\\SeleniumAutomationFrameWork\\DemoWebShop/Reports/rept.html");
		System.out.println("Before Suite is Executed");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test is Executed");
	}

	@BeforeClass
	public void beforeclass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Before Class is Executed");
	}

	@BeforeMethod
	public void beforemethod(Method method) {
		String methodname = method.getName();
		test = report.startTest(methodname);
		LoginPage lp = new LoginPage(driver);
		welcomepage wp = new welcomepage(driver);
		wp.welcomepageloginbutton();

		lp.enterusername("smugesh0208@gmail.com");
		lp.enterpassword("Mugesh@0208");
		lp.clickloginpageloginbutton();
		System.out.println("Before Method is Executed");
	}

	@AfterMethod
	public void aftermethod() {
		homepage hp = new homepage(driver);
		hp.homepagelogoutbutton();

		System.out.println("After Method is Executed");

	}

	@AfterClass
	public void afterclass() {
		driver.quit();
		System.out.println("After Class is Executed");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("After Test is Executed");
	}

	@AfterSuite
	public void aftersuite() {
		report.flush();
		System.out.println("After suite is Executed");
	}
}
