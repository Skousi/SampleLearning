import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "featurefile",glue="steps",
dryRun = false, monochrome = true, plugin = {"html:report/webreport.html", "json:report/jsonreport.json"}, tags = "@login1 and @simplecode")
public class Login_testrunner_datatable {
	

}
