/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * This is the dog class
 */
public class Dog extends Animal {
	
	// Instance variables
	
	private boolean longtailed;
	
	// Getters and setters

	/**
	 * @return the longtailed
	 */
	public boolean isLongtailed() {
		return longtailed;
	}

	/**
	 * @param longtailed - the longtailed to set
	 */
	public void setLongtailed(boolean longtailed) {
		this.longtailed = longtailed;
	}

	
	//toString method
	
	@Override
	public String toString() {
		return "Dog [longtailed=" + longtailed + ", getName()=" + getName() + ", getNoise()=" + getNoise()
				+ ", getEyeColour()=" + getEyeColour() + "]";
	}
	
	
	
	
	

}
