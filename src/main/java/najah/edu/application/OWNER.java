package najah.edu.application;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 class apartment {
    private int id;
    private static int nextId = 1;
    private int floorId;
    private int numBathrooms;
    private int numBedrooms;
    private boolean hasBalcony;
    private boolean Reserved;
    private int idres;

    
    public apartment( int floorId, int bath, int bed, boolean y) {
        //this.id = id;
    	  this.id = nextId++;
        this.floorId = floorId;
        this.numBathrooms = bath;
        this.numBedrooms = bed;
        this.hasBalcony = y;
      
    } 
    public apartment(int id, int floorId, int bath, int bed, boolean y) {
        //this.id = id;
        this.floorId = floorId;
        this.numBathrooms = bath;
        this.numBedrooms = bed;
        this.hasBalcony = y;
        this.id = nextId++;
    }
    
    public apartment(int id, int floorId, int bath, int bed, boolean y, int idd ) {
        //this.id = id;
        this.floorId = floorId;
        this.numBathrooms = bath;
        this.numBedrooms = bed;
        this.hasBalcony = y;
       // this.Reserved=RR;
        this.id = nextId++;
        this.idres = idd;
    }

    public int getId() {
        return id;
    }
    
    public boolean getRR() {
        return Reserved;
    }

    public int getFloorId() {
        return floorId;
    }

    // Other methods and properties as needed
    public int getNumBathrooms() {
        return numBathrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }
    
    
    public static void resetIdCounter() {
        nextId = 1;
    }
    public int getres() {
        return idres;
    }

}
/*
 class floor {
	private int idfloor;
	private int idresidence;
    private ArrayList<apartment> apartments;

	public floor(int f , int r) {
		this.idfloor = f;
		this.idresidence = r;
		
	}
	
	public int getidf(){
		return idfloor;
	}
	public int getidr() {
		return idresidence;
		
	}
	
	 public void setApartments(ArrayList<apartment> apartments) {
	        this.apartments = apartments;
	    }
	 public ArrayList<apartment> getApartments() {
	        return apartments;
	    }
}
*/

////
class Residence {
    private static int nextId = 1;

