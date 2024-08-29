package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {

	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//input[@id='email']") WebElement txtEmail;
	@FindBy(xpath="//input[@id='password']") WebElement txtPassword;
	@FindBy(xpath="//button[@id='livis-login-btn']") WebElement btnLogin;
	

    @FindBy(xpath = "//div[contains(text(), 'Please enter Email ID')]")
    WebElement emailErrorMessage;

    @FindBy(xpath = "//div[contains(text(), 'Please enter Password')]")
    WebElement passwordErrorMessage;
    
    @FindBy(xpath = "//img[@alt='livis logo']") 
    WebElement livisLogo;
    
			
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		
		btnLogin.click();
	}

	public String getEmailErrorMessage() {
        return emailErrorMessage.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordErrorMessage.getText();
    }
    public boolean isLivisLogoDisplayed() {
        return livisLogo.isDisplayed();
    }
}
