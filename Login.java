package sakanat;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.MyApplication;
import static org.junit.Assert.*;
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
    //    app.run();
       app.navigateToLoginPage();
        // Add implementation for navigating to the login page
    }

    @When("I enter my email as {string}")
    public void i_enter_my_email_as(String email) {
    	System.out.print("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
        app.getEnteredEmail();
    }

    @When("I enter my password as {string}")
    public void i_enter_my_password_as(String password) {
    	System.out.print("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
        app.getEnteredPassword();
    }
  //  io.cucumber.junit.UndefinedStepException: The step 'I enter my type as "<type>"' is undefined.
  //  You can implement this step using the snippet(s) below:



    @When("I click on the login button")
    public void i_click_on_the_login_button() {
    	System.out.print("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
        app.clickLoginButton();
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
    	System.out.print("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
        assertTrue(app.isLoggedIn());
    }

    @Then("I should see a welcome message")
    public void i_should_see_a_welcome_message() {
    	System.out.print("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHh");
        assertNotNull(app.getWelcomeMessage());
    }
}
