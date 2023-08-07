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

import java.util.ArrayList;
import java.util.Scanner;
public class FurnitureTest {
	public static String Pic;
	public static String Detailes;
	public static double price;
	public static String Email;
	public Tenant T= new Tenant();
    //private static ArrayList<Furn> newFurniture=new ArrayList<Furn>();
	
	
	@Given("Im the tenant with the email {string}")
	public String imTheTenantWithTheEmail(String string) {
	    Email=string;
	    return Email;
	}
	@When("i add a pic with the url {string}")
	public String iAddAPicWithTheUrl(String string) {
		Pic=string;
		return Pic;
	}
	
	@When("i add price which equals {double}")
	public double iAddPriceWhichEquals(Double double1) {
	    price=double1;
	    return price;
	}
	
	@When("some additional details like {string}")
	public String someAdditionalDetailsLike(String string) {
		Detailes=string;
		return Detailes;
	}
	
	@Then("an eeror message must appear that the addition operation isnt allowed until the admin accepts it")
	public void anEerorMessageMustAppearThatTheAdditionOperationIsntAllowedUntilTheAdminAcceptsIt() {
Assertions.assertEquals(false, T.addFurnn(Pic, price, Detailes,"123" ));
	}
	
	
	
	
	

	@Given("Im thee tenant with the email {string}")
	public String imTheeTenantWithTheEmail(String string) {
		 Email=string;
		    return Email;
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
	@When("i choose to view the whole furnitures in the arraylist")
	public void iChooseToViewTheWholeFurnituresInTheArraylist() {
	    //T.viewFurn(Email);
	}
	
	@Then("the result must appear")
	public void theResultMustAppear() {
		//T.printFurn();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}