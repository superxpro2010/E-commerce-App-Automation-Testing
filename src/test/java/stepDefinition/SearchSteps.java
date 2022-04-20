package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchResultPage;

public class SearchSteps {
    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected SearchResultPage searchResultPage;
    protected LoginPage loginPage;


    @Given("user open the browser")
    public void user_opens_the_browser() {
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().fullscreen();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        loginPage = new LoginPage(driver);
        softAssert = new SoftAssert();
    }

    @When("user login with valid email and password")
    public HomePage user_login_with_valid_email_and_password() {
        LoginPage loginPage = homePage.clickLogInLink();
        loginPage.loginSteps();
        return new HomePage(driver);
    }

    @And("user types product name on the search bar")
    public void user_types_product_name_on_the_search_bar() {
        homePage.enterSearchItem("Apple");
    }

    @And("user clicks on the search button")
    public SearchResultPage user_clicks_on_the_search_button() {
        SearchResultPage searchResultPage = homePage.clickSearchButton();
        return new SearchResultPage(driver);
    }

    @Then("system should display the search results")
    public void system_should_display_the_search_results() {
    }

    @After
    public void close_browser() {
        driver.quit();
    }
}
