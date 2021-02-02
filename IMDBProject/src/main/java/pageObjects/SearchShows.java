package pageObjects;
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


	//@FindBy(linkText="Game of Thrones: The Last Watch")
	// public WebElement movie;

	@FindBy()
	public WebElement title;

	@FindBy(className="imdbRating")
	public WebElement rating;

	@FindBy(css="//span[@itemprop='ratingValue']")
	
	public WebElement review;
	public void getShows(String searchmovie)
	{
		search.sendKeys(searchmovie);
	}

	//public void getSearch()//Search the movie
	//{
	//	search.sendKeys();
	//}
/*public void typeMovie(String MovieName)
	{
		movie.sendKeys(MovieName);
	}
	
	*/
	public void getTitle()
	{

	}

	public void getRating()
	{
		rating.isDisplayed();
	}

	public void getReviews()
	{
		review.isDisplayed();
	}





}
