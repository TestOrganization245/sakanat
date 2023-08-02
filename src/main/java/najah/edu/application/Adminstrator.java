package najah.edu.application;

import java.util.List;
import java.util.Scanner;

public class Adminstrator {
   static  OWNER yy = new OWNER();
   public int v;
   Scanner s  = new Scanner(System.in); 
   public Tenant user=new Tenant();
   public List<House> userlist=user.lisH();
   public List<Furn> furnn= user.addFurnn();
   //Scanner s  = new Scanner(System.in); 
	public void printMenu() {
		System.out.println("****** Hello Adminstrater!!!!!!");
		System.out.println("You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartments requests");
	  
	}
	
	public void checkk(int x) {
		if(x==1) { 
			
			furnn= user.addFurnn();
			System.out.println("The available furniture requests are :");
			for(int i=0;i<furnn.size();i++) {
				System.out.println("Request number "+v);
				System.out.println("Pic Link: "+furnn.get(i).getPic()+"Price: "+furnn.get(i).getPrice()+", More detailes: "+furnn.get(i).getDetails());
			}
			System.out.println();
			System.out.println("Which one would you like to accept?");
			Scanner scanner=new Scanner(System.in);
			int y=scanner.nextInt();
			user.addition(furnn, y);
			
			//Making sure it has been ADDED
			System.out.println();
			user.printFurn();
			System.out.println();
			
			
		}
		else if(x==2) {
			System.out.println("==== Reserved Houses :");
			int Z=1;
			for(int i=0;i<userlist.size()/2;i++) {
	        	//System.out.println(user.getEmail());
	            if (userlist.get(i).getReserved()==true ) {
	            	System.out.println("- House "+ Z);
	           System.out.println(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
				System.out.println();

	           Z++;}
		}
			System.out.println("==== Unreserved Houses :");
			 Z=1;
			 for(int i=0;i<userlist.size()/2;i++) {
		        	//System.out.println(user.getEmail());
		            if (userlist.get(i).getReserved()==false ) {
		            	System.out.println("- House "+ Z);
		           System.out.println(userlist.get(i).getPicLink()+"\n"+userlist.get(i).getLocation()+"\n"+userlist.get(i).getservices());
					System.out.println();

		           Z++;}
			 }
		}
		if(x==3) {
		//	System.out.println("TEST");
		//	yy.newapplication();
			System.out.println("THE LIST OF information about apartment to accept from admin:\n");
				System.out.println(yy.newapplication());

			if(yy.newapplication().equals(null) ) {
				System.out.println("NOT apartment to adding *****");

		}
			else {
				//System.out.println(yy.newapplication());
			System.out.print("*** Are You need to accept the request of adding the apartment from owner ?  \n(the anwser between this choise (yes || YES || NO || no) \n");
			
			
			String y = s.nextLine();
			if(y.equalsIgnoreCase("yes")) {
                yy.Approval();
			}
			else if (y.equalsIgnoreCase("no")) {
				System.out.print("OK, admin not accept this adding.... ");
			}
			else {
				System.out.print("no correct the choises \n");
			}
			//yy.APP();
			}
		}
	}		
	
}
