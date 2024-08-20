package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", features = {"src//test//resources//feature//flight.feature"}, 
glue = {"definitions"},
                 plugin = {"html:target/report.html"})
    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}