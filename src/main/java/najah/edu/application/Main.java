package najah.edu.application;

import java.util.List;
import java.util.Scanner;

public class Main {
	private static String flag;
    private static OWNER o ;
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
	mail=login.returnEmail();
	 login.run();
	 //System.out.println(login.returnEmail());
	while(true) {
		if(CHECK==true) {
			CHECK=false;
			 login.run();
		}
		
 if(login.getO()==true) {
	 while(true){
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
	  
	  } 
  
 }
 
 
 else if(login.getT()==true) {
	 T.printTenant();
	 Scanner scanner= new Scanner(System.in);
 	M=scanner.nextInt();
 	if(M==1) {
 		System.out.println();
 		System.out.println();
 		System.out.println();
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
 
 
 else if(login.getD()==true) {
	 adm.printMenu();
	 Scanner scanner = new Scanner(System.in);
		int C= scanner.nextInt();
		adm.checkk(C);
 }
 
 else
 {
	 
 }
 
 
 
	}
}}