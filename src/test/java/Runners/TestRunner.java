package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = {"src/test/SeleniumGlueCode/Test"}
)
public class TestRunner {

}
