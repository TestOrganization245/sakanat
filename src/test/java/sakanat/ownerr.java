package sakanat;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.OWNER;
import najah.edu.application.apartment;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



public class ownerr {
	//io.cucumber.junit.UndefinedStepException: The step 'I Am on owner page' and 2 other step(s) are undefined.
//	You can implement these steps using the snippet(s) below:
	public OWNER o = new OWNER();
	 private List<String> expectedOptions;
	    private boolean fileExists;
///
	    List<String> expectedResidences = new ArrayList<String>(); // Replace with your expected values
	    private apartment newapp = new apartment(9 , 1, 2, 0, false, 7);
		private static List<apartment> newappp = new ArrayList<apartment>();

	 //   apartment2.add(new apartment());
	    //*
	    boolean y = false;
	    
	    ///2222owner fun
	    @Test
		   public void pure() {
	    	System.out.print("senario to testing the result if i need add house or view ???");
	    	o.owner();
	    	System.out.print("now after test function add house ... \n");
	    	System.out.print("please try now to choise the 2(choise 2) to view house \n");
	    	o.owner();
	    	o.addNewResidence();
	    	boolean b = false;
           List<String> q = o.getAvailableOptions();
           if(q!= null) {
        	   b= true ;
        	   Assertions.assertTrue( b);
        	    

           }
           else {
        	   Assertions.assertFalse(b);

           }
	    }
	   
	    
	    ////222 
	    
	    @Test
		   public void art() {
	    	newappp.add(new apartment(9,1, 9, 5, false, 6));
	    	System.out.print("senario to testing apartment functions or approve apartment number if he exists or not  ???");
	    	//apartment(int id, int floorId, int bath, int bed, boolean y, int idd )
	    	//newapp.add(new apartment(9,1, 9, 5, false, 6));
	    	o.Approval();
	    	
	    	o.nnewselectres(newapp);
	    	System.out.print(o.nnewselectres(newapp));
	    	//////
	    	o.getNewAppId();
	    	o.isResidenceSelected();
	    	////
	    	System.out.print("when newapp is empty \n The condition is pass \n ");
	    String j =	o.newapplication();
	    	System.out.print("With new app array contain data the function to pass (check the array not empty) \n");
	    	o.aa(newappp);
	    	o.newapplication();
	    	//
	    	boolean s = false;
	    	System.out.print("return to make function approve \n");
	    	System.out.print("so for example select 6\n");
	    	o.Approval();
	    	if (j != null ) {
	    		s = true;
	        	   Assertions.assertTrue( s);

	    	}
	    	else {
	        	   Assertions.assertFalse( s);

	    	}
	    	
	    }
	    
	    @Test
	    public void fileTest() {
	    	System.out.print("The file not exixts testing this :::");
	    	String l = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse";
	    	boolean b = false;
	    	
	    String	file = "text.txt";
	    o.readFileee(file);
	    o.residenceMenu(file);
	    o.readResidencesFromFile(file);
	    o.saveToFile(file, newapp);
if(file == l ) {
	b = true ;
	   Assertions.assertTrue( b);

}else {
	   Assertions.assertFalse( b);

}
	    }
	    
	    
	  
	    @Test
	    public void printMenu() {
	    	o.print();
	    	
	    	boolean b = false;
	    	int a =6;
	    	
	    	int u = o.zget();
	    	o.viewResidenceDetailsss(a ,"C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse" );
	    	if(a == 6) {b = true;
	        	   Assertions.assertTrue( b);

	    	}
	    	else {
	        	   Assertions.assertFalse( b);

	    	}
	    }
	    
	    
	    
	    ////
	    @Test
	   public void testSaveToFile() throws IOException {
	    	
	        // Create a mock apartment
	   //   o.saveToFile(filePath, null);
	        // Clean up if needed
	    	String f = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense";
	   List <String> i =	o.readFileee(f);
	    	if(i == null) {
	    	 y = false ;
	    		System.out.print("((((((((((((((((((((((((((((((((((((((((((((((((((********************");

	    		Assertions.assertFalse(y);
	    	}
	    	else {
	    		y = true;
	    		System.out.print(")))))))))))))))))))))))))))))))))))))))))))))********************");
	    		Assertions.assertTrue(y);
	    	}
	    //	o.Approval();
	    //	o.setAppartmentToFloor();
	   // 	o.getapartmentinflooriselected(1);
	    //	o.buildfloorofresidence(1, 6);
	    	
	        // Delete the test file, close resources, etc.
	    }
	    
	    
	    
