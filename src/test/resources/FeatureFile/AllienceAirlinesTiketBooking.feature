Feature: To Validate the tiketBooking

  Scenario: To Book a Tiket
    Given User Should be Click the Book a Flight
    When User Should be Click the one way check box
    And User should be click from and print the cities in console and click a canberra city
    And User Should be click to and print the dropdown in console and click a sunshine Coast
    And User should be click Departure Date and Select One date
    And User should be click the Adult Text box and print the drop down option and click 
    And User should be click the child text box and print the drop down option and click 
    And user should be click the infant text box and print the drop down option and click 
    And User should be click the button Book Now
    Then User Should be navigate to the flight availablity page and verify
    
    Scenario: To Book Return Ticket
    Given User Should be Click the Book a Flight
    When User Should be Click the Return check box
    And User should be click from and print the cities in console and click a canberra city
    And User Should be click to and print the dropdown in console and click a sunshine Coast
    And User should be click Departure Date and Select One date
    And user should be click Return Date and Select one Date
    And User should be click the Adult Text box and print the drop down option and click 
    And User should be click the child text box and print the drop down option and click 
    And user should be click the infant text box and print the drop down option and click 
    And User should be click the button Book Now
    Then User Should be navigate to the flight availablity page and verify
    
