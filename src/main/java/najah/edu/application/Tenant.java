package najah.edu.application;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;
class User {
	private String name;
    private String email;
    private String password;
	private String type;
	private String iD;
	private int age;
	private String job;
	private String furnID;
    public User(String name,String email, String password , String type, String iD, int age, String job, String furnID) {
        this.name=name;
    	this.email = email;
        this.password = password;
        this.type = type;
        this.iD=iD;
        this.age=age;
        this.job=job;
        this.furnID=furnID;
        
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return iD;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getJob() {
        return job;
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
        return furnID;
    }
}
class House {
    private String picLink;
    private double price;
	private String location;
	private String services;
	private String iD;
	private String type;
	private boolean reserved;
    public House(String picLink, double price , String location, String services, String iD,String type,boolean reserved) {
        this.picLink=picLink;
        this.price=price;
        this.location=location;
        this.services=services;
        this.iD=iD;
        this.type=type;
        this.reserved=reserved;
    }
    public void setReserved(boolean q) {
        reserved=q;
    }
    
    public boolean getReserved() {
        return reserved;
    }
    public String getPicLink() {
        return picLink;
    }
    public String getType() {
        return type;
    }
    public String getID() {
        return iD;
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
 
 
 
public class Tenant {
	Logger logger = Logger.getLogger(Tenant.class.getName());
	static LOGIN login=new LOGIN();
	private static String y;
	private static int v;
	private static double price;
	private static String pic;
	private static String housenum;
    private static List<User> userList;
    private static ArrayList<House> houses;
    private ArrayList<Furn> furniture;
    private static ArrayList<Furn> newFurniture;
    private Scanner scanner;
    
    
    
    public Tenant() {
    	this.scanner = new Scanner(System.in);
        userList = new ArrayList<User>();
        userList.add(new User("Lama","example1@example.com", "password1" , "tenant","123", 18, "I Don't Work, I'm a princess <3","1"));
        userList.add(new User("Ibtissam","example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent","2"));
        userList.add(new User("Sami","example3@example.com", "password3" , "admin","234", 21 , "WEWE","1"));
        userList.add(new User("Waleed","example4@example.com", "password4" , "owner","85", 32 , "WEWE","2"));
        
        this.scanner = new Scanner(System.in);
        houses = new ArrayList<House>();
        houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student", false));
        houses.add(new House("PicLink2", 500, "Jenin", "Service2","234", "student", false));
        houses.add(new House("PicLink3", 200, "Jenin", "Service3","456", "family", false));
        houses.add(new House("PicLink4", 200, "Jenin", "Service4","85", "family", true));
        houses.add(new House("PicLink5", 200, "Jenin", "Service3","89", "student", true));
        
        this.scanner = new Scanner(System.in);
        furniture = new ArrayList<Furn>();
        furniture.add(new Furn("PicLink1", 200, "Used only for 2 weeks","1"));
        furniture.add(new Furn("PicLink2", 100, "Haven't been used.","1"));
        furniture.add(new Furn("PicLink3", 200, "No details available.","2"));
        
        newFurniture = new ArrayList<Furn>();
        
    }
    
    public static List<User> liss(){
    	 userList.add(new User("Lama","example1@example.com", "password1" , "tenant","123", 18, "I Don't Work, I'm a princess <3","1"));
         userList.add(new User("Ibtissam","example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent","2"));
         userList.add(new User("Sami","example3@example.com", "password3" , "admin","234", 21 , "WEWE","3"));
         
             return userList;
        }
    
    
    public static List<House> lisH(){
        houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student", false));
        houses.add(new House("PicLink2", 500, "Jenin", "Service2","234", "student", false));
        houses.add(new House("PicLink3", 200, "Jenin", "Service3","456", "family", false));
            return houses;
       }
    
    
    
    
    
    
    public void printTenant() {
    	System.err.println();
    	System.err.println("*******    Welcome our tenant!!    *******");
    	System.err.println("Would you like to \n 1. view the available houses \n 2. Advertise your own used furniture?");
    }
    
    
    public void myView() {
    	logger.info("\n");
    	logger.info("You have the following available options:");
    	logger.info("1.    House 1");
    	logger.info("2.    House 2");
    	logger.info("3.    House 3");
    	logger.info("\n");
    	logger.info("-Which house would you like to view? (1/2/3)");
    }
    
    
    public boolean vView() {
    	logger.info("\n");
    	logger.info("You have the following available options:");
    	logger.info("1.    House 1");
    	logger.info("2.    House 2");
    	logger.info("3.    House 3");
    	logger.info("\n");
    	logger.info("-Which house would you like to view? (1/2/3)");
    	return true;
    }
    
    
    
    
    public void housesDetailes(String mail) {
    	while(true) {
    		logger.info("\n");
    		logger.info("\n");
    	Scanner scanner= new Scanner(System.in);
    	v= scanner.nextInt();
    	logger.info(hhouse(v));
    	logger.info("\n");
    	logger.info("\n");
    	logger.info("Would you like to \n1. Go Back \n2. Accomodate this house");
    	int z =scanner.nextInt();
    	if(z==1) {
    		myView();
    		continue;
    	}
    	else if(z==2) {
    		 if(check(v)) {
    		    	y=scanner.nextLine();
    		    	y=scanner.nextLine();
    		    	if(y.equalsIgnoreCase("yes")) {
    		    		logger.info(stuHousing(v));
    		    		logger.info("Would you like to \n1. Go Back \n2. Accomodate this house");
    		        	z =scanner.nextInt();
    		        	if(z==1) {
    		        		myView();
    		        		continue;
    		        	}
    		        	else if(z==2) {
    		        		logger.info("    =====================================================================");
    		        		logger.info("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
        		    		logger.info("    =====================================================================\n");
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
        		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
        		    		logger.info("\n");
        		    		specifiedData(mail);
        		    		logger.info("\n");
        		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
        		    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
        		    		  int o =scanner.nextInt();    	
        		    		  if(o==1) {
        		    			  break;
        		    		  }
        		    		  else if(o==2) {
        		    			  myView();
        		    			  continue;
        		    		  }
    		        	}
    		    		
    		    	}
    		    	else if(y.equalsIgnoreCase("no")) {
    		    		logger.info("    =====================================================================");
    		    		logger.info("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
    		    		logger.info("    =====================================================================\n");
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		    		logger.info("\n");
    		    		specifiedData(mail);
    		    		logger.info("\n");
    		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
    		    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
    		    		  int o =scanner.nextInt();    	
    		    		  if(o==1) {
    		    			  break;
    		    		  }
    		    		  else if(o==2) {
    		    			  myView();
    		    			  continue;
    		    		  }
    		    	}
    		    }
    		    else if(check(v)==false) {
    		    	logger.info("    =====================================================================");
    		    	logger.info("    ============== YOU'VE ACCOMADATED THIS HOUSE SUCCESSFULLY ===========");
    		    	logger.info("    =====================================================================\n");
		    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
		    		printColorText    ("=============================== CONTROL PANEL ==================================",ConsoleColor.GREEN);
		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		logger.info("\n");
		    		specifiedData(mail);
		    		logger.info("\n");
		    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
		    		logger.info("Would you like to \n1. log out \n2. go back to the main menu?\n");
		    		  int o =scanner.nextInt();    	
		    		  if(o==1) {
		    			  break;
		    		  }
		    		  else if(o==2) {
		    			  myView();
		    		  }
    		    }
    	}
    	
    	}
    	
    }
   
    
    
    
        public static void printColorText(String text, ConsoleColor color) {
            String colorCode = "\u001B[" + color.getCode() + "m";
            String resetCode = "\u001B[0m";
            System.err.println(colorCode + text + resetCode);
        }
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
    	houses.get(v-1).setReserved(true);
    	printTenant(email);
    	printOwner(v);
    	logger.info(generateRandomDate());
    }
 
    
    
    public boolean checkAccomodation(int u) {
    	return houses.get(u-1).getReserved();
    }
    
    
    public String hhouse(int x) {
    		return ("===   This house's charachteristics are \n"+ " Picture:   "+houses.get(x-1).getPicLink() + "\n Location:   " + houses.get(x-1).getLocation() + "\n Price:   " + houses.get(x-1).getprice() + "$\n Services:   " + houses.get(x-1).getservices() );
    }
    
    
    
    public boolean check(int j) {
    	if(houses.get(j-1).getType().equals("student")) {
    		logger.info("\n\n- NOTE: This house is specified for students, you wanna know about their details?");
    		return true;
    	}
    	else
    		return false;
    }
    
    
    public boolean checkk(int j) {
    	if(houses.get(j-1).getType().equals("student")) {
    		return true;
    	}
    	else
    		return false;
    }
    
    
    
    public static String emailll(String email) {
    	return email;
    }
    
    public String stuHousing(int z) {
    	System.err.println(z);
    	String ret="\n===  The following students are living in this house:\n\n";
    	 for (int counter = 0; counter < userList.size()/2; counter++) { 	
    		 if((houses.get(z-1).getID().equals(userList.get(counter).getID()))&&(userList.get(counter).gettype().equalsIgnoreCase("tenant")))
              		ret+=("Name:    "+userList.get(counter).getName()+"\n"+"Age:    "+userList.get(counter).getage()+"\nJob:    "+ userList.get(counter).getJob()+"\n\n");
         }   
    	return ret;
    }
    
    
    public static String generateRandomDate() {
        Random random = new Random();
        int year = random.nextInt(1) + 2024;
        int month = random.nextInt(12);
        int day = random.nextInt(30);
        return ("And the payment operation must be done before the date :     "+ day+"-" + month+"-"+year);
    }
    
    
    public void printTenant(String emaill) {
    	for(int i=0;i<userList.size()/2;i++) {
    		if(emaill.equalsIgnoreCase(userList.get(i).getEmail()))
    			logger.info("The tenant ( " + userList.get(i).getName()+" ) with the email   **"+userList.get(i).getEmail() +"**\nAnd age "+ userList.get(i).getage()+"\nWho Works as "+userList.get(i).getJob() +"\n\nHave accommdated this house successfully\n");
    	}
    }
    
    public void printOwner(int houseNum) {
    	housenum=houses.get(houseNum-1).getID();
    	for(int i=0; i<userList.size()/2;i++) {
    		if(housenum.equals(userList.get(i).getID())&&userList.get(i).gettype().equalsIgnoreCase("owner")) {
    			logger.info("From the Owner " + userList.get(i).getName()+" with the email "+userList.get(i).getEmail() +"\nAnd age "+ userList.get(i).getage()+"\nwho works as "+userList.get(i).getJob() +"\n");
    		}
    	}
    }
    
    public boolean viewFurn(String mail) {
    	String furnID="";
    	logger.info("\n");
    	logger.info("\n");
    	logger.info("******** This window is designed for you to add your own furniture that you want to sell ");
    	logger.info("\n");
    	logger.info("= Please Add the following details");
    	logger.info("Provide a good pic link:");
            pic=scanner.nextLine();
            logger.info("Attach some additional details");
            String t3bt=scanner.nextLine();
            logger.info("Provide the specified price");
            price=scanner.nextDouble();
            for(int i=0;i<userList.size()/2;i++) {
            	if(mail==userList.get(i).getEmail()) {
            		furnID=userList.get(i).furnID();
            	}
            }
        	newFurniture.add(new Furn(pic, price, t3bt,furnID));
        	for(int i=0;i<newFurniture.size();i++) {
        		System.out.println(newFurniture.get(i).getPrice());
            }
    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
    		logger.info("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
            return false;
    }
    
    
    
    
    
    public boolean viewFurnn(String mail, String pic,double price, String det, String ID) {
        	newFurniture.add(new Furn(pic, price, det,ID));
    		printColorText    ("________________________________________________________________________________\n",ConsoleColor.RED);
    		logger.info("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
    		printColorText    ("________________________________________________________________________________",ConsoleColor.RED);
            return false;
    }
    
    
    
    public List<Furn> addFurnn() {
    	for(int i=0;i<newFurniture.size();i++) {
    		System.out.println(newFurniture.get(i).getPrice());
        }
return newFurniture;
    }
    
    
    
    public void addition(List <Furn> A, int s) {
    	for(int i=0;i<A.size();i++) {
    		if(i==(s-1)) {
    			furniture.add(new Furn(A.get(i).getPic(), A.get(i).getPrice(),A.get(i).getDetails(),"123"));
    		}
    	}
    }
    
    
    public void printFurn() {
    	for (int counter = 0; counter < furniture.size(); counter++) { 	
    		logger.info(furniture.get(counter).getPic());
   		System.out.println(furniture.get(counter).getPrice());
   		logger.info(furniture.get(counter).getDetails());
        }  
    }
    
   
    
  
    
    
  
    
    
    
    
    
    public void printMainAdminstrator() {
    	logger.info("********* WELCOME TO THE ADMISTRATOR PAGE ! **************************\n-You have the following available options to see:\n1. Furniture advertisment requests\n2. Available reservations\n3. Apartment Requests.\n\n Which one would you like to view?");
    }
    
    public void checkReserved() {
    	int z=1;
    	logger.info("\n");
    	logger.info("******* RESERVED APARTMENTS:");
    	for(int i=0; i<houses.size();i++) {
    		if(houses.get(i).getReserved()==true) {
    			logger.info(z+". Apartment number "+z+" with the following details "+houses.get(i).getID()+ " "+houses.get(i).getLocation()+ " "+houses.get(i).getPicLink()+ " "+houses.get(i).getprice()+ " "+houses.get(i).getservices()+"\n");
    			z++;
    		}
    	}
    	z=1;
    	logger.info("\n");
    	logger.info("******* UNRESERVED APARTMENTS:");
    	for(int i=0; i<houses.size();i++) {
    		if(houses.get(i).getReserved()==false) {
    			
    			logger.info(z+". Apartment number "+z+" with the following details "+houses.get(i).getID()+ " "+houses.get(i).getLocation()+ " "+houses.get(i).getPicLink()+ " "+houses.get(i).getprice()+ " "+houses.get(i).getservices()+"\n");
    		z++;
    		}
    	}
    }
    
    
}