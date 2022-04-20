package base;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;

public class ShoppingCartTests extends BaseTests {




    @Test
    public void shoppingCartTest() {
        ShoppingCartPage shoppingCartPage = homePage.clickShopingCart();
        shoppingCartPage.clickTermsBox();
        shoppingCartPage.clickCheckOut();

    }

}
