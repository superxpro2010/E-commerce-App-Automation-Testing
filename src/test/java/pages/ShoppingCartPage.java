package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.Hooks;

import java.util.List;

public class ShoppingCartPage {
    private WebDriver driver;
    private By termsButton = By.id("termsofservice");
    private By checkoutButton = By.id("checkout");


    public ShoppingCartPage(WebDriver driver) {
    this.driver = Hooks.driver;
}
    public void clickTermsBox(){
        driver.findElement(termsButton).click();
    }
    public CheckOutPage clickCheckOut(){
        driver.findElement(checkoutButton).click();
        return new CheckOutPage(driver);
    }
    public List<WebElement> productName ()
    {
        List <WebElement> productName = Hooks.driver.findElements(By.xpath("//div[@class=\"table-wrapper\"]//tbody/tr//td[@class=\"product\"]/a"));
        return productName;
    }
    public WebElement termsOfService ()
    {
        WebElement termsOfService = Hooks.driver.findElement(By.xpath("//input[@id=\"termsofservice\"]"));
        return termsOfService;
    }
    public WebElement checkoutButton ()
    {
        WebElement checkoutButton = Hooks.driver.findElement(By.xpath("//button[@id=\"checkout\"]"));
        return checkoutButton;
    }
    public Select country ()
    {
        WebElement countryList= Hooks.driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"));
        Select country = new Select(countryList);
        return country;
    }
    public WebElement city ()
    {
        WebElement city = Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]"));
        return city;
    }
    public WebElement address ()
    {
        WebElement address = Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]"));
        return address;
    }
    public WebElement zipCode ()
    {
        WebElement zipCode = Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]"));
        return zipCode;
    }
    public WebElement phoneNumber ()
    {
        WebElement phoneNumber = Hooks.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]"));
        return phoneNumber;
    }
    public WebElement firstContinueButton ()
    {
        WebElement firstContinueButton = Hooks.driver.findElement(By.xpath("//button[@onclick=\"Billing.save()\"]"));
        return firstContinueButton;
    }
    public WebElement secondContinueButton ()
    {
        WebElement secondContinueButton = Hooks.driver.findElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]"));
        return secondContinueButton;
    }
    public WebElement thirdContinueButton ()
    {
        WebElement thirdContinueButton = Hooks.driver.findElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]"));
        return thirdContinueButton;
    }
    public WebElement fourthContinueButton ()
    {
        WebElement fourthContinueButton = Hooks.driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]"));
        return fourthContinueButton;
    }
    public WebElement confirmOrderButton ()
    {
        WebElement confirmOrderButton = Hooks.driver.findElement(By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]"));
        return confirmOrderButton;
    }
    public WebElement confirmedOrderTextElement ()
    {
        WebElement confirmedOrderTextElement = Hooks.driver.findElement(By.xpath("//div[@class=\"page-body checkout-data\"]/div/div/strong"));
        return confirmedOrderTextElement;
    }
}
