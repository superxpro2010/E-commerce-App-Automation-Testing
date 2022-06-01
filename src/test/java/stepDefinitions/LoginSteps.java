package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    public static WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(Hooks.driver);
    LoginPage loginPage = new LoginPage(Hooks.driver);


    @And("user fill his or her email")
    public void userFillHisOrHerEmail()
    {
        if(Hooks.isLogin==false) {
            loginPage.setEmail(Hooks.validEmail);

        }
    }
    @And("user fill his or her password")
    public void userFillHisOrHerPassword()
    {
        if(Hooks.isLogin==false) {
            loginPage.setPassword(Hooks.validPassword);
        }
    }
    @And("user click on log in button")
    public void userClickOnLogInButton()
    {
        if(Hooks.isLogin==false) {
            loginPage.loginButton().click();
        }
    }
    @And("user should to be able to logged in")
    public void userShouldToBeAbleToLoggedIn()
    {
        loginPage.loginButton().click();
    }

}
