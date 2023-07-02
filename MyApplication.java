package najah.edu.application;
import java.util.Scanner;
//import najah.edu.Signup;
import najah.edu.application.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

class User {
    private String email;
    private String password;
	private String type;

    public User(String email, String password , String type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String gettype() {
        return type;
    }
}

public class MyApplication {
    private List<User> userList;
    private boolean loggedIn;
    private String welcomeMessage;
    private Scanner scanner;
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    
    
    
    public MyApplication() {
    	this.scanner = new Scanner(System.in);
        userList = new ArrayList<User>();
        // Add initial users to the user list
        userList.add(new User("example1@example.com", "password1" , "admin"));
        userList.add(new User("example2@example.com", "password2" , "aowner"));
        userList.add(new User("example3@example.com", "password3" , "tanant"));
    }

    public void run() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Welcome to the Application!");
            System.out.println("Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    navigateToLoginPage();
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting the application...");
        scanner.close();
    }

    public void navigateToLoginPage() {
    	System.out.println("Welcome to the Application!");
        System.out.println("Please select an option:");
        System.out.println("1. Login");
        System.out.println("2. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
            	 System.out.println("Navigating to the login page...");
         	    // Add code to display the login page or perform any necessary actions to navigate to the login page
         	    // For example, you can clear the console and display a login prompt

         	    // Clear the console
         	    clearConsole();

         	    // Display login prompt
         	    System.out.println("=== Login Page ===");
         	    System.out.println("Please enter your email and password:");
         	    System.out.print("Email: ");
         	    String n;
         	    String nn;
         	    String nnn;
         	    String email;
         	    String password;
         	    String type;
         	    n = scanner.nextLine();
         	    email = n;
         	   // String email = scanner.nextLine();
         	    enteredEmail = n;
         	    System.out.print("Password: ");
         	   nn  = scanner.nextLine();
         	   password = nn;
         	    enteredPassword = nn;
         	    //System.out.print("type of person: ");
         	    //nnn = scanner.nextLine();
         	  //  type = nnn;
         	    //enteredtype = type;
         	    // Call the login method with the entered email and password
         	    if (performLogin(enteredEmail, enteredPassword)) {
         	        System.out.println("Login successful.");
         	    } else {
         	        System.out.println("Invalid email or password. Please try again.");
         	    }
                break;
            case 2:
                System.out.print("weweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    	
    }
    private boolean performLogin(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password) ) {
                loggedIn = true;
                welcomeMessage = "Welcome, " + email +" " +  user.gettype()+  "!!";
                System.out.printf(welcomeMessage + user.gettype() );
                return true;
            }
        }
        loggedIn = false;
        welcomeMessage = null;
        return false;
    }

    // Helper method to clear the console
    private void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handle exception if unable to clear the console
        }
        
    }

    /*private boolean performLogin(Scanner scanner) {
        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

     //   if (isValidUser(email, password)) {
     //       loggedIn = true;
     //       welcomeMessage = "Welcome, " + email + "!";
     //       System.out.println("Login successful.");
     //       return true;
     //   } else {
     //       loggedIn = false;
     //       welcomeMessage = null;
     //       System.out.println("Invalid email or password. Please try again.");
            return false;
     //   }
    }*/

    private boolean isValidUser(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    public String getEnteredEmail() {
        return enteredEmail;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }
    public String getEnteredtype() {
        return enteredtype;
    }
    public void enterEmail(String email) {
        enteredEmail = email;
    }

    public void enterPassword(String password) {
        enteredPassword = password;
    }

    public void clickLoginButton() {
        // Validate the entered credentials and update the login status accordingly
        if (isValidUser(enteredEmail, enteredPassword)) {
            loggedIn = true;
            welcomeMessage = "Welcome, " + enteredEmail + "!";
            System.out.printf("Login successful.....................");
        } else {
            loggedIn = false;
            welcomeMessage = null;
            System.out.println("Invalid email or password. Please try again.");
        }
        // Clear the entered email and password after login attempt
        enteredEmail = null;
        enteredPassword = null;
    }
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.run();
    }
}