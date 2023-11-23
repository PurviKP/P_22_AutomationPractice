package testRunner;

import org.testng.annotations.Test;

import pages.VerifyTestCasesPages;
import setup.BaseSetup;

public class VerifyTestCasesTR extends BaseSetup{
	VerifyTestCasesPages testCases;
	
	  @Test(priority = 1, description = "Test Case 7: Verify Test Cases Page")
	    public void verifyTestCasesPage(){
	        testCases = new VerifyTestCasesPages(driver);
	        testCases.verifyTestCases();
	    }

}
