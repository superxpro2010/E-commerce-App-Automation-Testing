package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private By searchResult = By.linkText("Build your own computer");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> productList ()
    {
        List <WebElement> productTitles = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
        return productTitles;
    }
    public String getSearchResult(){
        return driver.findElement(searchResult).getText();
    }
}
