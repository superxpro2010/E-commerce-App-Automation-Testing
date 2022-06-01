package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.List;

public class CompareListPage {   public List<WebElement> productName ()
{
    List <WebElement> productName = Hooks.driver.findElements(By.xpath("//div[@class=\"table-wrapper\"]//tbody/tr[@class=\"product-name\"]/td/a"));
    return productName;
}
}