
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.*;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "D:\\Learning\\EG FWD\\Project\\E-commerce App Automation Testing\\src\\main\\resources\\features"
        },
        glue = {"stepDefinition"},
        plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,
                "html:target/cucumber-reports" },
        monochrome = true ,
        publish = true

)



public class TestRunner {
        @BeforeClass
        public static void setup() {

        }

}
