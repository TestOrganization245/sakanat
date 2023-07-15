package najah.edu.application;

import java.util.ArrayList;

public class  floor {
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
