package testRunner;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.UserRegistrationPages;
import pages.LoginUserPages;
import pages.ProductPagePages;
import setup.BaseSetup;

public class ProductPageTR extends BaseSetup {
	ProductPagePages productPage;
	UserRegistrationPages singUp;
	LoginUserPages loginPage;
	
//	@Test(priority = 1, description = "Test Case 8: Verify All Products and product detail page")
//	public void verifyAllProductAndProductDetails() {
//		productPage = new TC_8_9_12_to_24_pages(driver);
//		productPage.productDetailsPageConfirmation();
//	}
	
	@Test (priority = 2 , description = "Test Case 9: Search Product")
	public void verifyProductSearch() {
		productPage = new ProductPagePages(driver);
		productPage.productSearch();
	}

	@Test (priority = 3 , description = "Test Case 12: Add Products in Cart")
	 public void productAddToCart(){
        productPage = new ProductPagePages(driver);
        productPage.productAddToCart();
    }
	
	 @Test(priority = 4, description = "Test Case 13: Verify Product quantity in Cart")
	    public void verifyProductQuantity(){
	        productPage = new ProductPagePages(driver);
	        productPage.productQuantityInCart();
	    }
	 
	 @Test(priority = 5, description = "Test Case 14: Place Order: Register while Checkout")
	    public void placeOrderRegisterWhileCheckout(){
		 singUp = new UserRegistrationPages(driver);
		 productPage = new ProductPagePages(driver);
		 productPage.productCheckout();
		 singUp.userRegistration(userRegisterJson);
		 productPage.productCheckoutAfterLogin(userRegisterJson);
		 singUp.userDeletion();
	 }
	 
	 @Test(priority = 6, description = "Test Case 15: Place Order: Register before Checkout")
	    public void placeOrderRegisterBeforeCheckout(){
		 singUp = new UserRegistrationPages(driver);
		 productPage = new ProductPagePages(driver);
		 productPage.productCheckout();
		 singUp.userRegistration(userRegisterJson);
		 productPage.productCheckoutAfterLogin(userRegisterJson);
		 singUp.userDeletion();
	 }
	 
	 @Test(priority = 7, description = "Test Case 16: Place Order: Login before Checkout")
	    public void loginBeforeCheckout(){
		 loginPage = new LoginUserPages(driver);
	     loginPage.loginUsingValidCredential(userLoginJson);
		 productPage = new ProductPagePages(driver);
		 productPage.productCheckout();
		 productPage.productCheckoutAfterLogin(userLoginJson);
	 }
	 
	 @Test(priority = 8, description = "Test Case 17: Remove Products From Cart")
	    public void removeProductFromCart(){
	        productPage = new ProductPagePages(driver);
	        productPage.productCheckout();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        productPage.removeProductFromCart();
	    }
	 
	    @Test(priority = 9, description = "Test Case 18: View Category Products")
	    public void viewCategoryProduct() {
	    	productPage = new ProductPagePages(driver);
	    	productPage.viewWomenCategoryProduct();
	    	productPage = new ProductPagePages(driver);
	    	productPage.viewMenCategoryProduct();
	    }
	    
	    @Test(priority = 10, description = "Test Case 19: View & Cart Brand Products")
	    public void viewBrandProduct() {
	        productPage = new ProductPagePages(driver);
	        productPage.viewPoloBrandProduct();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        productPage = new ProductPagePages(driver);
	        productPage.viewMadamBrandProduct();
	    }
	    
	    @Test(priority = 11, description = "Test Case 20: Search Products and Verify Cart After Login")
	    public void searchProductsAndVerifyCartAfterLogin() {
	        productPage = new ProductPagePages(driver);
	        productPage.searchProductsAndVerifyCartAfterLogin();
	        productPage.verifyProductNames();
	        loginPage = new LoginUserPages(driver);
	        loginPage.loginUsingValidCredential(userLoginJson);
	        productPage.verifyProductNames();
	    }
	    
	    @Test(priority = 12, description = "Test Case 21: Add review on product")
	    public void writeProductReview() {
	        productPage = new ProductPagePages(driver);
	        productPage.writeProductReview();

	    }
	    
	    @Test(priority = 13, description = "Test Case 22: Add to cart from Recommended items")
	    public void addRecommendedItemsToCart(){
	        productPage = new ProductPagePages(driver);
	        productPage.addRecommendedItemsToCart();
	    }
	    
	    @Test(priority = 14, description = "Test Case 23: Verify address details in checkout page")
	    public void VerifyAddressDetailsInCheckoutPage(){
	        singUp = new UserRegistrationPages(driver);
	        singUp.userRegistration(userRegisterJson);
	        productPage = new ProductPagePages(driver);
	        productPage.productCheckout();
	        productPage.productCheckoutAfterLogin(userRegisterJson);
	        singUp.userDeletion();
	    }
	    
	    @Test(priority = 15, description = "Test Case 24: Download Invoice after purchase order")
	    public void DownloadInvoiceAfterPurchaseOrder() throws InterruptedException {
	    	productPage = new ProductPagePages(driver);
	        singUp = new UserRegistrationPages(driver);
	        productPage.deleteIfFilePresent();
	        productPage.productCheckout();
	        singUp.userRegistration(userRegisterJson);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        productPage.productCheckoutAfterLogin(userRegisterJson);
	        productPage.downloadInvoiceAfterPurchaseOrder();
	        singUp.userDeletion();	        
	    }	
}
