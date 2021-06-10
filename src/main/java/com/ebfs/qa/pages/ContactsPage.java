package com.ebfs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebfs.qa.base.TestBase;
import com.ebfs.qa.properties.ContactsPageProperties;

public class ContactsPage extends TestBase {

	@FindBy(xpath = ContactsPageProperties.LBL_CONTACT_US_XPATH)
	WebElement contactsLabel;
	
	@FindBy(id="id_contact")
	WebElement subjectHeading;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(name="id_order")
	WebElement orderReference;
	
	@FindBy(id = "fileUpload")
	WebElement textFileUpload;
	
	//TO-DO: Add all the Missing WebElement in the Contact Us page
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return contactsLabel.isDisplayed();
	}
	
	
	public void selectSubjectHeadingByVisibleText(String text){
		Select select = new Select(subjectHeading);
		select.selectByVisibleText(text);
	}
	
	//TO-DO: Add all the Missing Action in the Contact Us page
	
	
	
	

}
