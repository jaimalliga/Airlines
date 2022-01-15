package org.stepdefenition;

import org.junit.Assert;
import org.utilepackage.BaseClass;
import org.utilepackage.PojoAllianceAirlinesHomePage;

import io.cucumber.java.en.*;



public class HomeStepDefenitions extends BaseClass {
	
	@When("User Should click the Fly with Us button")
	public void userShouldClickTheFlyWithUsButton() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnFlyingWithUs());
	}

	@Then("User Verify Fly With Us page is load or not")
	public void userVerifyFlyWithUsPageIsLoadOrNot() {
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("to Veryfy the url", url.equals(url));
	}

	@When("User Should click the  button Aircraft Charter")
	public void userShouldClickTheButtonAircraftCharter() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnAircraftCharters());
	}

	@Then("User Verify Aircraft Charter page is load or not")
	public void userVerifyAircraftCharterPageIsLoadOrNot() {
		String url = driver.getCurrentUrl();
	    Assert.assertTrue("to Veryfy the url", url.equals(url));
	}

	@When("User Should click the  button Aircraft Sales and Lease")
	public void userShouldClickTheButtonAircraftSalesAndLease() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnAircraftSaleLeasing());
	}

	@Then("User Verify Aircraft Sales and Lease page is load or not")
	public void userVerifyAircraftSalesAndLeasePageIsLoadOrNot() {
		String url = driver.getCurrentUrl();
	    Assert.assertTrue("to Veryfy the url", url.equals(url));
	}

	@When("User Should click the  button FAQs")
	public void userShouldClickTheButtonFAQs() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnFaqs());
	}

	@Then("User Verify FAQs page is load or not")
	public void userVerifyFAQsPageIsLoadOrNot() {
		String url = driver.getCurrentUrl();
	    Assert.assertTrue("to Veryfy the url", url.equals(url));
	}

	@When("User Should click the  button Contact Us")
	public void userShouldClickTheButtonContactUs() {
		PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
		btnClick(p.getBtnContactUs());
	}

	@Then("User Verify Contact Us page is load or not")
	public void userVerifyContactUsPageIsLoadOrNot() {
		String url = driver.getCurrentUrl();
	    Assert.assertTrue("to Veryfy the url", url.equals(url));
	}
	
	@When("User should type company name{string}")
	public void userShouldTypeCompanyName(String s1) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtCompanyName(), s1);
	}

	@When("User should type contact name{string}")
	public void userShouldTypeContactName(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtContactName(), string);
	}

	@When("User should type contact number{string}")
	public void userShouldTypeContactNumber(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtContactNumber(), string);
	}

	@When("User should type contact emailId{string}")
	public void userShouldTypeContactEmailId(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtContactEmail(), string);
	}

	@When("User should type origin{string}")
	public void userShouldTypeOrigin(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtOrigin(), string);
	}

	@When("User should type destination{string}")
	public void userShouldTypeDestination(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtOrigin(), string);
	}

	@When("User Should Select date")
	public void userShouldSelectDate() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    moveElementTo(p.getDdDepatureDate());
	    actionsClick();
	    wait(3);
	    moveElementTo(p.getDate25());
	    actionsClick();
	}

	@When("User should Select time")
	public void userShouldSelectTime() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    jsClick(p.getDdTime());
	    wait(3);
	    moveElementTo(p.getTime7());
	    actionsClick();
	}

	@When("User Should select passanger")
	public void userShouldSelectPassanger() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    jsClick(p.getDdPassanger());
	    wait(3);
	    moveElementTo(p.getOpt50());
	    actionsClick();
	}

	@When("User should select service style")
	public void userShouldSelectServiceStyle() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    jsClick(p.getDdServiceStyle());
	    wait(3);
	    moveElementTo(p.getPremium());
	    actionsClick();
	}

	@When("User should type comments{string}")
	public void userShouldTypeComments(String string) {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    fill(p.getTxtComments(), string);
	}

	@When("User should click the send button")
	public void userShouldClickTheSendButton() {
	    PojoAllianceAirlinesHomePage p = new PojoAllianceAirlinesHomePage();
	    btnClick(p.getBtnSend());
	}
}
