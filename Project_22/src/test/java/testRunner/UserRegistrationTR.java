package testRunner;

import org.testng.annotations.Test;

import pages.UserRegistrationPages;
import setup.BaseSetup;

public class UserRegistrationTR extends BaseSetup {
	
	UserRegistrationPages signUp;
	
	@Test(priority = 1, description = "Test Case 1: Register User" )
	public void userRegistration() {
		signUp = new UserRegistrationPages(driver);
		signUp.userRegistration(userRegisterJson);
		signUp.userDeletion();
	}
	
	@Test(priority = 2, description = "Test Case 5: Register User with existing email")
	public void registerWithExistingEmail() {
		signUp = new UserRegistrationPages(driver);
		signUp.registerWithExistingEmail(userLoginJson);
	}

}
