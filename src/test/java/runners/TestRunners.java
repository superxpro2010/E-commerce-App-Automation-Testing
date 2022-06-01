package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)*/
@CucumberOptions(

        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        features = "src/main/resources/features",
        dryRun = false,
        glue = {"stepDefinitions"},
        tags =""

)

public class TestRunners extends AbstractTestNGCucumberTests {



}