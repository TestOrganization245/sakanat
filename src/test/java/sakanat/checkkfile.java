package sakanat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkkfile {
	 private String filePath;
	    private boolean fileExists;
	    private boolean fileIsEmpty;

	    private boolean fileread;
	    
	    @Given("there is a file {string} containing residence details on datahouse file")
	    public void thereIsAFileContainingResidenceDetailsOnDatahouseFile(String string) {
	        // Write code here that turns the phrase above into concrete actions
	     //   throw new io.cucumber.java.PendingException();

	    	System.out.println("*******************************************");
	    	System.out.println("TESTING SCENARIO: Check File Existence \n");
	        this.filePath = string;
	        

	    }



	    @When("the system checks if the file exists")
	    public void theSystemChecksIfTheFileExists() {
	        File file = new File(filePath);
	        fileExists = file.exists();
	    }

	    @Then("the system should confirm that the file exists")
	    public void theSystemShouldConfirmThatTheFileExists() {
	    	System.out.println("*******"+ "file exist.");

	        Assertions.assertTrue(fileExists);
	    }

	@Then("the system should confirm that the file does not exist")
	public void theSystemShouldConfirmThatTheFileDoesNotExist() {
	  //  Object fileExists;
		// Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
    	System.out.println("*******"+ "file NOT  exist.");

        Assertions.assertFalse(fileExists);

	}
	////
	
	@Given("there is a file {string} containing residence details \\(empty file)")
	public void thereIsAFileContainingResidenceDetailsEmptyFile(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new io.cucumber.java.PendingException();
		System.out.println("*******************************************");
    	System.out.println("TESTING SCENARIO: Check if the file containing residence details is empty \n");
        this.filePath = string;

		
		
	}



	@When("the system checks if the file is empty")
	public void theSystemChecksIfTheFileIsEmpty() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		File file = new File(filePath);
        if (file.exists()) {
            try {
                fileIsEmpty = Files.size(file.toPath()) == 0;
            } catch (IOException e) {
                fileIsEmpty = false;
            }
        } else {
            fileIsEmpty = true;
        }
	}
	@Then("the system should confirm that the file is empty")
	public void theSystemShouldConfirmThatTheFileIsEmpty() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		 System.out.println("File path: " + filePath);
		    System.out.println("File exists: " + fileExists);
		    System.out.println("File is empty: " + fileIsEmpty);
		//    Check if the file containing residence details is empty
		    System.out.println("***********");

		    Assertions.assertTrue(fileIsEmpty);
     //   Assertions.assertTrue(fileIsEmpty);

	}


/////scenario read file
	
	@When("the system checks if the file is readable")
	public void theSystemChecksIfTheFileIsReadable() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		   File file = new File(filePath);
	        fileread = file.canRead();
		
		
		
	}
	@Then("the system should confirm that the file is readable")
	public void theSystemShouldConfirmThatTheFileIsReadable() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("THE FILE DATAHOUSE IS READABLE \n");
		Assertions.assertTrue(fileread);
		
		
		System.out.print("************************************");
		
	}





}
