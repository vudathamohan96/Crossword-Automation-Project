@search
Feature: Test Crossword search scenario

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When the user search a book
    And user click search button
    Then application should be closed
  Examples: 
   |usernameNumber|
   | 1  	|
 
 
   