	    //*
	    
	    
	    
	    
	    
	    
	  
///	    
	    private String ResidenceIdS;
	    private int FloorNumberS;
	    private List<String> residencesList;
	    private boolean logO;
	    private boolean backtomenu;  
/////
	    private String filePath;
	    private String selectedResidenceDetails;
	    @BeforeEach
	    public void setUp() {
	        // Assuming you have the file path to the residences file
	        String filePath = "path_to_residences_file.txt";
	        residencesList = o.residenceMenu(filePath);
	    }
	   
	@Given("I Am on owner page")
	public void iAmOnOwnerPage() {
		System.out.print("TESTING OF SCENARIO :: add recidense for rent \n");
		 o = new OWNER();
	//	o.owner();
	//	o.view();
	
	}
	@When("i add the details the recidense")
	public void iAddTheDetailsTheRecidense() {
		o.getresidence();
		boolean t = true ;
		//System.out.print("SE " + o.getresidence());//
		if (o.getresidence() == null) {
			System.out.print("NOT ADDING RECIDENSE \n");// recidense for rent 
			t = false ;
			Assertions.assertFalse(t);
		}
		else {
			

			System.out.print(" ADDING RECIDENSE \n");// recidense for rent 
		//	o.addhouse();
			t = true;
			Assertions.assertTrue(t);
		}
		

		
		
	}
	@Then("the following option should be to available in my adding:")
	public void theFollowingOptionShouldBeToAvailableInMyAdding(List<String> dataTable) {
		 expectedOptions = dataTable;

	        List<String> availableOptions = o.getAvailableOptions();
	        Assertions.assertEquals(expectedOptions, availableOptions);
		
	
	}
	////scenario2
	
	@Given("I am on the owner page basic")
	public void iAmOnTheOwnerPageBasic() {
		System.out.print("TESTING OF SCENARIO :: View the residence list on the control panel\n");
		o = new OWNER();
		
		
		  String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense";
		    // Read the residence menu from the file and store it in the OWNER class
		    o.residenceMenu(filePath);
		
		
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	@When("I view the control panel with the menu of residence list")
	public void iViewTheControlPanelWithTheMenuOfResidenceList() {
		System.out.print("*******Menu Of recidences*******\n");
	    boolean vv =	o.viewjust();
		if(vv == true) {
			
			Assertions.assertTrue(vv);

		}
		else {
			Assertions.assertFalse(vv);
		}
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
	@Then("the information of residences should appear on the list")
	public void theInformationOfResidencesShouldAppearOnTheList() {
		
		boolean r = o.viewResidences();
		
		if (r == true) {
			Assertions.assertTrue(r);

		}
		else {
			Assertions.assertFalse(r);

		}
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
	}
////scenario 
	
	@Given("I am on the owner page basic residence")
	public void iAmOnTheOwnerPageBasicResidence() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println();
		
		System.out.println("TESTING OF SCENARIO :: View the number of floors for a residence\n");
		o = new OWNER();
		
		
		  String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense";
		    // Read the residence menu from the file and store it in the OWNER class
		    o.residenceMenu(filePath);
		
		
	}



	@When("I select a residence from the list with ID {string}")
	public void iSelectAResidenceFromTheListWithID(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		
		
		//  String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense";
		//o.residenceMenu(filePath);
		 boolean isResidenceSelected = o.selectIdRes(string);
		 Assertions.assertTrue(isResidenceSelected);
		 
		
		
		
	}
	@Then("the number of floors for the selected residence should be {string}")
	public void theNumberOfFloorsForTheSelectedResidenceShouldBe(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		  int expected = Integer.parseInt(string); // Convert the string to an integer
		    int actualFloors = o.getnumfloor();
		    System.out.println("the actual value of floor: " + actualFloors);
		    System.out.println("the expectedFloors value of floor: " + expected+"\n");

		    Assertions.assertEquals(expected, actualFloors);
		
	}
/// senario 
	
	@When("I select a residence with ID {string} from the list")
	public void iSelectAResidenceWithIDFromTheList(String residenceId) {
	    boolean isResidenceSelected = o.selectIdRes(residenceId);
	    Assertions.assertTrue(isResidenceSelected, "Failed to select the residence with ID: " + residenceId);
	    System.out.println("residenceId: "+ residenceId);

	}

	@When("I ask the owner to select a floor with number {string} from the menu")
	public void iAskTheOwnerToSelectAFloorWithNumberFromTheMenu(String string) {
	    int selectedFloorNumber = Integer.parseInt(string);
	    o.setNumFloor(selectedFloorNumber);
	    System.out.println("selectedFloorNumber: "+ selectedFloorNumber);

	}

	@Then("the owner should be able to select a floor {string} for the selected residence {string}")
	public void theOwnerShouldBeAbleToSelectAFloorForTheSelectedResidence(String floorNumber, String residenceId) {
	    int expectedFloorNumber = Integer.parseInt(floorNumber);
	    int actualFloorNumber = o.getNumoor();
	    System.out.println("expectedFloorNumber: "+ expectedFloorNumber);
	    System.out.println("actualFloorNumber: "+ actualFloorNumber);

	    Assertions.assertEquals(expectedFloorNumber, actualFloorNumber, "Floor number mismatch for residence with ID: " + residenceId);
	
	
	}


	@Given("the residences list is loaded from file")
	public void theResidencesListIsLoadedFromFile() {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("*******************************************************************");

		System.out.println("TESTING OF SCENARIO :: Select a floor from the menu for a residence ");
		
	}




///scenario

	@Then("the details of the selected residence floor should appear to the owner")
	public void theDetailsOfTheSelectedResidenceFloorShouldAppearToTheOwner() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		  String selectedResidenceId = o.getSelectedResidenceId();
	        int selectedFloorNumber = o.getNumoor();
	}



///senario print the res details 
	
