package sakanat;

import org.junit.Assert;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.MyApplication;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Login {
    private MyApplication app;
    @BeforeEach
    public void setUp() {
        app = new MyApplication();
    }

    @Test
    public void testSuccessfulLogin() {
        // Given
        app.navigateToLoginPage();

        // When
        app.enterEmail("example1@example.com");
        app.enterPassword("password1");
        app.clickLoginButton();

        // Then
        Assertions.assertTrue(app.isLoggedIn());
        Assertions.assertNotNull(app.getWelcomeMessage());
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
    	
        app = new MyApplication();
       app.navigateToLoginPage();
       
    }

    @When("I enter my email as {string}")
    public void i_enter_my_email_as(String email) {
    	
        app.getEnteredEmail();
     

    }

    @When("I enter my password as {string}")
    public void i_enter_my_password_as(String password) {
   
        app.getEnteredPassword();
    

    }
  


    @When("I click on the login button")
    public void i_click_on_the_login_button() {
    
        app.clickLoginButton();
        assertTrue(app.isLoggedIn(), "Login was not successful");
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
  
    //    assertTrue(app.isLoggedIn());
        assertTrue(app.isLoggedIn(), "User is not logged in");
    }

    @Then("I should see a welcome message")
    public void i_should_see_a_welcome_message() {
   
      //  assertNotNull(app.getWelcomeMessage());
        
        assertNotNull(app.getWelcomeMessage(), "Welcome message is not displayed");
    
    }
  //  io.cucumber.junit.UndefinedStepException: The step 'I should see an error message' is undefined.
 //   You can implement this step using the snippet(s) below:

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        // Write code here that turns the phrase above into concrete actions
      //  throw new io.cucumber.java.PendingException();
        assertNull(app.getWelcomeMessage());

    }



}
