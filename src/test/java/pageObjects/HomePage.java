package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(linkText = "Register")
	WebElement lnkRegister;

	@FindBy(linkText = "Login")   // Login link added in step6
	WebElement linkLogin;
	
	@FindBy(xpath = "//input[@placeholder='Search']")   // Login link added in step6
	WebElement SearchText;
	
	@FindBy(xpath = "//button[@class='btn btn-light btn-lg']")   // Login link added in step6
	WebElement clickSearch1;
		
	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin()    // added in step6
	{
		linkLogin.click();
	}

	public void enterProductName(String pname) {
		// TODO Auto-generated method stub
		SearchText.sendKeys(pname);
	}

	public void clickSearch() {
		
		clickSearch1.click();
		
		
		
	}
	
	
	
}
