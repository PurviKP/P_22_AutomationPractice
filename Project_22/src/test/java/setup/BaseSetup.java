package setup;

import java.time.Duration;

import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Utils;


public class BaseSetup {
	public static WebDriver driver;
	public static SoftAssert softAssert;
	public static JSONObject userRegisterJson = Utils.loadjsonFile("./src/test/resources/userRegistration.json");
	public static JSONObject userLoginJson = Utils.loadjsonFile("./src/test/resources/userLogin.json");
    public static JSONObject paymentDetailsJson = Utils.loadjsonFile("./src/test/resources/paymentDetails.json");
    public static JSONObject poloBrandProductsJson = Utils.loadjsonFile("./src/test/resources/poloBrandProduct.json");
    public static JSONObject madameBrandProductsJson = Utils.loadjsonFile("./src/test/resources/madameBrandProduct.json");
    public static JSONObject invalidUserJson = Utils.loadjsonFile("./src/test/resources/invalidUserLogin.json");
    public static JSONObject contactUsJson = Utils.loadjsonFile("./src/test/resources/contactUs.json");
    public static JSONObject applicationInputJson = Utils.loadjsonFile("./src/test/resources/applicationInput.json");

    public static final String expectedFilename = "invoice.txt";
    public static final String downloadpath = "D:/Purvi/selenium";
    
    @BeforeMethod
    public void setup() {
    	softAssert = new SoftAssert();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("load-extention=" + "D:\\Purvi\\selenium\\chromedriver.exe");
        chromeOptions.addArguments("download.default_directory",downloadpath);
        WebDriverManager.chromedriver().capabilities(chromeOptions).setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com/");
    }
    
    @AfterMethod
    public void CloseDriver() {
    	driver.close();
    }
    
    public static JavascriptExecutor getJavascriptExecutor(){
        return (JavascriptExecutor) driver;
    }
}
