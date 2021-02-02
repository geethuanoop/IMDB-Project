package pageObjects;
//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
   /* By menu=By.id("imdbHeader-navDrawerOpen--desktop");
    By shows=By.xpath("//div[@class='sc-jzJRlG jGFlLU']//div[1]//span[1]//div[1]//div[1]//ul[1]//a[3]");
    By search= By.id("suggestion-search");
    By movie= By.linkText("Game of Thrones: The Last Watch");
    By rating= By.className("imdbRating");
    By reviews= By.cssSelector("//span[@itemprop='ratingValue']");
    */
		
    @FindBy(id="imdbHeader-navDrawerOpen--desktop")
    public WebElement menu;
    
    @FindBy(xpath="//div[@class='sc-jzJRlG jGFlLU']//div[1]//span[1]//div[1]//div[1]//ul[1]//a[3]")
    public  WebElement shows;

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
    
    public void getMenu()
    {
      menu.click();
    }
    
    public void topShows() {
    	
    	shows.click();
    }
}


