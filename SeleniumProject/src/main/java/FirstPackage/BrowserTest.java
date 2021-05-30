package FirstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {

		// launch ChromeDriver- Using Selenium webdriver and Chrome browser and driver of Chrome. then path of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		//Creating an object driver for ChromeDriver class to call any method under the class by this object
		ChromeDriver driver = new ChromeDriver(); 
		
		//loading  webpage using object driver to call get method.
		driver.get("http://leaftaps.com/opentaps/"); 
		
		//print url
		System.out.println("url is = "+driver.getTitle());
		
		//Maximize window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		Thread.sleep(3000);
		driver.findElementByLinkText("CRM/SFA").click();
		
		


		
	}

}