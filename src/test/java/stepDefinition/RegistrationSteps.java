package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationCompletedPage;
import pages.RegistrationPage;

public class RegistrationSteps {
    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected RegistrationPage registrationPage;
    protected RegistrationCompletedPage registrationCompletedPage;

    @Given("user open the browser")
        public void user_open_the_browser(){
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().fullscreen();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
        registrationCompletedPage = new RegistrationCompletedPage(driver);
        softAssert = new SoftAssert();
    }

    @And("user clicks on the register link")
    public RegistrationPage user_clicks_on_the_register_link() {
        RegistrationPage registrationPage = homePage.clickRegisterLink();
        return  new RegistrationPage(driver);
        }

    @When("user entered the valid data")
    public HomePage user_entered_the_valid_data() throws InterruptedException {
        registrationPage.registrationSteps();
        return  new HomePage(driver);

    }
    @And("And user should Click on the Continue button")
    public HomePage user_should_Click_on_the_Continue_button(){
        registrationCompletedPage.clickContinueButton();
        return new HomePage(driver);
    }

    @Then("user should register successfully")
    public void user_should_register_successfully() {

    }


}
