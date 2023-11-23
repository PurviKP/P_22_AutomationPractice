package testRunner;

import org.testng.annotations.Test;

import pages.ScrollUpAndScrollDownPages;
import setup.BaseSetup;

public class ScrollUpAndScrollDownTR extends BaseSetup {
	ScrollUpAndScrollDownPages homePageScrollFunctionality;
	
	 @Test(priority = 1, description = "Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality")
	    public void scrollUpWithArrowAndScrollDownFunctionality(){
	        homePageScrollFunctionality =new ScrollUpAndScrollDownPages(driver);
	        homePageScrollFunctionality.scrollUpWithArrowAndScrollDownFunctionality();
	    }

	    @Test(priority = 1, description = "Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality")
	    public void scrollUpAndScrollDownFunctionality(){
	        homePageScrollFunctionality =new ScrollUpAndScrollDownPages(driver);
	        homePageScrollFunctionality.scrollUpWithoutArrowAndScrollDown();
	    }
	

}
