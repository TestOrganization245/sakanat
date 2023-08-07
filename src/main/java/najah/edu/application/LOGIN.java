package najah.edu.application;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class LOGIN {
 Tenant user = new Tenant();
    Scanner scanner=new Scanner(System.in);
    private String enteredEmail;
    private String enteredPassword;
    private static int choice;
    private static List<User> userlist=Tenant.liss();
    private static String tyu = "";
    private static String ten = "";
	 static Logger logger =  Logger.getLogger(LOGIN.class.getName());

	
    public boolean run(int p) {
        return p == 1;
    }



    public void navigateToLoginPage(String email,String password) {
         	   enteredPassword=password;
         	  enteredEmail=email;
         	    if (performLogin(enteredEmail, enteredPassword)) {
         	        logger.info("Login successful.");
         	       logger.info("\n");
         	      logger.info("\n");
         	    } else {
         	    	logger.info("Invalid email or password. Please try again.");
         	    }
            
    }
    
  
    
    
    
    public static boolean performLogin(String email, String password) {
        for (User userr : userlist) {
            if (userr.getEmail().equals(email) && userr.getPassword().equals(password)  ) {
                tyu = userr.gettype();
                return true;
               
            }
        }
        return false;
    }
    
    
    public String returnEmail() {
    	return enteredEmail;
    }
    
    public boolean getO() {
   	 if(tyu.equals("owner") ) {
   		 return true ;
   	 }
   	 return false;
    }
    
    public boolean getT() {
   	 if(tyu.equals("tenant")) {
   		 return true ;
   	 }
   	 return false;
    }
    
    public boolean getD() {
      	 if(tyu.equals("admin")) {
      		 return true ;
      	 }
      	 return false;
       }

    
    
}