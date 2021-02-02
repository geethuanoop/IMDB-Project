package pageObjects;

 
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateAccount {
    public WebDriver driver;
    /*By Name =By.id("id ap_customer_name");
    By Email=By.id("ap_email");
    By Password=By.id("ap_password");
    By Repassword=By.id("ap_password_check");
    By submit= By.id("continue");
    */
    
    
    public CreateAccount(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
        //this.driver=driver;
    }
    
    @FindBy(name="customerName")
	public WebElement Name;

    @FindBy(id="ap_email")
   	public WebElement Email;
    
    @FindBy(id="ap_password")
   	public WebElement Password;
    
    @FindBy(id="ap_password_check")
   	public WebElement RePassword;
    
    @FindBy(id="continue")
   	public WebElement BtnSubmit;

	//public WebElement getSignin()
	//{
	//	return driver.findElement(signin);
		
		
    public void getName(String name)
    {
        Name.sendKeys(name);
    }
    public void getEmail(String email)
    {
        Email.sendKeys(email);
    }
    public void getPassword(String password)
    {
        Password.sendKeys(password);
    }

    public void getRepassword(String repassword)
    {
        RePassword.sendKeys(repassword);
    }
    public void getSubmit()
    {
        BtnSubmit.click();
    }


}
