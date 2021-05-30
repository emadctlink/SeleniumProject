package utils_IntegrareExcelDataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	
	@DataProvider
	public String[][] getData() throws IOException {
		ReadExcel r1 = new ReadExcel();
		return r1.readExcel();
		
		
		/*
		String data[][] = new String [2][3]; //2D array- here 2 is row and 3 is column
		
		data[0][0] ="ABC";
		data[0][1]="Arshan";
		data[0][2]="Khan";
				
		data[1][0]="TCS";
		data[1][1]="Zimam";
		data[1][2]="Uddin";
		
		/*CName	FNAme	LName
		  ABC	Arshan	Khan
		 TCS	Zimam	Uddin 

		return data;		//return type
		*/
	}

}
