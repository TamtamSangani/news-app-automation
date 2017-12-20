import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.telegraph.qa",
        features = "src/test/resources/features",
        format = {"pretty", "html:reports/Telegraph-report"})
public class RunTest {
}
