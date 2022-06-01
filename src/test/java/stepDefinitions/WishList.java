package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.ProductPage;
import pages.WishListPage;

import java.util.ArrayList;

public class WishList {

    ProductPage productPage=new ProductPage();
    WishListPage wishlistPage=new WishListPage(Hooks.driver);
    SoftAssert productsAddedToWishlist=new SoftAssert();
    ArrayList<String> addedProductToWishlist= new ArrayList<>();
    ArrayList<String> actualProductInWishlist= new ArrayList<>();
    @And("user click on add to wishlist")
    public void userClickOnAddToWishlist()
    {
        productPage.addToWishlistButton().click();
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to wishlist
        }
        while(productPage.isAddedToCartSuccessNotification())
        {
            //wait until product added to wishlist notification disappear
        }
        addedProductToWishlist.add(productPage.productName().getText());
    }

    @Then("user should found the product added to wishlist in the wishlist")
    public void userShouldFoundTheProductAddedToWishlistInTheWishlist()
    {
        productPage.wishlist().click();
        int numberOfItemsInWishlist=wishlistPage.productName().size();
        for(int i=0;i<numberOfItemsInWishlist;i++)
        {
            actualProductInWishlist.add(wishlistPage.productName().get(i).getText());
        }
        for(int i=0;i<numberOfItemsInWishlist;i++)
        {
            productsAddedToWishlist.assertTrue(actualProductInWishlist.contains(addedProductToWishlist.get(i)));
            productsAddedToWishlist.assertAll();
        }

    }
}
