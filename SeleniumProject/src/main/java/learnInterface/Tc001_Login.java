package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tc001_Login extends GenericWrapper {

	@Test
	public void login() {
		launchBrowser("http://www.leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password","crmsfa");
		clickByClassName("decorativeSubmit");
		
		
		
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		
		enterById("createLeadForm_companyName", "TCS");
		enterById("createLeadForm_firstName", "Hema");
		enterById("createLeadForm_lastName", "Malini");
		
		selectVisibleTextById("createLeadForm_dataSourceId","Employee");
		
		
		
		
	}
}
