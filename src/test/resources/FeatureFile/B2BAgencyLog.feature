Feature: To Validate Login Functionality of Alliance Airlines Page

  Background: 
    Given User Should be launch Browser and load The Alliance page Url
    When User Should go to click Corporate Login
    And print the tittle  of Login page
    And print the current url of Login page

  Scenario: Validate the Login page invalid Agency name invalid User id invalid pass
    And User Should type the invalid agency name
    And User Should type the invalid user id
    And User should type the invalid password
    And User Should Click login button
    Then User Should Show to Incorrect user and pass
