package org.utilepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAllianceAirlinesHomePage extends BaseClass {
	public PojoAllianceAirlinesHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Book A Flight']")
	private WebElement btnBookAFlight;
	
	@FindBy(id="selDepart")
	private WebElement txtFrom;
	
	@FindBy(id="selDest")
	private WebElement txtTo;
	
	@FindBy(xpath="//img[@title='Departure Date']")
	private WebElement txtDepartureDate;
	
	@FindBy(xpath="//img[@title='Return Date']")
	private WebElement txtReturnDate;
	
	@FindBy(id="selAdult")
	private WebElement txtAdult;
	
	@FindBy(id="selChild")
	private WebElement txtChild;
	
	@FindBy(id="selInfant")
	private WebElement txtInfant;
	
	@FindBy(xpath="(//div[@class='containeBTN'])[2]")
	private WebElement btnBookNow;
	
	@FindBy(xpath="//div[@class='close']")
	private WebElement btnClocse;
	
	@FindBy(xpath="//a[@class='manage']")
	private WebElement btnManageBookings;
	
	@FindBy(xpath="//a[@class='webcheck']")
	private WebElement btnWebCheckIn;
	
	@FindBy(xpath="//label[text()='Return']")
	private WebElement chkBoxReturn;
	
	@FindBy(id="rbRetOneWayB")
	private WebElement chkBoxOneWay;
	
	@FindBy(xpath="(//a[text()='Where We Fly'])[1]")
	private WebElement btnWhereWeFly;
	
	@FindBy(xpath="(//a[text()='Flying With Us'])[1]")
	private WebElement btnFlyingWithUs;
	
	@FindBy(xpath="(//a[text()='Aircraft Charters'])[1]")
	private WebElement btnAircraftCharters;
	
	@FindBy(xpath="(//a[text()='Aircraft Sales & Leasing'])[1]")
	private WebElement btnAircraftSaleLeasing;
	
	@FindBy(xpath="(//a[text()='FAQs'])[1]")
	private WebElement btnFaqs;
	
	@FindBy(xpath="(//a[text()='Contact Us'])[1]")
	private WebElement btnContactUs;
	
	@FindBy(xpath="//a[text()='30']")
	private WebElement btnDate30;
	
	@FindBy(xpath="//input[@id='company-name']")
	private WebElement txtCompanyName;
	
	@FindBy(xpath="//input[@placeholder='Contact Email']")
	private WebElement txtContactEmail;
	
	public WebElement getTxtContactEmail() {
		return txtContactEmail;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtContactName() {
		return txtContactName;
	}

	public WebElement getTxtContactNumber() {
		return txtContactNumber;
	}

	public WebElement getTxtOrigin() {
		return txtOrigin;
	}

	public WebElement getTxtDestination() {
		return txtDestination;
	}

	public WebElement getDdDepatureDate() {
		return ddDepatureDate;
	}

	public WebElement getDdTime() {
		return ddTime;
	}

	public WebElement getDdPassanger() {
		return ddPassanger;
	}

	public WebElement getDdServiceStyle() {
		return ddServiceStyle;
	}

	public WebElement getTxtComments() {
		return txtComments;
	}

	public WebElement getChkRobot() {
		return chkRobot;
	}

	public WebElement getBtnSend() {
		return btnSend;
	}
	@FindBy(xpath="//input[@id='contact-name']")
	private WebElement txtContactName;
	
	@FindBy(xpath="//input[@id='contact-telephone']")
	private WebElement txtContactNumber;
	
	@FindBy(xpath="//input[@id='flight-1-origin']")
	private WebElement txtOrigin;
	
	@FindBy(xpath="//input[@id='flight-1-destination']")
	private WebElement txtDestination;
	
	@FindBy(xpath="(//input[@class='hasDatepicker'])[3]")
	private WebElement ddDepatureDate;
	
	@FindBy(xpath="//select[@name='flight-1-time']")
	private WebElement ddTime;
	
	@FindBy(xpath="//select[@name='flight-1-passengers']")
	private WebElement ddPassanger;
	
	@FindBy(xpath="//select[@name='service-style']")
	private WebElement ddServiceStyle;
	
	@FindBy(xpath="//textarea[@name='comments']")
	private WebElement txtComments;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	private WebElement chkRobot;
	
	@FindBy(xpath="//input[@name='cmdSend']")
	private WebElement btnSend;

	public WebElement getBtnDate30() {
		return btnDate30;
	}

	public WebElement getBtnBookAFlight() {
		return btnBookAFlight;
	}

	public WebElement getTxtFrom() {
		return txtFrom;
	}

	public WebElement getTxtTo() {
		return txtTo;
	}

	public WebElement getTxtDepartureDate() {
		return txtDepartureDate;
	}

	public WebElement getTxtReturnDate() {
		return txtReturnDate;
	}

	public WebElement getTxtAdult() {
		return txtAdult;
	}

	public WebElement getTxtChild() {
		return txtChild;
	}

	public WebElement getTxtInfant() {
		return txtInfant;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getBtnClocse() {
		return btnClocse;
	}

	public WebElement getBtnManageBookings() {
		return btnManageBookings;
	}

	public WebElement getBtnWebCheckIn() {
		return btnWebCheckIn;
	}

	public WebElement getChkBoxReturn() {
		return chkBoxReturn;
	}

	public WebElement getChkBoxOneWay() {
		return chkBoxOneWay;
	}

	public WebElement getBtnWhereWeFly() {
		return btnWhereWeFly;
	}

	public WebElement getBtnFlyingWithUs() {
		return btnFlyingWithUs;
	}

	public WebElement getBtnAircraftCharters() {
		return btnAircraftCharters;
	}

	public WebElement getBtnAircraftSaleLeasing() {
		return btnAircraftSaleLeasing;
	}

	public WebElement getBtnFaqs() {
		return btnFaqs;
	}

	public WebElement getBtnContactUs() {
		return btnContactUs;
	}
	
	@FindBy(xpath="//a[text()='25']")
	private WebElement date25;

	public WebElement getDate25() {
		return date25;
	}
	
	@FindBy(xpath="//option[text()='7:00am']")
	private WebElement time7;

	public WebElement getTime7() {
		return time7;
	}
	
	@FindBy(xpath="//option[text()='50 - 59']")
	private WebElement opt50;

	public WebElement getOpt50() {
		return opt50;
	}

	@FindBy(xpath="//option[text()='Premium']")
	private WebElement premium;

	public WebElement getPremium() {
		return premium;
	}
	
	 
	

}
