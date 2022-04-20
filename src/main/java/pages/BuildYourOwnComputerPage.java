package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage {
    private WebDriver driver;
    private By selectRam = By.id("product_attribute_2");
    private By addToCartButton = By.id("add-to-cart-button-1");
    private By confirmAddToCart = By.xpath("//*[text()=\"The product has been added to your \"]");
    private By hdd320 = By.id("product_attribute_3_6");
    private By hdd400 = By.id("product_attribute_3_7");
    private By homeButton = By.xpath("//*[span=\"Home\"]");
    private By addToWishList = By.id("add-to-wishlist-button-1");
    private By wishListQty = By.className("wishlist-qty");

    public BuildYourOwnComputerPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public void selectHDD320() {
        driver.findElement(hdd320).click();
    }

    public void clickAddToWishList() {
        driver.findElement(addToWishList).click();
    }

    public void selectHDD400() {
        driver.findElement(hdd400).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public Boolean getConfirmationText() {
        return driver.findElement(confirmAddToCart).isDisplayed();
    }

    public void selectRam(String value) {
        findDropDownElement().selectByValue(value);
    }

    public String getWishlistQty() {
        return driver.findElement(wishListQty).getText();
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(selectRam));
    }
}
