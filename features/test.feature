@login
Feature: Test Crossword login scenario

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    Then application should be closed
  Examples: 
   |usernameNumber|
   | 1  	|
 
  