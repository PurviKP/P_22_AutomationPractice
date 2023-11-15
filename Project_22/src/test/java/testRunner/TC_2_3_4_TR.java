package testRunner;

import org.testng.annotations.Test;

import pages.TC_2_3_4Pages;
import setup.BaseSetup;

public class TC_2_3_4_TR extends BaseSetup {
	TC_2_3_4Pages loginPage;
	
	 @Test(priority = 1, description = "Test Case 2: Login User with correct email and password")
	    public void loginUsingValidCredential(){
	        loginPage=new TC_2_3_4Pages(driver);
	        loginPage.loginUsingValidCredential(userLoginJson);
	    }
	    @Test(priority = 2, description = "Test Case 3: Login User with incorrect email and password")
	    public void loginUserWithInvalidCredential(){
	        loginPage=new TC_2_3_4Pages(driver);
	        loginPage.loginUserWithInvalidCredential(invalidUserJson);
	    }
	    @Test(priority = 3, description = "Test Case 4: Logout User")
	    public void logout(){
	        loginPage=new TC_2_3_4Pages(driver);
	        loginPage.loginUsingValidCredential(userLoginJson);
	        loginPage.logoutUser();
	    }
	}
