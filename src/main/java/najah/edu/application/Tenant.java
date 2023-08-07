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
	 public String getPic() {
	        return pic;
	    }
	  public double getPrice() {
	        return price;
	    }
	  public String getDetails() {
	        return details;
	    }
	  public String getUserId() {
	        return userid;
	    }
	 
}
 
 
 
public class Tenant {
	private static final String b = "tenant";
	private static final String o = "owner";
	private static final String a = "admin";
	private static final String s = "student";
	private static final String f = "family";

	static Logger logger = Logger.getLogger(Tenant.class.getName());
	static LOGIN login=new LOGIN();
	private static String y;
	private static double price;
	private static String pic;
	private static String housenum;
    private static List<User> userList;
    private static ArrayList<House> houses;
    private static ArrayList<Furn> furniture;
    private static ArrayList<Furn> newFurniture;
    private Scanner scanner;
    
    
    
    public Tenant() {
    	this.scanner = new Scanner(System.in);
        userList = new ArrayList<User>();
        userList.add(new User("Lama","example1@example.com", "password1" ,b ,"123", 18, "I Don't Work, I'm a princess <3","1"));
        userList.add(new User("Ibtissam","example2@example.com", "password2" , o,"123", 27 , "Waiter at a resturent","2"));
        userList.add(new User("Sami","example3@example.com", "password3" , a,"234", 21 , "WEWE","1"));
        userList.add(new User("Waleed","example4@example.com", "password4" , o,"85", 32 , "WEWE","2"));
        
        this.scanner = new Scanner(System.in);
        houses = new ArrayList<House>();
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES1", 200, "Jenin", "Very good Network","123", s, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES2", 500, "Nablus", "Water service is very good","234", s, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES3", 200, "Ramallah", "Network is good","456", f, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES4", 200, "Kufurrai", "Electricity won't cut off","85", f, true));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES5", 200, "Tulkarm", "Excellent network","89", s, true));
        
        this.scanner = new Scanner(System.in);
        furniture = new ArrayList<Furn>();
        furniture.add(new Furn("C:\\Users\\hp\\Desktop\\PICTURES", 200, "Used only for 2 weeks","1"));
        furniture.add(new Furn("C:\\Users\\hp\\Desktop", 100, "Haven't been used.","1"));
        furniture.add(new Furn("C:\\Users\\hp\\Desktop\\PICTURES\\p1", 200, "No details available.","2"));
        
        newFurniture = new ArrayList<Furn>();
        
    }
    
    public static List<User> liss(){
    	 userList.add(new User("Lama","example1@example.com", "password1" , b,"123", 18, "I Don't Work, I'm a princess <3","1"));
         userList.add(new User("Ibtissam","example2@example.com", "password2" , o,"123", 27 , "Waiter at a resturent","2"));
         userList.add(new User("Sami","example3@example.com", "password3" , a,"234", 21 , "WEWE","3"));
         
             return userList;
        }
    
    
    public static List<House> lisH(){
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES1", 200, "Jenin", "Very good Network","123", s, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES2", 500, "Nablus", "Water service is very good","234", s, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES3", 200, "Ramallah", "Network is good","456", f, false));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES4", 200, "Kufurrai", "Electricity won't cut off","85", f, true));
        houses.add(new House("C:\\Users\\hp\\Desktop\\PICTURES5", 200, "Tulkarm", "Excellent network","89", s, true));
            return houses;
       }
    
    
    
    
    
    
    public void printTenant() {
    	logger.info("\n");
    	logger.info("*******    Welcome our tenant!!    *******");
    	logger.info("Would you like to \n 1. view the available houses \n 2. Advertise your own used furniture?");
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
    
    
   
    
        public static void printColorText(String text, ConsoleColor color) {
            String colorCode = "\u001B[" + color.getCode() + "m";
            String resetCode = "\u001B[0m";
            logger.info(colorCode + text + resetCode);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void specifiedData(String email,int v) {
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
    
    
    
    
    public static String emailll(String email) {
    	return email;
    }
    
    public String stuHousing(int z) {
    	System.err.println(z);
    	String ret="\n===  The following students are living in this house:\n\n";
    	StringBuilder resultBuilder = new StringBuilder();

    	for (int counter = 0; counter < userList.size() / 2; counter++) {
    	    if (houses.get(z - 1).getID().equals(userList.get(counter).getID()) && userList.get(counter).gettype().equalsIgnoreCase("tenant")) {
    	        resultBuilder.append("Name:    ").append(userList.get(counter).getName()).append("\n");
    	        resultBuilder.append("Age:    ").append(userList.get(counter).getage()).append("\n");
    	        resultBuilder.append("Job:    ").append(userList.get(counter).getJob()).append("\n\n");
    	    }
    	}

    	String result = resultBuilder.toString();
 
    	return ret;
    }
    
    
    public static String generateRandomDate() {
    
        int year = 2024;
        int month =3;
        int day = 30;
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
    
    
    
    public boolean addFurnn(String pic, double price, String details, String userid) {
    	newFurniture.add(new Furn(pic, price, details,userid));
    	logger.info("\nA REQUEST HAS BEEN SENT\n== Your furniture will be added to the system as long as the adminstrator accepts it.");
    	return false;
    }
    
    
    
    public static void furnn() {
    	
    	for(int i=0;i<newFurniture.size();i++) {
    		furniture.add(new Furn(newFurniture.get(i).getPic(),newFurniture.get(i).getPrice(),newFurniture.get(i).getDetails(),newFurniture.get(i).getUserId()));
        }
    }
    
    
 
    
    public void printFurn() {
    	for (int counter = 0; counter < furniture.size(); counter++) { 	
    		logger.info(furniture.get(counter).getPic());
    		logger.info(furniture.get(counter).getPrice()+"");
   		logger.info(furniture.get(counter).getDetails());
        }  
    }
   
    
    
    
}