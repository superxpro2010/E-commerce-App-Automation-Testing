package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class AnyCategoryPage {
    public List<WebElement> allAvailableTags()
    {
        List <WebElement> allAvailableTags = Hooks.driver.findElements(By.xpath("//div[@class=\"tags\"]/ul/li/a"));
        return allAvailableTags;
    }
    public WebElement pageTitle()
    {
        WebElement pageTitle= Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1"));
        return pageTitle;
    }
    public List <WebElement> productListInStock ()
    {
        List <WebElement> productTitles = Hooks.driver.findElements(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]//ancestor::div[@class=\"add-info\"]//preceding-sibling::h2[@class=\"product-title\"]/a"));
        return productTitles;
    }
}
