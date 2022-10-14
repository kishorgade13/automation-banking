package org.example.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"org/example/StepDefinition"},
        plugin = {"pretty","html:html_report.html"},
        tags = "@CS"
)
public class TestRunner {
}
