package sakanat;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Features/login.feature","Features/ownerr.feature", "Features/checkk.feature","Features/viewHousing.feature","Features/AcomodationTest.feature", "Features/admin.feature","Features/FurnitureAdd.feature"},
    // features="Features/admin.feature",
		plugin= {"summary","html:target/output.html"},
     monochrome=true,
     snippets = SnippetType.CAMELCASE,
     glue="sakanat")

public class Software {

}