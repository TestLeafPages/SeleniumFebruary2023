package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/java/features"},
				 glue = {"steps","hooks"},
				 monochrome = true,
				 publish = true,
				 tags = "@Smoke or @Regression")
public class TestRunner extends AbstractTestNGCucumberTests {

}
