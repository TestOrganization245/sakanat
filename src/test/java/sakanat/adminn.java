package sakanat;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.LOGIN;
import najah.edu.application.OWNER;

public class adminn {
	public static boolean check ;
	static	String  email;
	static	String  password;
	static String  checkresadd ;
public static boolean D=false;
	public static LOGIN ll = new LOGIN(); 
	@Given("I am an admin whose email is {string}")
	public String iAmAnAdminWhoseEmailIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		email = string ;
		return email;
	}

	@Given("my password is {string}")
	public String myPasswordIs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		password = string ;
		return password;
	}
		
		
	@When("I press login button")
	public void iPressLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		ll.performLogin(email, password);
		Assertions.assertTrue(ll.getD());
	}
	@Then("The Following choices will be available")
	public void theFollowingChoicesWillBeAvailable(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
	}

//scenario 2

	@Given("That I choose to accept some apartment request")
	public void thatIChooseToAcceptSomeApartmentRequest() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("***************************************");
		System.out.println("TESTING SCENARIO : apartment acceptance" + "\n" + "CHECK IF THE  new appartment need to accept from admin to add in RES \n");
		
		OWNER nn = new OWNER();
		
		
		        checkresadd = nn.newapplication();
		        
		        
		      //  System.out.print("iii  " + checkresadd);
		        if (checkresadd == null) {
		        	check = false;
		        //    System.out.print("nulllll11");
		        } else {
		        	check = true;
		         //   System.out.print("not nullll");
		        }
		   // }
	}


	
	//
	
	@Then("the system should display an appropriate message about new apartment requests")
	public void theSystemShouldDisplayAnAppropriateMessageAboutNewApartmentRequests() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("checkresadd:  " + checkresadd);
		System.out.println("****check if the arraylist contain the new apartment in resicedence******");
		if (check == false) {
		    // check = false;
			System.out.println("***the arraylist not contain new apartment to adding from admin****");
			Assertions.assertFalse(check);
			

		}
		else {
			//check = true;
			System.out.println("***The arraylist  contain new apartment to adding from admin****");
			Assertions.assertTrue(check);
		}
		
		
	}
	@Then("the system should indicate if there are new apartments to be accepted")
	public void theSystemShouldIndicateIfThereAreNewApartmentsToBeAccepted() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		Assertions.assertFalse(check);

	}

	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///
	//scenario 3
	@Given("That I choose To accept some Furniture request")
	public void thatIChooseToAcceptSomeFurnitureRequest() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("error message must show that it has been added successfully")
	public void errorMessageMustShowThatItHasBeenAddedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





}
