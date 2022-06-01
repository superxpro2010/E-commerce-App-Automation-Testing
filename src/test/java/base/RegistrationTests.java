package base;

import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTests extends BaseTests {


    @Test
    public void testRegistration() throws InterruptedException {

        RegistrationPage registrationPage = homePage.clickRegisterLink();
        registrationPage.clickMaleButton();
        registrationPage.enterFirstName("AAAAAA");
        registrationPage.enterLastName("dwwdww");
        registrationPage.selectBirthDay("30");
        registrationPage.selectBirthMonth("2");
        registrationPage.selectBirthYear("2000");
        registrationPage.enterEmail("test177777@gmail.com");
        registrationPage.enterCompanyName("dddddd");
        registrationPage.enterPassword("test123");
        registrationPage.enterConfirmPassword("test123");
        registrationPage.clickRegisterButton();
        Thread.sleep(2000);
        registrationPage.clickContinueButton();


    }
}


