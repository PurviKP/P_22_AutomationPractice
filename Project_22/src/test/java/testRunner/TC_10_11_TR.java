package testRunner;

import org.testng.annotations.Test;

import pages.TC_10_11_pages;
import setup.BaseSetup;

public class TC_10_11_TR extends BaseSetup {
	TC_10_11_pages subscription;
	
	@Test(priority = 1, description = "Test Case 10: Verify Subscription in home page")
    public void verifySubscriptionInHomePage(){
		subscription=new TC_10_11_pages(driver);
		subscription.verifySubscriptionHomePage();
	}

	@Test(priority = 2, description = "Test Case 11: Verify Subscription in cart page")
    public void verifySubscriptionInCartPage(){
		subscription=new TC_10_11_pages(driver);
		subscription.verifySubscriptionCartPage();
	}

}
