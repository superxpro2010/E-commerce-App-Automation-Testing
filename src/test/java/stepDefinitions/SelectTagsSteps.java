package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ShoesSubcategoryPage;

public class SelectTagsSteps {

     ShoesSubcategoryPage shoesSubcategoryPage = new ShoesSubcategoryPage(Hooks.driver);

    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);

    @And("user select different tags")
    public void userSelectDifferentTags() {
        shoesSubcategoryPage.filterByApparelTag();
        shoesSubcategoryPage.filterByAwesomeTag();
    }

    @Then("the filtered results should be opened normally")
    public void theFilteredResultsShouldBeOpenedNormally() {
    }
}
