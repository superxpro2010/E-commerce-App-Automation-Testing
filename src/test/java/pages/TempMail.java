package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class TempMail {
    public String tempEmailValue ()
    {
        WebElement tempEmailElement= Hooks.driver.findElement(By.id("mail"));
        String emailAddressValue=tempEmailElement.getAttribute("value");
        return emailAddressValue;
    }
}

