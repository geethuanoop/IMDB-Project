package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this); // not sure
		
	}

	//By signin=By.xpath("[//div[contains(text(),'Sign In')]");
	//By createaccount=By.linkText("Create a New Account");

	//@FindBy(xpath="//div[contains(text(),'Sign In']")
	//@FindBy(xpath="//div[contains")
	@FindBy(how=How.XPATH, using ="//div[contains(text(),'Sign In')]")
	
	public WebElement btnSignin;
	

		public void ClickSignin(){
			btnSignin.click();
		}
	
/*	public void ClickCreateAccount()
	{
		//return driver.findElement(createaccount);
		CreateAccount.click();
		
	}
	*/
		

}














