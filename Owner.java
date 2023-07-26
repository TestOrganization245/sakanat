package sakanat;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

//import org.junit.Assert;
//import org.picocontainer.DefaultPicoContainer;
//import org.picocontainer.MutablePicoContainer;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.MyApplication;
import najah.edu.application.OWNER;
import najah.edu.application.floor;
//import najah.edu.application.OWNER;
import io.cucumber.java.Before;

public class Owner {
	
//	io.cucumber.junit.UndefinedStepException: The step 'i am on the owner page' and 2 other step(s) are undefined.
//	You can implement these steps using the snippet(s) below:
       private OWNER o ;
       MyApplication yyw = new MyApplication();
       public static boolean pp ;
       private List<String> expectedOptions;
       private List<String> residences;
      // private List<floor> floor;
       Scanner scanner = new Scanner(System.in);
       @BeforeEach
       public void setUp() {
  		 residences = new ArrayList<String>();

    		o = new OWNER();
       }
       
       public boolean hi() {
    	   if(yyw.get()) {
        	   return true;
           }
    	   return false;
       }
      
       
       
	@Given("i am on the owner page")
	public void iAmOnTheOwnerPage() {
		if(hi()== true) {
			 o = new OWNER();
		     residences = o.owner();
		     pp = true;
		}
		else {
			pp= false;
		}
	}
	@When("i add a new  residence for rent")
	public void iAddANewResidenceForRent() {
		
	}
	@Then("the following option should be available:")
	public void theFollowingOptionShouldBeAvailable(List<String> options) {
		if(pp == true) {
		  expectedOptions = options;

	        List<String> availableOptions = o.getAvailableOptions();
	       Assert.assertEquals(options, availableOptions);}
	}
	
	/////feature view ************************************************
	String flag ;
	@Given("I AM on the owner page pasic")
	public String iAMOnTheOwnerPagePasic() {
		if(pp == true) {
	 o = new OWNER();
	 System.out.println("*******************************************************************************");
	 System.out.println("*******************************************************************************");
	  System.out.println("Welcome to another scenario.");
	  System.out.println("Do you want to see your own residences details ???");
	 // String flag ;
	  flag = scanner.next();}
	  return flag;
		
	}

	int rr ;

	@When("i view the control panel with menu of residence list")
	public int iViewTheControlPanel() {
		if(pp == true) {
		if(flag.equals("Y")) {
			System.out.println();
			System.out.println("********* You have the following residences:: \n");
		 
	    
		 rr = o.view();
		// System.out.println("false >>.." + rr);
		}else {
			System.out.println("You have entered a mistaken choice >>.."+ rr);
		}
		}
		return rr;
	}
	@Then("the information of residence should appear when i select the number of residence in menu")
	public void theHomesIAddedForRentShouldAppear() {
	//	  System.out.println("Homes added for rent:");
	      
	        }
	
	    
	@Then("The number of his tenants  appears to the owner")
	public void theNumberOfHisTenantsAppearsToTheOwner() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		
	//	System.out.print("The number of his tenants  appears to the owner "+ rr);	
	}
	
	
	@Then("the number of floors of the residence will appears to owner")
	public void theNumberOfFloorsOfTheResidenceWillAppearsToOwner() {
	    if(pp == true) {
		o.gett(rr);
	    }
	}
	
	
int e =0;
	@Then("i ask the owner to select the floor from menu if he want")
	public int iAskTheOwnerToSelectTheFloorFromMenuIfHeWant() {
		if(pp==true) {
		System.out.println("\n\nDo you want to see the details of any of the floors?");
		String uu;
		uu = scanner.next();
		if (uu.equals("Y")) {
			System.out.println("ok, please select the floor you want to see ...");
			//o.floor();
			//int e;
			e = o.selectfloorfrommenu();
		}
		else {
			System.out.print("not correct");
		}
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		}
		return e;
	}
	List<floor> f ;
	floor ft = null;
	@Then("i ask the owner if need to see the details of floor he selected")
	public floor iAskTheOwnerIfNeedToSeeTheDetailsOfFloorHeSelected() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		if(pp == true) {
			
		
		 f = o.getfloor(e);
		 
		 for(floor ff : f) {
	    	
	    		   ft = ff;
	    	
	      }
		 }
		 return ft;
		//o.showFloorDetails(o.getfloor(e));
	}
	
	
	
	@Given("the user chose a specific apartment")
	public void theUserChoseASpecificApartment() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		OWNER o = new OWNER(); // Instantiate the OWNER class
		
		
	}
	@Then("all the needed information will appear")
	public void allTheNeededInformationWillAppear() {
	    // Write code here that turns the phrase above into concrete actions
	 //  throw new io.cucumber.java.PendingException();
	}


	@Then("Log out menu or go back to main menu should appear")
	public void logOutMenuOrGoBackToMainMenuShouldAppear() {
		MyApplication PP= new MyApplication();
		System.out.println("Do you want to \n 1. log out \n 2. to go back to the (Owner) main menu??\nEnter One of two choices");
		int X= scanner.nextInt();
		if(X==1) {
			PP.navigateToLoginPage();
		}
		else
			System.out.print("Lama W Ibtisam malekat el software");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}








	





}
