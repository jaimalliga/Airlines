package org.stepdefenition;

import org.junit.Assert;
import org.utilepackage.BaseClass;
import org.utilepackage.PojoWhereWeFly;

import io.cucumber.java.en.*;

public class WhereWeFly extends BaseClass {
	@Given("User Should Display the Message")
	public void userShouldDisplayTheMessage() {
	   System.out.println("User Should Check the WHERE WE FLY Button");
	   System.out.println("Scenario 2 Starting");
	}

	@When("User should click where we fly button")
	public void userShouldClickWhereWeFlyButton() {
		PojoWhereWeFly p = new PojoWhereWeFly();
		jsHighLight(p.getWhereWeFly());
		btnClick(p.getWhereWeFly());
	    
	}

	@When("The page will be load and print titile & url")
	public void thePageWillBeLoadAndPrintTitileUrl() {
	    printTitle();
	    printCurrentUrl();
	}

	@Then("User Verify the page is load or not")
	public void userVerifyThePageIsLoadOrNot() {
	    String title = driver.getTitle();
	    Assert.assertTrue("Validate the page Where we fly", title.equals(title));
	    System.out.println("Scenario 2 will be executed");
	}


}
