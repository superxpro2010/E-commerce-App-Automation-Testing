package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetPasswordSteps {

    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected LoginPage loginPage;
    protected ResetPasswordPage resetPasswordPage;

    @Given("user open the browser")
    public void user_open_his_browser() {
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().fullscreen();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        resetPasswordPage = new ResetPasswordPage(driver);
        softAssert = new SoftAssert();
    }

    @And("click on the Login Link")
    public LoginPage click_on_the_login_link() {
        LoginPage loginPage = homePage.clickLogInLink();
        return new LoginPage(driver);
    }

    @When("user clicks on the forget password link")
    public ResetPasswordPage user_clicks_on_the_forget_password_link() {
        loginPage.clickForgetPasswordLink();
        return  new ResetPasswordPage(driver);
    }

    @And("enter his valid email")
    public void enter_his_valid_email_and_clicks_RecoverButton() {
        resetPasswordPage.setEmail("test@gmail.com");
        resetPasswordPage.clickRecoverButton();
    }
    @And("user clicks RecoverButton")
    public void user_clicks_RecoverButton() {
        resetPasswordPage.clickRecoverButton();
    }

    @Then("he will receive email to reset his password")
    public void he_will_receive_email_to_reset_his_password() {
    }

    @After
    public void close_browser() {
        driver.quit();
    }
}
