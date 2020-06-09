package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/trivago.feature",dryRun = false,glue = "StepDefinitions",snippets = SnippetType.CAMELCASE,monochrome = true)
public class TrivagoRunTest extends AbstractTestNGCucumberTests {

}
