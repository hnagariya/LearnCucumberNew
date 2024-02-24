package com.api.LearnCucumberNew;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\feature",
                  glue = {"com.api.LearnCucumberNew.stepDefinition"},
                 plugin= {"pretty","html:target/cucumber"},
                monochrome=true,
                tags="@regression"
		)

public class TestRunner {

}
