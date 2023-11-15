package testRunner;

import org.testng.annotations.Test;

import pages.TC_6_pages;
import setup.BaseSetup;

public class TC_6_TR extends BaseSetup {
	TC_6_pages contactUs;
	
	 @Test(priority = 1, description = "Test Case 6: Contact Us Form")
	    public void ContactUsForm(){
	        contactUs=new TC_6_pages(driver);
	        contactUs.contactUsForm(contactUsJson);
	    }

}
