package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.ProductPage;
import pages.ShoppingCartPage;

public class SuccessfulOrderSteps {

    ProductPage productPage=new ProductPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage(Hooks.driver);
    SoftAssert confirmOrder = new SoftAssert();
    @Given("Go to shopping cart")
    public void goToShoppingCart()
    {
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until loading completed
        }
        while(productPage.isAddedToCartSuccessNotification())
        {
            //wait until any notifications disappear
        }
        productPage.shoppingCart().click();
        while (productPage.loadingProgress().isDisplayed())
        {
            //wait until loading completed
        }
    }
    @And("user check on terms of service")
    public void userCheckOnTermsOfService()
    {
        while (!(shoppingCartPage.termsOfService().isSelected()))
            shoppingCartPage.termsOfService().click();
    }
    @And("user click on checkout button")
    public void userClickOnCheckoutButton()
    {
        shoppingCartPage.checkoutButton().click();
    }
    @And("user chose country")
    public void userChoseCountry()
    {
        shoppingCartPage.country().selectByVisibleText("Germany");
    }
    @And("user chose city")
    public void userChoseCity()
    {
        shoppingCartPage.city().sendKeys("Berlin");
    }
    @And("user write address")
    public void userWriteAddress()
    {
        shoppingCartPage.address().sendKeys("Weserstr 13");
    }
    @And("user enter zip code")
    public void userEnterZipCode()
    {
        shoppingCartPage.zipCode().sendKeys("10178");
    }
    @And("user enter phone number")
    public void userEnterPhoneNumber()
    {
        shoppingCartPage.phoneNumber().sendKeys("30681883786");
    }
    @And("user click on first continue button")
    public void userClickOnFirstContinueButton()
    {
        shoppingCartPage.firstContinueButton().click();
    }
    @And("user click on second continue button")
    public void userClickOnSecondContinueButton()
    {
        shoppingCartPage.secondContinueButton().click();
    }
    @And("user click on third continue button")
    public void userClickOnThirdContinueButton()
    {
        shoppingCartPage.thirdContinueButton().click();
    }
    @And("user click on fourth continue button")
    public void userClickOnFourthContinueButton()
    {
        shoppingCartPage.fourthContinueButton().click();
    }
    @And("user click on confirm order button")
    public void userClickOnConfirmOrderButton()
    {
        shoppingCartPage.confirmOrderButton().click();
    }
    @Then("user should redirected to the page of confirmed order")
    public void userShouldRedirectedToThePageOfConfirmedOrder()
    {
        confirmOrder.assertEquals(shoppingCartPage.confirmedOrderTextElement().getText(),"Your order has been successfully processed!");
        confirmOrder.assertAll();
    }
}
