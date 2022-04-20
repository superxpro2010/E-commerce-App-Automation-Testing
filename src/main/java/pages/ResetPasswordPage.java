package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    private WebDriver driver;
    //private By forgetPassword
    private By emailField = By.id("Email");
    private By recoverButton = By.xpath("//button[text()=\"Recover\"]");
    private By emailSentAlert = By.cssSelector("#bar-notification");
    public String recoverPasswordTxt = "Email with instructions has been sent to you.";


    public ResetPasswordPage(WebDriver driver) {
        this.driver=driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }



    public void clickRecoverButton(){
        driver.findElement(recoverButton).click();
    }
    public String getAlertTxt(){
      return  driver.findElement(emailSentAlert).getText();
    }
}
