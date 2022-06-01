package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegistrationPage;
import pages.TempMail;


public class RegistrationSteps {

    SoftAssert verifyRegistration=new SoftAssert();
    TempMail tempMail = new TempMail();

    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    CompleteRegistrationPage completeRegistrationPage = new CompleteRegistrationPage();
    RegistrationPage registrationPage = new RegistrationPage(Hooks.driver);

    @And("user clicks on the register link")
    public void userClicksOnTheRegisterLink() {

        homePage.clickRegisterLink();
    }

    @When("user entered the valid data")
    public void userEnteredTheValidData() throws Exception {
        registrationPage.registrationSteps();

    }
    @And("user has a valid email")
    public void user_has_a_valid_email()
    {
        if(Hooks.validEmail.isEmpty())
        {
            Hooks.driver.navigate().to("https://temp-mail.org/en/");
            do
            {
                Hooks.validEmail = tempMail.tempEmailValue();
            }while(!(Hooks.validEmail.contains("@")));
            System.out.println("Email: "+ Hooks.validEmail);
            System.out.println("Password: "+ Hooks.validPassword);
        }
    }


    @And("user should Click on the Continue button")
    public void userShouldClickOnTheContinueButton() throws InterruptedException {

        registrationPage.clickContinueButton();
    }

    @Then("user should register successfully")
    public void userShouldRegisterSuccessfully(String message) {

            verifyRegistration.assertEquals(completeRegistrationPage.message().getText(), message, "Registration Process Failed_1");
        }
    @Given("user navigate to home page")
    public void user_navigate_to_home_page()
    {
        if(!(Hooks.driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/")))
        {
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        }
    }
    @Then("^complete Registration message \"(.*?)\" should be displayed")
    public void userShouldSeeMessage(String message)
    {
        verifyRegistration.assertEquals(completeRegistrationPage.message().getText(), message, "Registration Process Failed_1");
    }
    }

