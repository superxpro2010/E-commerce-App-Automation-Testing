package base;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickLogInLink();
        loginPage.setEmail("test@gmail.com");
        loginPage.setPassword("test123");
        //loginPage.clickLogInButton();

    }
}
