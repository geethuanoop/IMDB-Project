package stepDefinations;

//import com.mailslurp.apis.*;
//import com.mailslurp.clients.*;
//import com.mailslurp.models.*;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import pageObjects.LoginPage;
import pageObjects.NewAccount;
import pageObjects.CreateAccount;
import pageObjects.VerifyUserRegistration;
//import pageObjects.HomePage;
import resources.base;

/*@RunWith(Cucumber.class)
public class stepDefination extends base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
    	driver =initializeDriver();
    	driver.get("https://www.imdb.com/");
       
    }
    

   /* @Given("^User is in the IMDB sign in page$")
    public void user_is_in_the_imdb_sign_in_page() throws Throwable {
    	driver.get("");
    	
        throw new PendingException();
    }
    */

  /*  @When("^User searches \"([^\"]*)\" and select \"([^\"]*)\"$")
    public void user_searches_something_and_select_something(String gameofthrones, String gameofthronesthelastwatch, String strArg1, String strArg2) throws Throwable {
        HomePage hp=new HomePage(driver);
        hp.getMenu().click();
        hp.getShows().click();
        hp.getMovie().sendKeys("Game of thrones");
        hp.getMovie().getText();
        Assert.assertEquals(hp.getMovie(),"Game of Thrones: The Last Watch");
        Assert.assertEquals(hp.getRating(),"Game of Thrones: The Last Watch");
        Assert.assertEquals(hp.getReviews(),"Game of Thrones: The Last Watch");
    	throw new PendingException();
    }

    @When("^User enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and create account$")
    public void user_enters_something_something_something_something_and_create_account(String name, String email, String password, String reenterpassword, String strArg1, String strArg2, String strArg3, String strArg4) throws Throwable {
        throw new PendingException();
    }

    @Then("^\"([^\"]*)\" appear$")
    public void something_appear(String gameofthronesthelastwatch, String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^user registration is successful$")
    public void user_registration_is_successful() throws Throwable {
        throw new PendingException();
    }

    @And("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Click on Menu button on the left corner and select Top rated show$")
    public void click_on_menu_button_on_the_left_corner_and_select_top_rated_show() throws Throwable {
        throw new PendingException();
    }

    @And("^Navigate to Create new accountpage$")
    public void navigate_to_create_new_accountpage() throws Throwable {
        throw new PendingException();
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
        throw new PendingException();
    }

}
*/



@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class stepDefination extends base {
	
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
	       // throw new PendingException();
	    }
	 @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		 driver.get(strArg1);
	      // throw new PendingException();
	    }

	
	 @Given("Click on sign in button")
	 public void click_on_sign_in_button() {
		 LoginPage lp=new LoginPage(driver);
         lp.ClickSignin();
	     //throw new cucumber.api.PendingException();
	 }
	
	 @Given("click on create account button")
	 public void click_on_create_account_button() {
		 NewAccount na=new NewAccount(driver);
         na.ClickCreateAccount();
	    // throw new cucumber.api.PendingException();
	 }

	   
	    @When("^User enters (.+),(.+), (.+), (.+)$")
	    public void user_enters_(String username, String email, String password, String repassword) throws Throwable {
	    	CreateAccount ca=new CreateAccount(driver);
	    	ca.getName(username);
	    	ca.getEmail(email);
	    	ca.getPassword(password);
	    	ca.getRepassword(repassword);
	    	ca.getSubmit();
	        //throw new PendingException();
	        
	    }

	    @Then("^User is  successfully logged into the application$")
	    public void user_is_successfully_logged_into_the_application() throws Throwable {
	    	//VerifyUserRegistration vr= new VerifyUserRegistration(driver);
	    	//vr.VerifyOTP();
	    	System.out.println("user registration completed");
	        //throw new PendingException();
	    }

	   
	   
	   /* @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	       // throw new PendingException();
	    }
*/
	}