package najah.edu.application;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	private static String flag;
    private static OWNER o ;
	private static Tenant T=new Tenant();
    private static int rr;
    private static String mail;
    private static int M;
    private static int choice;
    private static String h;
    static Adminstrator adm=new Adminstrator();
    public static boolean pp ;
    private static boolean CHECK=false;
    private List<String> expectedOptions;
    private static List<String> residences;
   static // private List<floor> floor;
    Scanner scanner = new Scanner(System.in);
   
  private static Logger logger = Logger.getLogger(Main.class.getName());
	
  private static LOGIN login=new LOGIN();
  
public static void main(String args[]) {
	mail=login.returnEmail();
	 login.run();
	while(true) {
		if(CHECK) {
			CHECK=false;
			 login.run();
		}
		
 if(login.getO()) {
	 while(true){
		 
	 o = new OWNER();
	 residences =  o.owner();
	 
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
			  CHECK=true;
		  break;
		  
		  }
	  }
	  else if(choice==2) {
		  logger.info("\n");
		  logger.info("\n");
		  logger.info("\n");
		  continue;
	  }
	  else {
		  logger.info("\n");
		  logger.info("YOU ENTERED A WRONG CHOICE");
	  }
	  
	  } 
  
 }
 
 
 else if(login.getT()) {
	 T.printTenant();
	 Scanner scanner= new Scanner(System.in);
 	M=scanner.nextInt();
 	if(M==1) {
 		logger.info("\n");
 		logger.info("\n");
 		logger.info("\n");
 	T.View();
	 T.housesDetailes(login.returnEmail());
	 CHECK=true;
	 continue;
 	}
 	else if(M==2) {
 		T.viewFurn(login.returnEmail());
 		CHECK=true;
 		 continue;
 	}
	 
 }
 
 
 else if(login.getD()) {
	 adm.printMenu();
	 Scanner scanner = new Scanner(System.in);
		int c = scanner.nextInt();
		adm.checkk(c);
 }
 
 else
 {
	 
 }
 
 
 
	}
}}