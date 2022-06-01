package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class WishListPage {
    private WebDriver driver;

    public WishListPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> productName() {
        List<WebElement> productName = Hooks.driver.findElements(By.xpath("//div[@class=\"table-wrapper\"]//tbody/tr//td[@class=\"product\"]/a"));
        return productName;
    }
}