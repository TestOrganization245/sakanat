package najah.edu.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Userr {
	
    private String email;
    private String password;
	private String type;
	private String ID;
	private int age;
	private String Job;
	public Userr() {
		
	}
    public Userr(String email, String password , String type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }
    public Userr(String email, String password , String type , String id) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.ID = id;
    }
    public Userr(String email, String password , String type, String ID, int age, String Job) {
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
    public String getJob() {
        return Job;
    }
    public int getage() {
        return age;
    }
	public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public String gettype() {
        return type;
    }
}


public class ArrayLists {

	public static String em ;
    public static List<Userr> userList;
    private boolean loggedIn;
    private String welcomeMessage;
    private Scanner scanner;
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    public static String tyu = "";
    public ArrayLists() {
    	//this.scanner = new Scanner(System.in);
        userList = new ArrayList<Userr>();
        // Add initial users to the user list
        userList.add(new Userr("example1@example.com", "password1" , "owner"));
        userList.add(new Userr("example2@example.com", "password2" , "aowner"));
        userList.add(new Userr("example3@example.com", "password3" , "admin"));
    }
    public static List<Userr> liss(){
    	 userList.add(new Userr("example1@example.com", "password1" , "owner"));
         userList.add(new Userr("example2@example.com", "password2" , "aowner"));
         userList.add(new Userr("example3@example.com", "password3" , "admin"));
         return userList;
    }
}
