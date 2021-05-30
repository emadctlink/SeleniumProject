package testNG_Parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {

	public ChromeDriver driver;
	
	
		@Parameters ({"url","uname","pwd"})
		
		@BeforeMethod
		public void login(String url, String uname, String pwd) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		}
		
		
		@AfterMethod
		public void closeDriver() {
			driver.close();
		}
	

	}


