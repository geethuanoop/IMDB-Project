package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyUserRegistration {

	WebDriver driver;
	public VerifyUserRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // not sure
	}	
	//	@FindBy(name="cvf_captcha_input")
		@FindBy(xpath="//input[@name='code']")
		
		public WebElement OTP;

		

		public void VerifyOTP()
		{
			//return driver.findElement(createaccount);
			OTP.click();
			
		}

}
