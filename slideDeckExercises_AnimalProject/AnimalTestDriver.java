/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * Test driver to test Animal class and sub classes
 */
public class AnimalTestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		
		a1.setEyeColour("Blue");
		a1.setName("Unknown");
		a1.setNoise("YAWK");
		
		a1.makeNoise();
		System.out.println(a1.toString());
		
		Bird b1 = new Bird();
		b1.setName("Sparrow");
		b1.setEyeColour("Black");
		b1.setWingSpan(32.3);
		b1.setNoise("TWEAT");
		
		b1.makeNoise();
		System.out.println(b1);
		
		Dog d1 = new Dog();
		
		d1.setName("Lola");
		d1.setLongtailed(true);
		d1.setEyeColour("Brown");
		d1.setNoise("Woof-it-e-woof");
		
		d1.makeNoise();
		System.out.println(d1);
		
		
	}

}
