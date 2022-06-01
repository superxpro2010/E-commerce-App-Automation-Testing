package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationCompletedPage {
    private WebDriver driver;
    private By continueButton = By.linkText("Continue");
    String registrationCompleted = "Your registration completed";


    public RegistrationCompletedPage(WebDriver driver){
        this.driver = driver;
    }
    public HomePage clickContinueButton(){
        driver.findElement(continueButton).click();
        return new HomePage(driver);
    }
}
