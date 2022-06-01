package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetPasswordSteps {


    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);

    ResetPasswordPage resetPasswordPage =new ResetPasswordPage(Hooks.driver);
    SoftAssert verifyRecoveryMessage =new SoftAssert();


    @When("user clicks on the forget password link")
    public void userClickOnForgotPassword()
    {
        loginPage.forgotPassword().click();
    }

    @And("enter his valid email")
    public void enterHisValidEmail() {
        loginPage.setEmail(Hooks.validEmail);
    }

    @And("user clicks RecoverButton")
    public void userClicksRecoverButton() {
        resetPasswordPage.clickRecoverButton();
    }

    @Then("user should see message {string}at the top")
    public void userShouldSeeMessageAtTheTop(String message)
    {
        verifyRecoveryMessage.assertEquals(resetPasswordPage.message().getText(),message,"Wrong Recovery Message 01");
        verifyRecoveryMessage.assertTrue(resetPasswordPage.message().isDisplayed(),"Wrong Recovery Message 02");
        verifyRecoveryMessage.assertAll();
    }


}
