package najah.edu.application;
import java.util.Scanner;
//import najah.edu.Signup;
import najah.edu.application.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

class User {
    private String email;
    private String password;
	private String type;
	private String ID;
	private int age;
	private String Job;

    public User(String email, String password , String type, String ID, int age, String Job) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.ID=ID;
        this.age=age;
        this.Job=Job;
        
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
}


class House {
    private String PicLink;
    private double price;
	private String location;
	private String services;
	private String ID;
	private String Type;

    public House(String PicLink, double price , String location, String services, String ID,String Type) {
        this.PicLink=PicLink;
        this.price=price;
        this.location=location;
        this.services=services;
        this.ID=ID;
        this.Type=Type;
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

public class MyApplication {
    private List<User> userList;
    private ArrayList<House> Houses;
    private boolean loggedIn;
    private String welcomeMessage;
    private Scanner scanner;
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    
    
    
    public MyApplication() {
    	this.scanner = new Scanner(System.in);
        userList = new ArrayList<User>();
        // Add initial users to the user list
        userList.add(new User("example1@example.com", "password1" , "admin","123", 18, "I Don't Work, I'm a princess <3"));
        userList.add(new User("example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent"));
        userList.add(new User("example3@example.com", "password3" , "tenant","234", 21 , "WEWE"));
        
        this.scanner = new Scanner(System.in);
       Houses = new ArrayList<House>();
        Houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student"));
        Houses.add(new House("PicLink2", 500, "Jenin", "Service2","234", "student"));
        Houses.add(new House("PicLink3", 200, "Jenin", "Service3","456", "family"));
        
    }

    
    //testttttttttttttttttttttttttttt
    public void Ibtissam() {
    	Houses.add(new House("PicLink1", 200, "Jenin", "Service1","123", "student"));
    }
    
    public void Testt() {
    	for(int i=0; i<Houses.size();i++) {
    	System.out.println("This house's charachteristics are \n"+ " Picture:   "+Houses.get(i-1).getPicLink() + "\n Location:   " + Houses.get(i-1).getLocation() + "\n Price:   " + Houses.get(i-1).getprice() + "$\n Services:   " + Houses.get(i-1).getservices());
    	}
    	}
    public String House(int x) {
    		return ("This house's charachteristics are \n"+ " Picture:   "+Houses.get(x-1).getPicLink() + "\n Location:   " + Houses.get(x-1).getLocation() + "\n Price:   " + Houses.get(x-1).getprice() + "$\n Services:   " + Houses.get(x-1).getservices() );
    }
    
    
    public boolean Check(int j) {
    	if(Houses.get(j-1).getType()=="student") {
    		System.out.println("\n****** This house is specified for student, you wanna know about their details?");
    		return true;
    	}
    	else
    		return false;
    }
    
    
    public String StuHousing(int z) {
    	System.out.println(z);
    	String ret="\n The following students are living in this house:\n";
    	 for (int counter = 0; counter < userList.size(); counter++) { 	
    		 if(Houses.get(z-1).getID()==userList.get(counter).getID())
              		ret+=("Age:    "+userList.get(counter).getage()+"\nJob:    "+ userList.get(counter).getJob()+"\n\n");
         }   
    	return ret;
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
    
    
    
    public void run() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            System.out.println("Welcome to the Application!");
            System.out.println("Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    navigateToLoginPage();
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting the application...");
        scanner.close();
    }

    public void navigateToLoginPage() {
    	System.out.println("Welcome to the Application!");
        System.out.println("Please select an option:");
        System.out.println("1. Login");
        System.out.println("2. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
            	 System.out.println("Navigating to the login page...");
         	    // Add code to display the login page or perform any necessary actions to navigate to the login page
         	    // For example, you can clear the console and display a login prompt

         	    // Clear the console
         	    clearConsole();

         	    // Display login prompt
         	    System.out.println("=== Login Page ===");
         	    System.out.println("Please enter your email and password:");
         	    System.out.print("Email: ");
         	    String n;
         	    String nn;
         	    String nnn;
         	    String email;
         	    String password;
         	    String type;
         	    n = scanner.nextLine();
         	    email = n;
         	   // String email = scanner.nextLine();
         	    enteredEmail = n;
         	    System.out.print("Password: ");
         	   nn  = scanner.nextLine();
         	   password = nn;
         	    enteredPassword = nn;
         	    //System.out.print("type of person: ");
         	    //nnn = scanner.nextLine();
         	  //  type = nnn;
         	    //enteredtype = type;
         	    // Call the login method with the entered email and password
         	    if (performLogin(enteredEmail, enteredPassword)) {
         	        System.out.println("Login successful.");
         	    } else {
         	        System.out.println("Invalid email or password. Please try again.");
         	    }
                break;
            case 2:
                System.out.print("weweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    	
    }
    private boolean performLogin(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password) ) {
                loggedIn = true;
                welcomeMessage = "Welcome, " + email +" " +  user.gettype()+  "!!";
                System.out.printf(welcomeMessage + user.gettype() );
                return true;
            }
        }
        loggedIn = false;
        welcomeMessage = null;
        return false;
    }

    // Helper method to clear the console
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    /*private boolean performLogin(Scanner scanner) {
        System.out.println("Enter your email:");
        String email = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

     //   if (isValidUser(email, password)) {
     //       loggedIn = true;
     //       welcomeMessage = "Welcome, " + email + "!";
     //       System.out.println("Login successful.");
     //       return true;
     //   } else {
     //       loggedIn = false;
     //       welcomeMessage = null;
     //       System.out.println("Invalid email or password. Please try again.");
            return false;
     //   }
    }*/

    private boolean isValidUser(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    public String getEnteredEmail() {
        return enteredEmail;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }
    public String getEnteredtype() {
        return enteredtype;
    }
    public void enterEmail(String email) {
        enteredEmail = email;
    }

    public void enterPassword(String password) {
        enteredPassword = password;
    }

    public void clickLoginButton() {
        // Validate the entered credentials and update the login status accordingly
        if (isValidUser(enteredEmail, enteredPassword)) {
            loggedIn = true;
            welcomeMessage = "Welcome, " + enteredEmail + "!";
            System.out.printf("Login successful.....................");
        } else {
            loggedIn = false;
            welcomeMessage = null;
            System.out.println("Invalid email or password. Please try again.");
        }
        // Clear the entered email and password after login attempt
        enteredEmail = null;
        enteredPassword = null;
    }
    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.run();
    }
}