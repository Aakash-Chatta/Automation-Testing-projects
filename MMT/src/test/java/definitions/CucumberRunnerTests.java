package definitions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", features = {"src//test//resources//feature//flight.feature"}, 
//glue = {"com.example.definitions"},
                 plugin = {"html:target/report.html"})
    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}