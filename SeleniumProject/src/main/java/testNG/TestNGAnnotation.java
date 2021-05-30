package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGAnnotation {

	/* 
		-In Annotation instead of main method used @Test to execute.
		-we know 9 Annotations- 4 pre condition then 1 Test then 4 post condition
		 	all of them will execute serially, if anyone of them are missing 
		 	in test cases its will not run.
		-Annotations 1st letter Capital like-@BeforeTest
		-after using Annotation create a customize method and try to use method name
			 as class/Annotation name and we know method name start with lower case.	
	*/
	
	@BeforeSuite	
	public void beforeSuite() {
		System.out.println("Pre condition- 1st Annotation- run only one time");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre condition- 2nd Annotation - run only one time");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Pre condition- 3nd Annotation - run only one time");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Pre condition- 4nd Annotation - run as many as test Annotation");
		
	}
	
	@Test
	public void test1() {
		System.out.println("5th Annotation- test case 1 - run one time");
	}
		/*if priority in test cases- lowest number priority is the Highest priority 
		when every test case execute and syntex will be-
		
		@Test (priority = 0 or 1 or 2)
		public void test1() {
		System.out.println(" ");
		}
		
		*/
	@Test
	public void test2() {
		System.out.println("5th Annotation- test case 2 - run one time");
	}
	
	@AfterMethod
	private void afterMethod(){
		System.out.println("post condition- 6th Annotation - run as many as test Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("post condition- 7th Annotation - run only one time");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Post condition- 8th Annotation - run only one time");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Post condition- 9th Annotation - run only one time");
	}
}
