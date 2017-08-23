public class Dolphins extends Animal {
	private String Dolphins;
	private String Ocean;
	public Dolphins (String Name, String LocationFound) {
		super(Name, LocationFound);
		Dolphins = Name;
		Ocean = LocationFound;
	}
	public String getName(){
		return Dolphins;
	}
	public String getLocation(){
		return Ocean;
	}
	public void setLocation(String Location){
		Ocean = Location;
	}
	public void setName(String Name){
		Dolphins = Name;
	}
	
}