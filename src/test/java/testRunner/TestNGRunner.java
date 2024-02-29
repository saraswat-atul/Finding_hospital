package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//src/test/resources/Features/E2E.feature"},
				glue = "stepDefinations",
				plugin = {"pretty", "html:reports/report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				dryRun = false,
				monochrome = false
				)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
