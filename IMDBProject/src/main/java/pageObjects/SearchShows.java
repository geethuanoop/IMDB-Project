package pageObjects;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchShows {
	public WebDriver driver;
	public SearchShows(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="suggestion-search")
	public WebElement search;

@FindBy(xpath="//div[normalize-space()='Game of Thrones: The Last Watch']")
public WebElement movie;
	
//@FindBy(linkText="Game of Thrones: The Last Watch")
	// public WebElement movie;

	@FindBy(xpath="//div[@id='wrapper']//h1[1]")
	public WebElement title;

	//@FindBy(className="imdbRating")
	//public WebElement rating;
	@FindBy(xpath="//span[@itemprop='ratingValue']")
	public WebElement rating;

public WebElement reviews;

	//@FindBy(css="//span[@itemprop='ratingValue']")
 @FindBy(xpath="//span[@class='small']")
 public WebElement review;

	public void getShows(String searchmovie)
	{
		search.sendKeys(searchmovie);
	}

	
public void typeMovie()
	{
		movie.click();
	}
	
	
	public void getTitle()
	{
		String gettitletext= title.getText().trim();
		assertEquals("Game of Thrones:The Last Watch (2019)",gettitletext);
	}
	

	public void getRating()
	{
		//double expectedcnt= 7.2;
		String actualcnt= rating.getText().trim();
		assertEquals("7.2",actualcnt);
	}

	public void getReview()
	{
		String getreview= review.getText().trim();
		assertEquals("5652",getreview);
	}





}
