package runners;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src\\test\\resources\\features",
        glue = "stepDefinition",
        tags ="@e2e"

)

public class TestRunners {

    private WebDriver driver;
    protected HomePage homePage;
    protected SoftAssert softAssert;
    protected LoginPage loginPage;

    @Before
    public void userOpenTheBrowser(){
        String chromePath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //driver.manage().window().fullscreen();
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        softAssert = new SoftAssert();

    }
}
