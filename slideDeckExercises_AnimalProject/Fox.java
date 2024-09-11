/**
 * 
 */
package slideDeckExercises_AnimalProject;

/**
 * This is the fox class
 */
public class Fox extends Animal {
	
	// Instance variables
	
	private String furColour;
	
	// Getters and setters

	/**
	 * @return the furColour
	 */
	public String getFurColour() {
		return furColour;
	}

	/**
	 * @param furColour the furColour to set
	 */
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	
	// toString method

	@Override
	public String toString() {
		return "Fox [furColour=" + furColour + ", getName()=" + getName() + ", getNoise()=" + getNoise()
				+ ", getEyeColour()=" + getEyeColour() + "]";
	}
	
	
	
	

}
