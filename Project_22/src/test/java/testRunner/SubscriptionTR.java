package testRunner;

import org.testng.annotations.Test;

import pages.SubscriptionPages;
import setup.BaseSetup;

public class SubscriptionTR extends BaseSetup {
	SubscriptionPages subscription;
	
	@Test(priority = 1, description = "Test Case 10: Verify Subscription in home page")
    public void verifySubscriptionInHomePage(){
		subscription=new SubscriptionPages(driver);
		subscription.verifySubscriptionHomePage();
	}

	@Test(priority = 2, description = "Test Case 11: Verify Subscription in cart page")
    public void verifySubscriptionInCartPage(){
		subscription=new SubscriptionPages(driver);
		subscription.verifySubscriptionCartPage();
	}

}
