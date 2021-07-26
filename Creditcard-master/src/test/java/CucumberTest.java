

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty","json:target/cucumber-reports/json/cucumber.json", "html:target/cucumber-reports/html","junit:target/cucumber-reports/junit/cucumber.xml"},
        monochrome=true
//        format = {"pretty", "html:target/Destination"} 
        
//        You can also skip the tests via the command line by executing the following command:
//
//        	mvn install -DskipTests
//        	If you absolutely must, you can also use the maven.test.skip property to skip compiling the tests. maven.test.skip is honored by Surefire, Failsafe and the Compiler Plugin.
//
//        	mvn install -Dmaven.test.skip=true
        	
)
public class CucumberTest {
}