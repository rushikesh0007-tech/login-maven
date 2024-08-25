package loginLivis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
			
          driver.get("https://demo.livis.ai/auth/login");
         // driver.close();
	}

}
