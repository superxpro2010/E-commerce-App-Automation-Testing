package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginLink = By.cssSelector("a[class=\"ico-login\"]");
    private By loginBtn = By.cssSelector("button[class=\"button-1 login-button\"]");
    private By rememberMe = By.id("RememberMe");


    public LoginPage(WebDriver driver) {
        this.driver = Hooks.driver;
    }

    public RegistrationPage clickLRegisterButton() {
        clickLink("Register");
        return new RegistrationPage(Hooks.driver);
    }

    public void setEmail(String email) {
        Hooks.driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password) {
        Hooks.driver.findElement(passwordField).sendKeys(password);
    }

    public void chooseRememberMe() {
        driver.findElement(rememberMe).click();
    }

    public ResetPasswordPage clickForgetPasswordLink() {
        clickLink("Forgot password?");
        return new ResetPasswordPage(Hooks.driver);
    }
    public WebElement forgotPassword ()
    {
        WebElement forgotPassword= Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
        return forgotPassword;
    }
    public WebElement loginButton ()
    {
        WebElement loginButton= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginButton;
    }
    private void clickLink(String linkText) {
        Hooks.driver.findElement(By.linkText(linkText)).click();
    }

    public void loginSteps(String username, String password){
        setEmail(username);
        setPassword(password);
        //clickLogInButton();
    }
}
