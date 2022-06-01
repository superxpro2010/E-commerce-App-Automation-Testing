package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoesSubcategoryPage {
    private WebDriver driver;
    private By apparelTag = By.xpath("//a[text()='apparel']");
    private By awesomeTag = By.xpath("//a[text()='awesome']");
    private By coolTag = By.xpath("//a[text()='cool']");

    //private By redFilter = By.id("attribute-option-15");

    public ShoesSubcategoryPage(WebDriver driver){
        this.driver = driver;
    }
    private void filterByColor(String color){
        driver.findElement(By.id(color)).click();
    }
    public void filterByGrey(){
        filterByColor("attribute-option-14");
    }
    public void filterByRed(){
        filterByColor("attribute-option-15");
    }
    public void filterByBlue(){
        filterByColor("attribute-option-16");
    }
    public ApparelTagPage filterByApparelTag(){
        driver.findElement(apparelTag).click();
        return new ApparelTagPage(driver);
    }
    public AwesomeTagPage filterByAwesomeTag(){
        driver.findElement(awesomeTag).click();
        return new AwesomeTagPage(driver);
    }
    public CoolTagPage filterByCoolTag(){
        driver.findElement(coolTag).click();
        return new CoolTagPage(driver);
    }
}
