package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.CompareListPage;
import pages.ProductPage;

import java.util.ArrayList;

public class CompareListSteps {

    ProductPage productPage=new ProductPage();
    CompareListPage compareListPage=new CompareListPage();
    SoftAssert productsAddedToCompareList=new SoftAssert();
    ArrayList<String> addedProductToCompareList= new ArrayList<>();
    ArrayList<String> actualProductInCompareList= new ArrayList<>();
    @And("user click on add to compare list")
    public void userClickOnAddToCompareList()
    {
        productPage.addToCompareList().click();
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to compare list
        }
        while(productPage.isAddedToCartSuccessNotification())
        {
            //wait until product added to compare list notification disappear
        }
        addedProductToCompareList.add(productPage.productName().getText());
    }
    @Then("user should found the product added in the compare list")
    public void userShouldFoundTheProductAddedInTheCompareList()
    {
        productPage.compareList().click();
        int numberOfItemsInCompareList=compareListPage.productName().size();
        for(int i=0;i<numberOfItemsInCompareList;i++)
        {
            actualProductInCompareList.add(compareListPage.productName().get(i).getText());
        }
        for(int i=0;i<numberOfItemsInCompareList;i++)
        {
            productsAddedToCompareList.assertTrue(actualProductInCompareList.contains(addedProductToCompareList.get(i)));
            productsAddedToCompareList.assertAll();
        }
    }
}
