Feature: Login functionality test with multiple credentials

Scenario Outline: Testing login functionality with multiple invalid usernames
Given user is on the home page of Amazon
When he hovers the pointer over Hello Sign In menu
And he clicks on the Sign in button in the sub-menu
And he enters an invalid username  '<username>'
And he clicks on Continue button
Then he must see the error message  'We cannot find an account with that email address'
Examples: 
|username|
|batman554466@gmail.com|
|ironman554466@gmail.com|
|superman554466@gmail.com|
|spiderman554466@gmail.com|
|captainplanet554466@gmail.com| 

