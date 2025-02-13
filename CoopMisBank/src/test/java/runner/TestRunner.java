package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Journal.feature",
        glue = {"utility" , "stepDefinitions"},
        plugin = {"html:target/cucumber=reports/cucumber.html",
                "json:target/cucumber=reports/cucumber.json"}
)
public class TestRunner {
}
