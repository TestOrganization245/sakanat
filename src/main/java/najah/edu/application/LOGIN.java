package najah.edu.application;

import java.util.List;
import java.util.Scanner;

public class LOGIN {
	public Tenant user = new Tenant();
	public static String em ;
    private boolean loggedIn;
    private String welcomeMessage;
    Scanner scanner=new Scanner(System.in);
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    public static int choice;
    public List<User> userlist=user.liss();
    public static String tyu = "";
    
    public static String ten = "";
    
    
    
    public void run() {
        while (true) {
           System.out.println("Welcome to the Application!");
            System.out.println("Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");

           choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    navigateToLoginPage();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            break;
        }

    }
    
    
    
    

    public void navigateToLoginPage() {
            	 System.out.println("Navigating to the login page...");
         	    System.out.println("            === Login Page ===");
         	    System.out.println("- Please enter your email and password:");
         	    System.out.println("Email: ");
         	    String email;
         	    email = scanner.nextLine();
         	   email=scanner.nextLine();
         	    enteredEmail=email;
         	    String password;
         	   System.out.println("Password: ");
         	    password = scanner.nextLine();
         	   enteredPassword=password;
         	    
         	    if (performLogin(enteredEmail, enteredPassword)) {
         	        System.out.println("Login successful.");
         	       System.out.println();
         	      System.out.println();
         	    } else {
         	        System.out.println("Invalid email or password. Please try again.");
         	    }
             
    	
    }
    
  
    
    
    
    public boolean performLogin(String email, String password) {
    	
        for (User user : userlist) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)  ) {
                loggedIn = true;
               
                em = user.getEmail();
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
   	 if(tyu == "owner") {
   		 return true ;
   	 }
   	 return false;
    }
    
    
    
    //hiiiiiiioooo
    
   // kkkgggsssqaaaa
    
    
    public boolean getT() {
   	 if(tyu == "tenant") {
   		 return true ;
   		 
   		 
   	 }
   	 return false;
    }
    
    
    
    public boolean getD() {
      	 if(tyu == "admin") {
      		 return true ;
      	 }
      	 return false;
       }
    
    
    
}