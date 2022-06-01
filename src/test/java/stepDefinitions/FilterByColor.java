package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.ShoesSubcategoryPage;

public class FilterByColor {


     ShoesSubcategoryPage shoesSubcategoryPage = new ShoesSubcategoryPage(Hooks.driver);

    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);



    @And("user filter by color")
    public void userFilterByColor() {
        shoesSubcategoryPage.filterByBlue();
    }

    @Then("the filtered results should be displayed")
    public void theFilteredResultsShouldBeDisplayed() {
    }
}
