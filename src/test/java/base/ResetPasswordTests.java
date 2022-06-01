package base;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ResetPasswordPage;

public class ResetPasswordTests extends BaseTests{


    @Test
    public void testResetPassword() throws InterruptedException {
        LoginPage loginPage =homePage.clickLogInLink();
        ResetPasswordPage resetPasswordPage = loginPage.clickForgetPasswordLink();
        resetPasswordPage.setEmail("test@gmail.com");
        resetPasswordPage.clickRecoverButton();
        System.out.println(resetPasswordPage.getAlertTxt());

        softAssert.assertEquals(resetPasswordPage.getAlertTxt(),resetPasswordPage.recoverPasswordTxt);
        softAssert.assertAll();
    }
}
