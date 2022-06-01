package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class AbstractPageStepDefinition {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static LoginPage loginPage;
    protected static RegistrationPage registrationPage;

    protected static WebDriver getDriver(){
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);

        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    protected static HomePage getHomePage(){
        if(homePage == null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    protected static LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    protected static RegistrationPage getRegistrationPage(){
        if(registrationPage == null){
            registrationPage = new RegistrationPage(driver);
        }
        return registrationPage;
    }
}
