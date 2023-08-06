package najah.edu.application;

public class apartment {
	  private int id;
	    private static int nextId = 1;
	    private int floorId;
	    private int numBathrooms;
	    private int numBedrooms;
	    private boolean hasBalcony;
	    private boolean reserved;
	    private int idres;

	    
	    public apartment( int floorId, int bath, int bed, boolean y) {
	    	  this.id = nextId++;
	        this.floorId = floorId;
	        this.numBathrooms = bath;
	        this.numBedrooms = bed;
	        this.hasBalcony = y;
	      
	    } 
	    public apartment(int id, int floorId, int bath, int bed, boolean y) {
	        this.floorId = floorId;
	        this.numBathrooms = bath;
	        this.numBedrooms = bed;
	        this.hasBalcony = y;
	        this.id = nextId++;
	    }
	    
	    public apartment(int id, int floorId, int bath, int bed, boolean y, int idd ) {
	        this.floorId = floorId;
	        this.numBathrooms = bath;
	        this.numBedrooms = bed;
	        this.hasBalcony = y;
	        this.id = nextId++;
	        this.idres = idd;
	    }

	    public int getId() {
	        return id;
	    }
	    
	    public boolean getRR() {
	        return reserved;
	    }

	    public int getFloorId() {
	        return floorId;
	    }

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
