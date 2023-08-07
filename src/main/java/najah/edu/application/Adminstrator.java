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

	
   public void printFurnn() {
	   user.printFurn();
   }
   public void addFurrn() {
	   Tenant.furnn();
   }
   
   public void apartmentrequest() {
		  yy.processApartmentRequests();
	   }
   
  
	
}