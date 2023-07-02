package sakanat;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
   // features = "Features/check.feature",  "Features/owner.feature"
   // features = {"Features/check.feature", },
    		// features = "Features/check.feature",
    		 
    				  features = "Features/login.feature",
    //features1 = "Features/owner.feature",
   // glue = "com.example.stepdefinitions",
   // plugin = {"pretty", "html:target/cucumber-reports"}
    
    glue = "sakanat", // Update the package name to match your step definitions package
    	    plugin = {"pretty", "html:target/cucumber-reports"},
    	    snippets = SnippetType.CAMELCASE // Optional: Specify the snippet type
    
    
    
)

public class Software {

}
