package base;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.ShoppingCartPage;
import pages.HtcOnePage;
import pages.RegistrationPage;

public class CompleteCheckOutTests extends BaseTests {



    @Test
    public void completeTheCheckOutTest() throws InterruptedException {
//        RegistrationTests registrationTests = new RegistrationTests();
//        registrationTests.testRegistration();
//        LoginTests loginTests = new LoginTests(driver);
//        loginTests.testSuccessfulLogin();

        RegistrationPage registrationPage = homePage.clickRegisterLink();
        registrationPage.clickMaleButton();
        registrationPage.enterFirstName("sdads");
        registrationPage.enterLastName("dasd");
        registrationPage.selectBirthDay("30");
        registrationPage.selectBirthMonth("11");
        registrationPage.selectBirthYear("1988");
        registrationPage.enterEmail("test@gmail.com");
        registrationPage.enterCompanyName("tetete");
//        registrationPage.

        HtcOnePage htcOnePage = homePage.clickHtcOneItem();
        htcOnePage.clickAddToCart();
        Thread.sleep(2000);
        ShoppingCartPage shoppingCartPage = homePage.clickShopingCart();
        shoppingCartPage.clickTermsBox();
        CheckOutPage checkOutPage =shoppingCartPage.clickCheckOut();
        checkOutPage.selectCountry("Egypt");
        checkOutPage.enterCityAddress("sdadsad");
        checkOutPage.enterNewAddress("seefe");
        checkOutPage.enterZipCode("asdsadsa");
        checkOutPage.enterPhoneNumber("32423423423423");
        checkOutPage.clickBillingContinueBtn();
    }
}
