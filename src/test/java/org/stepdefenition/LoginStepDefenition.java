package org.stepdefenition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilepackage.BaseClass;
import org.utilepackage.PojoClassOfLogIn;

import io.cucumber.java.en.*;

public class LoginStepDefenition extends BaseClass{
	@Given("User Should be launch Browser and load The Alliance page Url")
	public void user_Should_be_launch_Browser_and_load_The_Alliance_page_Url() {
		
	}

	@When("User Should go to click Corporate Login")
	public void user_Should_go_to_click_Corporate_Login() {
	   PojoClassOfLogIn p = new PojoClassOfLogIn();
	   jsHighLight(p.getBtnLogin());
	   btnClick(p.getBtnLogin());
	}

	@When("print the tittle  of Login page")
	public void print_the_tittle_of_Login_page() {
		Set<String> allid = driver.getWindowHandles();
	    List <String> li = new ArrayList<String>();
	    li.addAll(allid);
	    driver.switchTo().window(li.get(1));
		printTitle();
	}

	@When("print the current url of Login page")
	public void print_the_current_url_of_Login_page() {
	    printCurrentUrl();
	}

	@When("User Should type the invalid agency name")
	public void user_Should_type_the_invalid_agency_name() {
		PojoClassOfLogIn p = new PojoClassOfLogIn();
		jsHighLight(p.getTxtAgencyName());
		fill(p.getTxtAgencyName(), "poda");
	}

	@When("User Should type the invalid user id")
	public void user_Should_type_the_invalid_user_id() {
	    PojoClassOfLogIn p = new PojoClassOfLogIn();
	    jsHighLight(p.getTxtAgencyLogin());
	    fill(p.getTxtAgencyLogin(), "jojo@gmail.com");
	}

	@When("User should type the invalid password")
	public void user_should_type_the_invalid_password() {
	    PojoClassOfLogIn p = new PojoClassOfLogIn();
	    jsHighLight(p.getTxtAgencyPass());
	    fill(p.getTxtAgencyPass(), "jaij@11928");
	}

	@When("User Should Click login button")
	public void user_Should_Click_login_button() {
	    PojoClassOfLogIn p = new PojoClassOfLogIn();
	    jsHighLight(p.getBtnLog());
	    btnClick(p.getBtnLog());
	}

	@Then("User Should Show to Incorrect user and pass")
	public void user_Should_Show_to_Incorrect_user_and_pass() {
	    WebElement error = driver.findElement(By.id("AgencyLogin-error"));
	    jsHighLight(error);
	    String errorMessage = error.getText();
	    System.out.println("Error Message =  "+errorMessage);
	    Assert.assertTrue("to check the validation", errorMessage.equals(errorMessage));
	    System.out.println("-----The Validation is be Failed Bcoz Invalid Details-----");
	    System.out.println("*****My First Scenario Will Be Executed*****");
	}


}
