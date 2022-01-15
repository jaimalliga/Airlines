package org.stepdefenition;

import org.junit.Assert;
import org.utilepackage.BaseClass;
import org.utilepackage.PojoAllianceAirlinesHomePage;

import io.cucumber.java.en.*;

public class AllianceAirlinesHome extends BaseClass {
	@Given("User Should be Click the Book a Flight")
	public void user_Should_be_Click_the_Book_a_Flight() {
	   PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	   btnClick(p.getBtnBookAFlight());
	}

	@When("User Should be Click the one way check box")
	public void user_Should_be_Click_the_one_way_check_box() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    btnClick(p.getChkBoxOneWay());
	}
	
	@When("User Should be Click the Return check box")
	public void userShouldBeClickTheReturnCheckBox() {
		 PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		    btnClick(p.getChkBoxReturn());
	}

	@When("User should be click from and print the cities in console and click a canberra city")
	public void user_should_be_click_from_and_print_the_cities_in_console_and_click_a_canberra_city() {
	   PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	   btnClick(p.getTxtFrom());
	   allOption(p.getTxtFrom());
	   ddSingIndex(p.getTxtFrom(), 4);
	   selectedOption(p.getTxtFrom());
	   
	}

	@When("User Should be click to and print the dropdown in console and click a sunshine Coast")
	public void user_Should_be_click_to_and_print_the_dropdown_in_console_and_click_a_sunshine_Coast() {
	   PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	   btnClick(p.getTxtTo());
	   allOption(p.getTxtTo());
	   ddSingIndex(p.getTxtTo(), 2);
	   selectedOption(p.getTxtTo());
	}

	@When("User should be click Departure Date and Select One date")
	public void user_should_be_click_Departure_Date_and_Select_One_date() {
	   PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	   jsClick(p.getTxtDepartureDate());
	   wait(2);
	   moveElementTo(p.getBtnDate30());
	   actionsClick();
	   //selectedOption(p.getTxtDepartureDate());
	}

	@When("User should be click the Adult Text box and print the drop down option and click")
	public void user_should_be_click_the_Adult_Text_box_and_print_the_drop_down_option_and_click() {
	  PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	  btnClick(p.getTxtAdult());
	  allOption(p.getTxtAdult());
	  ddSingIndex(p.getTxtAdult(), 1);
	  
	}

	@When("User should be click the child text box and print the drop down option and click")
	public void user_should_be_click_the_child_text_box_and_print_the_drop_down_option_and_click() {
	   PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	   btnClick(p.getTxtChild());
	   allOption(p.getTxtChild());
	   ddSingIndex(p.getTxtChild(), 0);
	}

	@When("user should be click the infant text box and print the drop down option and click")
	public void user_should_be_click_the_infant_text_box_and_print_the_drop_down_option_and_click() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		   btnClick(p.getTxtInfant());
		   allOption(p.getTxtInfant());
		   ddSingIndex(p.getTxtInfant(), 0);
	}

	@When("User should be click the button Book Now")
	public void user_should_be_click_the_button_Book_Now() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnBookNow());
	}

	@Then("User Should be navigate to the flight availablity page and verify")
	public void user_Should_be_navigate_to_the_flight_availablity_page_and_verify() {
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("Check the url", url.contains("Availability"));
	    System.out.println("My booking scenario will be executed");
	}
	
	@When("user should be click Return Date and Select one Date")
	public void userShouldBeClickReturnDateAndSelectOneDate() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		   jsClick(p.getTxtReturnDate());
		   wait(2);
		   moveElementTo(p.getBtnDate30());
		   actionsClick();
	}
	
	

	

}
