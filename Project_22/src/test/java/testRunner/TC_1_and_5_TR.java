package testRunner;

import org.testng.annotations.Test;

import pages.TC_1_and_5_pages;
import setup.BaseSetup;

public class TC_1_and_5_TR extends BaseSetup {
	
	TC_1_and_5_pages signUp;
	
	@Test(priority = 1, description = "Test Case 1: Register User" )
	public void userRegistration() {
		signUp = new TC_1_and_5_pages(driver);
		signUp.userRegistration(userRegisterJson);
		signUp.userDeletion();
	}
	
	@Test(priority = 2, description = "Test Case 5: Register User with existing email")
	public void registerWithExistingEmail() {
		signUp = new TC_1_and_5_pages(driver);
		signUp.registerWithExistingEmail(userLoginJson);
	}

}
