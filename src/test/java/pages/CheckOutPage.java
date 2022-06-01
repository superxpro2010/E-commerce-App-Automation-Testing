package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private WebDriver driver;
    private By cityAddressField = By.id("BillingNewAddress_City");
    private By newAddressField = By.id("BillingNewAddress_Address1");
    private By zipCodeField = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumField = By.id("BillingNewAddress_PhoneNumber");
    private By country = By.id("BillingNewAddress_CountryId");
    private By billingContinueBtn = By.xpath("//button[text() =\"Continue\"]//../../..//div[@id=\"checkout-step-billing\"]");
    private By shippingMethodContinueBtn = By.id("shipping-method-please-wait");
    private By paymentMethodContinueBtn = By.id("payment-method-please-wait");
//    private By paymentInfoBtn = By.id()




    public CheckOutPage(WebDriver driver){
        this.driver=driver;
    }
    public void enterCityAddress(String city){
        driver.findElement(cityAddressField).sendKeys(city);
    }
    public void enterNewAddress(String address){
        driver.findElement(newAddressField).sendKeys(address);
    }
    public void enterZipCode(String zipCode){
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }
    public void enterPhoneNumber(String PhoneNumber){
        driver.findElement(phoneNumField).sendKeys(PhoneNumber);
    }
    public void selectCountry(String text) {
        findDropDownElement().selectByVisibleText(text);
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(country));
    }
    public void clickBillingContinueBtn(){
        driver.findElement(billingContinueBtn).click();
    }
    private void clickShippingMethod(){
        driver.findElement(shippingMethodContinueBtn).click();
    }

}
