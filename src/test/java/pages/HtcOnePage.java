package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HtcOnePage {
    private WebDriver driver;
    private By addToCartButton = By.id("add-to-cart-button-18");
    private By addToWishList = By.id("add-to-wishlist-button-18");
    private By wishListQty = By.className("wishlist-qty");

    public HtcOnePage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getWishlistQty() {
        return driver.findElement(wishListQty).getText();
    }

    public void clickAddToWishList() {
        driver.findElement(addToWishList).click();
    }
}
