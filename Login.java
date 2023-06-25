package sakanat;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	najah.edu.application.MyApplication app  = new najah.edu.application.MyApplication();

	@Given("I am on the sign-up page")
	public void i_am_on_the_sign_up_page() {
	//	MyApplication sign = new MyApplication();
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	String name;
	@When("I enter my name as {string}")
	public void i_enter_my_name_as(String name) {
	   this.name = name;
        app.enterName(name);

		
		
		
	}
	String email;
	@When("I enter my email as {string}")
	public void i_enter_my_email_as(String email) {
		this.email = email;
        app.enterEmail(email);

		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@When("I enter my password as {string}")
	public void i_enter_my_password_as(String password) {
        app.enterPassword(password);

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@When("I click on the sign-up button")
	public void i_click_on_the_sign_up_button() {
        app.clickSignUpButton();

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("I should be redirected to the home page")
	public void i_should_be_redirected_to_the_home_page() {
        app.redirectToHomePage();

	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("I should see a welcome message")
	public void i_should_see_a_welcome_message() {
	//	String msg ="Welcome" + name;
		// assertEquals(app.getWelcomeMessage(), msg);
	   //     System.out.println(msg);
		String i = "hi";
		//System.out.print(i);
        //String welcomeMessage = app.getWelcomeMessage();
        
        
        String expectedWelcomeMessage = "Welcome, " + name + "!";
        String actualWelcomeMessage = app.getWelcomeMessage();
        Assert.assertEquals(expectedWelcomeMessage, actualWelcomeMessage);
        
        
        
        
       // app.ll();
      //  String ii = app.ll();
      
       // Assert.assertEquals(expectedWelcomeMessage, ii);
       // Assert.assertTrue(ii, true);
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
}
