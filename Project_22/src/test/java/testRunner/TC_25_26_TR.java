package testRunner;

import org.testng.annotations.Test;

import pages.TC_25_26_pages;
import setup.BaseSetup;

public class TC_25_26_TR extends BaseSetup {
	TC_25_26_pages homePageScrollFunctionality;
	
	 @Test(priority = 1, description = "Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality")
	    public void scrollUpWithArrowAndScrollDownFunctionality(){
	        homePageScrollFunctionality =new TC_25_26_pages(driver);
	        homePageScrollFunctionality.scrollUpWithArrowAndScrollDownFunctionality();
	    }

	    @Test(priority = 1, description = "Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality")
	    public void scrollUpAndScrollDownFunctionality(){
	        homePageScrollFunctionality =new TC_25_26_pages(driver);
	        homePageScrollFunctionality.scrollUpWithoutArrowAndScrollDown();
	    }
	

}
