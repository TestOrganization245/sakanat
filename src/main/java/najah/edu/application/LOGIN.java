package najah.edu.application;

import java.util.List;
import java.util.Scanner;

public class LOGIN {
 Tenant user = new Tenant();
    Scanner scanner=new Scanner(System.in);
    private String enteredEmail;
    private String enteredPassword;
    public static int choice;
    public List<User> userlist=Tenant.liss();
    public static String tyu = "";
    public static String ten = "";
    
    public boolean run(int p) {
        if(p==1) {
        	return true;
        }
        return false;
        }


    public void navigateToLoginPage(String email,String password) {
         	   enteredPassword=password;
         	  enteredEmail=email;
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
                tyu = user.gettype();
                return true;
               
            }
        }
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