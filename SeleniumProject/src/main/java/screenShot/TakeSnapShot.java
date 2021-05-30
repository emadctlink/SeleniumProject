package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*Mannually we can take screen shot in 3 different way
		
		=>press on prt sc or (function) fn and prt sc together.
		  captured screen will store in temp file but we can pest it on MS word to save.		
		=> use app snipping tool> new> Drag how much we like to catch or
		  press widows logo + shift + s then drag it will save on clipboard unless you select the space. 
		=> app snip & catch > new > drag and save
		*/
		
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://www.leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			//print url
			System.out.println("url is = "+driver.getTitle());
			
			//input username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//input password
			driver.findElementById("password").sendKeys("crmsfa");
			//click login
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//click crm/sfa
			driver.findElementByLinkText("CRM/SFA").click();
			
			//click create link
			driver.findElementByLinkText("Create Lead").click();
			//enter company name
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			//enter first name
			driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
			
			//enter last name
			try {
			driver.findElementById("createLeadForm_lastName").sendKeys("Malini");
			System.out.println("Lastname entered successfully");
			}
			catch(Exception e) {
				System.err.println("last name not entered");
			}
			finally {
				//take snapshot
				File src = driver.getScreenshotAs(OutputType.FILE);//take snapshot and store in a variable what is a temp file src
				File dest = new File("C:\\Users\\Zimam\\Desktop\\SnapShot\\img.png"); //temp file saved to snapshot folder
					
				//then add dependency on POM.XML commons-IO by apache to move file one place to another place.
				
				FileUtils.copyFile(src, dest); //FileUtils class under apachi commons-IO
			}
			
			
			//Explicitly wait
			Thread.sleep(2000);
		
			
			//click on logout btn
			//driver.findElementByLinkText("Logout").click();
			
			//close web page
			//driver.close();
			}
	
			/* check this
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Employee");
			*/
			
	}


