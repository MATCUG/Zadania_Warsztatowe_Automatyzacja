package PACKAGE_NAME;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features/User-order-test.feature",
        plugin = {"pretty", "html:report/result.html"})
public class ProductOrderTest {
}
