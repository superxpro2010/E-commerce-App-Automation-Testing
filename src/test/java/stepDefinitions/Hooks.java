package stepDefinitions;

import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Hooks
{
    static public WebDriver driver =null;
    static public String validEmail="";
    static public String validPassword ="Alaa123987/*-";
    static public boolean isThisEmailRegistered=false;
    static public boolean isLogin=false;
    CompleteRegistrationPage completeRegistrationPage = new CompleteRegistrationPage();
    SoftAssert verifyRegistration=new SoftAssert();
    HomePage homePage=new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);

    @BeforeAll
    public static void user_open_chrome_browser()
    {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After //(order=1)
    public static void user_close_the_driver(Scenario scenario)
    {
        if(scenario.isFailed())
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TakesScreenshot ts= (TakesScreenshot) driver;
            byte [] src=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","screenshot");
        }
    }
    @AfterAll
    public static void r()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    //common steps between features
    @Given("user opens the Website")
    public void user_opens_the_Website()
    {
        if(!(Hooks.driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/")))
        {
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        }
    }
    @And("user should login successfully")
    public void userShouldLoginSuccessfully()
    {
        verifyRegistration.assertTrue(completeRegistrationPage.logout().isDisplayed(), "Registration Process Failed_2");
        verifyRegistration.assertAll();
        Hooks.isThisEmailRegistered=true;
        Hooks.isLogin=true;
    }
    @Given("user had a valid registered account")
    public void userHadAValidRegisteredAccount()
    {
        Assert.assertTrue(((!(Hooks.validEmail.isEmpty()))&&(Hooks.isThisEmailRegistered)),"There's no valid account registered yet");
    }
    @And("user click on log in")
    public void userClickOnLogIn() throws InterruptedException {
        if(Hooks.isLogin==false) {
            homePage.login().click();
        }
    }
    @When("user enter valid username and password")
    public HomePage user_enter_valid_username_and_password() {
        if(Hooks.isLogin==false)
        {
            loginPage.loginSteps(validEmail,validPassword);
        }
        return new HomePage(Hooks.driver);
    }

    @When("user select the shoes sub-category")
    public void user_select_the_shoes_sub_category() {
        Actions action = new Actions(Hooks.driver);
        //Move mouse to Apparel category
        action.moveToElement(homePage.apparelCategory()).perform();
        //Select shoes sub category
        homePage.shoesSubCategory().click();
    }

    @And("User Should login normally")
    public void User_Should_login_normally(){
        verifyRegistration.assertTrue(completeRegistrationPage.logout().isDisplayed(), "Registration Process Failed_2");
        verifyRegistration.assertAll();
        Hooks.isThisEmailRegistered=true;
        Hooks.isLogin=true;
    }
    @Then("user click on log out button")
    public void userClickOnLogOutButton()
    {
        if(Hooks.isLogin==true) {
            completeRegistrationPage.logout().click();
            verifyRegistration.assertTrue(homePage.login().isDisplayed(), "Logout Process Failed");
            verifyRegistration.assertAll();
            Hooks.isLogin = false;
        }
    }
}
