package sakanat;
import org.junit.jupiter.api.Assertions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.LOGIN;

public class Login {
	public static String Email;
	public static String Password;
	public LOGIN lo=new LOGIN();
	public static String ee;
	
	
	
	@Given("I am on the login page")
	public void iAmOnTheLoginPage() {
		Assertions.assertTrue(lo.run(1));
	}
	
	@When("I enter my email as {string}")
	public String iEnterMyEmailAs(String string) {
		Email=string;
		string=lo.returnEmail();
		return Email;
	}
	
	@When("I enter my password as {string}")
	public String iEnterMyPasswordAs(String string) {
		Password=string;
				return Password;
	}
	
	
	@Then("A login succeded message should appear")
	public void aLoginSuccededMessageShouldAppear() {
		lo.navigateToLoginPage(Email, Password);
		Assertions.assertTrue(lo.performLogin(Email, Password));
	}
	
	@Then("i will be logged in as a tenant")
	public void iWillBeLoggedInAsATenant() {
		Assertions.assertEquals(lo.getT(), true);
		Assertions.assertEquals(lo.getD(), false);
		Assertions.assertEquals(lo.getO(), false);
	}
	
	
	
	
	
	
	@Given("I am on the login pagee")
	public void iAmOnTheLoginPagee() {
	}
	
	@When("I enter my emaill as {string}")
	public String iEnterMyEmaillAs(String string) {
		Email=string;
		return Email;
	}
	
	@When("I enter my passwordd as {string}")
	public String iEnterMyPassworddAs(String string) {
		Password=string;
		return Password;
	}
	
	
	@Then("A login succeded message should appearr")
	public void aLoginSuccededMessageShouldAppearr() {
		Assertions.assertTrue(lo.performLogin(Email, Password));
	}
	@Then("i will be logged in as a owner")
	public void iWillBeLoggedInAsAOwner() {
		Assertions.assertEquals(lo.getO(), true);
		Assertions.assertEquals(lo.getT(), false);
		Assertions.assertEquals(lo.getD(), false);

	}
	
	
	
	
	
	
	


	@Given("I am on the login pageee")
	public void iAmOnTheLoginPageee() {
	}
	@When("I enter my emailll as {string}")
	public String iEnterMyEmailllAs(String string) {
		Email=string;
		return Email;
		}
	
	@When("I enter my passworddd as {string}")
	public String iEnterMyPasswordddAs(String string) {
		Password=string;
		return Password;	}
	
	@Then("A login succeded message should appearrr")
	public void aLoginSuccededMessageShouldAppearrr() {
		Assertions.assertTrue(lo.performLogin(Email, Password));
	}
	@Then("i will be logged in as an adminstrator")
	public void iWillBeLoggedInAsAnAdminstrator() {
		Assertions.assertEquals(lo.getD(), true);
	}

	
	

	@When("I enter my emaillll as {string}")
	public String iEnterMyEmaillllAs(String string) {
		Email=string;
		return Email;	}
	
	
	@When("I enter my passwordddd as {string}")
	public String iEnterMyPassworddddAs(String string) {
		Password=string;
		return Password;	}
	
	
	@Then("An error message succeded message should appear")
	public void anErrorMessageSuccededMessageShouldAppear() {
		lo.navigateToLoginPage(Email, Password);
		Assertions.assertFalse(lo.performLogin(Email, Password));
	}

	

	@Given("I choose to exit instead of log in")
	public void iChooseToExitInsteadOfLogIn() {
		}
	
	
	@Then("i will not enter the app")
	public void iWillNotEnterTheApp() {
		Assertions.assertFalse(lo.run(2));

	}







}