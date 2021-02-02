package stepDefinations;
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
import pageObjects.HomePage;
import pageObjects.SearchShows;
import resources.base;


@SuppressWarnings("unused")
@RunWith(Cucumber.class)
public class searchMovie extends base{
	
 @Given("^Initialize the chrome browser$")
	public void initialize_the_chrome_browser() throws Throwable {
	driver =initializeDriver();   
	}
 
    @Given("^Login to \"([^\"]*)\" site$")
    public void login_to_something_site(String strArg1) throws Throwable {
    	driver.get(strArg1);    }

    @Given("^Click on menu button$")
    public void click_on_menu_button() throws Throwable {
    	HomePage hp= new HomePage(driver);
    	hp.getMenu();
    	hp.topShows();    }

    @Given("^Select Top rated shows$")
    public void select_top_rated_shows() throws Throwable {
        
    }

    @Given("^click search$")
    public void click_search() throws Throwable {
    }
    @When("^User searches (.+)$")
    public void user_searches(String searchinput) throws Throwable {
    }
    @Then("^the page should contain the search input$")
    public void the_page_should_contain_the_search_input() throws Throwable {
    }

    @And("^the search should include (.+)$")
    public void the_search_should_include(String result) throws Throwable {
    }
    @Then("^Verify the title, Rating, Number of reviews of the movie$")
    public void verify_the_title_rating_number_of_reviews_of_the_movie() throws Throwable {
    }
   
}



	  
	/*
	  @Given("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		  driver.get(strArg1);
	    }
	  @Given("^Click on menu button $")
	    public void click_on_menu_button() throws Throwable {
	    	HomePage hp= new HomePage(driver);
	    	hp.getMenu();
	    	hp.topShows();
	   
	    }
}

   /* @When("^User searches (.+)and click search$")
    public void user_searches_and_click_search(String searchinput) throws Throwable {
    	SearchShows ss=new SearchShows(driver);
    	ss.getShows(searchinput);
    	
    }
    

    @Then("^the page should contain the search input$")
    public void the_page_should_contain_the_search_input() throws Throwable {
    }

    @Then("^Verify the title, Rating, Number of reviews of the movie$")
    public void verify_the_title_rating_number_of_reviews_of_the_movie() throws Throwable {
    }

  

   

  /*  @And("^ Select Top rated shows$")
    public void select_top_rated_shows() throws Throwable {
    	
    }
    */

   /* @And("^the search (.+) should include:$")
    public void the_search_should_include(String result) throws Throwable {
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    }

}
*/
