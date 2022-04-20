package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected LoginPage loginPage;


    @And("user navigates to login page")
    public LoginPage userNavigatesToLoginPage() {
        LoginPage loginPage = homePage.clickLogInLink();
        return new LoginPage(driver);
    }

    @When("user enter valid username and password")
    public HomePage user_enter_valid_username_and_password() {
        loginPage.loginSteps();
        return new HomePage(driver);
    }
    @Then("user could login successfully")
    public void user_could_login_successfully() {

    }

    @After
    public void close_browser() {
        driver.quit();
    }
}
