package in.co.gorest.cucumber;

import cucumber.api.CucumberOptions;
import in.co.gorest.testbase.TestBase;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature",//path from feature file
 tags = "@SMOKE")
public class CucumberRunner extends TestBase {
}
