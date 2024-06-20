package in.redBus6.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\praveen\\RedBus6\\src\\test\\resources\\FeatureFiles",
                    glue = "in.redBus6.StepDefinition",
                            plugin = {"html:target","json:target/report.json"},
                    dryRun = false,
                    monochrome = false)
public class TestRunner {

}
