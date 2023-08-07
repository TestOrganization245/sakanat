package najah.edu.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import najah.edu.application.Tenant.ConsoleColor;

public class Main {
	
    private static List<User> userList;
    private static ArrayList<House> houses;
    private ArrayList<Furn> furniture;
    private static ArrayList<Furn> newFurniture=new ArrayList<Furn>();
    private static String pic;
    private static double price;
    private static String housenum;

	private static int v;
	private static String flag;
	private static Tenant T=new Tenant();
    private static int rr;
    private static String mail;
    private static int M;
    private static int Choice;
    private static String H;
    static Adminstrator adm=new Adminstrator();
    //MyApplication yyw = new MyApplication();
    public static boolean pp ;
    private static boolean CHECK=false;
    private List<String> expectedOptions;
    private static List<String> residences;
   static // private List<floor> floor;
    Scanner scanner = new Scanner(System.in);
	//1
   
   
	
  static LOGIN login=new LOGIN();
  
public static void main(String args[]) {
    System.out.println("Welcome to the Application!");
     System.out.println("Please select an option:");
     System.out.println("1. Login");
     System.out.println("2. Exit");
	Scanner scanner=new Scanner(System.in);
	int p=scanner.nextInt();
	if(p==1) {
		System.out.println("Navigating to the login page...");
 	    System.out.println("            === Login Page ===");
 	    System.out.println("- Please enter your email and password:");
 	    System.out.println("Email: ");
 	    String m=scanner.nextLine();
m=scanner.nextLine();
 	   System.out.println("Password: ");
	    String z=scanner.nextLine();
		login.navigateToLoginPage(m,z);
		mail=login.returnEmail();
	}
	while(true) {
		if(CHECK==true) {
			CHECK=false;
	           System.out.println("Welcome to the Application!");
	            System.out.println("Please select an option:");
	            System.out.println("1. Login");
	            System.out.println("2. Exit");
			int o=scanner.nextInt();
			if(o==1) {
				System.out.println("Navigating to the login page...");
		 	    System.out.println("            === Login Page ===");
		 	    System.out.println("- Please enter your email and password:");
		 	    System.out.println("Email: ");
		 	    String m=scanner.nextLine();
		 	   m=scanner.nextLine();
		 	   System.out.println("Password: ");
			    String z=scanner.nextLine();
				login.navigateToLoginPage(m,z);
				mail=login.returnEmail();
			}
		}
		
 if(login.getO()==true) {
	/* while(true){
	 //OWWWNERRRRRRR
		 
	 o = new OWNER();
	 residences =  o.owner();///true all residences 
	 //
	 System.out.println("*******************************************************************************");
	 System.out.println("*******************************************************************************");
	  System.out.println("Do you want to see your own residences details ???");
	  flag = scanner.nextLine();
	  if(flag.equalsIgnoreCase("yes")) {
		  System.out.println();
			System.out.println("********* You have the following residences:: \n");
		 rr = o.view();
	  }
	else if(flag.equalsIgnoreCase("no")) {
		System.out.println("OK");
		 }
	  else {
			System.out.println("You have entered a mistaken choice >>.."+ rr);
		}
	  System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
	  Choice=scanner.nextInt();
	  if(Choice==1) {
		  System.out.println("         ********** YOU LOGGED OUT SUCCESSFULLY *********\n- Would you like log in again?");
		 H=scanner.nextLine();
		 H=scanner.nextLine();
		  if(H.equalsIgnoreCase("yes")) {
			  CHECK=true;
		  break;
		  
		  }
	  }
	  else if(Choice==2) {
		  System.out.println();
		  System.out.println();
		  System.out.println();
		  continue;
	  }
	  else {
		  System.out.println();
		  System.out.println("YOU ENTERED A WRONG CHOICE");
	  }
	  
	  } */
  
 }
 
 
 else if(login.getT()==true) {
	 
	T.printTenant();
	M=scanner.nextInt();
 	if(M==1) {
 		System.out.println();
 		System.out.println();
 		System.out.println();
 	T.myView();
 	
 	while(true) {
 	System.out.println();
 	System.out.println();
	scanner= new Scanner(System.in);
	v= scanner.nextInt();
	
	System.out.println(T.hhouse(v));
	System.out.println("Would you like to \n1. Go Back \n2. Accomodate this house");
	int z =scanner.nextInt();
	if(z==1) {
		T.myView();
		continue;
	}
	
	
	else if(z==2) {
		if(T.check(v)) {
			String y=scanner.nextLine();
			y=scanner.nextLine();
			if(y.equalsIgnoreCase("yes")) {
				System.out.println(T.stuHousing(v));
				System.out.println("Would you like to \n1. Go Back \n2. Accomodate this house");
	        	z =scanner.nextInt();
	        	if(z==1) {
	        		T.myView();
	        		continue;
	        		}
	        	else if(z==2) {
	        		System.out.println("    =====================================================================");
	        		System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
	        		System.out.println("    =====================================================================\n");
		    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		T.printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
		    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		System.out.println();
		    		System.out.println(mail);

		    		T.specifiedData(mail, v);
		    		System.out.println();
		    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
		    		  int o =scanner.nextInt();    	
		    		  if(o==1) {
		    			  break;
		    		  }
		    		  else if(o==2) {
		    			  T.myView();
		    			  continue;
		    		  }
	        	}
			}
			

	    	else if(y.equalsIgnoreCase("no")) {
	    		System.out.println("    =====================================================================");
	    		System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
	    		System.out.println("    =====================================================================\n");
	    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
	    		T.printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
	    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
	    		System.out.println();
	    		T.specifiedData(mail,v);
	    		System.out.println();
	    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
	    		System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
	    		  int o =scanner.nextInt();    	
	    		  if(o==1) {
	    			  break;
	    		  }
	    		  else if(o==2) {
	    			  T.myView();
	    			  continue;
	    		  }
	    	}
	    }
	    else if(T.check(v)==false) {
	    	System.out.println("    =====================================================================");
	    	System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
	    	System.out.println("    =====================================================================\n");
    		T.printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
    		T.printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		System.out.println();
    		T.specifiedData(mail,v);
    		System.out.println();
    		T.printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
    		  int o =scanner.nextInt();    	
    		  if(o==1) {
    			  break;
    		  }
    		  else if(o==2) {
    			  T.myView();
    		  }
	    }
	}
	
	 CHECK=true;
	 continue;
 	}
 }
 	
 	else if(M==2) {

 		String furnID="";
    	System.out.println();
    	System.out.println();
    	System.out.println("******** This window is designed for you to add your own furniture that you want to sell ");
    	System.out.println();
    	System.out.println("= Please Add the following details");
    	System.out.println("Provide a good pic link:");
            pic=scanner.nextLine();
            pic=scanner.nextLine();
            System.out.println("Attach some additional details");
            String t3bt=scanner.nextLine();
            System.out.println("Provide the specified price");
            price=scanner.nextDouble();
            userList=T.liss();
            for(int i=0;i<userList.size()/2;i++) {
            	if(mail.equals(userList.get(i).getEmail())) {
            		furnID=userList.get(i).furnID();
            	}
            }
            
        	T.addFurnn(pic,price,t3bt,furnID);
    		CHECK=true;
    		 continue;
 	}
 	
 
 }
 
 
 else if(login.getD()==true) {
	 System.out.println("****** Hello Adminstrater!!!!!!");
	 System.out.println("You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartments requests");
	 scanner = new Scanner(System.in);
		int c= scanner.nextInt();
		
		if(c==1) {
			adm.addFurrn();
		}
		
		else if(c==2) {
			System.out.println();
			System.out.println("==== Reserved Houses :");
			int z=1;
			houses=T.lisH();
			for(int i=0;i<houses.size()/2;i++) {
	            if (houses.get(i).getReserved() ) {
	            	System.out.println(String.format("- House %d", z));
	            	System.out.println(houses.get(i).getPicLink()+"\n"+houses.get(i).getLocation()+"\n"+houses.get(i).getservices());
	            	System.out.println("\n");
	           z++;}
		}
			System.out.println("==== Unreserved Houses :");
			 z=1;
			 for(int i=0;i<houses.size()/2;i++) {
		            if (!(houses.get(i).getReserved()) ) {
		            	System.out.println(String.format("- House %d", z));
		            	System.out.println(houses.get(i).getPicLink()+"\n"+houses.get(i).getLocation()+"\n"+houses.get(i).getservices());
		            	System.out.println("\n");
		           z++;}
			 }
		}
		
 }
 
 else
 {
	 
 }
 
 
 
	}
}}