package testRunner;

import org.testng.annotations.Test;

import pages.TC_7_pages;
import setup.BaseSetup;

public class TC_7_TR extends BaseSetup{
	TC_7_pages testCases;
	
	  @Test(priority = 1, description = "Test Case 7: Verify Test Cases Page")
	    public void verifyTestCasesPage(){
	        testCases = new TC_7_pages(driver);
	        testCases.verifyTestCases();
	    }

}
