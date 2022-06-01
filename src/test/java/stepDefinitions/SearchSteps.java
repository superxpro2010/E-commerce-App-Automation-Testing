package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchResultPage;

import java.util.ArrayList;

public class SearchSteps {

    public static WebDriver driver = Hooks.driver;
    SoftAssert searchResult= new SoftAssert();
    SearchResultPage searchResultPage=new SearchResultPage(Hooks.driver);

    String searchItem=null;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);



    @When("^user types product name \"(.*?)\" on the search bar")
    public void userTypesProductNameOnTheSearchBar(String searchTerm) {
        homePage.searchField().sendKeys(searchTerm);
        this.searchItem=searchTerm;
    }

    @And("user clicks on the search button")
    public void userClicksOnTheSearchButton() {
        homePage.clickSearchButton();

    }

    @Then("system should display the search results")
    public void systemShouldDisplayTheSearchResults() {
        {
            int numberOfItems = searchResultPage.productList().size();
            int check;
            searchResult.assertFalse(numberOfItems <= 0, "No Relevant Search Items For This Search Term");
            searchResult.assertAll();
            ArrayList<String> productListS = new ArrayList();
            for (int i = 0; i < numberOfItems; i++) {
                productListS.add(searchResultPage.productList().get(i).getText());
                check = productListS.get(i).toUpperCase().indexOf(searchItem.toUpperCase());
                searchResult.assertFalse(check == -1, "One Of Search Results Is Irrelevant To Search Term");
                searchResult.assertAll();
            }
        }
    }
}

