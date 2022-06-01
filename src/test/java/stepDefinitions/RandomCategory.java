package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCategory {
    HomePage homePage=new HomePage(Hooks.driver);
    ProductPage productPage=new ProductPage();
    Random random = new Random();
    int randomNumber = this.random.nextInt(7);
    int randomNumber2;
    String expectedURL;
    @Given("user select random category")
    public void userSelectRandomCategory()
    {
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to cart
        }
        int numberOfCategories=homePage.categories().size();
        int numberOfSubCat=homePage.allSubCategories().size();
        int numberOfAvailableSubCat=0;
        randomNumber = random.nextInt(numberOfCategories);
        Actions action = new Actions(Hooks.driver);
        List<WebElement> availableSubCat=new ArrayList<WebElement>();
        action.moveToElement(homePage.categories().get(randomNumber)).perform();
        for(int i=0;i<numberOfSubCat;i++)
        {
            if(homePage.allSubCategories().get(i).isDisplayed())
            {
                numberOfAvailableSubCat++;
                availableSubCat.add(homePage.allSubCategories().get(i));
            }
        }
        if(numberOfAvailableSubCat>0)
        {
            randomNumber2 = ((this.random.nextInt(numberOfAvailableSubCat)));
            expectedURL=availableSubCat.get(randomNumber2).getAttribute("href");
            availableSubCat.get(randomNumber2).click();
        }
        else
        {
            expectedURL= homePage.categories().get(randomNumber).getAttribute("href");
            homePage.categories().get(randomNumber).click();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("user should redirected to the page of the selected category")
    public void userShouldRedirectedToThePageOfTheSelectedCategory()
    {
        SoftAssert chosenCat=new SoftAssert();
        chosenCat.assertEquals(Hooks.driver.getCurrentUrl(),expectedURL);
        chosenCat.assertAll();
    }
}