    private int id;
    private String location;
    private int numFloors;
    private String services;
    private String monthlyRent;
    private String inclusive;
    private String contactInfo;
    private String ownerid;
    public Residence(String location, int numFloors, String services, String ssm, String photoFilePath, String contactInfo , String idd) {
        this.id = nextId++;
        this.location = location;
        this.numFloors = numFloors;
        this.services = services;
        this.monthlyRent = ssm;
        this.inclusive = photoFilePath;
        this.contactInfo = contactInfo;
        this.ownerid = idd; 
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public String getServices() {
        return services;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public String isInclusive() {
        return inclusive;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public String getidowner() {
        return ownerid;
    }
    public static void resetIdCounter() {
        nextId = 1;
    }
}
public class OWNER {
	
	public void APP() {
        String applicationDetails = newapplication();
        int id = getNewAppId(); // Get the ID of the first apartment
      //  saveToFile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse", id, applicationDetails);
    }
	//apartment
	//em = "rr";
	 String residenceId;
	/////*******apartment
	public static List<apartment> newapp = new ArrayList<apartment>();

	public static int iddres;
	public static int idsamalll = -1;
	/////
	Tenant o = new Tenant() ;
	 private List<apartment> apartment = new ArrayList<apartment>();

	
	 private List<apartment> ap = new ArrayList<apartment>();

		
	 Scanner ss4 = new Scanner(System.in);
	//floor
	 private List<floor> floorr = new ArrayList<floor>();

	//tenant
	 private List<User> tenant = new ArrayList<User>();
     
	 private List<Residence> res = new ArrayList<Residence>();
	///
	 
	 //**
	 private List<apartment> app = new ArrayList<apartment>();

	 //**residencesList
	 public static List<String> residences = new ArrayList<String>();
	 public static List<String> residencesList = new ArrayList<String>();

	 private List<String> viewwwhouse = new ArrayList<String>();
	    private List<String> availableOptions = new ArrayList<String>();
	    Scanner scannerr = new Scanner(System.in);
	    private int flag = 0;
	     int flagg = 0;
	     int flaggg =0;
	     int cv =0;
	    private int x = 0;
	    private String photoFilePath; // Add a new instance variable to store the photo file path
	    
	   public OWNER() {
		   apartment = new ArrayList<apartment>();
		   
		 //  newapp = new ArrayList<apartment>(); 
		   
		   floorr = new ArrayList<floor>();

		   res = new ArrayList<Residence>();
		   //*** residence
		 //  res.add(new Residence("nablus",30,"wifi","1200","photo.jpg","example@ibtisam.com","123"));
		//  res.add(new Residence("ramallah",50,"wifinet","1600","photo1.jpg","example@salam.com","123"));
		//   res.add(new Residence("jenin",60,"network","1800","photo2.jpg","example@jehad.com","100"));

		   ///****floor
		 //  floorr.add(new floor(1 , 1));
		//   floorr.add(new floor(2, 3));
		   //**** apartment
		//   apartment.add(new apartment(1 , 1 , 3 , 2 , true));
		//   apartment.add(new apartment(2 ,1, 4, 5 ,false));
		//   apartment.add(new apartment(3 ,1, 2 , 1 , false));
		//   apartment.add(new apartment(4 ,6 , 3 ,1 ,false));
		//   apartment.add(new apartment(5 ,3, 5 , 10 , true));

		   app.add(new apartment(1 , 5 , 7, 9 ,false));
		   
		   ////
		   
		   
		 //  residences = new ArrayList<String>();
		   
		   
		   availableOptions = new ArrayList<String>();
		 //  tenant.add(new Userr("example1@example.com", "password1" , "admin"));
		 //  tenant.add(new Userr("example2@example.com", "password2" , "owner"));
		 //  tenant.add(new User("example3@example.com", "password3" , "tenant"));
		  /* tenant.add(new User("example1@example.com", "password1" , "admin","123", 18, "I Don't Work, I'm a princess <3"));
		   tenant.add(new User("example2@example.com", "password2" , "owner","123", 27 , "Waiter at a resturent"));
		   tenant.add(new User("example3@example.com", "password3" , "tenant","234", 21 , "WEWE"));*/
		   availableOptions.add("add photos");
	        availableOptions.add("Residence location");
	        availableOptions.add("Available services");
	        availableOptions.add("monthly rent");
	        availableOptions.add("contact information");
	        
		   
	   }
	   //
	   public List<String> getresidence() {
		    if (residences.isEmpty()) {
		        return null;
		    } else {
		        return residences;
		    }
		}
	   
	   
	   //
	   
	public List<String> owner(){
		
			
		
		//  residences = new ArrayList<String>();
		 //availableOptions = new ArrayList<String>();
		 Scanner scanner = new Scanner(System.in);
		System.out.print("hello owner in your page .");
		
		System.out.println("_______page owner ___________");
		System.out.println("please can you select from menu the process");
		System.out.println("1.Add House");
		System.out.println("2.view the house option in dashbord ");
		int flag = scanner.nextInt();
		switch(flag) {
		case 1: 
			System.out.println("OK. Please add the required information for the residence. ");
			flagg =1;
			addhouse();
			break;
		case 2: 
			System.out.println("ok, you can show the view of house added to app.");
			view();
			System.out.println("Are you need to return back???");
			String u;
			u = scanner.next();
			if(u.equals("Y")) {
				owner();
			}
			
			break;
		default:
            System.out.println("Invalid choice. Please try again.");
            
		}
		
	//	System.out.println("Residences added: " + residences);
		return residences;
	}
	
	public void addhouse() {
		   
	        
		System.out.println();
		System.out.println();
	        System.out.println("Available options:");
	        for (int i = 0; i < availableOptions.size(); i++) {
	            String option = availableOptions.get(i);
	            System.out.println("- " + option);
	        }
	        System.out.println();
	        
		Scanner s = new Scanner(System.in);
		System.out.println("Add the photo (provide file path):");
		String photoFilePath = s.nextLine(); 
	
        File photoFile = new File(photoFilePath);
        if (photoFile.exists()) {
            this.photoFilePath = photoFilePath;
           // res.s
            System.out.println("Photo file path: " + this.photoFilePath);
        } else {
            System.out.println("Invalid photo file path.");
        }
        System.out.println();
        
      
		//
        System.out.println("Add the location and number of floors (e.g., nablus, 10 floors):");
        String ssl;
        ssl  = s.nextLine(); // Read the entire line
        String[] parts = ssl.split(",");

        if (parts.length < 2) {
            System.out.println("Invalid input format. Please provide the location and number of floors separated by a comma.");
            return; // Return or handle the error appropriately
        }

        String locationPart = parts[0].trim();
        String floorsPart = parts[1].trim();

        int numFloors;
        String floorsString = floorsPart.replaceAll("\\D+", ""); // Extract numeric part only
        try {
            numFloors = Integer.parseInt(floorsString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for the number of floors.");
            return;
        }
        
      
		///
		System.out.println("Add the Available Services:");
		String ssa ;
		ssa = s.next();
		System.out.println(ssa);
		System.out.println();
		////
		System.out.println("Add the Monthly Rent:");
		String ssm ;
		ssm = s.next();
		System.out.println(ssm);
		System.out.println();
		////
		System.out.println("Add the Contact Information:");
		String ssc ;
		ssc = s.next();
		System.out.println(ssc);
		System.out.println();
		
		String ii=null;
		
		
		
		for (int counter = 0; counter < tenant.size(); counter++) { 	
        	//  pp.userList.get(counter).getID();
     		 if( (tenant.get(counter).gettype()) == "owner" ) {
     			// System.out.printf("this owner ");
     			// tann++;
     			// tannres++;
     			 
     		ii = tenant.get(counter).getID();
     		 }
     		 else {
     		//	 System.out.printf("not   ....\n");
     		 }
     			 //ret+=("Age:    "+userList.get(counter).getage()+"\nJob:    "+ userList.get(counter).getJob()+"\n\n");
          }  
		 Residence reS = new Residence(locationPart, numFloors, ssa, ssm, photoFilePath, ssc ,ii);
		//????????????????????????????????????????????????????????????????????????????????????/
		
		
     
        res.add(reS);
        viewResidences();
        appendTo(reS , "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense");
        
        
        
	        System.out.printf("New residence added successfully!..\n\n" );//+ residences + "\n" );
	        System.out.println();
	     //   appendToFile(residences, "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse");
	        
	        x=1;
	        flag =1;
	        
	        if(flag ==1) {
	        	System.out.printf("OK, after you added a new residence!!! \nQ:Do you need to view all your updated residences ???? \n" );
	        	System.out.printf("please select from two the following choices (Y / N)");
	        	/// sss = new Scanner(System.in);
	        	
	    		ssc = s.next();
	    		//System.out.printf("i",ssc);
	    		if (ssc.equals("Y")) {
	    		    //view();
	    			Viewjust();
	    		    getResidences();
	    		} else if (ssc.equals("N")) {
	    			System.out.println("OK");
	    		    //owner();
	    		} else {
	    		    System.out.println("Please select from only two options (Y / N): " + ssc);
	    		}
	    		
	        }
	       // return residences;
	}
	
	//****
	 public boolean viewResidences() {
		 System.out.println();
	        System.out.println("******** Viewing residences of information ...");
	        if(res.equals(null)) {
	        	return false;
	        }else {
	        	 for (int i = 0; i < res.size(); i++) {
	 	            Residence rr = res.get(i);
	 	            System.out.println( "Location: " + rr.getLocation() + ", Services: " + rr.getServices() + ", Monthly Rent: " + rr.getMonthlyRent() +
	                 ", Inclusive: " + rr.isInclusive() + ", Contact Info: " + rr.getContactInfo() + ", OwnerID: " + rr.getidowner()+ ", Floornum: " + rr.getNumFloors());
	 	            
	 	          //  System.out.println("Residence " + (i + 1) + ": ID - " + rr.getId() + ", Location - " + rr.getLocation()+"floor:" +rr.getNumFloors()+ "getcon:"+rr.getContactInfo()+ rr.getServices() + "servi" + rr.getMonthlyRent());
	 	        }
	 	        return true;
	        }
	       
	    }
	
	
	
	
	
	
	  public List<String> getResidences() {
		  
	        return residences;
	    }
	  public boolean  Viewjust() {
		  res = readffile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense");
		  if(res.equals(null)) {
			  return false;
		  }
		  else {
			// print array list of residence ...... 
			  for (int i = 0; i < res.size(); i++) {
				    System.out.println("Residence " + (i + 1));
				}
			  return true ;
		  }
		  
		
		  
	  }
	  ////
	 
	  ////
	public int view( ) {
		res = readffile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense");
		//****** array list
		int fnum = 0; 
		int id =0;
		int idd =0;
		for (int i = 0; i < res.size(); i++) {
		    System.out.println("Residence " + (i + 1));
		}
		System.out.print("the owner id " + res.get(0).getidowner()+ "\n");
		 System.out.println("please select the residence you want to see the information of it::\n");
         int uU;
         uU =   scannerr.nextInt();
		if (uU >= 1 && uU <= res.size()) {
			Residence ar = res.get(uU - 1);
			   System.out.println( "1.  Location: " + ar.getLocation() + "\n    Services: " + ar.getServices() + "\n    Monthly Rent: " + ar.getMonthlyRent() +
		                "\n    Inclusive: " + ar.isInclusive() + "\n    Contact Info: " + ar.getContactInfo() + "\n    OwnerID: " + ar.getidowner()+ "\n    Floornum: " + ar.getNumFloors()+"\n");
			   System.out.print("the number of floors in the residence you chose is equal to:" + ar.getNumFloors()+ "\n");
			   System.out.println();
			   System.out.println();
			   System.out.println("***************************************************");
			   System.out.println("****** Now you have to provide the floors full info");
			   
			  id =  ar.getId();
			  idd = uU;
			 iddres= idd;
			 // System.out.printf("number id of residence" + id);
			//  set(id);
			    fnum = ar.getNumFloors();
			    flaggg = fnum;
			  floorr =  buildfloorofresidence(fnum, id);
			  String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse";
			  System.out.println("good"+id);
			  boolean gg;
			  cv = idd;
			gg =  viewResidenceDetailsss(idd, filePath);
			
			 if(gg == false)
			 {
				 
			 
			  for(int i=1; i<=fnum;i++) {
				  System.out.println();
				  System.out.println("This is floor number "+ i);
				  System.out.println("Add the number of the apartments in your "+ i +" floor");
				  Scanner scanner=new Scanner(System.in);
				  int z= scanner.nextInt();
				  for(int y=1; y<=z;y++) {
					 // System.out.println();
					 // System.out.println();
					//  System.out.println();
					 System.out.println("Enter the number of the provided bathrooms:");
					 int bath;
					 bath = scanner.nextInt();
					 System.out.println("Enter the number of the provided bedrooms:");
					 int bedrooms;
					 bedrooms =scanner.nextInt();
					 System.out.println("Is there a balcony? (yes/no)");
						// String H;
						// H = scanner.nextLine();
						 boolean balcony;
						
						 //
						// System.out.println("Is there a balcony? (yes/no)");
						 String H = scanner.next();
						// boolean balcony;

						 while (true) {
						     if (H.equalsIgnoreCase("yes")) {
						         balcony = true;
						         break;
						     } else if (H.equalsIgnoreCase("no")) {
						         balcony = false;
						         break;
						     } else {
						         System.out.println("Invalid input. Please enter 'yes' or 'no':");
						         H = scanner.next();
						     }
						 }
					 
					 
					 System.out.println("This is the apartment number "+ y +" information");
					 app.add(new apartment(y,i, bath, bedrooms,balcony));
					 ap.add(new apartment(y,i, bath, bedrooms,balcony));
					newapp.add(new apartment(y,i, bath, bedrooms,balcony,iddres));
				 System.out.println(newapp.get(y - 1).getId() + "," + newapp.get(y - 1).getFloorId() + "," + newapp.get(y - 1).getNumBathrooms() + "," + newapp.get(y - 1).getNumBedrooms() + "," + newapp.get(y - 1).hasBalcony()+ "," + newapp.get(y - 1).getres());

				//	 System.out.println(ap.get(y - 1).getId() + "," + ap.get(y - 1).getFloorId() + "," + ap.get(y - 1).getNumBathrooms() + "," + ap.get(y - 1).getNumBedrooms() + "," + ap.get(y - 1).hasBalcony());
					 System.out.print("This apartement will be added as soon as the adminstrator accepts it.");
					 System.out.println();
					 
					 
				  }
			  }
		
		
			  setAppartmentToFloor();
			//  saveToFile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse", idd);
		}	  
			  
		}
		else {
			System.out.print("invalid index of switch");

		}
		
		
		
		

         return fnum;
	}
	
	
	
	



		public void addNewResidence() {
	        // Perform actions to add a new residence, such as gathering user input or creating a new object

	        // Assuming you have a method to retrieve the available options, update the list accordingly
	        availableOptions = Arrays.asList("add photos", "Residence location", "Available services", "monthly rent", "contact information");
	    }

	    public List<String> getAvailableOptions() {
	        return availableOptions;
	    }
	    public static void appendTo(Residence data, String filePath) {
	        RandomAccessFile file = null;
	        try {
	            file = new RandomAccessFile(filePath, "rw");
	            long fileLength = file.length();
	            file.seek(fileLength);

	           // for (Residence residence : data) {
	                file.writeBytes("Location: " + data.getLocation() + ", ");
	               // file.writeBytes("Floors: " + residence.getNumFloors() + System.lineSeparator());
	                file.writeBytes("Services: " + data.getServices() + ", ");
	                file.writeBytes("Monthly Rent: " + data.getMonthlyRent() + ", ");
	                file.writeBytes("Inclusive: " + data.isInclusive() + ", ");
	                file.writeBytes("Contact Info: " + data.getContactInfo() + ", ");
	                file.writeBytes("OwnerID: " + data.getidowner() + ", ");
	                file.writeBytes("Floornum: " + data.getNumFloors());

	                file.writeBytes(System.lineSeparator());
	         //   }

	            System.out.println("Data appended to file successfully!");
	        } catch (IOException e) {
	            System.err.println("Error appending data to file: " + e.getMessage());
	        } finally {
	            if (file != null) {
	                try {
	                    file.close();
	                } catch (IOException e) {
	                    System.err.println("Error closing file: " + e.getMessage());
	                }
	            }
	        }
	    }
	
	    ///*****
	    public static List<Residence> readffile(String filePath) {
	        List<Residence> residences = new ArrayList<Residence>();
	        BufferedReader reader = null;
	        int reid = 1;

	        try {
	            reader = new BufferedReader(new FileReader(filePath));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] fields = line.split(", ");
	             //   System.out.println("Line: " + line);
	             //   System.out.println("Fields: " + Arrays.toString(fields));
	                String location = fields[0].substring(fields[0].indexOf(":") + 1).trim();
	                String services = fields[1].substring(fields[1].indexOf(":") + 1).trim();
	                String monthlyRent = fields[2].substring(fields[2].indexOf(":") + 1).trim();
	                String inclusive = fields[3].substring(fields[3].indexOf(":") + 1).trim();
	                String contactInfo = fields[4].substring(fields[4].indexOf(":") + 1).trim();
	                String ownerID = fields[5].substring(fields[5].indexOf(":") + 1).trim();
	                int floorNum = Integer.parseInt(fields[6].substring(fields[6].indexOf(":") + 1).trim());

	                Residence residence = new Residence(location, floorNum, services, monthlyRent, inclusive,contactInfo, ownerID );
	                residences.add(residence);
	            //    System.out.println("Line: " + line);
	             //   System.out.println("Fields: " + Arrays.toString(fields));
	                reid++;
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    System.err.println("Error closing reader: " + e.getMessage());
	                }
	            }
	        }

	        return residences;
	    }
	  
	   
	    //////tenant******************************
	    
	  /////******* floors menu in reciedence
	  
	    ////****** int floor
	    public void gett(int floor) {
	    	System.out.print("Do you want to view the floors information?");
	    	String ee;
	    ee = scannerr.next();
	    if(ee.equals("Y")) {
	    	//floor = floor.trim(); // Remove leading and trailing spaces
          int s = floor;
	    ///	int s = Integer.parseInt(floor);
	    	System.out.print("menu of floors in recidence:: \n");
	    	for(int i =1; i<= s ; i++) {
		    	
		    	System.out.print("floor " + i + "\n");
		    	

	    	}
	    	
	    }else{
	    int z =	view();
	    gett(z);
    		System.out.print("not --------");
    	}
	    }
	    
	    ///********8for test
	    public List<floor> getfloor(int floor) {
	    	 List<floor> floors = new ArrayList<floor>();

		      for(floor f : floorr) {
		    	  if(f.getidf() == floor) {
		    		  floors.add(f);
		    		//  System.out.println("Floor ID: " + f.getidf());
		    		 //   System.out.println("Residence ID: " + f.getidr());
		    	  }
		      }
		        return floors;
	    	
	    	
	    	
	    }///****
	    
	    public List<floor> buildfloorofresidence(int numFloors, int residenceId) {
	        List<floor> floors = new ArrayList<floor>();

	        for (int i = 1; i <= numFloors; i++) {
	            floor floor = new floor(i, residenceId);
	            floors.add(floor);
	        }

	        return floors;
	    }
	public int selectfloorfrommenu() {
		int yy ;
		int idfloorselect =0;
	    System.out.println("Enter the floor number to view details:");
        floor select = null;
		yy = ss4.nextInt();
		
		 for (floor floor : floorr) {
		        if (floor.getidf() == yy) {
		    		//System.out.println("floor Id:"+ floor.getidf());
		    	//	System.out.println("floor of residence id:" + floor.getidr());
                      select = floor;
		        //    break;
		        }
		        
		    }
		if(select != null) {
			System.out.println("floor Id:"+ select.getidf());
    		System.out.println("floor of residence id:" + select.getidr());
    		idfloorselect = select.getidf();
    		//apartment
    		int count =1;
    	//	viewResidenceDetailsss(cv, "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse");
    		for(int i = 1; i<= ap.size();i++) {
    			if(ap.get(i-1).getFloorId() == idfloorselect) {
    				 System.out.println();
    				 System.out.println("APARTMENT "+ count);
   				 System.out.println("- Apartment ID :  "+ap.get(i - 1).getId() + "\n" + "- Floor ID :  " + ap.get(i - 1).getFloorId() + "\n" + "- Number Of BathRooms :  " + ap.get(i - 1).getNumBathrooms() + "\n" + "- Number Of BadRooms :  " + ap.get(i - 1).getNumBedrooms() + "\n" + "- Is There A Balcony :  " + ap.get(i - 1).hasBalcony());
    				count++;
    				
    			}
    		}
    		count=1;
    		System.out.println();
    		
    		
    		
    		ArrayList<apartment> apart = getapartmentinflooriselected(idfloorselect);
    		int ss = apart.size();
    //		System.out.print("Floor ID:" + idfloorselect + "size num of apartment " + ss +"\n");
    		setAppartmentToFloor();    		
    	//	showFloorDetails(select);
    		
    		
    		
    	//	System.out.print("hiiii \n");
    		//aa();
    		
    		
    	
    		
    		//*/
    		
		}
		return idfloorselect;
	}
	
	//apartment
	
	public ArrayList<apartment> getapartmentinflooriselected(int floorId) {
	    ArrayList<apartment> apartments = new ArrayList<apartment>();

	    for (apartment apartment : ap) {
	        if (apartment.getFloorId() == floorId) {
	            apartments.add(apartment);
	        }
	    }

	    return apartments;
	}
	
	
	public void setAppartmentToFloor() {
	    for (floor floor : floorr) {
	        ArrayList<apartment> apartments = getapartmentinflooriselected(floor.getidf());
	        floor.setApartments(apartments);
	        
	        
	    }
	    
	}
	
	
	/////new in case view 
	public void saveToFile(String filePath, apartment apartment) {
        String applicationDetails = NNewselectres(apartment);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(filePath, true));
            writer.println(applicationDetails); // Write the application details
            writer.println("---------------------------------"); // Add a separator between entries
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

	 public boolean viewResidenceDetailsss(int residenceId, String filePath) {
		    List<String> lines = readFileee(filePath);
		    boolean value = false;
		    StringBuilder apartmentData = new StringBuilder();
		    //System.out.println("vaaaaa\n" + "hhhh "+residenceId);
		    for (String line : lines) {
		        if (!line.trim().isEmpty() && !line.trim().equals("---------------------------------")) {
		            apartmentData.append(line).append("\n");
		        } else {
		            String[] dataLines = apartmentData.toString().trim().split("\n");
		            if (dataLines.length < 6) {
		                // Not enough data for a valid apartment, skip to the next apartment
		                apartmentData.setLength(0);
		                continue;
		            }

		            int currentResidenceId = Integer.parseInt(dataLines[0].split(": ")[1]);
		      //      System.out.println("vaaaaa\n"+currentResidenceId + "hhhh "+residenceId);
		            
		            if (currentResidenceId == residenceId) {
		                int apartmentId = Integer.parseInt(dataLines[1].split(": ")[1]);
		                int floorId = Integer.parseInt(dataLines[2].split(": ")[1]);
		                int numBathrooms = Integer.parseInt(dataLines[3].split(": ")[1]);
		                int numBedrooms = Integer.parseInt(dataLines[4].split(": ")[1]);
		                boolean hasBalcony = Boolean.parseBoolean(dataLines[5].split(": ")[1]);

		                //System.out.println("APARTMENT " + apartmentId);
		                System.out.println("- Apartment ID : " + apartmentId);
		                System.out.println("- Floor ID : " + floorId);
		                System.out.println("- Number Of Bathrooms : " + numBathrooms);
		                System.out.println("- Number Of Bedrooms : " + numBedrooms);
		                System.out.println("- Is There A Balcony : " + hasBalcony);

		                ap.add(new apartment(apartmentId, floorId, numBathrooms, numBedrooms, hasBalcony));
		                value = true;
		            }

		            apartmentData.setLength(0);
		        }
		    }

		    return value;
		}
	public List<String> readFileee(String filePath) {
	    List<String> lines = new ArrayList<String>();
	    Scanner scanner = null;
	    try {
	        scanner = new Scanner(new File(filePath));
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            lines.add(line);
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } finally {
	        if (scanner != null) {
	            scanner.close();
	        }
	    }
	    return lines;
	}
	
	
	////***********newapp
	
	public String newapplication() {
	    StringBuilder result = new StringBuilder();

	    if (newapp.isEmpty()) {
	        return null;
	    } else {
	        for (int i = 0; i < newapp.size(); i++) {
	            apartment app = newapp.get(i);
	            result.append("residence ID: ").append(app.getres()).append("\n");
	            result.append("Apartment ID: ").append(app.getId()).append("\n");
	            result.append("Floor ID: ").append(app.getFloorId()).append("\n");
	            result.append("Number of Bathrooms: ").append(app.getNumBathrooms()).append("\n");
	            result.append("Number of Bedrooms: ").append(app.getNumBedrooms()).append("\n");
	            result.append("Is There a Balcony: ").append(app.hasBalcony()).append("\n");
	            result.append("\n");
	        }
	        return result.toString();
	    }
	}
	//
	
	
	public String NNewselectres(apartment a) {
		 StringBuilder result = new StringBuilder();
		    result.append("residence ID: ").append(a.getres()).append("\n");
		    result.append("Apartment ID: ").append(a.getId()).append("\n");
		    result.append("Floor ID: ").append(a.getFloorId()).append("\n");
		    result.append("Number of Bathrooms: ").append(a.getNumBathrooms()).append("\n");
		    result.append("Number of Bedrooms: ").append(a.getNumBedrooms()).append("\n");
		    result.append("Is There a Balcony: ").append(a.hasBalcony()).append("\n");
		    result.append("\n");
		    return result.toString();
	}
	
	
	
	//
	   Scanner s  = new Scanner(System.in); 

	
	 public int getNewAppId() {
		 /*
	        if (!newapp.isEmpty()) {
	            apartment app = newapp.get(0); // Get the first apartment in the list
	            return app.getId();
	        }
	        return -1; // Return -1 if the list is empty*/
		 int y = Integer.parseInt(residenceId);
		 return y;
	    }
    public static  apartment selectedApartment = null;

	 public void Approval() {
	        // Prompt the admin to select the apartment to approve
	        System.out.print("Enter the residence ID of the apartment to approve: ");
	         residenceId = s.nextLine();

	        // Find the apartment in newapp based on the residenceId
	        // selectedApartment = null;
	        for (apartment app : newapp) {
	        	int x = Integer.parseInt(residenceId);
	        	System.out.print("****The residenceId selected: " + x + "\n" + "****The residenceId selected of loop array: "+ app.getres() +"\n");
	            if (app.getres()== x) {
	                selectedApartment = app;
	                break;
	                
	            }
	        }

	        if (selectedApartment == null) {
	            System.out.println("Apartment with Residence ID '" + residenceId + "' not found.");
	        } else {
	            // Save the approved apartment to the file
	            saveToFile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse", selectedApartment);
	        //	APP();
	            System.out.println("Apartment with Residence ID '" + residenceId + "' has been approved and added to the file.");
	        }
	    }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/////////////////test owner ***********************************
	 public List<String> residenceMenu(String filePath) {
		    List<String> residenceMenu = new ArrayList<String>();

		    try {
		        BufferedReader reader = new BufferedReader(new FileReader(filePath));
		        String line;
		        while ((line = reader.readLine()) != null) {
		            residenceMenu.add(line); // Add each line (residence information) to the list
		        }
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }

		    // Store the residence menu in the class field (assuming you have one called residenceMenuList)
		    this.residences = residenceMenu;
		 //   System.out.println("Residences List: " + this.residences);
		    return residences;
		}
	 public static  String selectedResidenceId;
	    public static int numFloor; // Define numFloor as a class-level variable

	    public boolean selectIdRes(String residenceId) {
	        for (String residenceInfo : residences) {
	            String[] residenceData = residenceInfo.split(", ");
	            String idStr = residenceData[residenceData.length - 1];
	            String id = idStr.substring(idStr.lastIndexOf(" ") + 1);

	        ///    System.out.println("Residence Info: " + residenceInfo);
	        //    System.out.println("Extracted ID: " + id);
	        //    System.out.println("Residence ID to select: " + residenceId);

	            if (id.equals(residenceId)) {
	                selectedResidenceId = residenceId;

	                // Extract the number of floors from the residenceData and store it in numFloor
	                String floorNumberStr = residenceData[residenceData.length - 2].split(": ")[1].trim();
	                numFloor = Integer.parseInt(floorNumberStr);

	                return true;
	            }
	        }

	        // Residence with the given ID was not found
	        return false;
	    }
	 
	 public String getSelectedResidenceId() {
		    return selectedResidenceId;
		}
	 public int getnumfloor() {
		    // Step 1: Get the selected residence ID
		    String selectedResidenceId = getSelectedResidenceId(); // Assuming you have a method to get the selected ID

		    // Step 2: Loop through the list of residence information and find the selected residence
		    for (String residenceInfo : residences) {
		        String[] residenceData = residenceInfo.split(", ");

		        // Extract the residence ID from the last part of the residenceData array
		        String idStr = residenceData[residenceData.length - 1];
		        String id = idStr.substring(idStr.lastIndexOf(" ") + 1).trim();

		        // Check if the current residence is the selected one
		        if (id.equals(selectedResidenceId)) {
		            // Extract the number of floors from the last line of the residenceData array
		            String floorsStr = residenceData[residenceData.length - 1];
		            int numberOfFloors = Integer.parseInt(floorsStr.substring(floorsStr.lastIndexOf(":") + 1).trim());
		            return numberOfFloors;
		        }
		    }

		    // If the selected residence is not found, return -1 or any other appropriate value
		    return -1;
		}
	
	 
	 
	 public boolean isResidenceSelected() {
	        return selectedResidenceId != null;
	    }
	 
	 
	 public int getNumFloor() {
		    return numFloor;
		}
	 
	 public int getNumFloo() {
	        for (String residenceInfo : residences) {
	            String[] residenceData = residenceInfo.split(", ");
	            String idStr = residenceData[residenceData.length - 1];
	            String id = idStr.substring(idStr.lastIndexOf(" ") + 1).trim();

	            if (id.equals(selectedResidenceId)) {
	                // Extract the number of floors from the residenceData and return it
	                return Integer.parseInt(residenceData[residenceData.length - 2].split(": ")[1].trim());
	            }
	        }
	        // If the selected residence is not found, return -1 or some other appropriate value
	        return -1;
	    }
	 
	 
	 public void setNumFloor(int floorNumber) {
	        this.numFloor = floorNumber;
	    }
	 
	 
	 
	 ////
	 
	 public static List<String> readResidencesFromFile(String filePath) {
		    List<String> residences = new ArrayList<String>();
		    BufferedReader br = null;
		    try {
		        br = new BufferedReader(new FileReader(filePath));
		        String line;
		        StringBuilder residenceInfo = new StringBuilder();
		        while ((line = br.readLine()) != null) {
		            if (line.startsWith("-")) {
		                if (residenceInfo.length() > 0) {
		                    residences.add(residenceInfo.toString().trim()); // Trim to remove extra whitespace
		                    residenceInfo = new StringBuilder();
		                }
		            } else {
		                residenceInfo.append(line).append(System.lineSeparator());
		            }
		        }
		        if (residenceInfo.length() > 0) {
		            residences.add(residenceInfo.toString().trim()); // Trim to remove extra whitespace
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		        // You can log the error, display a message, or throw a custom exception here as needed.
		    } finally {
		        if (br != null) {
		            try {
		                br.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		    residencesList = residences;
		    return residences;
		}
	  
	  
	  public String getResidenceDetailsById(String residenceId) {
		  for (String residenceInfo : residencesList) {
		        if (residenceInfo.contains("residence ID: " + residenceId)) {
		            return residenceInfo.trim();
		        }
		    }
		    return null; // Residence with the given ID not found // Residence with the given ID not found
	    }
	 
}
