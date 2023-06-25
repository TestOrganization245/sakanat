package najah.edu.application;
import java.util.Scanner;
//import najah.edu.Signup;
import najah.edu.application.*;


public class MyApplication {
	  private String name;
	    private String email;
	    private String password;
	    private boolean signUpSuccessful;
	    private boolean loggedIn;


	    public void enterName(String name) {
	        this.name = name;
	    }

	    public void enterEmail(String email) {
	        this.email = email;
	    }

	    public void enterPassword(String password) {
	        this.password = password;
	    }

	    public void clickSignUpButton() {
	        // Implement the sign-up logic here
	        // You can validate the input, create a new user account, store it in a database, etc.
	        // Update the 'signUpSuccessful' variable based on the success or failure of the sign-up process
	        signUpSuccessful = true; // Assuming sign-up is successful for now
	    }

	    public boolean isSignUpSuccessful() {
	        return signUpSuccessful;
	    }

	    public void redirectToHomePage() {
	        // Implement the logic to redirect to the home page
	    }

	    public String getWelcomeMessage() {
	        // Implement the logic to generate the welcome message based on the signed-up user
	        // You can use the 'name' or 'email' variables here
	        return "Welcome, " + name + "!";
	    }
	    public void clickLoginButton() {
	        // Implement the login logic here
	        // You can validate the input, check if the owner account exists in the database, etc.
	        // Update the 'loggedIn' variable based on the success or failure of the login process
	        loggedIn = true; // Assuming login is successful for now
	    }
	    public boolean isLoggedIn() {
	        return loggedIn;
	    }
	    public   String ll() {
	    	
		   //	 System.out.print("lamaaaaaaaaaaaa");
		   	 return "hiiiiiiiiiiiiiiiiiiiiiiiii";
		    }
	    

	    public static void main(String[] args) {
	    	  MyApplication app = new MyApplication();

	          // Display menu options
	          System.out.println("Menu:");
	          System.out.println("1. Sign Up");
	          System.out.println("2. Login");

	          // Read user input for menu choice
	          Scanner scanner = new Scanner(System.in);
	          System.out.print("Enter your choice: ");
	          int choice = scanner.nextInt();

	          switch (choice) {
	              case 1:
	                  // Sign Up
	                  System.out.print("Enter your name: ");
	                  scanner.nextLine(); // Consume newline
	                  String name = scanner.nextLine();
	                  System.out.print("Enter your email: ");
	                  String email = scanner.nextLine();
	                  System.out.print("Enter your password: ");
	                  String password = scanner.nextLine();

	                  app.enterName(name);
	                  app.enterEmail(email);
	                  app.enterPassword(password);

	                  app.clickSignUpButton();
	                 
	                  if (app.isSignUpSuccessful()) {
	                      System.out.println("Sign up successful!");
	                      app.redirectToHomePage();
	                      System.out.println(app.getWelcomeMessage());
	                      app.ll();
	                  } else {
	                      System.out.println("Sign up failed. Please try again.");
	                  }
	                  break;

	              case 2:
	                  // Login
	                  System.out.print("Enter your email: ");
	                  scanner.nextLine(); // Consume newline
	                  String loginEmail = scanner.nextLine();
	                  System.out.print("Enter your password: ");
	                  String loginPassword = scanner.nextLine();

	                  // You can implement the login functionality here
	                  // by validating the email and password against the owner accounts in the database.
	                  // For simplicity, let's assume login is successful for any valid email and password.
	                  app.clickLoginButton();

	                  if (app.isLoggedIn()) {
	                      System.out.println("Login successful!");
	                      app.redirectToHomePage();
	                      System.out.println(app.getWelcomeMessage());
	                  }  else {
	                          System.out.println("Login failed. Please try again.");
	                      }
	                      break;

	                  default:
	                      System.out.println("Invalid choice. Please try again.");
	                      break;
	              }
	          }
	  

	      }
