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

import java.util.Scanner;
public class viewHousing {
	private static boolean K=false;
	private static String Y;
	private static int V;
    private MyApplication app;
    @BeforeEach
    public void setUp() {
        app = new MyApplication();
    }


    //Scenareo1111111
@Given("i am on the the tenant page")
public void iAmOnTheTheTenantPage() {
	boolean J=false;
	app = new MyApplication();
	app.clearConsole();
	System.out.println("Would you like to \n 1. view the available houses \n 2. book an accomodation directly?");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


@When("i vhoose to view the available houses")
public void iVhooseToViewTheAvailableHouses() {
	Scanner scanner= new Scanner(System.in);
	if(scanner.nextInt()==1) {
		System.out.println();
		System.out.println();
		System.out.println();

    	System.out.println("*******    Welcome our tenant!!    *******");
	app.View();
	}
	
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}




@Then("the following options should be available:")
public void theFollowingOptionsShouldBeAvailable(io.cucumber.datatable.DataTable dataTable) {
	boolean mainPage=false;
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    //throw new io.cucumber.java.PendingException();
	while(true) {
		System.out.println();
		System.out.println();
	Scanner scanner= new Scanner(System.in);
	V= scanner.nextInt();
	System.out.println(app.House(V));
	System.out.println();
	System.out.println();
	System.out.println("Would you like to \n1. Go Back \n2. Accomodate this house");
	int Z =scanner.nextInt();
	if(Z==1) {
		K=true;
		app.View();
		app.clearConsole();
		continue;
	}
	else if(Z==2) {
		System.out.print("You've accomodated this house");
		break;
	}
	
	}
	
	
}



//Scenareo222222
@Given("I choose one of the houses")
public void iChooseOneOfTheHouses() {
    // Write code here that turns the phrase above into concrete actions
	
	app = new MyApplication();
	Scanner scanner= new Scanner(System.in);
    if(app.Check(V)) {
    	Y=scanner.nextLine();
    }
	
		
    
}
@When("the user of the house is student")
public void theUserOfTheHouseIsStudent() {
    // Write code here that turns the phrase above into concrete actions
    if(Y.equalsIgnoreCase("no")) {
    	System.out.println("OK");
    	System.out.print("You've accomodated this house");
    }
}
@Then("Show the required info")
public void showTheRequiredInfo() {
    // Write code here that turns the phrase above into concrete actions
	if(Y.equalsIgnoreCase("yes")) {
		System.out.print(app.StuHousing(V));
	}
}



}