Feature: Verify whether a new user is able to search a movie into the IMDB Application
@tag2
Scenario Outline: Searched Movie should be displayed
Given Initialize the chrome browser
And Login to "https://www.imdb.com/" site
And  Click on menu button to select Top rated shows
When User searches <Search input> 
Then Verify the title, Rating, Number of reviews of the movie


Examples:
|Search input   |		
|Game of Thrones|