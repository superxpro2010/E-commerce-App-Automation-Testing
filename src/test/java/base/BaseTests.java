package base;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilils.WindowManager;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;


    @Before
    public void setUp() {
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().fullscreen();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
    }

    @Test
    public void successfulOrderTest() throws InterruptedException {
        RegistrationTests registrationTests = new RegistrationTests();
       // registrationTests.testRegistration();

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}

