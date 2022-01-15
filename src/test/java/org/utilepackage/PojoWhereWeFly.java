package org.utilepackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoWhereWeFly extends BaseClass {
	public PojoWhereWeFly() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Where We Fly'])[1]")
	private WebElement whereWeFly;

	public WebElement getWhereWeFly() {
		return whereWeFly;
	}

}


