package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features= {"src/test/java/features/Login.feature","src/test/java/features/CreateLead.feature"})
//or
@CucumberOptions(features= "src/test/java/features/", glue = {"steps","hook"}, monochrome = true
//,tags= {"@functional"}
)
//snippets=SnippetType.CAMELCASE
public class Runtest extends AbstractTestNGCucumberTests{
	

}
/*@CucumberOptions(features = {"src/test/java/features"},
glue = {"steps","hook"},
dryRun = false,
snippets = SnippetType.CAMELCASE,
monochrome = true, plugin = {"pretty","html:target/cucumber"},
tags = {"@ReadyToRun and @Reg"})
public class RunTest extends AbstractTestNGCucumberTests {
}*/