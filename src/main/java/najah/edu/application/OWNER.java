package najah.edu.application;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



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
	
	//test
	
	 static int ibtisam =6;
	//
	
	
	public static  Tenant tanentt = new Tenant();
	   private static final List<User> userlist= tanentt.liss();

    private static final String FILE_PATH = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\recidense";

	 String residenceId;
	private static List<apartment> newapp = new ArrayList<apartment>();

	private static int iddres;
	private static int idsamalll = -1;
	Tenant o = new Tenant() ;
	 private List<apartment> apartment = new ArrayList<apartment>();
     static Logger logger = Logger.getLogger(OWNER.class.getName());
	
	 private List<apartment> ap = new ArrayList<apartment>();

		
	 Scanner ss4 = new Scanner(System.in);
	 private List<floor> floorr = new ArrayList<floor>();

     
	 private List<Residence> res = new ArrayList<Residence>();
	
	 private List<apartment> app = new ArrayList<apartment>();

	 private static List<String> residences = new ArrayList<String>();
	 private static List<String> residencesList = new ArrayList<String>();

	 private List<String> viewwwhouse = new ArrayList<String>();
	    private List<String> availableOptions = new ArrayList<String>();
	    Scanner scannerr = new Scanner(System.in);
	    private int flag = 0;
	     int flagg = 0;
	     int flaggg =0;
	     int cv =0;
	    private int x = 0;
	    private String photoFilePath1; 
	    
	    
	  
	    
	    
	    
	   public OWNER() {
		   apartment = new ArrayList<apartment>();
		  
		   
		   floorr = new ArrayList<floor>();

		   res = new ArrayList<Residence>();
		  

		   app.add(new apartment(1 , 5 , 7, 9 ,false));
		   
		   availableOptions = new ArrayList<String>();
		 
		   availableOptions.add("add photos");
	        availableOptions.add("Residence location");
	        availableOptions.add("Available services");
	        availableOptions.add("monthly rent");
	        availableOptions.add("contact information");
	        
		   
	   }
	
	   public List<String> getresidence() {
		    if (residences.isEmpty()) {
		    	 return Collections.emptyList();
		    } else {
		        return residences;
		    }
		}
	   
	   public void print() {
		    logger.info("Welcome OWNER To Test Your Application ...");
		    logger.info("In this function, you can:");
		    logger.info("- Test if your residences have any floors");
		    logger.info("- Check if floors contain apartments");
		    logger.info("- Verify if your file is empty from residence information or not");
		    
		    // Additional instructions
		    logger.info("\nInstructions:");
		    logger.info("- Follow the prompts to test different aspects of your application.");
		    logger.info("- Make sure to have a sample file with residence information ready for testing.");
		    logger.info("- Use the provided options to simulate various scenarios.");
		    logger.info("- Examine the output to ensure your application is functioning correctly.");
		    
		    // Conclusion
		    logger.info("\nHave fun testing your application!");
		    logger.info("**************************************");
		    logger.info("TESTING SCENARIO: <Scenario Name>");

		    logger.info("<Step 1>");
		    logger.info("ADD HOUSE");
		    logger.info("<Step 2>");
		    logger.info("View ****");
		    // Add more steps as needed

		    logger.info("**************************************");
		}
	   
	public List<String> owner(){
		
		
		 Scanner scanner = new Scanner(System.in);
		logger.info("hello owner in your page .");
		
		logger.info("_______page owner ___________");
		logger.info("please can you select from menu the process");
		logger.info("1.Add House");
		logger.info("2.view the house option in dashbord ");
		int fflag = scanner.nextInt();
		switch(fflag) {
		case 1: 
			logger.info("OK. Please add the required information for the residence. ");
			flagg =1;
			addhouse();
			break;
		case 2: 
			logger.info("ok, you can show the view of house added to app.");
			view();
			logger.info("Are you need to return back???");
			String u;
			u = scanner.next();
			if(u.equals("Y")) {
				owner();
			}
			
			break;
		default:
			logger.info("Invalid choice. Please try again.");
            
		}
		
	
		return residences;
	}
	
	public void addhouse() {
		   
	        
		logger.info("\n");
		logger.info("\n");
		logger.info("Available options:");
	        for (int i = 0; i < availableOptions.size(); i++) {
	            String option = availableOptions.get(i);
	            logger.info("- " );
	            logger.info(option);
	        }
	        logger.info("\n");
	        
	
		logger.info("Add the photo (provide file path):");
		String photoFilePath = s.nextLine(); 
	
        File photoFile = new File(photoFilePath);
        if (photoFile.exists()) {
           photoFilePath1 = photoFilePath;
            logger.info("Photo file path: ");
            logger.info(  this.photoFilePath1);
        } else {
        	logger.info("Invalid photo file path.");
        }
        logger.info("\n");
        
      
        logger.info("Add the location and number of floors (e.g., nablus, 10 floors):");
        String ssl;
        ssl  = s.nextLine(); 
        String[] parts = ssl.split(",");

        if (parts.length < 2) {
        	logger.info("Invalid input format. Please provide the location and number of floors separated by a comma.");
            return; 
        }

        String locationPart = parts[0].trim();
        String floorsPart = parts[1].trim();

        int numFloors;
        String floorsString = floorsPart.replaceAll("\\D+", ""); 
        try {
            numFloors = Integer.parseInt(floorsString);
        } catch (NumberFormatException e) {
        	logger.info("Invalid input for the number of floors.");
            return;
        }
        
      
        logger.info("Add the Available Services:");
		String ssa ;
		ssa = s.next();
		logger.info(ssa);
		logger.info("\n");
		logger.info("Add the Monthly Rent:");
		String ssm ;
		ssm = s.next();
		logger.info(ssm);
		logger.info("\n");
		logger.info("Add the Contact Information:");
		String ssc ;
		ssc = s.next();
		logger.info(ssc);
		logger.info("\n");
		
		String ii=null;
		
		
		
		for (int counter = 0; counter < userlist.size(); counter++) { 	
     		 if( (userlist.get(counter).gettype()).equals("owner") ) {
     			
     			 
     		ii = userlist.get(counter).getID();
     		 }
     		 else {
     			 logger.info("not owner .. no id ");
     		 }
          }  
		 Residence reS = new Residence(locationPart, numFloors, ssa, ssm, photoFilePath, ssc ,ii);
		
		
     
        res.add(reS);
        viewResidences();
        appendTo(reS , FILE_PATH);
        
        
        
        logger.info("New residence added successfully!..\n\n" );
        logger.info("\n");
	        
	        x=1;
	        flag =1;
	        
	        if(flag ==1) {
	        	logger.info("OK, after you added a new residence!!! \nQ:Do you need to view all your updated residences ???? \n" );
	        	logger.info("please select from two the following choices (Y / N)");
	        	
	    		ssc = s.next();
	    		if (ssc.equals("Y")) {
	    			viewjust();
	    		    getResidences();
	    		} else if (ssc.equals("N")) {
	    			logger.info("OK");
	    		} else {
	    			logger.info("Please select from only two options (Y / N): " );
	    			logger.info( ssc);
	    		}
	    		
	        }
	}
	
	public boolean viewResidences() {
	    logger.info("\n");
	    logger.info("******** Viewing residences of information ...");
	    
	    if (res != null && !res.isEmpty()) {
	        for (int i = 0; i < res.size(); i++) {
	            Residence rr = res.get(i);
	            logger.info("Location: " + rr.getLocation() + ", Services: " + rr.getServices() +
	                        ", Monthly Rent: " + rr.getMonthlyRent() + ", Inclusive: " + rr.isInclusive() +
	                        ", Contact Info: " + rr.getContactInfo() + ", OwnerID: " + rr.getidowner() +
	                        ", Floornum: " + rr.getNumFloors());
	        }
	        return true;
	    } else {
	        return false;
	    }
	}
	
	
	
	
	  public List<String> getResidences() {
		  
	        return residences;
	    }
	  
	  public boolean  viewjust() {
		  res = readffile(FILE_PATH);
		  if (res.isEmpty()) {
			    return false;
			} else {
			    for (int i = 0; i < res.size(); i++) {
			        logger.info("Residence " + (i + 1));
			    }
			    return true;
			}
		  
		
		  
	  }
	 
	public int view( ) {
		res = readffile(FILE_PATH);
		int fnum = 0; 
		int id =0;
		int idd =0;
		for (int i = 0; i < res.size(); i++) {
			logger.info("Residence " + (i + 1));
		}
		logger.info("the owner id " + res.get(0).getidowner()+ "\n");
		logger.info("please select the residence you want to see the information of it::\n");
         int uU;
         uU =   scannerr.nextInt();
		if (uU >= 1 && uU <= res.size()) {
			Residence ar = res.get(uU - 1);
			logger.info( "1.  Location: " + ar.getLocation() + "\n    Services: " + ar.getServices() + "\n    Monthly Rent: " + ar.getMonthlyRent() +
		                "\n    Inclusive: " + ar.isInclusive() + "\n    Contact Info: " + ar.getContactInfo() + "\n    OwnerID: " + ar.getidowner()+ "\n    Floornum: " + ar.getNumFloors()+"\n");
			logger.info("the number of floors in the residence you chose is equal to:" + ar.getNumFloors()+ "\n");
			logger.info("\n");
			logger.info("\n");
			logger.info("***************************************************");
			logger.info("****** Now you have to provide the floors full info");
			   
			  id =  ar.getId();
			  idd = uU;
			 iddres= idd;
			    fnum = ar.getNumFloors();
			    flaggg = fnum;
			  floorr =  buildfloorofresidence(fnum, id);
			  String filePath = "C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse";
			  logger.info("good"+id);
			  boolean gg;
			  cv = idd;
			gg =  viewResidenceDetailsss(idd, filePath);
			
			 if(!gg )
			 {
				 
			 
			  for(int i=1; i<=fnum;i++) {
				  logger.info("\n");
				  logger.info("This is floor number "+ i);
				  logger.info("Add the number of the apartments in your "+ i +" floor");
				  Scanner scanner=new Scanner(System.in);
				  int z= scanner.nextInt();
				  for(int y=1; y<=z;y++) {
					
					  logger.info("Enter the number of the provided bathrooms:");
					 int bath;
					 bath = scanner.nextInt();
					 logger.info("Enter the number of the provided bedrooms:");
					 int bedrooms;
					 bedrooms =scanner.nextInt();
					 logger.info("Is there a balcony? (yes/no)");
						
						 boolean balcony;
						
						 String h = scanner.next();

						 while (true) {
						     if (h.equalsIgnoreCase("yes")) {
						         balcony = true;
						         break;
						     } else if (h.equalsIgnoreCase("no")) {
						         balcony = false;
						         break;
						     } else {
						    	 logger.info("Invalid input. Please enter 'yes' or 'no':");
						         h = scanner.next();
						     }
						 }
					 
					 
						 logger.info("This is the apartment number "+ y +" information");
					 app.add(new apartment(y,i, bath, bedrooms,balcony));
					 ap.add(new apartment(y,i, bath, bedrooms,balcony));
					newapp.add(new apartment(y,i, bath, bedrooms,balcony,iddres));
					logger.info(newapp.get(y - 1).getId() + "," + newapp.get(y - 1).getFloorId() + "," + newapp.get(y - 1).getNumBathrooms() + "," + newapp.get(y - 1).getNumBedrooms() + "," + newapp.get(y - 1).hasBalcony()+ "," + newapp.get(y - 1).getres());

					logger.info("This apartement will be added as soon as the adminstrator accepts it.");
					logger.info("\n");
					 
					 
				  }
			  }
		
		
			  setAppartmentToFloor();
		}	  
			  
		}
		else {
			logger.info("invalid index of switch");

		}
		
		
		
		

         return fnum;
	}
	
	
	
	



		public void addNewResidence() {

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

	                file.writeBytes("Location: " + data.getLocation() + ", ");
	                file.writeBytes("Services: " + data.getServices() + ", ");
	                file.writeBytes("Monthly Rent: " + data.getMonthlyRent() + ", ");
	                file.writeBytes("Inclusive: " + data.isInclusive() + ", ");
	                file.writeBytes("Contact Info: " + data.getContactInfo() + ", ");
	                file.writeBytes("OwnerID: " + data.getidowner() + ", ");
	                file.writeBytes("Floornum: " + data.getNumFloors());

	                file.writeBytes(System.lineSeparator());

	                logger.info("Data appended to file successfully!");
	        } catch (IOException e) {
	           
	            logger.log(Level.SEVERE, "Error appending data to file: " );
	            logger.log(Level.SEVERE,e.getMessage());
	        } finally {
	            if (file != null) {
	                try {
	                    file.close();
	                } catch (IOException e) {
	                  
	                    logger.log(Level.SEVERE, "Error closing file: " );
	                    logger.log(Level.SEVERE, e.getMessage(), e);
	                }
	            }
	        }
	    }
	  
	    public static List<Residence> readffile(String filePath) {
	        List<Residence> residences = new ArrayList<Residence>();
	        BufferedReader reader = null;
	       

	        try {
	       
	            reader = new BufferedReader(new FileReader(filePath));
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] fields = line.split(", ");
	                String location = fields[0].substring(fields[0].indexOf(":") + 1).trim();
	                String services = fields[1].substring(fields[1].indexOf(":") + 1).trim();
	                String monthlyRent = fields[2].substring(fields[2].indexOf(":") + 1).trim();
	                String inclusive = fields[3].substring(fields[3].indexOf(":") + 1).trim();
	                String contactInfo = fields[4].substring(fields[4].indexOf(":") + 1).trim();
	                String ownerID = fields[5].substring(fields[5].indexOf(":") + 1).trim();
	                int floorNum = Integer.parseInt(fields[6].substring(fields[6].indexOf(":") + 1).trim());

	                Residence residence = new Residence(location, floorNum, services, monthlyRent, inclusive,contactInfo, ownerID );
	                residences.add(residence);
	        
	            }
	        } catch (IOException e) {
	            logger.log(Level.SEVERE, "Error reading file: " );
	            logger.log(Level.SEVERE,e.getMessage());
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e) {
	                    logger.log(Level.SEVERE, "Error closing reader: " );
	                    logger.log(Level.SEVERE, e.getMessage(), e);
	                }
	            }
	        }

	        return residences;
	    }
	  
	   
	  
	    
	  
	    
	    public List<floor> buildfloorofresidence(int numFloors, int residenceId) {
	        List<floor> floors = new ArrayList<floor>();

	        for (int i = 1; i <= numFloors; i++) {
	            floor floor = new floor(i, residenceId);
	            floors.add(floor);
	        }

	        return floors;
	    }
	
	
	
	public ArrayList<apartment> getapartmentinflooriselected(int floorId) {
	    ArrayList<apartment> apartments = new ArrayList<apartment>();

	    for (apartment apartmenttt : ap) {
	        if (apartmenttt.getFloorId() == floorId) {
	            apartments.add(apartmenttt);
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
	
	
	public void saveToFile(String filePath, apartment apartment) {
        String applicationDetails = nnewselectres(apartment);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(filePath, true));
            writer.println(applicationDetails); // Write the application details
            writer.println("---------------------------------"); // Add a separator between entries
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while writing to file:", e);
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
		    for (String line : lines) {
		        if (!line.trim().isEmpty() && !line.trim().equals("---------------------------------")) {
		            apartmentData.append(line).append("\n");
		        } else {
		            String[] dataLines = apartmentData.toString().trim().split("\n");
		            if (dataLines.length < 6) {
		                apartmentData.setLength(0);
		                continue;
		            }

		            int currentResidenceId = Integer.parseInt(dataLines[0].split(": ")[1]);
		            
		            if (currentResidenceId == residenceId) {
		                int apartmentId = Integer.parseInt(dataLines[1].split(": ")[1]);
		                int floorId = Integer.parseInt(dataLines[2].split(": ")[1]);
		                int numBathrooms = Integer.parseInt(dataLines[3].split(": ")[1]);
		                int numBedrooms = Integer.parseInt(dataLines[4].split(": ")[1]);
		                boolean hasBalcony = Boolean.parseBoolean(dataLines[5].split(": ")[1]);

		                logger.info("- Apartment ID : " + apartmentId);
		                logger.info("- Floor ID : " + floorId);
		                logger.info("- Number Of Bathrooms : " + numBathrooms);
		                logger.info("- Number Of Bedrooms : " + numBedrooms);
		                logger.info("- Is There A Balcony : " + hasBalcony);

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
	        logger.log(Level.SEVERE, "An error occurred while writing to file:", e);
	    } finally {
	        if (scanner != null) {
	            scanner.close();
	        }
	    }
	    return lines;
	}
	
	
	
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
	public static List<apartment> aa(List<apartment> a) {
		newapp= a;
		return newapp;
	}
	
	
	public String nnewselectres(apartment a) {
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
	
	
	
	
	   Scanner s  = new Scanner(System.in); 

	
	 public int getNewAppId() {
		 
		 int y = Integer.parseInt(residenceId);
		 return y;
	    }
     static  apartment selectedApartment = null;

	 public void Approval() {
		 logger.info("Enter the residence ID of the apartment to approve: ");
	         residenceId = s.nextLine();

	        for (apartment appo : newapp) {
	        	int x = Integer.parseInt(residenceId);
	        	logger.info("****The residenceId selected: " + x + "\n" + "****The residenceId selected of loop array: "+ appo.getres() +"\n");
	            if (appo.getres()== x) {
	                selectedApartment = appo;
	                break;
	                
	            }
	        }

	        if (selectedApartment == null) {
	        	logger.info("Apartment with Residence ID '" + residenceId + "' not found.");
	        } else {
	            saveToFile("C:\\Users\\Lenovo\\eclipse-workspace\\sakanat\\datahouse", selectedApartment);
	            logger.info("Apartment with Residence ID '" + residenceId + "' has been approved and added to the file.");
	        }
	    }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static List<String> residenceMenu(String filePath) {
		    List<String> residenceMenu = new ArrayList<String>();
		    BufferedReader reader = null;
		    try {
		        reader = new BufferedReader(new FileReader(filePath));
		        String line;
		        while ((line = reader.readLine()) != null) {
		            residenceMenu.add(line); 
		        }
		    } catch (IOException e) {
		        logger.log(Level.SEVERE, "An error occurred:", e);
		    } finally {
		        if (reader != null) {
		            try {
		                reader.close();
		            } catch (IOException e) {
		                logger.log(Level.SEVERE, "Error closing reader:", e);
		            }
		        }
		    }
		   residences = residenceMenu;
		    return residences;
		}
	 
	 
	  static  String selectedResidenceId;
	     static int numFloor; 

	    public static boolean selectIdRes(String residenceId) {
	        for (String residenceInfo : residences) {
	            String[] residenceData = residenceInfo.split(", ");
	            String idStr = residenceData[residenceData.length - 1];
	            String id = idStr.substring(idStr.lastIndexOf(" ") + 1);


	            if (id.equals(residenceId)) {
	                selectedResidenceId = residenceId;

	                String floorNumberStr = residenceData[residenceData.length - 2].split(": ")[1].trim();
	                numFloor = Integer.parseInt(floorNumberStr);

	                return true;
	            }
	        }

	        return false;
	    }
	 
	 public String getSelectedResidenceId() {
		    return selectedResidenceId;
		}
	 public int getnumfloor() {
		    String selectedResidence = getSelectedResidenceId(); // Assuming you have a method to get the selected ID

		    for (String residenceInfo : residences) {
		        String[] residenceData = residenceInfo.split(", ");

		        String idStr = residenceData[residenceData.length - 1];
		        String id = idStr.substring(idStr.lastIndexOf(" ") + 1).trim();

		        if (id.equals(selectedResidence)) {
		            String floorsStr = residenceData[residenceData.length - 1];
		         
		           return Integer.parseInt(floorsStr.substring(floorsStr.lastIndexOf(":") + 1).trim());
		        }
		    }

		    return -1;
		}
	
	 
	 
	 public boolean isResidenceSelected() {
	        return selectedResidenceId != null;
	    }
	 
	 
	 public int getNumoor() {
		    return numFloor;
		}
	 
	
	 
	 public static void setNumFloor(int floorNumber) {
	        numFloor = floorNumber;
	    }
	 
	 
	 
	 
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
		        logger.log(Level.SEVERE, "An error occurred while writing to file:", e);
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
		    return null; 
	    }
	 ///test
	  public int zget() {
		  return ibtisam;
	  }
	  ////
	  public void processApartmentRequests() {
		    logger.info("THE LIST OF information about apartment to accept from admin:\n");

		    if (newapplication() == null) {
		        logger.info("NOT apartment to adding ***");
		    } else {
		        logger.info("* Are You need to accept the request of adding the apartment from owner ?\n(the answer between this choice (yes || YES || NO || no)\n");

		        String y = s.nextLine();
		        if (y.equalsIgnoreCase("yes")) {
		           Approval();
		        } else if (y.equalsIgnoreCase("no")) {
		            logger.info("OK, admin not accept this adding.... ");
		        } else {
		            logger.info("no correct the choices \n");
		        }
		    }
		}
}
