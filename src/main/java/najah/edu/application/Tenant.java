package najah.edu.application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.Scanner;




////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////// REQUIERED LISTS CLASSES  ////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////

//1
class User {
	private String Name;
    private String email;
    private String password;
	private String type;
	private String ID;
	private int age;
	private String Job;
	private String FurnID;

    public User(String Name,String email, String password , String type, String ID, int age, String Job, String FurnID) {
        this.Name=Name;
    	this.email = email;
        this.password = password;
        this.type = type;
        this.ID=ID;
        this.age=age;
        this.Job=Job;
        this.FurnID=FurnID;
        
    }

    public String getName() {
        return Name;
    }
    public String getID() {
        return ID;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getJob() {
        return Job;
    }
    
    public int getage() {
        return age;
    }

    public String getPassword() {
        return password;
    }
    
    public String gettype() {
        return type;
    }
    
    public String furnID() {
        return FurnID;
    }
}


//2
class House {
    private String PicLink;
    private double price;
	private String location;
	private String services;
	private String ID;
	private String Type;
	private boolean Reserved;

    public House(String PicLink, double price , String location, String services, String ID,String Type,boolean Reserved) {
        this.PicLink=PicLink;
        this.price=price;
        this.location=location;
        this.services=services;
        this.ID=ID;
        this.Type=Type;
        this.Reserved=Reserved;
    }

    public void setReserved(boolean Q) {
        Reserved=Q;
    }
    
    public boolean getReserved() {
        return Reserved;
    }
    public String getPicLink() {
        return PicLink;
    }

    public String getType() {
        return Type;
    }
    public String getID() {
        return ID;
    }
    
    public String getLocation() {
        return location;
    }
    public String getservices() {
        return services;
    }
    public double getprice() {
        return price;
    }
}


//3
 class Furn{
	private String pic;
	private double price;
	private String details;
	private String userid;
	
	 public Furn(String pic, double price, String details, String userid) {
	       this.pic=pic;
	       this.price=price;
	       this.details=details;
	       this.userid=userid;
	    }
	  public double getPrice() {
	        return price;
	    }
	  public String getPic() {
	        return pic;
	    }
	  public String getDetails() {
	        return details;
	    }
	  public String getUserId() {
	        return userid;
	    }
	 
}

 
 
 
 /////////////////////////////////////////// MAIN CLASS ///////////////////////////////////////////////
 
public class Tenant {
	static LOGIN login=new LOGIN();
	private static boolean K=false;
	private static String Y;
	private static boolean B= false;
	private static String User;
	public static int V;
	public static int M;
	public static int C;
	public static double Price;
	private static String Pic;
	private static String Details;
	public static String emaill;
	public static String housenum;
    private static List<User> userList;
    private static ArrayList<House> Houses;
    private ArrayList<Furn> Furniture;
    private static ArrayList<Furn> newFurniture;
    private boolean loggedIn;
    private String welcomeMessage;
    public static String Email;
    private Scanner scanner;
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    
    
    
    public Tenant() {
    	this.scanner = new Scanner(System.in);
        userList = new ArrayList<User>();
        // Add initial users to the user list
        userList.add(new User("Lama","example1@example.com", "password1" , "tenant","123", 18, "I Don't Work, I'm a princess <3","1"));
        userList.add(new User("Ibtissam","example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent","2"));
        userList.add(new User("Sami","example3@example.com", "password3" , "admin","234", 21 , "WEWE","1"));
        userList.add(new User("Waleed","example4@example.com", "password4" , "owner","85", 32 , "WEWE","2"));

        
        this.scanner = new Scanner(System.in);
       Houses = new ArrayList<House>();
        Houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student", false));
        Houses.add(new House("PicLink2", 500, "Jenin", "Service2","234", "student", false));
        Houses.add(new House("PicLink3", 200, "Jenin", "Service3","456", "family", false));
        Houses.add(new House("PicLink4", 200, "Jenin", "Service4","85", "family", true));
        Houses.add(new House("PicLink5", 200, "Jenin", "Service3","89", "student", true));
        
        this.scanner = new Scanner(System.in);
        Furniture = new ArrayList<Furn>();
        Furniture.add(new Furn("PicLink1", 200, "Used only for 2 weeks","1"));
        Furniture.add(new Furn("PicLink2", 100, "Haven't been used.","1"));
        Furniture.add(new Furn("PicLink3", 200, "No details available.","2"));
        
        newFurniture = new ArrayList<Furn>();

        
    }
    
