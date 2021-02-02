package pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount{

	public WebDriver driver;
	public NewAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this); // not sure	
	}

	
	@FindBy(linkText="Create a New Account")
	public WebElement CreateAccount;


	
	public void ClickCreateAccount()
	{

		CreateAccount.click();
		
	}

}














