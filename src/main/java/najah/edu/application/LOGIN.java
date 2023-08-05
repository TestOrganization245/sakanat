package najah.edu.application;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class LOGIN {
	private static Tenant userr = new Tenant();
    private static boolean loggedIn;
    private static String welcomeMessage;
    Scanner scanner=new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(LOGIN.class.getName());
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    private static final  List<User> userlist=userr.liss();
    private static String tyu = "";
    
   
    
    
    
    
    
    public void run() {
        while (true) {
          logger.info("Welcome to the Application!");
            logger.info("Please select an option:");
            logger.info("1. Login");
            logger.info("2. Exit");

          int  choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    navigateToLoginPage();
                    break;
                case 2:
                    break;
                default:
                	logger.info("Invalid choice. Please try again.");
            }
            break;
        }

    }
    
    
    
    

    public void navigateToLoginPage() {
    	logger.info("Navigating to the login page...");
    	logger.info("            === Login Page ===");
    	logger.info("- Please enter your email and password:");
    	logger.info("Email: ");
         	    String email;
         	    email = scanner.nextLine();
         	   email=scanner.nextLine();
         	    enteredEmail=email;
         	    String password;
         	   logger.info("Password: ");
         	    password = scanner.nextLine();
         	   enteredPassword=password;
         	    
         	    if (performLogin(enteredEmail, enteredPassword)) {
         	    	logger.info("Login successful.");
         	    	logger.info("\n");
         	    	logger.info("\n");
         	    } else {
         	    	logger.info("Invalid email or password. Please try again.");
         	    }
             
    	
    }
    
  
    
    
    
    public static boolean performLogin(String email, String password) {
    	
        for (User user : userlist) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)  ) {
                loggedIn = true;
               
                tyu = user.gettype();
                return true;
               
            }
        }
        loggedIn = false;
        welcomeMessage = null;
        return false;
    }
    
    
    public String returnEmail() {
    	return enteredEmail;
    }
    
    public boolean getO() {
        return "owner".equals(tyu);

    }
    
    
    
    public boolean getT() {
        return "tenant".equals(tyu);

    }
    
    
    
    public boolean getD() {
        return "admin".equals(tyu);

       }
    
    
    
}