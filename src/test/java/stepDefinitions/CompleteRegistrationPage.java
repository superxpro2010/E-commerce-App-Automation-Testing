package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompleteRegistrationPage {


    public WebElement message ()
    {
        WebElement message= stepDefinitions.Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return message;
    }
    public WebElement logout ()
    {
        WebElement logout = stepDefinitions.Hooks.driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
        return logout;
    }
}
