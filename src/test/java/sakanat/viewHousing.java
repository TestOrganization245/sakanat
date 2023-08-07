package sakanat;
import org.junit.Assert; 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import najah.edu.application.Tenant;
import najah.edu.application.Tenant.ConsoleColor;

import static org.junit.Assert.*;
import java.util.Scanner;
public class viewHousing {
	public Tenant T= new Tenant();
	private static boolean Check=false;
	private static boolean Test=false;
	private static String email;
	private static int s;
	private static int b;

   /* @BeforeEach
    public void setUp() {
        app = new MyApplication();
        //B=app.Tenantt();
        //B=app.Tenantt(app.getEnteredEmail());
    }*/
	
	
public viewHousing() {
}

    //Scenareo1111111

@Given("i am on the the tenant page and my email is {string}")
public void iAmOnTheTheTenantPageAndMyEmailIs(String string) {
	T.printTenant();
	 T.myView();
	// T.housesDetailes(string);
}



@When("i choose to view the available houses")
public void iChooseToViewTheAvailableHouses() {

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("The specified details should be available")
public void theSpecifiedDetailsShouldBeAvailable() {
	Assertions.assertTrue(T.vView());
}







@Given("The user of the first house is student")
public void theUserOfTheFirstHouseIsStudent() {
	Check=true;
}


@When("I choose to check it")
public void iChooseToCheckIt() {
	Test=T.check(1);
}


@Then("An error message to show that this is specified for student")
public void anErrorMessageToShowThatThisIsSpecifiedForStudent() {
    Assertions.assertEquals(Test,Check);
}


@Given("The user of the third house isn't student")
public void theUserOfTheThirdHouseIsnTStudent() {
	Check=false;
    /// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("I choose to check itt")
public void iChooseToCheckItt() {
	Test=T.check(3);
}

@Then("No error message will be shown. The accomodation process continues.")
public void noErrorMessageWillBeShownTheAccomodationProcessContinues() {
    // Write code here that turns the phrase above into concrete actions
    Assertions.assertEquals(Test,Check);
}




@Given("i am a tenant and my email is {string}")
public String iAmATenantAndMyEmailIs(String string) {
	email=string;
	string=T.emailll(string);
	return email;
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


@Given("i want to see who lives in house number {string} and it's details")
public int iWantToSeeWhoLivesInHouseNumberAndItSDetails(String string) {
	 s=Integer.parseInt(string);
	    return s;
}


@Then("The data of people living in this house must appear")
public void theDataOfPeopleLivingInThisHouseMustAppear() {
    // Write code here that turns the phrase above into concrete actions
    T.stuHousing(s);
}
@Then("the house's detailes must be shown")
public void theHouseSDetailesMustBeShown() {
    // Write code here that turns the phrase above into concrete actions
	T.hhouse(s);
  T.specifiedData(email, s);
  Tenant.printColorText(email, ConsoleColor.RED);
}





@Given("House number {string} is not reserved")
public int houseNumberIsNotReserved(String string) {
    // Write code here that turns the phrase above into concrete actions
    b=Integer.parseInt(string);
    return b;
}
@Then("message must be shown that it's not reserved")
public void messageMustBeShownThatItSNotReserved() {
    // Write code here that turns the phrase above into concrete actions
	Assertions.assertEquals(false, T.checkAccomodation(b));
}







}