	@Given("there is a file {string} containing residence details")
	public void thereIsAFileContainingResidenceDetails(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
        this.filePath = string;
        System.out.println("##########################################################");
		System.out.println("TESTING OF SCENARIO ::  Read Residence Details from a File  ");
        System.out.println();


		
	}
	@When("the system reads the residence details from the file")
	public void theSystemReadsTheResidenceDetailsFromTheFile() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
        residencesList = o.readResidencesFromFile(filePath);

		
	}
	@Then("the system should correctly extract and store the residence details for residence ID {string}")
	public void theSystemShouldCorrectlyExtractAndStoreTheResidenceDetailsForResidenceID(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
        selectedResidenceDetails = o.getResidenceDetailsById(string);

		
	}
	@Then("the residence details for residence ID {string} should match the expected values:")
	public void theResidenceDetailsForResidenceIDShouldMatchTheExpectedValues(String residenceId, io.cucumber.datatable.DataTable dataTable) {
	    List<String> expectedValues = dataTable.asLists().get(1); // Get the values from the second row (index 1) in the table

	    String expectedResidenceDetails = "residence ID: " + residenceId + "\n" +
	            "Apartment ID: " + expectedValues.get(0) + "\n" +
	            "Floor ID: " + expectedValues.get(1) + "\n" +
	            "Number of Bathrooms: " + expectedValues.get(2) + "\n" +
	            "Number of Bedrooms: " + expectedValues.get(3) + "\n" +
	            "Is There a Balcony: " + expectedValues.get(4);

	    expectedResidenceDetails = normalizeWhitespace(expectedResidenceDetails);
	    String actualResidenceDetails = normalizeWhitespace(o.getResidenceDetailsById(residenceId));
	    System.out.println("Expected Length: " + expectedResidenceDetails.length());
	    System.out.println("Actual Length: " + actualResidenceDetails.length()+"\n");
	    System.out.println("expect resinfo: \n" + expectedResidenceDetails+"\n\n");
	    System.out.println("actual resinfo: \n" + selectedResidenceDetails+"\n\n");

	    // Compare the expected and actual residence details
	    if(expectedResidenceDetails.length()== actualResidenceDetails.length()) {
	    	 Assertions.assertEquals(expectedResidenceDetails, actualResidenceDetails);
	 	    System.out.println("******The expected of residence information equal to actual residence information of the id selected\n\n");

	    }
	    else {
	    	 Assertions.assertNotEquals(expectedResidenceDetails, actualResidenceDetails);

	 	    System.out.println("the expected of residence information (not ) equal to actual residence information of the id selected\n\n");

	    }
	   
	}

	String normalizeWhitespace(String input) {
	    return Pattern.compile("\\s+").matcher(input.trim()).replaceAll(" ");
	}

	
	///scenario not correct actual and expect
	
	@Given("there is a file {string} contain residence details")
	public void thereIsAFileContainResidenceDetails(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		   this.filePath = string;
		
	}
	@When("the system reads the residence details from the file datahouse")
	public void theSystemReadsTheResidenceDetailsFromTheFileDatahouse() {
	   
		 residencesList = o.readResidencesFromFile(filePath);
		
		
	}
	@When("the system should correctly extract and store the residence details \\(actual) for residence ID {string}")
	public void theSystemShouldCorrectlyExtractAndStoreTheResidenceDetailsActualForResidenceID(String string) {
	    
		selectedResidenceDetails = o.getResidenceDetailsById(string);
		
		
	}
	@Then("the residence details for residence ID {string} should not match the expected values:")
	public void theResidenceDetailsForResidenceIDShouldNotMatchTheExpectedValues(String string, io.cucumber.datatable.DataTable dataTable) {
	  
		// String expectedResidenceDetails = o.getResidenceDetailsById(string);
		  
		   // Assertions.assertEquals(expectedResidenceDetails, selectedResidenceDetails.trim());
		    List<String> expectedValues = dataTable.asLists().get(1); // Get the values from the second row (index 1) in the table

	        String expectedResidenceDetails = "residence ID: " + string + "\n" +
	                "Apartment ID: " + expectedValues.get(1) + "\n" +
	                "Floor ID: " + expectedValues.get(2) + "\n" +
	                "Number of Bathrooms: " + expectedValues.get(3) + "\n" +
	                "Number of Bedrooms: " + expectedValues.get(4) + "\n" +
	                "Is There a Balcony: " + expectedValues.get(5);
	        System.out.println("selectedResidenceDetails "+selectedResidenceDetails);
		    System.out.print("expecter value "+expectedResidenceDetails);
		    Assertions.assertNotEquals(expectedResidenceDetails.trim(), selectedResidenceDetails.trim());
	    
		
		
	}
