package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//a[text()='Try it Yourself »'])[1]").click();
		
		String CurrentWindow = driver.getWindowHandle();
		System.out.println(CurrentWindow);
		//CDwindow-CA5AB61CFAC7F419C8681475F68CC73E
		
		Set<String> bothwin = driver.getWindowHandles();
		System.out.println(bothwin);
		
		for (String eachwin : bothwin) {
			System.out.println(eachwin);
			
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
			
		}
		
		/*
		//driver.findElementByXPath("(//a[text()='Try it Yourself »'])[1]").click();
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		//String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);
		
		//System.out.println(driver.getWindowHandle());
		
		//[CDwindow-E755D13617E73CA991D48260EDE25B7A, CDwindow-2B035027686FBEAD4BD24908B38B90AE]
		
		for(String eachallwin:allwin) {
		//System.out.println(eachallwin);
			
		driver.switchTo().window(eachallwin);
		System.out.println(driver.getTitle());		
		
		*/
		}
		
		
		
		
		
		//driver.close();
		
	}


