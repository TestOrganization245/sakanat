package sakanat;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import najah.edu.application.OWNER;

public class adminn {
	OWNER uu = new OWNER();
	//io.cucumber.junit.UndefinedStepException: The step 'That I AM in the admin page' and 1 other step(s) are undefined.
//	You can implement these steps using the snippet(s) below:

	@Given("That I AM in the admin page")
	public void thatIAMInTheAdminPage() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}
	@Then("The Following choices will be valid")
	public void theFollowingChoicesWillBeValid(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("****** Hello Adminstrater!!!!!!");
		System.out.println("You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartments requests");
		
		
	}

	//io.cucumber.junit.UndefinedStepException: The step 'That I choise To accept the request' and 1 other step(s) are undefined.
	//You can implement these steps using the snippet(s) below:
int c =0;
	@Given("That I choise To accept the request")
	public void thatIChoiseToAcceptTheRequest() {
		Scanner scanner = new Scanner(System.in);
		int C= scanner.nextInt();
	
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		c =C;
		//return c;
	}
	@Then("the data will be added succesfully")
	public void theDataWillBeAddedSuccesfully() {
		if(c== 3) {
			uu.APP();
		}
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("That I choose To view reservations")
	public void thatIChooseToViewReservations() {
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("available reservations must be viewed")
	public void availableReservationsMustBeViewed() {
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}







}
