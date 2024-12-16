package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		dryRun = false,
		glue = "steps",
		tags = "@positivos",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/cucumber-reports.html"}
		
				)


public class Executa {

}
