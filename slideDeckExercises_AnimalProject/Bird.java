/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * This is the bird class
 */
public class Bird extends Animal {
	
	// Instance variables
	
	private double wingSpan;

	// Getters and setters
	
	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() {
		return wingSpan;
	}

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	// toString method

	@Override
	public String toString() {
		return "Bird [wingSpan=" + wingSpan + ", getName()=" + getName() + ", getNoise()=" + getNoise()
				+ ", getEyeColour()=" + getEyeColour() + "]";
	}
	
	

}
