package com.letskodeit.testclass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.letskodeit.pageclass.LoginPage;
import com.letskodeit.pageclass.NavigationPage;
import com.letskodeit.pageclass.ResultPage;
import com.letskodeit.pageclass.SearchBarPage;

public class AllCourseTest {
	
	
	WebDriver driver;
	String baseURL;
	NavigationPage nav;
	LoginPage login;
	SearchBarPage search;
	ResultPage result;
	
	
	@BeforeClass
	public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		baseURL = "https://courses.letskodeit.com/";
		driver.get(baseURL);
		nav = new NavigationPage(driver);
		login = nav.Login();
		nav = login.signInWith("test@email.com", "abcabc");
		}
	
	@Test
	public void verifySearchCourse() {
		nav.allCourse();
		search = new SearchBarPage(driver);
		result = search.course("rest_api");
		boolean searchResult = result.verifyPage();
		Assert.assertTrue(searchResult);
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
