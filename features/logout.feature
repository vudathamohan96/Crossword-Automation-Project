@logout
Feature: Test Crossword logout scenario

  Scenario Outline: Test logout 
    Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    And clicks logoutbutton
    Then application should be closed
  Examples: 
   |usernameNumber|
   | 1  	|
 
 
   