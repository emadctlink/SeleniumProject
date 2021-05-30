package testLeaf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC001Login {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://www.leaftaps.com/opentaps/control/main");
	System.out.println("Testleaf url= "+driver.getTitle());
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	 

	}

}
