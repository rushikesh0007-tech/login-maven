package loginLivis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
			
		driver.get("https://demo.livis.ai/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("devteam@dev-livis.ai");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123@Devs");
		driver.findElement(By.xpath("//button[@id='livis-login-btn']")).click();

	}

}
