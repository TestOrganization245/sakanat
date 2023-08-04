package najah.edu.application;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
	private static String flag;
    private static OWNER o ;
	private static Tenant t =new Tenant();
    private static int rr;
    private static String mail;
    private static int m;
    private static int choice;
    private static String h;
   public  static Adminstrator adm=new Adminstrator();
    private static boolean cHECK=false;
    private List<String> expectedOptions;
    private static List<String> residences;
   static 
    Scanner scanner = new Scanner(System.in);
   
  private static Logger logger = Logger.getLogger(Main.class.getName());
	
  private static LOGIN login=new LOGIN();
  
public static void main(String args[]) {
	mail=login.returnEmail();
	 login.run();
	while(true) {
		if(cHECK) {
			cHECK=false;
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
		  logger.info("You have entered a mistaken choice >>..");
		  
		}
	  logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
	  choice=scanner.nextInt();
	  if(choice==1) {
		  logger.info("         ********** YOU LOGGED OUT SUCCESSFULLY *********\n- Would you like log in again?");
		 h=scanner.nextLine();
		 h=scanner.nextLine();
		  if(h.equalsIgnoreCase("yes")) {
			  cHECK=true;
		  break;
		  
		  }
	  }
	  else if(choice==2) {
		  logger.info("\n\n\n");
		 
		  continue;
	  }
	  else {
		  logger.info("\n");
		  logger.info("YOU ENTERED A WRONG CHOICE");
	  }
	  
	  } 
  
 }
 
 
 else if(login.getT()) {
	 processTenant();
	 
 }
 
 
 else if(login.getD()) {
	 processAdministrator();
 }
 
 else
 {
	 logger.info("nooo");
 }
 
 
 
	}
	
}
private static void processAdministrator() {
    adm.printMenu();
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    adm.checkk(c);
}

private static void processTenant() {
    t.printTenant();
    Scanner scanner = new Scanner(System.in);
    m = scanner.nextInt();

    if (m == 1) {
        logger.info("\n\n\n");
        t.View();
        t.housesDetailes(login.returnEmail());
        cHECK = true;
    } else if (m == 2) {
        t.viewFurn(login.returnEmail());
        cHECK = true;
    }
}


}