package com.runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                 snippets = CucumberOptions.SnippetType.CAMELCASE,
                 plugin = {"pretty", "html:reports/report"},
                 features = {"./src/test/resources/features"},
                 glue =  {"com.automationpractice.steps", "com.automationpractice.configuration"},
                 tags = "@loginAplicacao")
public class RunTest {
}
