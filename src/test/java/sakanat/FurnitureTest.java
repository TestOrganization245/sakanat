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

public class FurnitureTest {

	public static String Pic;
	public static String Detailes;
	public static double price;

	public static String Email;
	public Tenant T= new Tenant();
	
	
	@Given("Im the tenant with the email {string}")
	public String imTheTenantWithTheEmail(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    Email=string;
	    return Email;
	}
	@When("i add a pic with the url {string}")
	public String iAddAPicWithTheUrl(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //throw new io.cucumber.java.PendingException();
		Pic=string;
		return Pic;
	}
	
	@When("i add price which equals {double}")
	public double iAddPriceWhichEquals(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    price=double1;
	    return price;
	}





	@When("some additional details like {string}")
	public String someAdditionalDetailsLike(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Detailes=string;
		return Detailes;
	}



	@Then("an eeror message must appear that the addition operation isnt allowed until the admin accepts it")
	public void anEerorMessageMustAppearThatTheAdditionOperationIsntAllowedUntilTheAdminAcceptsIt() {
	    // Write code here that turns the phrase above into concrete actions
	    Assertions.assertTrue(false==T.viewFurnn(Email, Pic, price, Detailes, "123"));
	}



}