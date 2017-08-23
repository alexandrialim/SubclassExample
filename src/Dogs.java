public class Dogs extends Animal {
	private String Dogs;
	private String City;

	public Dogs(String Name, String LocationFound) {
		super(Name, LocationFound);
		Dogs = Name;
		City = LocationFound;
		
	}
	
	public String getName(){
		return Dogs;
	}
	public String getLocation(){
		return City;
	}
	public void setLocation(String Location){
		City = Location;
	}
	public void setName(String Name){
		Dogs = Name;
	}
}