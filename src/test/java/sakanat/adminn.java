package sakanat;

import org.junit.Assert;
 


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.Adminstrator;
import najah.edu.application.Tenant;

//import najah.edu.application.MyApplication;
import static org.junit.Assert.*;

import java.util.Scanner;
public class adminn{
	private static Tenant T=new Tenant();
    static Adminstrator adm=new Adminstrator();

	//private MyApplication app;
	public static int choice;
	private static String pic;
	private static double price;

	private static String details;

	private static String furnID;

	@Given("That I AM in the admin page")
	public void thatIAMInTheAdminPage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}




	@Given("i have a furn request with a pic link {string}")
	public String iHaveAFurnRequestWithAPicLink(String string) {
	    // Write code here that turns the phrase above into concrete actions
		pic=string;
		return pic;
	}
	
	
	@Given("a price equals to {string}")
	public double aPriceEqualsTo(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    price=Double.parseDouble(string);
	    return price;
	}
	
	@Given("with details like {string}")
	public String withDetailsLike(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		details=string;
		return string;
	}
	
	@Given("it's ID is {string}")
	public String itSIDIs(String string) {
		furnID=string;
		return furnID;
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("i choose the add button")
	public void iChooseTheAddButton() {
		T.addFurnn(pic, price, details, furnID);

	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		
	}
	@Then("the furniture request must be accepted")
	public void theFurnitureRequestMustBeAccepted() {
	   adm.addFurrn();
	}









@Given("The adminstrator menu")
public void theAdminstratorMenu() {
   System.out.println();
}

@When("I press the first choice")
public void iPressTheFirstChoice() {
}

@Then("the data will be added succesfully")
public void theDataWillBeAddedSuccesfully() {
	if(choice==3) {
		System.out.println("Ibtisam t3bt mennek");
	}
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//System.out.print("HHHHHHHHHHHHHHHHHHHHHH");
}




@Given("The adminstrator menu is shown")
public void theAdminstratorMenuIsShown() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("That I choose the Available Reservations button")
public void thatIChooseTheAvailableReservationsButton() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	//System.out.println("WEWEEEEEEEEEEEEEEEE");
}
@Then("the data will be shown correctly")
public void theDataWillBeShownCorrectly() {
	if(choice==2) {
		//app.checkReserved();
		System.out.println("WEWEEEEEEEEEEEEEEEE");
	}
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}






}

