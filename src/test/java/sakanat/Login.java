package sakanat;

import org.junit.Assert;
import najah.edu.application.ArrayLists;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.LOGIN;
import najah.edu.application.Main;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Login {
	public static String Email;
	public static String Password;

    private Main app;
   public  LOGIN ll = new LOGIN() ;
    @BeforeEach
    public void setUp() {
        app = new Main();
      
    }
/*
    @Test
    public void testSuccessfulLogin() {
        // Given
        app.navigateToLoginPage();

        // When
      //  app.enterEmail("example1@example.com");
        app.enterPassword("password1");
        app.clickLoginButton();

        // Then
      //  Assertions.assertTrue(app.isLoggedIn());
      //  Assertions.assertNotNull(app.getWelcomeMessage());
    }
*/
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    	
      //  app = new MyApplication();
    	 ll = new LOGIN();
      // ll.navigateToLoginPage();
     //  Assertions.assertTrue( ll.navigateToLoginPage());

    }

    @When("I enter my email as {string}")
    public String i_enter_my_email_as(String email) {
    	
       // app.getEnteredEmail();
    Email = email;
    return Email;
    //	Assertions.assertFalse(	ll.getemail().equals("<invalid_email>"));

    }

    @When("I enter my password as {string}")
    public String i_enter_my_password_as(String password) {
   
    //	Assertions.assertFalse(	ll.getpass().equals("<invalid_password>"));
    
     Password = password;
     return Password;
    }
  



    @Then("I should see a welcome message")
    public void i_should_see_a_welcome_message() {
   
      //  assertNotNull(app.getWelcomeMessage());
        
      //  assertNotNull(app.getWelcomeMessage(), "Welcome message is not displayed");
    	Assertions.assertTrue(	ll.performLogin(Email, Password));

    }
  //  io.cucumber.junit.UndefinedStepException: The step 'I should see an error message' is undefined.
 //   You can implement this step using the snippet(s) below:

   
//

@Then("I should see an {string}")
public void iShouldSeeAn(String string) {
    // Write code here that turns the phrase above into concrete actions
	//ll.performLogin(Email, Password);
	Assertions.assertFalse(	ll.performLogin(Email, Password));

   // throw new io.cucumber.java.PendingException();
}

@When("I enter my email as1 {string}")
public String iEnterMyEmailAs1(String string) {
	Email = string ;
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	return Email;
}

@When("I enter my password as1  {string}")
public String iEnterMyPasswordAs1(String string) {
	Password = string ;
	
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
	return Password;
}



}
