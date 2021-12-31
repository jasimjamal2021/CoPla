package CoPla.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class page {
	
	
	WebDriver driver;
	
	// Create constructor driver as a parameter
	public page(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "i0116")
	WebElement txtusername;

	@FindBy(id = "idSIButton9")
	WebElement buttonclick;

	@FindBy(xpath = "//input[@id='passwordInput']")
	WebElement txtpassword;

	@FindBy(xpath = "//span[@id='submitButton']")
	WebElement submit;

	@FindBy(id = "KmsiCheckboxField")
	WebElement checkbox;

	@FindBy(id = "idSIButton9")
	WebElement id;

	public void setUserName(String username) {
		txtusername.sendKeys(username);
	}

	public void clickbutton() {
		buttonclick.click();

	}

	public void setPassword(String password) {
		txtpassword.sendKeys(password);

	}

	public void submit() {
		submit.click();

	}

	public void checkbox()

	{
		checkbox.click();

	}

	public void clickbuttonid() {
		id.click();

	}
	
}