    public static List<User> liss(){
    	 userList.add(new User("Lama","example1@example.com", "password1" , "tenant","123", 18, "I Don't Work, I'm a princess <3","1"));
         userList.add(new User("Ibtissam","example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent","2"));
         userList.add(new User("Sami","example3@example.com", "password3" , "admin","234", 21 , "WEWE","3"));
         
             return userList;
        }
    
    
    public static List<House> lisH(){
        Houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student", false));
        Houses.add(new House("PicLink2", 500, "Jenin", "Service2","234", "student", false));
        Houses.add(new House("PicLink3", 200, "Jenin", "Service3","456", "family", false));
            return Houses;
       }
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////VIEWING THE HOUSE FUNCTIONS/////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void printTenant() {
    	System.out.println();
    	System.out.println("*******    Welcome our tenant!!    *******");
    	System.out.println("Would you like to \n 1. view the available houses \n 2. Advertise your own used furniture?");
    }
    
    
    public void View() {
    	boolean available =false;
    	System.out.println();
    	System.out.println("You have the following available options:");
    	System.out.println("1.    House 1");
    	System.out.println("2.    House 2");
    	System.out.println("3.    House 3");
    	System.out.println();
    	System.out.println("-Which house would you like to view? (1/2/3)");
    }
    
    
    //TEST
    public boolean Vview() {
    	boolean available =false;
    	System.out.println();
    	System.out.println("You have the following available options:");
    	System.out.println("1.    House 1");
    	System.out.println("2.    House 2");
    	System.out.println("3.    House 3");
    	System.out.println();
    	System.out.println("-Which house would you like to view? (1/2/3)");
    	return true;
    }
    
    
    
    
    public void housesDetailes(String mail) {
    	while(true) {
    		System.out.println();
    		System.out.println();
    	Scanner scanner= new Scanner(System.in);
    	V= scanner.nextInt();
    	System.out.println(House(V));
    	System.out.println();
    	System.out.println();
    	System.out.println("Would you like to \n1. Go Back \n2. Accomodate this house");
    	int Z =scanner.nextInt();
    	if(Z==1) {
    		View();
    		continue;
    	}
    	else if(Z==2) {
    		//Making sure if the house is owned recently by students or not When accomodating
    		 if(Check(V)) {
    		    	Y=scanner.nextLine();
    		    	Y=scanner.nextLine();
    		    	if(Y.equalsIgnoreCase("yes")) {
    		    		System.out.print(StuHousing(V));
    		    		System.out.println("Would you like to \n1. Go Back \n2. Accomodate this house");
    		        	Z =scanner.nextInt();
    		        	if(Z==1) {
    		        		View();
    		        		continue;
    		        	}
    		        	else if(Z==2) {
    		        		System.out.println("    =====================================================================");
        		    		System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
        		    		System.out.println("    =====================================================================\n");
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);

        		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
        		    		System.out.println();
        		    		specifiedData(mail);
        		    		System.out.println();
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
        		    		 System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
        		    		  int O =scanner.nextInt();    	
        		    		  if(O==1) {
        		    			  break;
        		    		  }
        		    		  else if(O==2) {
        		    			  View();
        		    			  continue;
        		    		  }
    		        	}
    		    		
    		    	}
    		    	else if(Y.equalsIgnoreCase("no")) {
    		    		System.out.println("    =====================================================================");
    		    		System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
    		    		System.out.println("    =====================================================================\n");
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);

    		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		    		System.out.println();
    		    		specifiedData(mail);
    		    		System.out.println();
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		    		 System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
    		    		  int O =scanner.nextInt();    	
    		    		  if(O==1) {
    		    			  break;
    		    		  }
    		    		  else if(O==2) {
    		    			  View();
    		    			  continue;
    		    		  }
    		    	}
    		    }
    		    else if(Check(V)==false) {
    		    	System.out.println("    =====================================================================");
		    		System.out.println("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
		    		System.out.println("    =====================================================================\n");
		    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		System.out.println();
		    		specifiedData(mail);
		    		System.out.println();
		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		 System.out.println("Would you like to \n1. log out \n2. go back to the main menu?\n");
		    		  int O =scanner.nextInt();    	
		    		  if(O==1) {
		    			  break;
		    		  }
		    		  else if(O==2) {
		    			  View();
		    			  continue;
		    		  }
    		    }
    	}
    	
    	}
    	
    }
   
    
    
    

        public static void printColorText(String text, ConsoleColor color) {
            // ANSI escape codes to change text color
            String colorCode = "\u001B[" + color.getCode() + "m";
            String resetCode = "\u001B[0m";

            System.out.println(colorCode + text + resetCode);
        }

        // Enum to represent different console colors
        public enum ConsoleColor {
            RED("31"),
            GREEN("32"),
            BLUE("34");

            private String code;

            ConsoleColor(String code) {
                this.code = code;
            }

            public String getCode() {
                return code;
            }
        }
    

    
    
    
    
    
    
    
    
    
    
    
    
    public void specifiedData(String email) {
    	Houses.get(V-1).setReserved(true);
    	printTenant(email);
    	printOwner(V);
    	System.out.println(generateRandomDate());
    }
 
    
    
    public boolean CheckAccomodation(int U) {
    	return Houses.get(U-1).getReserved();
    }
    
    

    public String House(int x) {
    		return ("===   This house's charachteristics are \n"+ " Picture:   "+Houses.get(x-1).getPicLink() + "\n Location:   " + Houses.get(x-1).getLocation() + "\n Price:   " + Houses.get(x-1).getprice() + "$\n Services:   " + Houses.get(x-1).getservices() );
    }
    
    
    
    public boolean Check(int j) {
    	if(Houses.get(j-1).getType()=="student") {
    		System.out.println("\n\n- NOTE: This house is specified for students, you wanna know about their details?");
    		return true;
    	}
    	else
    		return false;
    }
    
    //TEST
    public boolean Checkk(int j) {
    	if(Houses.get(j-1).getType()=="student") {
    		//System.out.println("\n\n- NOTE: This house is specified for students, you wanna know about their details?");
    		return true;
    	}
    	else
    		return false;
    }
    
    
    public static String emailll(String email) {
    	//System.out.print(email);
    	return email;
    }
    
    public String StuHousing(int z) {
    	System.out.println(z);
    	String ret="\n===  The following students are living in this house:\n\n";
    	 for (int counter = 0; counter < userList.size()/2; counter++) { 	
    		 if((Houses.get(z-1).getID()==userList.get(counter).getID())&&(userList.get(counter).gettype().equalsIgnoreCase("tenant")))
              		ret+=("Name:    "+userList.get(counter).getName()+"\n"+"Age:    "+userList.get(counter).getage()+"\nJob:    "+ userList.get(counter).getJob()+"\n\n");
         }   
    	return ret;
    }
    
    
    public static String generateRandomDate() {
        Random random = new Random();

        // Set a random year between 1900 and 2099
        int year = random.nextInt(1) + 2024;

        // Set a random month (0-11) since months in Calendar are 0-based
        int month = random.nextInt(12);

        // Set a random day of the month
        int day = random.nextInt(30);

        // Create a Calendar instance and set the year, month, and day
        return ("And the payment operation must be done before the date :     "+ day+"-" + month+"-"+year);
    }
    


    
    public void printTenant(String emaill) {
    	for(int i=0;i<userList.size()/2;i++) {
    		if(emaill.equalsIgnoreCase(userList.get(i).getEmail()))
    			System.out.print("The tenant ( " + userList.get(i).getName()+" ) with the email   **"+userList.get(i).getEmail() +"**\nAnd age "+ userList.get(i).getage()+"\nWho Works as "+userList.get(i).getJob() +"\n\nHave accommdated this house successfully\n");
    	}
    }
    
    public void printOwner(int HouseNum) {
    	//System.out.println(housenum=Houses.get(HouseNum-1).getID());
    	housenum=Houses.get(HouseNum-1).getID();
    	for(int i=0; i<userList.size()/2;i++) {
    		if(housenum==userList.get(i).getID()&&userList.get(i).gettype().equalsIgnoreCase("owner")) {
    			System.out.println("From the Owner " + userList.get(i).getName()+" with the email "+userList.get(i).getEmail() +"\nAnd age "+ userList.get(i).getage()+"\nwho works as "+userList.get(i).getJob() +"\n");
    		}
    	}

    }
    

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// ADDING FURNITURE FUNCTIONS  ///////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    

    public boolean viewFurn(String mail) {
    	String FurnID="";
    		System.out.println();
    		System.out.println();
        	System.out.println("******** This window is designed for you to add your own furniture that you want to sell ");
        	System.out.println();
        	System.out.println("= Please Add the following details");
        	System.out.println("Provide a good pic link:");
            Pic=scanner.nextLine();
            System.out.println("Attach some additional details");
            String t3bt=scanner.nextLine();
            System.out.println("Provide the specified price");
            Price=scanner.nextDouble();
            for(int i=0;i<userList.size()/2;i++) {
            	if(mail==userList.get(i).getEmail()) {
            		FurnID=userList.get(i).furnID();
            	}
            }
        	newFurniture.add(new Furn(Pic, Price, t3bt,FurnID));
        	for(int i=0;i<newFurniture.size();i++) {
        		System.out.println(newFurniture.get(i).getPrice());
            }
    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
        	System.out.println("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
            return false;
    }
    
    
    
    
    //TESTTTTT
    
    public boolean viewFurnn(String mail, String pic,double price, String det, String ID) {
        	newFurniture.add(new Furn(pic, price, det,ID));
    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
        	System.out.println("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
            return false;
    }
    /*
    public void addFurn(String userr ) {
    	newFurniture.add(new Furn(picture, pricee, detailss, userr));
		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
    	System.out.println("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);

    }*/
    
    
    public List<Furn> addFurnn() {
    	//newFurniture.add(new Furn(Pic, Price, t3bt,FurnID));
    	for(int i=0;i<newFurniture.size();i++) {
    		System.out.println(newFurniture.get(i).getPrice());
        }
return newFurniture;
    }
    
    
    
    public void addition(List <Furn> A, int s) {
    	for(int i=0;i<A.size();i++) {
    		if(i==(s-1)) {
    			Furniture.add(new Furn(A.get(i).getPic(), A.get(i).getPrice(),A.get(i).getDetails(),"123"));
    		}
    	}
    }
    
    
    public void printFurn() {
    	for (int counter = 0; counter < Furniture.size(); counter++) { 	
   		 System.out.println(Furniture.get(counter).getPic());
   		System.out.println(Furniture.get(counter).getPrice());
   		System.out.println(Furniture.get(counter).getDetails());
        }  
    }
    
   
    
  
    
    
  
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// ADDING ADMINSTRATOR FUNCTIONS  ////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void printMainAdminstrator() {
    	System.out.println("********* WELCOME TO THE ADMISTRATOR PAGE ! **************************\n-You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartment Requests.\n\n Which one would you like to view?");
    }
    
    public void checkReserved() {
    	int z=1;
    	System.out.println();
    	System.out.println("******* RESERVED APARTMENTS:");
    	for(int i=0; i<Houses.size();i++) {
    		if(Houses.get(i).getReserved()==true) {
    			System.out.println(z+". Apartment number "+z+" with the following details "+Houses.get(i).getID()+ " "+Houses.get(i).getLocation()+ " "+Houses.get(i).getPicLink()+ " "+Houses.get(i).getprice()+ " "+Houses.get(i).getservices()+"\n");
    			z++;
    		}
    	}
    	z=1;
    	System.out.println();
    	System.out.println("******* UNRESERVED APARTMENTS:");
    	for(int i=0; i<Houses.size();i++) {
    		if(Houses.get(i).getReserved()==false) {
    			
    			System.out.println(z+". Apartment number "+z+" with the following details "+Houses.get(i).getID()+ " "+Houses.get(i).getLocation()+ " "+Houses.get(i).getPicLink()+ " "+Houses.get(i).getprice()+ " "+Houses.get(i).getservices()+"\n");
    		z++;
    		}
    	}
    }
    
    
}
