package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver driver;
    private By termsButton = By.id("termsofservice");
    private By checkoutButton = By.id("checkout");



    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickTermsBox(){
        driver.findElement(termsButton).click();
    }
    public CheckOutPage clickCheckOut(){
        driver.findElement(checkoutButton).click();
        return new CheckOutPage(driver);
    }



}
