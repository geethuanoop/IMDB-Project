Feature: Verify whether a new user is able to search a movie into the IMDB Application
@tag2
Scenario Outline: Searched Movie should be displayed
Given Initialize the chrome browser
And Login to "https://www.imdb.com/" site
And  Click on menu button 
And  Select Top rated shows
When User searches <Search input>
And  click search
Then the page should contain the search input
And the search should include <Result>
Then Verify the title, Rating, Number of reviews of the movie


Examples:
|Search input   |		|Result                        |
|Game of Thrones|   |Game of Thrones:The Last Watch|
