package najah.edu.application;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class Adminstrator {
   static  OWNER yy = new OWNER();
  private static  int v;
  static Logger logger = Logger.getLogger(Adminstrator.class.getName());
  private static final Scanner s  = new Scanner(System.in); 
   private static  Tenant user=new Tenant();
   private static final List<House> userlist= user.lisH();

	
   
   public void addFurrn() {
	   Tenant.Furnn();
	   user.printFurn();
   }
   
   
   
   
   
	/*public void checkk(int x) {
		if(x==1) { 
			  furnn.clear();
	            furnn.addAll(user.addFurnn());
			logger.info("The available furniture requests are :"+ "\n");
			for(int i=0;i<furnn.size();i++) {
				logger.info(String.format("Request number %d%n", v));
				logger.info("Pic Link: "+furnn.get(i).getPic()+"Price: "+furnn.get(i).getPrice()+", More detailes: "+furnn.get(i).getDetails());
			}
			logger.info("\n");
			logger.info("Which one would you like to accept?");
			Scanner scanner=new Scanner(System.in);
			int y=scanner.nextInt();
			//user.addition(furnn, y);
			
			logger.info("\n");
			user.printFurn();
			logger.info("\n");
			
		}
		else if(x==2) {
			logger.info("==== Reserved Houses :");
			int z=1;
			for(int i=0;i<userlist.size()/2;i++) {
	            if (userlist.get(i).getReserved() ) {
	            	logger.info(String.format("- House %d", z));
	            	logger.info(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
	            	logger.info("\n");
	           z++;}
		}
			logger.info("==== Unreserved Houses :");
			 z=1;
			 for(int i=0;i<userlist.size()/2;i++) {
		            if (!(userlist.get(i).getReserved()) ) {
		            	logger.info(String.format("- House %d", z));
		            	logger.info(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
		            	logger.info("\n");
		           z++;}
			 }
		}
		if(x==3) {
			processApartmentRequests();}
	}
	
	//
	private void processApartmentRequests() {
	    logger.info("THE LIST OF information about apartment to accept from admin:\n");

	    if (yy.newapplication() == null) {
	        logger.info("NOT apartment to adding *****");
	    } else {
	        logger.info("*** Are You need to accept the request of adding the apartment from owner ?\n(the answer between this choice (yes || YES || NO || no)\n");

	        String y = s.nextLine();
	        if (y.equalsIgnoreCase("yes")) {
	            yy.Approval();
	        } else if (y.equalsIgnoreCase("no")) {
	            logger.info("OK, admin not accept this adding.... ");
	        } else {
	            logger.info("no correct the choices \n");
	        }
	    }
	}*/
	
}