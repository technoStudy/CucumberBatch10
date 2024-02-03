package runnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featureFiles",
        glue = "stepDefinitions",
        tags = "@SmokeTest",
        plugin = "html:target/report/cucumber-pretty.html" // Generates a html report for us
)
public class _06_RunnerClassWithPlugin extends AbstractTestNGCucumberTests {
}
