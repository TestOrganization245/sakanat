package sakanat;
import org.junit.Assert; 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.Tenant;
import static org.junit.Assert.*;
import java.util.Scanner;
public class viewHousing {
	public Tenant T= new Tenant();
	private static boolean Check=false;
	private static boolean Test=false;
   /* @BeforeEach
    public void setUp() {
        app = new MyApplication();
        //B=app.Tenantt();
        //B=app.Tenantt(app.getEnteredEmail());
    }*/
	
	
public viewHousing() {
}
    //Scenareo1111111
@Given("i am on the the tenant page")
public void iAmOnTheTheTenantPage() {
}
@When("i choose to view the available houses")
public void iChooseToViewTheAvailableHouses() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("The specified details should be available")
public void theSpecifiedDetailsShouldBeAvailable() {
	Assertions.assertTrue(T.vView());
}
//Scenareo222222
@Given("The user of the first house is student")
public void theUserOfTheFirstHouseIsStudent() {
	Check=true;
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
}
@When("I choose to check it")
public void iChooseToCheckIt() {
	Test=T.checkk(1);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("An error message to show that this is specified for student")
public void anErrorMessageToShowThatThisIsSpecifiedForStudent() {
    Assertions.assertEquals(Test,Check);
}
//Scenario3333
@Given("The user of the third house isn't student")
public void theUserOfTheThirdHouseIsnTStudent() {
	Check=false;
    /// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("I choose to check itt")
public void iChooseToCheckItt() {
	Test=T.checkk(3);
}
@Then("No error message will be shown.The accomodation process continues.")
public void noErrorMessageWillBeShownTheAccomodationProcessContinues() {
    Assertions.assertEquals(Test,Check);
}}