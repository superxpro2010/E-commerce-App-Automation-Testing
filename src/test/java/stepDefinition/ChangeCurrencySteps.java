package stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ChangeCurrencySteps {

    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected LoginPage loginPage;
    protected ResetPasswordPage resetPasswordPage;

@Given("user open his browser")

    @Then("user wants to change his currency to euro")
    public void user_wants_to_change_his_currency_to_euro() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the currency should be changed to euro")
    public void the_currency_should_be_changed_to_euro() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void close_browser() {
        driver.quit();
    }

}
