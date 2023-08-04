package najah.edu.application;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Adminstrator {
   static  OWNER yy = new OWNER();
   public int v;
  static Logger logger = Logger.getLogger(Adminstrator.class.getName());
  private static final Scanner s  = new Scanner(System.in); 
   public Tenant user=new Tenant();
   public List<House> userlist=user.lisH();
   public List<Furn> furnn= user.addFurnn();
	public void printMenu() {
		logger.info("****** Hello Adminstrater!!!!!!");
		logger.info("You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartments requests");
	  
	}
	
	public void checkk(int x) {
		if(x==1) { 
			
			furnn= user.addFurnn();
			logger.info("The available furniture requests are :"+ "\n");
			for(int i=0;i<furnn.size();i++) {
				logger.info("Request number "+v + "\n");
				logger.info("Pic Link: "+furnn.get(i).getPic()+"Price: "+furnn.get(i).getPrice()+", More detailes: "+furnn.get(i).getDetails());
			}
			logger.info("\n");
			logger.info("Which one would you like to accept?");
			Scanner scanner=new Scanner(System.in);
			int y=scanner.nextInt();
			user.addition(furnn, y);
			
			logger.info("\n");
			user.printFurn();
			logger.info("\n");
			
			
		}
		else if(x==2) {
			logger.info("==== Reserved Houses :");
			int Z=1;
			for(int i=0;i<userlist.size()/2;i++) {
	            if (userlist.get(i).getReserved()==true ) {
	            	logger.info("- House "+ Z);
	            	logger.info(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
	            	logger.info("\n");

	           Z++;}
		}
			logger.info("==== Unreserved Houses :");
			 Z=1;
			 for(int i=0;i<userlist.size()/2;i++) {
		            if (userlist.get(i).getReserved()==false ) {
		            	logger.info("- House "+ Z);
		            	logger.info(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
		            	logger.info("\n");

		           Z++;}
			 }
		}
		if(x==3) {
			logger.info("THE LIST OF information about apartment to accept from admin:\n");
			logger.info(yy.newapplication());

			if(yy.newapplication() == null ) {
				logger.info("NOT apartment to adding *****");

		}
			else {
				logger.info("*** Are You need to accept the request of adding the apartment from owner ?  \n(the anwser between this choise (yes || YES || NO || no) \n");
			
			
			String y = s.nextLine();
			if(y.equalsIgnoreCase("yes")) {
                yy.Approval();
			}
			else if (y.equalsIgnoreCase("no")) {
				logger.info("OK, admin not accept this adding.... ");
			}
			else {
				logger.info("no correct the choises \n");
			}
			}
		}
	}		
	
}
