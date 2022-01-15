package org.stepdefenition;

import java.util.Date;

import org.utilepackage.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before(order=1)
	public void beforeScenario() {
		launchChrome();
		loadUrl("https://www.allianceairlines.com.au/");
		winMax();
		printTitle();
		printCurrentUrl();
		wait(2);
	}
	
	@Before(order=2)
	public void startTime() {
		System.out.println(new Date());
	}
	
	@After(order=2)
	public void endTime() {
		System.out.println(new Date());
	}
	@After(order=1)
	public void afterScenario() {
		quiteChrome();
	}
}
