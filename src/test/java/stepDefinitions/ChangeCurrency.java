package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class ChangeCurrency {

    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);


    @When("user change the currency.")
    public void userChangeTheCurrency() {
        loginPage.loginSteps(Hooks.validEmail, Hooks.validPassword);
    }

    @Then("the currency should changed successfully.")
    public void theCurrencyShouldChangedSuccessfully() {
        homePage.selectCustomerCurrency("Euro");
    }
}
