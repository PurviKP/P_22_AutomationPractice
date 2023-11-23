package pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginUserPages {
	public LoginUserPages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath = "//li/a/i[contains(@class,'home')]")
	    WebElement homePageConfirmation;
	    @FindBy (xpath = "//a[@href='/login']")
	    WebElement signUpLink;
	    @FindBy (name = "name")
	    WebElement name;
	    @FindBy (xpath = "//input[@data-qa='signup-email']")
	    WebElement emailAddress;
	    @FindBy (xpath = "//button[@data-qa='signup-button']")
	    WebElement signUpButton;
	    @FindBy(xpath = "//button[@data-qa='create-account']")
	    WebElement createButton;
	    @FindBy(xpath = "//h2[@data-qa='account-created']")
	    WebElement accountCreationConfirmation;
	    @FindBy(xpath = "//a[@data-qa='continue-button']")
	    WebElement continueButton;
	    @FindBy(xpath = "//li[10]")
	    WebElement loggedInConfirmation;
	    @FindBy(xpath = "//li[5]/a/i[@class='fa fa-trash-o']")
	    WebElement deleteIcon;
	    @FindBy(xpath = "//input[@data-qa='login-email']")
	    WebElement loginEmailBox;
	    @FindBy(name = "password")
	    WebElement passwordBox;
	    @FindBy(xpath = "//button[@data-qa='login-button']")
	    WebElement loginButton;
	    @FindBy(xpath = "//div[contains(@class,'container')]/div[1]/div[1]/div/h2")
	    WebElement loginToYourAccountText;
	    @FindBy(xpath = "//p[contains(.,'Your email or password is incorrect!')]")
	    WebElement errorMessageText;
	    @FindBy(xpath = "//li[4]/a[.=' Logout']")
	    WebElement logoutIcon;
	    
	    // Test Case 2: Login User with correct email and password
	    public void loginUsingValidCredential(JSONObject userLogin) {
	    	Assert.assertTrue(homePageConfirmation.isEnabled());
	    	signUpLink.click();
	        Assert.assertEquals("Login to your account", loginToYourAccountText.getText());
	        loginEmailBox.sendKeys((String)userLogin.get("email"));
	        passwordBox.sendKeys((String)userLogin.get("password"));
	        loginButton.click();
	        Assert.assertEquals("Logged in as " + (String) userLogin.get("name"), loggedInConfirmation.getText());
	    }
	    
	    // Test Case 3: Login User with incorrect email and password
	    public void loginUserWithInvalidCredential(JSONObject invalidUserLogin) {
	    	Assert.assertTrue(homePageConfirmation.isEnabled());
	    	signUpLink.click();
	        Assert.assertEquals("Login to your account", loginToYourAccountText.getText());
	        loginEmailBox.sendKeys((String)invalidUserLogin.get("email"));
	        passwordBox.sendKeys((String) invalidUserLogin.get("password"));
	        loginButton.click();
	        Assert.assertEquals("Your email or password is incorrect!",errorMessageText.getText());
	    }
	    
	    // Test Case 4: Logout User
	    public void logoutUser() {
	    	logoutIcon.click();
	    	 Assert.assertTrue(signUpLink.isEnabled());
	    }
}
