package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC_7_pages {
	public TC_7_pages(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
	
	@FindBy(xpath = "//li/a/i[contains(@class,'home')]")
    WebElement homePageConfirmation;
	
	@FindBy(xpath = "//a[@href='/test_cases']")
	WebElement testCases;
	
	 @FindBy(xpath = "//h5")
	 WebElement testCasesConfirmation;
	 
	 // Test Case 7: Verify Test Cases Page
	 public void verifyTestCases(){
	        Assert.assertTrue(homePageConfirmation.isEnabled());
	        testCases.click();
	        Assert.assertTrue(testCases.isEnabled());
	        Assert.assertEquals("Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:",testCasesConfirmation.getText());

	    }
}
