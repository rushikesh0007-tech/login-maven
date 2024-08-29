package testCases;



import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Loginpage;

import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://demo.livis.ai/auth/login");
		 driver.manage().window().maximize();
		
	}

	@Test(priority=1)
	public void verify_Login() {
	Loginpage lg=new Loginpage(driver);
     lg.setEmail("devteam@dev-livis.ai");
     lg.setPassword("123@Devs");
     lg.clickLogin();
    
	}
	
	
	/*
	 * @AfterClass public void teardown() { driver.quit(); }
	 */
	

}
