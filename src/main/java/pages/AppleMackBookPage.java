package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleMackBookPage {
    private WebDriver driver;
    private By addToCartButton = By.id("add-to-cart-button-4");
    private By addToWishList = By.id("add-to-wishlist-button-4");
    private By wishListQty = By.className("wishlist-qty");

    public AppleMackBookPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickAddToWishList() {
        driver.findElement(addToWishList).click();
    }

    public String getWishlistQty() {
        return driver.findElement(wishListQty).getText();
    }


}
