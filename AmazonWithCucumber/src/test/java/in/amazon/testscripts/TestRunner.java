package in.amazon.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features//parameterization.feature"
                 , glue = "in.amazon.testscripts"
                 ,plugin = {"progress","html:target/Cucumber.html"}
                // , tags = "@TC_101"
                 //, dryRun = true
		)
                 		
                 
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
