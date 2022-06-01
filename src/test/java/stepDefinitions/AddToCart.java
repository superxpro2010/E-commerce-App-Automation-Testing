package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.AnyCategoryPage;
import pages.ProductPage;
import pages.ShoppingCartPage;

import java.util.ArrayList;
import java.util.Random;

public class AddToCart {



    ProductPage productPage =new ProductPage();

    Random random = new Random();
    int x=5;
    SoftAssert productsAddedToCart=new SoftAssert();

    ShoppingCartPage shoppingCartPage=new ShoppingCartPage(Hooks.driver);
    RandomCategory randomCategory = new RandomCategory();

    ArrayList<String> addedProductToCart= new ArrayList<>();

    AnyCategoryPage anyCategoryPage=new AnyCategoryPage();
    ArrayList <String> productsInCart= new ArrayList<>();
    @Then("user click on random product")
    public void userClickOnRandomProduct()
    {
        int numberOFAvailableProducts=anyCategoryPage.productListInStock().size();
        int randomNumber = random.nextInt(numberOFAvailableProducts);
        anyCategoryPage.productListInStock().get(randomNumber).click();
    }
    @And("user check if the product have attributes")
    public void userCheckIfTheProductHaveAttributes()
    {
        while((productPage.isProductHasAttributes())||(productPage.isProductGiftCard())||(!(productPage.isAddToCartButton()))||(!(productPage.availability()))||(addedProductToCart.contains(productPage.productName().getText())))
        {
            randomCategory.userSelectRandomCategory();
            randomCategory.userShouldRedirectedToThePageOfTheSelectedCategory();
            this.userClickOnRandomProduct();
        }
    }
    @And("user click on add to cart")
    public void userClickOnAddToCart()
    {
        productPage.addToCartButton().click();
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to cart
        }
        while(productPage.isAddedToCartSuccessNotification())
        {
            //wait until product added to cart notification disappear
        }
        addedProductToCart.add(productPage.productName().getText());
    }
    @Then("user should found the product added to cart in shopping cart")
    public void userShouldFoundTheProductAddedToCartInShoppingCart()
    {
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to cart
        }
        while(productPage.isAddedToCartSuccessNotification())
        {
            //wait until product added to cart notification disappear
        }
        productPage.shoppingCart().click();
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until product added to cart
        }
        int actualNumberOfProductInCart=shoppingCartPage.productName().size();
        for(int i=0;i<actualNumberOfProductInCart;i++) {
            productsInCart.add(shoppingCartPage.productName().get(i).getText());
        }
        for(int i=0;i<actualNumberOfProductInCart;i++)
        {
            productsAddedToCart.assertTrue(productsInCart.contains(addedProductToCart.get(i)));
            productsAddedToCart.assertAll();
        }
    }
}