///logout  the scenario  or back to menu 
	
	
	@Given("I am on the owner page pasic")
	public void iAmOnTheOwnerPagePasic() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println();
		System.out.println("*******************************************");
    	System.out.println("TESTING SCENARIO:  Log Out or Go Back "+ "\n");

	}
	@When("I select {string} from the control panel")
	public void iSelectFromTheControlPanel(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		  if (string.equals("log out")) {
	            // Implement the logic to select the log out option
	            logO = true; // Set the flag to true since we are assuming successful log out
	        } else if (string.equals("go back to menu")) {
	            // Implement the logic to select the go back to main menu option
	            backtomenu = true; // Set the flag to true since we are assuming successful back navigation
	        }
	}
	@Then("I should be {string}")
	public void iShouldBe(String string) {
		  if (string.equals("logged out  from menu")) {
	            // Implement the logic to verify that the user is logged out
	            // You can use assertions or other methods to check if the user is logged out
	        	System.out.println("variable log out: "+ backtomenu+ "\n");

	            Assertions.assertTrue(logO);
	        } else if (string.equals("taken back to main menu")) {
	            // Implement the logic to verify that the user is taken back to the main menu
	            // You can use assertions or other methods to check if the user is back on the main menu
	        	
	        	
	        	System.out.println("variable back to menu: "+ backtomenu+ "\n");
	            Assertions.assertTrue(backtomenu);
	        }
		  
		//  o.newapplication();
		  
		  
		  
	    }
	    // Write code here that turns the phrase above into concrete actions
	   //throw new io.cucumber.java.PendingException();
	




	




	
	
	
	
}
