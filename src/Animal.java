public class Animal {
	private String Name;
	private String LocationFound; 
	public Animal(String N, String L) {
	Name = N;
	LocationFound = L;
	}

	public String getName(){
		return Name;
	}
	public String getLocation(){
		return LocationFound;
	}
	public void getAnimalinfo(){
		System.out.println("This animal is called a" + " " + Name + " " + "which is found in the" + " " + LocationFound + ".");
	}
}