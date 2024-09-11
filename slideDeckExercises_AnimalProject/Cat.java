/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * This is the cat class
 */
public class Cat extends Animal {
	
	// Instance variables
	
	private int numberOfNapsPerDay;

	// Getters and setters
	
	/**
	 * @return the numberOfNapsPerDay
	 */
	public int getNumberOfNapsPerDay() {
		return numberOfNapsPerDay;
	}

	/**
	 * @param numberOfNapsPerDay the numberOfNapsPerDay to set
	 */
	public void setNumberOfNapsPerDay(int numberOfNapsPerDay) {
		this.numberOfNapsPerDay = numberOfNapsPerDay;
	}

	// toString method
	
	@Override
	public String toString() {
		return "Cat [numberOfNapsPerDay=" + numberOfNapsPerDay + ", getName()=" + getName() + ", getNoise()="
				+ getNoise() + ", getEyeColour()=" + getEyeColour() + "]";
	}
	
	

}
