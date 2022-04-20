package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    private WebDriver driver;
    private By searchResult = By.linkText("Build your own computer");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getSearchResult(){
        return driver.findElement(searchResult).getText();
    }
}
