package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class ChangeCategorySteps {
    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    @When("user hover over the Computers category")
    public void userHoverOverTheComputersCategory() {
        homePage.hoverOverComputerCategory();
    }

    @And("user choose Notebook sub category.")
    public void userChooseNotebookSubCategory() {
        homePage.clickNotebooksSubCategory();
    }

    @Then("the category should be opened.")
    public void theCategoryShouldBeOpened() {
    }


}
