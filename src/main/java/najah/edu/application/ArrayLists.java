package najah.edu.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Userr {
	
    private String email;
    private String password;
	private String type;
	private String id;
	private int age;
	private String job;
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
        this.id = id;
    }
    public Userr(String email, String password , String type, String id, int age, String job) {
        this.email = email;
        this.password = password;
        this.type = type;
        this.id=id;
        this.age=age;
        this.job=job;

    }
    public String getID() {
        return id;
    }
    public String getJob() {
        return job;
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

	
    public static List<Userr> userList =new ArrayList<Userr>(); 
    private boolean loggedIn;
    private String welcomeMessage;
    private Scanner scanner;
    private String enteredEmail;
    private String enteredPassword;
    private String enteredtype;
    
    public ArrayLists() {
     
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
