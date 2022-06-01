package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.concurrent.TimeUnit;

public class ProductPage {
    public boolean isAddToCartButton()
    {
        boolean isAddToCartButton=false;
        Hooks.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]"));
            isAddToCartButton=true;
        }catch (NoSuchElementException e)
        {
            isAddToCartButton=false;
        }
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isAddToCartButton;
    }
    public WebElement addToCartButton()
    {
        WebElement addToCartButton= Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]"));
        return addToCartButton;
    }
    public boolean isAddedToCartSuccessNotification()
    {
        boolean isAddedToCartSuccessNotification=false;
        Hooks.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hooks.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
            isAddedToCartSuccessNotification=true;
        }
        catch (NoSuchElementException e)
        {
            isAddedToCartSuccessNotification=false;
        }
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isAddedToCartSuccessNotification;
    }
    public WebElement loadingProgress()
    {
        WebElement loadingProgress= Hooks.driver.findElement(By.xpath("//div[@class=\"ajax-loading-block-window\"]"));
        return loadingProgress;
    }
    public boolean isProductHasAttributes()
    {
        boolean isProductHasAttributes=false;
        Hooks.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hooks.driver.findElement(By.xpath("//div[contains(@class,'attributes')]"));
            isProductHasAttributes=true;
        }
        catch (NoSuchElementException e)
        {
            isProductHasAttributes=false;
        }
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isProductHasAttributes;
    }
    public boolean isProductGiftCard()
    {
        boolean isProductGiftCard=false;
        Hooks.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hooks.driver.findElement(By.xpath("//div[@class=\"giftcard\"]"));
            isProductGiftCard=true;
        }
        catch (NoSuchElementException e)
        {
            isProductGiftCard=false;
        }
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isProductGiftCard;
    }
    public WebElement productName()
    {
        WebElement productName= Hooks.driver.findElement(By.xpath("//div[@class=\"product-name\"]/h1"));
        return productName;
    }
    public WebElement shoppingCart()
    {
        WebElement shoppingCart= Hooks.driver.findElement(By.xpath("//a[@class=\"ico-cart\"]"));
        return shoppingCart;
    }
    public boolean availability()
    {
        boolean availability=false;
        Hooks.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            availability= Hooks.driver.findElement(By.xpath("//div[@class=\"availability\"]//following-sibling::span[@class=\"value\"]")).getText().equalsIgnoreCase("In stock");
        }
        catch (NoSuchElementException e)
        {
            availability=false;
        }
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return availability;
    }
    public WebElement addToWishlistButton()
    {
        WebElement addToWishlistButton= Hooks.driver.findElement(By.xpath("//div[@class=\"add-to-wishlist\"]/button"));
        return addToWishlistButton;
    }
    public WebElement wishlist()
    {
        WebElement wishlist= Hooks.driver.findElement(By.xpath("//a[@href=\"/wishlist\" and @class=\"ico-wishlist\"]"));
        return wishlist;
    }
    public WebElement addToCompareList()
    {
        WebElement addToCompareList= Hooks.driver.findElement(By.xpath("//div[@class=\"compare-products\"]/button"));
        return addToCompareList;
    }
    public WebElement compareList()
    {
        WebElement compareList = Hooks.driver.findElement(By.xpath("//a[@href=\"/compareproducts\"]"));
        return compareList;
    }
}
