package testCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Loginpage;

public class BaseClass {
    
    public WebDriver driver;
    
    @BeforeClass
    public void setup() {
        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Initialize the Chrome driver
        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.livis.ai/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority=1)
    public void verify_Login() {
        Loginpage lg = new Loginpage(driver);
        lg.setEmail("devteam@dev-livis.ai");
        lg.setPassword("123@Devs");
        lg.clickLogin();
    }
    
    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
