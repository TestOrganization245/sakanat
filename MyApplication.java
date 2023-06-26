package najah.edu.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import najah.edu.Signup;
import najah.edu.application.*;


public class MyApplication {
	static ArrayList<String> userName = new ArrayList<String>();
	 static ArrayList<String> emaill = new ArrayList<String>();
	 static ArrayList<String> passwordd = new ArrayList<String>();
	 static ArrayList<String> userType = new ArrayList<String>();
	 
	 //INITIALIZING THE STATIC ARRAYLISTS INSIDE THE CONSTRUCTER 
	 
	 public MyApplication(){
	 emaill.add("Lama@outlook.sa");
	 emaill.add("Ibtissam@outlook.sa");
	 emaill.add("Areej@outlook.sa");
	 userName.add("Lama");
	 userName.add("Ibtissam");
	 userName.add("Areej");
	 passwordd.add("12345");
	 passwordd.add("54321");
	 passwordd.add("147");
	 userType.add("Tenant");
	 userType.add("Owner");
	 userType.add("Adminstrator");
	 /*
	 System.out.println(emaill.get(0));
	 System.out.println(emaill.get(1));
	 System.out.println(passwordd.get(0));
	 System.out.println(passwordd.get(1));
	 System.out.println(userType.get(0));
	 System.out.println(userType.get(1));
	 */
	 }
	 
	  
	 
	 //***UNUSED*******************************************************************************************
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
	    //************************************************************************************************
	    

	    
	    
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
	                  System.out.print("Are you an Adminstrator, Owner or Tenant?");
	                  String userTypee = scanner.nextLine();
	                  
	                  emaill.add(email);
	                  passwordd.add(password);
	                  userName.add(name);
	                  userType.add(userTypee);
	                  System.out.println("You've signed up succesfully!");
	                  System.out.println("Welcome our "+ userTypee+ " "+ name +" <3");
	                  break;

	              case 2:
	            	  
	                  // Login
	                  System.out.println("Enter your email: ");
	                  scanner.nextLine();
	                  String loginEmail = scanner.nextLine();
	                  System.out.println("Enter your password: ");
	                  String loginPassword = scanner.nextLine();
	                  
	                  //MAKING SURE THE EMAIL EXIST
	                  if(emaill.contains(loginEmail)==false) {
	                	  System.out.println("This email Doesn't exist");
	                  }
	                  
	                  else {
	                	//MAKING SURE THE PASSWORD IS TRUE
	                	  if(passwordd.contains(loginPassword)==false) {
		                	  System.out.println("You've entered a wrong password");
		                  }
	                	  else {
	                	  String h= userType.get(emaill.indexOf(loginEmail));
	                	  if(h=="Tenant") {
	                		  System.out.println("Welcome our Tenant "+ userName.get(emaill.indexOf(loginEmail))+ "!");
	                	  }
	                	  if(h=="Owner") {
	                		  System.out.println("Welcome our Owner "+ userName.get(emaill.indexOf(loginEmail))+ "!");
	                	  }
	                	  if(h=="Adminstrator") {
	                		  System.out.println("Welcome our Adminstrator "+ userName.get(emaill.indexOf(loginEmail))+ "!");
	                	  }
	                	  }
	                  }
	                  

	                  
	                  //**    I DIDN'T USE ANY OF THE FUNCTIONS BELOW SO I COMMENTED THEM, MAKE SURE IF WE SHOULD USE THEM OR NOT
	                 
	                  
	                  // You can implement the login functionality here
	                  // by validating the email and password against the owner accounts in the database.
	                  // For simplicity, let's assume login is successful for any valid email and password.
	                  /*app.clickLoginButton();
	                  if (app.isLoggedIn()) {
	                      System.out.println("Login successful!");
	                      
	                  //***   I DIDN'T UNDERSTAND THE AIM OF THE FUNCTION "redirectToHomePage" .. I USED THE DIRECT PRINT MESSAGES WITHOUT REFERENCING TO A PREVIOUSLY DEFINED FUNCTIONS
	                  
	                      app.redirectToHomePage();
	                      System.out.println(app.getWelcomeMessage());
	                  }  else {
	                          System.out.println("Login failed. Please try again.");
	                      }
	                      break;
	                  default:
	                      System.out.println("Invalid choice. Please try again.");
	                      break;*/
	                  
	              }
	          }
	  

	      }