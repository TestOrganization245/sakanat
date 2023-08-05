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

public class Acommodation {
	public static String Email;
	public Tenant T= new Tenant();
	private static boolean Check=false;
	private static boolean Test=false;
	
	
	
	@Given("I'm the tenant with the email {string}")
	public String iMTheTenantWithTheEmail(String string) {
		Email=string;
		return Email;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Given("I tried to reserve the first house from the owner")
	public void iTriedToReserveTheFirstHouseFromTheOwner() {
		Check=false;
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("The accomodation process must succeed")
	public void theAccomodationProcessMustSucceed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Assertions.assertTrue(Check==T.checkAccomodation(1));
		
	}
	
	
	
	
	@Given("I'm thee tenant with the email {string}")
	public String iMTheeTenantWithTheEmail(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Email=string;
		return Email;
	}
	@Given("I tried to reserve the fourth house from the owner")
	public void iTriedToReserveTheFourthHouseFromTheOwner() {
		Check=false;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("The accomodation process must fail because it's already fully reserved")
	public void theAccomodationProcessMustFailBecauseItSAlreadyFullyReserved() {
	    // Write code here that turns the phrase above into concrete actions
		Assertions.assertFalse(Check==T.checkAccomodation(4));

	}






}