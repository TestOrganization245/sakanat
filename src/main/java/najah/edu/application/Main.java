package najah.edu.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import najah.edu.application.Tenant.ConsoleColor;

public class Main {
	static OWNER o =new OWNER();
    private static List<User> userList;
    private static ArrayList<House> houses;
    private ArrayList<Furn> furniture;
    private static ArrayList<Furn> newFurniture=new ArrayList<Furn>();
    private static String pic;
    private static double price;
    private static String housenum;
private static String sh = "    =====================================================================";
private static String ac ="    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========";
private static String shh="________________________________________________________________________________";
private static String cp="=============================== CONTROL PANEL ==================================";

	private static int v;
	private static String flag;
	private static Tenant t=new Tenant();
    private static int rr;
    private static String mail;
    private static int m;
    private static int choice;
    private static String h;
    static Adminstrator adm=new Adminstrator();
    private static boolean pp ;
    private static boolean check=false;
    private List<String> expectedOptions;
    private static List<String> residences;
    Scanner scanner = new Scanner(System.in);
   
   
	 static Logger logger =  Logger.getLogger(Main.class.getName());
  static LOGIN login=new LOGIN();
  
public static void main(String args[]) {
    logger.info("Welcome to the Application!");
    logger.info("Please select an option:");
    logger.info("1. Login");
    logger.info("2. Exit");
	Scanner scanner=new Scanner(System.in);
	int p=scanner.nextInt();
	if(p==1) {
		logger.info("Navigating to the login page...");
		logger.info("            === Login Page ===");
		logger.info("- Please enter your email and password:");
		logger.info("Email: ");
 	    String m=scanner.nextLine();
m=scanner.nextLine();
logger.info("Password: ");
	    String z=scanner.nextLine();
		login.navigateToLoginPage(m,z);
		mail=login.returnEmail();
	}
	while(true) {
		if(check) {
			check=false;
			logger.info("Welcome to the Application!");
			logger.info("Please select an option:");
			logger.info("1. Login");
			logger.info("2. Exit");
			int o=scanner.nextInt();
			if(o==1) {
				logger.info("Navigating to the login page...");
				logger.info("            === Login Page ===");
				logger.info("- Please enter your email and password:");
				logger.info("Email: ");
		 	    String m=scanner.nextLine();
		 	   m=scanner.nextLine();
		 	  logger.info("Password: ");
			    String z=scanner.nextLine();
				login.navigateToLoginPage(m,z);
				mail=login.returnEmail();
			}
		}
		
 if(login.getO()) {
	 while(true){
		 
	 o = new OWNER();
	 residences =  o.owner();
	 //
	 logger.info("*******************************************************************************");
	 logger.info("*******************************************************************************");
	 logger.info("Do you want to see your own residences details ???");
	  flag = scanner.nextLine();
	  if(flag.equalsIgnoreCase("yes")) {
		  logger.info("\n");
		  logger.info("********* You have the following residences:: \n");
		 rr = o.view();
	  }
	else if(flag.equalsIgnoreCase("no")) {
		logger.info("OK");
		 }
	  else {
		  logger.info("You have entered a mistaken choice >>.."+ rr);
		}
	  logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
	  choice=scanner.nextInt();
	  if(choice==1) {
		  logger.info("         ********** YOU LOGGED OUT SUCCESSFULLY *********\n- Would you like log in again?");
		 h=scanner.nextLine();
		 h=scanner.nextLine();
		  if(h.equalsIgnoreCase("yes")) {
			  check=true;
		  break;
		  
		  }
	  }
	  else if(choice==2) {
		  logger.info("\n");
		  logger.info("\n");		  
		  logger.info("\n");
	  }
	  else {
		  logger.info("\n");
		  logger.info("YOU ENTERED A WRONG CHOICE");
	  }
	  
	  } 
  
 }
 
 
 else if(login.getT()) {
	 
	t.printTenant();
	m=scanner.nextInt();
 	if(m==1) {
		  logger.info("\n");
		  logger.info("\n");
		  logger.info("\n");
 	t.myView();
 	
 	while(true) {
		  logger.info("\n");
		  logger.info("\n");
	scanner= new Scanner(System.in);
	v= scanner.nextInt();
	
	logger.info(t.hhouse(v));
	logger.info("Would you like to \n1. Go Back \n2. Accomodate this house");
	int z =scanner.nextInt();
	if(z==1) {
		t.myView();
		continue;
	}
	
	
	else if(z==2) {
		if(t.check(v)) {
			String y=scanner.nextLine();
			y=scanner.nextLine();
			if(y.equalsIgnoreCase("yes")) {
				logger.info(t.stuHousing(v));
				logger.info("Would you like to \n1. Go Back \n2. Accomodate this house");
	        	z =scanner.nextInt();
	        	if(z==1) {
	        		t.myView();
	        		continue;
	        		}
	        	else if(z==2) {
	        		logger.info(sh);
	        		logger.info(ac);
	        		logger.info(sh);
		    		t.printColorText    (shh,ConsoleColor.RED);
		    		t.printColorText    (cp,ConsoleColor.GREEN);
		    		t.printColorText    (shh,ConsoleColor.RED);
		    		logger.info("\n");
		    		logger.info(mail);

		    		t.specifiedData(mail, v);
		    		logger.info("\n");
		    		t.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
		    		  int o =scanner.nextInt();    	
		    		  if(o==1) {
		    			  break;
		    		  }
		    		  else if(o==2) {
		    			  t.myView();
		    			  continue;
		    		  }
	        	}
			}
			

	    	else if(y.equalsIgnoreCase("no")) {
	    		logger.info(sh);
        		logger.info(ac);
        		logger.info(sh);
	    		t.printColorText    (shh,ConsoleColor.RED);
	    		t.printColorText    (cp,ConsoleColor.GREEN);
	    		t.printColorText    (shh,ConsoleColor.RED);
	    		logger.info("\n");
	    		t.specifiedData(mail,v);
	    		logger.info("\n");
	    		t.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
	    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
	    		  int o =scanner.nextInt();    	
	    		  if(o==1) {
	    			  break;
	    		  }
	    		  else if(o==2) {
	    			  t.myView();
	    			  continue;
	    		  }
	    	}
	    }
	    else if(t.check(v)==false) {
	    	logger.info(sh);
    		logger.info(ac);
    		logger.info(sh);
    		t.printColorText    (shh,ConsoleColor.RED);
    		t.printColorText    (cp,ConsoleColor.GREEN);
    		t.printColorText    (shh,ConsoleColor.RED);
    		logger.info("\n");
    		t.specifiedData(mail,v);
    		logger.info("\n");
    		t.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
    		  int o =scanner.nextInt();    	
    		  if(o==1) {
    			  break;
    		  }
    		  else if(o==2) {
    			  t.myView();
    		  }
	    }
	}
	
	check=true;
	 continue;
 	}
 }
 	
 	else if(m==2) {

 		String furnID="";
 		logger.info("\n");
 		logger.info("\n");
 		logger.info("******** This window is designed for you to add your own furniture that you want to sell ");
    	logger.info("\n");
    	logger.info("= Please Add the following details");
    	logger.info("Provide a good pic link:");
            pic=scanner.nextLine();
            pic=scanner.nextLine();
            logger.info("Attach some additional details");
            String t3bt=scanner.nextLine();
            logger.info("Provide the specified price");
            price=scanner.nextDouble();
            userList=t.liss();
            for(int i=0;i<userList.size()/2;i++) {
            	if(mail.equals(userList.get(i).getEmail())) {
            		furnID=userList.get(i).furnID();
            	}
            }
            
        	t.addFurnn(pic,price,t3bt,furnID);
    		check=true;
    		 continue;
 	}
 	
 
 }
 
 
 else if(login.getD()==true) {
	 logger.info("****** Hello Adminstrater!!!!!!");
	 logger.info("You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartments requests");
	 scanner = new Scanner(System.in);
		int c= scanner.nextInt();
		
		if(c==1) {
			adm.addFurrn();
		}
		
		else if(c==2) {
			logger.info("\n");
			logger.info("==== Reserved Houses :");
			int z=1;
			houses=t.lisH();
			for(int i=0;i<houses.size()/2;i++) {
	            if (houses.get(i).getReserved() ) {
	            	logger.info(String.format("- House %d", z));
	            	logger.info(houses.get(i).getPicLink()+"\n"+houses.get(i).getLocation()+"\n"+houses.get(i).getservices());
	            	logger.info("\n");
	           z++;}
		}
			logger.info("==== Unreserved Houses :");
			 z=1;
			 for(int i=0;i<houses.size()/2;i++) {
		            if (!(houses.get(i).getReserved()) ) {
		            	logger.info(String.format("- House %d", z));
		            	logger.info(houses.get(i).getPicLink()+"\n"+houses.get(i).getLocation()+"\n"+houses.get(i).getservices());
		            	logger.info("\n");
		           z++;}
			 }
		}
		
 }
 
 else
 {
	 
 }
 
 
 
	}
}}