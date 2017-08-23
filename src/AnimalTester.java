public class AnimalTester {
	
	public static void main(String[] args) {
		Animal animal1 = new Dogs ("dog", "city");
		Animal animal2 = new Dolphins ("dolphin", "wild");
		
		animal1.getAnimalinfo();
		System.out.println();
		animal2.getAnimalinfo();
		System.out.println();
	}
}