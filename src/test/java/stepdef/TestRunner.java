package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
    plugin = {"pretty", "html:target/swiggy-html","json:target/cucumber-json"},
    features = "src/test/java/features",
    tags = {"@Search"},
    glue = { "stepdef" }
    )
public class TestRunner {

}
