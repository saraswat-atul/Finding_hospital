package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//src/test/resources/Features/E2E.feature"},
		glue = "stepDefinations",
		plugin = {"pretty", "html:reports/report.html"},
		dryRun = false,
		monochrome = false
		)
public class TestCucumberRunner {

}
