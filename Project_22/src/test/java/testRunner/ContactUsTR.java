package testRunner;

import org.testng.annotations.Test;

import pages.ContactUsPages;
import setup.BaseSetup;

public class ContactUsTR extends BaseSetup {
	ContactUsPages contactUs;
	
	 @Test(priority = 1, description = "Test Case 6: Contact Us Form")
	    public void ContactUsForm(){
	        contactUs=new ContactUsPages(driver);
	        contactUs.contactUsForm(contactUsJson);
	    }

}
