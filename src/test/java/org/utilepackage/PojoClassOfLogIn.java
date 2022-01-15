package org.utilepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClassOfLogIn extends BaseClass {
	public PojoClassOfLogIn() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='loginLinks']")
	private WebElement btnLogin;
	
	@FindBy(id="AgencyName")
	private WebElement txtAgencyName;

	@FindBy(id="AgencyLogin")
	private WebElement txtAgencyLogin;
	
	@FindBy(id="AgencyPassword")
	private WebElement txtAgencyPass;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnLog;
	
	public WebElement getBtnLog() {
		return btnLog;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtAgencyName() {
		return txtAgencyName;
	}

	public WebElement getTxtAgencyLogin() {
		return txtAgencyLogin;
	}

	public WebElement getTxtAgencyPass() {
		return txtAgencyPass;
	}
	

}
