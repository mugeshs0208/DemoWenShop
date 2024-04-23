package DemoWepShopTestCases;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import DDBase.DDBaseClass;
import DWObjectRepository.homepage;


public class DDTestCase extends DDBaseClass  {
   
	@Test
	public void homepageverification() {
		homepage hp=new homepage(driver);
		try {
		hp.verifyelement("Welcome to our store");
		test.log(LogStatus.PASS,"Test case is Passed");
		
		} catch (Exception e ) {
			// TODO: handle exception
			test.log(LogStatus.FAIL,"Test case is Failed");
		}
	}
	
}
