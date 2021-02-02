	Feature: Verify whether the newly registered user is able to login to the IMDB Application
@tag1
Scenario Outline: Successful login to IMDB application
Given Initialize the browser with chrome
And Navigate to "https://www.imdb.com/" Site
And Click on sign in button 
And  click on create account button
When User enters <username>,<email>, <password>, <repassword>
Then User is  successfully logged into the application

Examples:
|username	|	|email|							|password|	|repassword|
|Geeth    |	|abcd124@gmail.com|	|password1|	|password1|
|Anoop|		|abc12@gmail.com|		|password2|	|password2|